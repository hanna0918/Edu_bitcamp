/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.50
 * Generated at: 2021-09-02 05:53:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/board/../04_include/top.jspf", Long.valueOf(1630553658128L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\" integrity=\"sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("<script src=\"//cdn.ckeditor.com/4.16.2/full/ckeditor.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		CKEDITOR.replace('content');\r\n");
      out.write("		\r\n");
      out.write("		$('#frm').submit(function(){\r\n");
      out.write("			if($('#subject').val()==\"\"){\r\n");
      out.write("				alert('제목을 입력 후 등록하세요.');\r\n");
      out.write("				return false\r\n");
      out.write("			}\r\n");
      out.write("			if(CKEDITOR.instances.content.getData()==\"\"){\r\n");
      out.write("				alert('글 내용을 입력 후 등록하세요.');\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			return true;\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	ul, li{\r\n");
      out.write("	   	margin:0;\r\n");
      out.write("	   	padding:0;\r\n");
      out.write("	   	list-style-type:none;\r\n");
      out.write("	}\r\n");
      out.write("	#menu>li{\r\n");
      out.write("		float:left; \r\n");
      out.write("		width:200px; \r\n");
      out.write("		height:50px; \r\n");
      out.write("		line-height:50px;\r\n");
      out.write("	}\r\n");
      out.write("	.container{\r\n");
      out.write("		width:1000px; \r\n");
      out.write("		margin: 0 auto;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<div style=\"height:100px; background-color:lightblue\">\r\n");
      out.write("<ul id=\"menu\">\r\n");
      out.write("   <li><a href=\"/webJSP/index.jsp\">홈</a></li>\r\n");
      out.write("   <li><a href=\"/webJSP/board/boardList.jsp\">게시판</a></li>\r\n");
      out.write("   <li>\r\n");
      out.write("      ");

      //logId, logName
      if(session.getAttribute("logId")!=null && !session.getAttribute("logId").equals("")){//로그인상태 /getContextPath -> webJSP 가져와주는애
         
      out.write("\r\n");
      out.write("            ");
      out.print(session.getAttribute("logName") );
      out.write("님 <a href=\"");
      out.print(request.getContextPath());
      out.write("/daumLogin/logout.jsp\">로그아웃</a>\r\n");
      out.write("         ");
 
      }else{//로그인 안한 경우
         
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print(request.getContextPath());
      out.write("/daumLogin/loginForm.html\">로그인</a>\r\n");
      out.write("         ");

      }
      
      out.write("\r\n");
      out.write("   </li>\r\n");
      out.write("</ul>\r\n");
      out.write("   ");

      int num=1234;
      String username="이순신";
   
      out.write("\r\n");
      out.write("   ");
      out.print(num );
      out.write(',');
      out.write(' ');
      out.print(username );
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<h1>글쓰기폼</h1>\r\n");
      out.write("	<form method='post' id='frm' action=\"boardWriteOk.jsp\">\r\n");
      out.write("		제목 : <input type='text' name='subject' id='subject' /><br/>\r\n");
      out.write("		<textarea name='content' id='content'></textarea>\r\n");
      out.write("		<input type='submit' value='등록' />\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
