package com.bitcamp.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/initTest.do")
public class InitParam extends HttpServlet {
	
    public InitParam() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		//xml ������ ������ request�ϱ�
		String userid  = getInitParameter("userid");
		String userpwd = getInitParameter("userpwd");
		String userName = getInitParameter("username");
		
		System.out.println("userName = "+ userName);
		
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = res.getWriter();
		pw.println("<html><head><title>Init �׽�Ʈ</title></head><body>");
		pw.println("���̵� : "+ userid + "<br/>");
		pw.println("��й�ȣ : "+ userpwd + "<br/>");
		pw.println("�̸� : "+ userName +"<br/>");
		pw.println("</body></html>");
	}

}
