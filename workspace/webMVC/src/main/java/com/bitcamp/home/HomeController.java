package com.bitcamp.home;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/*.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HashMap<String, CommandService> hm = new HashMap<String, CommandService>();

	public HomeController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException{
		// urlMapping.properties�� �ִ� key�� value�� ���Ͽ� HashMap�� �ּҿ� ��ü�� �����Ѵ�.
		// web.xml���� properties ���ϸ� ��������
		String propFileName = config.getInitParameter("path");
		System.out.println("propFileName = " + propFileName);

		Properties prop = new Properties();
		try {
			// ���Ͽ��� ���ڿ��� �о� Properties ��ü�� �����Ѵ�.
			FileInputStream fis = new FileInputStream(propFileName);
			prop.load(fis);

		}catch(Exception e) {
			System.out.println("������Ƽ ��ü �Է� ���� �߻�" + e.getMessage());
		}
		/////////////////////////////////////////////
		// properties ��ü�� ��� Ű�� ���Ѵ�.
		Enumeration keyList = prop.propertyNames();
		while(keyList.hasMoreElements()) {
			String key = (String)keyList.nextElement();
			String className = prop.getProperty(key);

			// key�� HashMap�� key�� ����ϰ�
			// value�� ��ü�� ����� HashMap�� ������ ����Ѵ�.
			try {
				Class commandClass = Class.forName(className); // lang�� Class��� Ŭ���� ����. // 54,55�� ���� �� ��

				CommandService service = (CommandService)commandClass.getDeclaredConstructors()[0].newInstance(); // com.bitcamp.home.IndexCommand�� ��ü�� ��
				hm.put(key, service);
			} catch(Exception e) {
				System.out.println("Command ��ü ���� �߻�.");
				e.printStackTrace();
			}

			System.out.println("key = " + key + ", className = " + className);
		}
	}

	//                           ���� ������ ��, ���� ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ctxPath = request.getContextPath();
		String uri = request.getRequestURI();
		System.out.println("ContextPath = " + ctxPath);
		System.out.println("uri = " + uri);

		//mapping �ּ� ���ϱ�
		String key = uri.substring(ctxPath.length()); // index.do
		CommandService command = hm.get(key);
		String viewFileName = command.execute(request, response); // �����ϸ��� ���� ����.

		// view���ϸ��� ��ġ�� �̵��ϱ�
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewFileName);
		dispatcher.forward(request, response);
	}
}