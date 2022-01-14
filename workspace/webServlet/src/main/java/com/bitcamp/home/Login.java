package com.bitcamp.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginForm.do")
public class Login extends HttpServlet {
	 
    public Login() {
        super();  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		// 로그인폼
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><head><title>로그인폼</title><script>");
		pw.println("function logChk(){ if(document.getElementById('userid').value=='')");
		pw.println("{alert('아이디를 입력하세요'); return false}");
		pw.println("if(document.getElementById('userpwd').value=='')");
		pw.println("{alert('비밀번호를 입력하세요.'); return false;}return true}</script>");
		pw.println("</head><body>");
		pw.println("<h1>로그인폼</h1>");
		pw.println("<form method='post' action='/webServlet/loginForm.do' onsubmit='return logChk()'>");
		pw.println("아이디 : <input type='text' name='userid' id='userid'/><br/>");
		pw.println("비밀번호 : <input type='password' name='userpwd' id='userpwd'><br/>");
		pw.println("<input type='submit' value='로그인'/> </form></body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//로그인하기
		String userid = req.getParameter("userid");
		String userpwd = req.getParameter("userpwd");
		
		driverLoading();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##scott", "tiger");
			String sql = "select userid, username from register where userid=? and userpwd=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpwd);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {//로그인성공시
				HttpSession ses = req.getSession();
				ses.setAttribute("userid", rs.getString(1));
				ses.setAttribute("userpwd", rs.getString(2));
				
				System.out.println(ses.getId());
				System.out.println(ses.getAttribute("userid"));
				System.out.println(ses.getAttribute("username"));
				
				res.sendRedirect(req.getContextPath()+"/index.do");
			}else {//로그인 실패시
				res.setContentType("text/html; charset=UTF-8");
				PrintWriter pw = res.getWriter();
				pw.println("<script>");
				pw.println("alert('다시 로그인하자')");
				pw.println("history.back()");
				pw.println("</script>");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void driverLoading() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
