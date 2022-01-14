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
		//xml 변수의 데이터 request하기
		String userid  = getInitParameter("userid");
		String userpwd = getInitParameter("userpwd");
		String userName = getInitParameter("username");
		
		System.out.println("userName = "+ userName);
		
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = res.getWriter();
		pw.println("<html><head><title>Init 테스트</title></head><body>");
		pw.println("아이디 : "+ userid + "<br/>");
		pw.println("비밀번호 : "+ userpwd + "<br/>");
		pw.println("이름 : "+ userName +"<br/>");
		pw.println("</body></html>");
	}

}
