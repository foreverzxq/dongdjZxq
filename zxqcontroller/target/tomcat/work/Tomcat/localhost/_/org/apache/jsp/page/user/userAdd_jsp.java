/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-14 09:29:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>文章列表--layui后台管理模板 2.0</title>\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../../layui/css/layui.css\" media=\"all\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../../css/public.css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\" src=\"../../layui/layui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"userAddJs.js\"></script>\n");
      out.write("\n");
      out.write("<body class=\"childrenBody\">\n");
      out.write("<form class=\"layui-form\" style=\"width:80%;\">\n");
      out.write("\t<div class=\"layui-form-item layui-row layui-col-xs12\">\n");
      out.write("\t\t<label class=\"layui-form-label\">登录名</label>\n");
      out.write("\t\t<div class=\"layui-input-block\">\n");
      out.write("            <input type=\"hidden\" class=\"layui-input usersId\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"layui-input userName\"  lay-verify=\"required\" placeholder=\"请输入登录名\"><span id=\"checkUN\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"layui-form-item layui-row layui-col-xs12\">\n");
      out.write("\t\t<label class=\"layui-form-label\">邮箱</label>\n");
      out.write("\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"layui-input userEmail\" lay-verify=\"email\" placeholder=\"请输入邮箱\"><span id=\"checkEm\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"layui-row\">\n");
      out.write("\t\t<div class=\"magb15 layui-col-md4 layui-col-xs12\">\n");
      out.write("\t\t\t<label class=\"layui-form-label\">性别</label>\n");
      out.write("\t\t\t<div class=\"layui-input-block userSex\">\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"男\" title=\"男\" checked>\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"女\" title=\"女\">\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"保密\" title=\"保密\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"magb15 layui-col-md4 layui-col-xs12\">\n");
      out.write("\t\t\t<label class=\"layui-form-label\">会员等级</label>\n");
      out.write("\t\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t\t<select name=\"userGrade\" class=\"userGrade\" lay-filter=\"userGrade\">\n");
      out.write("\t\t\t\t\t<option value=\"0\">注册会员</option>\n");
      out.write("\t\t\t\t\t<option value=\"1\">中级会员</option>\n");
      out.write("\t\t\t\t\t<option value=\"2\">高级会员</option>\n");
      out.write("\t\t\t\t\t<option value=\"3\">钻石会员</option>\n");
      out.write("\t\t\t\t\t<option value=\"4\">超级会员</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"magb15 layui-col-md4 layui-col-xs12\">\n");
      out.write("\t\t\t<label class=\"layui-form-label\">会员状态</label>\n");
      out.write("\t\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t\t<select name=\"userStatus\" class=\"userStatus\" lay-filter=\"userStatus\">\n");
      out.write("\t\t\t\t\t<option value=\"0\">正常使用</option>\n");
      out.write("\t\t\t\t\t<option value=\"1\">限制用户</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"layui-form-item layui-row layui-col-xs12\">\n");
      out.write("\t\t<label class=\"layui-form-label\">用户简介</label>\n");
      out.write("\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t<textarea placeholder=\"请输入用户简介\" class=\"layui-textarea userDesc\"></textarea>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"layui-form-item layui-row layui-col-xs12\">\n");
      out.write("\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t<button class=\"layui-btn layui-btn-sm\" lay-submit=\"\" lay-filter=\"addUser\" id=\"btn_submit\">立即添加</button>\n");
      out.write("\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-sm layui-btn-primary\">取消</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
