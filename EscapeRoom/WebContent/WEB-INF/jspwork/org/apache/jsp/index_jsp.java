/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
<<<<<<< HEAD
 * Generated at: 2018-12-30 13:07:24 UTC
=======
 * Generated at: 2018-12-28 17:35:10 UTC
>>>>>>> parent of 48ca03a... -index수정, header 추가(미완성)
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Charm\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Do+Hyeon\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body, html{\r\n");
      out.write("\twidth: 1024px; \r\n");
      out.write("\theight: 723px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("}\r\n");
      out.write("body{display:none;}\r\n");
      out.write("div#backGround{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("div.on{\r\n");
      out.write("\tbackground-image: url('");
      out.print(request.getContextPath());
      out.write("/images/index2.jpg');\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("header{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 40%;\r\n");
      out.write("\ttop: 3%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("div{color: white; font-family: 'Do Hyeon', sans-serif;}\r\n");
      out.write("div#title{\r\n");
      out.write("\tfont-size : 135px;\r\n");
      out.write("\tfont-family: 'Charm', cursive;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-shadow: 6px 6px 2px gray;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\t/* opacity: .8; */\r\n");
      out.write("\tcolor: lightgray;\r\n");
      out.write("}\r\n");
      out.write("div#login{float: right; margin-right: 25px; font-size: 20px; opacity: .7; cursor: pointer;}\r\n");
      out.write("div#login:hover{opacity:1; border-bottom: 2px solid white;}\r\n");
      out.write("nav#menu{display:none;}\r\n");
      out.write("nav#menu ul li{\r\n");
      out.write("\tdisplay: inline; \r\n");
      out.write("\topacity: .8; \r\n");
      out.write("\tmargin-right: 10px; \r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\tfont-family: 'Do Hyeon', sans-serif;\r\n");
      out.write("\tcolor: #910303;\r\n");
      out.write("\tborder-bottom: 1px solid #910303;\r\n");
      out.write("}\r\n");
      out.write("nav#menu ul li>a:link, ul li>a:visited, ul li>a:hover{color: #910303;text-decoration: none;}\r\n");
      out.write("nav#menu ul li:hover{\r\n");
      out.write("\tborder-bottom: 2px solid #910303; \r\n");
      out.write("\topacity: 1;\r\n");
      out.write("\ttext-shadow: 2px 2px 2px gray;\r\n");
      out.write("}\r\n");
      out.write("section{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 60%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("section button{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 80px;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("}\r\n");
      out.write(".b10_tveffect{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 412px; \r\n");
      out.write("\ttop: 250px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write(".b10_tveffect div {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    border-radius: 30% 0 30% 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(1) {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("   \tbackground-color: gray;\r\n");
      out.write("    -webkit-transition: all 0.1s ease;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("   /*  border: #000000 solid 1px; */\r\n");
      out.write("   opacity: .7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(2) {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(2) div {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    -webkit-box-sizing: border-box;\r\n");
      out.write("    -moz-box-sizing: border-box;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(2) div:nth-child(1) {\r\n");
      out.write("    color: rgba(200, 120, 120, 0.8);\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAGCAYAAAAL+1RLAAAAF0lEQVQIW2NkwAIYgWKS6OIgQQxAoUoAE4AAUnD/0ugAAAAASUVORK5CYII=) repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(2) div:nth-child(2) {\r\n");
      out.write("    color: rgba(120, 200, 120, 0.8);\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAGCAYAAAAL+1RLAAAAF0lEQVQIW2NkwAIYgWKS6OIgQQxAoUoAE4AAUnD/0ugAAAAASUVORK5CYII=) repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect div:nth-child(2) div:nth-child(3) {\r\n");
      out.write("    color: rgba(120, 120, 200, 0.8);\r\n");
      out.write("    opacity: 0;\r\n");
      out.write("    background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAGCAYAAAAL+1RLAAAAF0lEQVQIW2NkwAIYgWKS6OIgQQxAoUoAE4AAUnD/0ugAAAAASUVORK5CYII=) repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect:hover div:nth-child(1) {\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    background-color: #000000;\r\n");
      out.write("    transition: color 0s ease;\r\n");
      out.write("    -webkit-transition: color 0s ease;\r\n");
      out.write("    -moz-transition: color 0s ease;\r\n");
      out.write("    transition: background-color 0.3s ease 0.2s;\r\n");
      out.write("    -webkit-transition: background-color 0.3s ease 0.2s;\r\n");
      out.write("    -moz-transition: background-color 0.3s ease 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect:hover div:nth-child(2) div:nth-child(1) {\r\n");
      out.write("    animation: b10_tveffect_red 0.25s linear;\r\n");
      out.write("    -webkit-animation: b10_tveffect_red 0.25s linear;\r\n");
      out.write("    -moz-animation: b10_tveffect_red 0.25s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect:hover div:nth-child(2) div:nth-child(2) {\r\n");
      out.write("    animation: b10_tveffect_green 0.25s linear;\r\n");
      out.write("    -webkit-animation: b10_tveffect_green 0.25s linear;\r\n");
      out.write("    -moz-animation: b10_tveffect_green 0.25s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b10_tveffect:hover div:nth-child(2) div:nth-child(3) {\r\n");
      out.write("    animation: b10_tveffect_blue 0.25s linear;\r\n");
      out.write("    -webkit-animation: b10_tveffect_blue 0.25s linear;\r\n");
      out.write("    -moz-animation: b10_tveffect_blue 0.25s linear;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes b10_tveffect_red {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.8, 1.6) translate(-10px, 3px) skewX(30deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.5, 1.2) translate(20px, 6px) skewX(5deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(0.9, 1.8) translate(-16px, -1px) skewX(-20deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes b10_tveffect_green {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.3, 1.5) translate(3px, 6px) skewX(25deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.6, 1.1) translate(-16px, -5px) skewX(-15deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1, 1.8) translate(18px, 4px) skewX(15deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes b10_tveffect_blue {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.2, 1.4) translate(-10px, -3px) skewX(-25deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.9, 1.1) translate(16px, 3px) skewX(5deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        -webkit-transform: scale(1.3, 2) translate(-30px, -3px) skewX(20deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-moz-keyframes b10_tveffect_red {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.8, 1.6) translate(-10px, 3px) skewX(30deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.5, 1.2) translate(20px, 6px) skewX(5deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(0.9, 1.8) translate(-16px, -1px) skewX(-20deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-moz-keyframes b10_tveffect_green {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.3, 1.5) translate(3px, 6px) skewX(25deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.6, 1.1) translate(-16px, -5px) skewX(-15deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1, 1.8) translate(18px, 4px) skewX(15deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-moz-keyframes b10_tveffect_blue {\r\n");
      out.write("    from,\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("    }\r\n");
      out.write("    25% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.2, 1.4) translate(-10px, -3px) skewX(-25deg);\r\n");
      out.write("    }\r\n");
      out.write("    50% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.9, 1.1) translate(16px, 3px) skewX(5deg);\r\n");
      out.write("    }\r\n");
      out.write("    75% {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: scale(1.3, 2) translate(-30px, -3px) skewX(20deg);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//페이지 서서히 켜지는 효과\r\n");
      out.write("\t$(\"body\").fadeIn(2000);\r\n");
      out.write("\t\r\n");
      out.write("\t//제목에 마우스 오버 시 메뉴 나옴.\r\n");
      out.write("\t$(\"#title\").fadeIn(4000).on('mouseenter', function(){\r\n");
      out.write("\t\t$(\"#menu\").fadeIn(2000);\r\n");
      out.write("\t\t$(\".b10_tveffect\").fadeIn(2000);\r\n");
      out.write("\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t//배경 깜빡거리는 효과\r\n");
      out.write("\tsetInterval(function(){\r\n");
      out.write("\t\t$(\"#backGround\").removeClass(\"on\");\r\n");
      out.write("\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t$(\"#backGround\").addClass(\"on\");\r\n");
      out.write("\t\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t\t$(\"#backGround\").removeClass(\"on\");\r\n");
      out.write("\t\t\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#backGround\").addClass(\"on\");\r\n");
      out.write("\t\t\t\t}, 200)\r\n");
      out.write("\t\t\t}, 200)\r\n");
      out.write("\t\t}, 200)\r\n");
      out.write("\t}, 3000);\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"backGround\" class=\"on\">\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div id=\"login\">LOGIN</div>\r\n");
      out.write("\t\t<div id=\"title\">EscapeRoom</div>\r\n");
      out.write("\t\t<nav id=\"menu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li ><a href=\"#\">HOME</a></li>\r\n");
      out.write("\t\t\t\t<li ><a href=\"#\">NOTICE</a></li>\r\n");
      out.write("\t\t\t\t<li ><a href=\"#\">RANKING</a></li>\r\n");
      out.write("\t\t\t\t<li ><a href=\"#\">COMMUNITY</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t<div class=\"button_base b10_tveffect\">\r\n");
      out.write("\t        <div>Enter Room</div>                                                                                                                                     \r\n");
      out.write("\t        <div>\r\n");
      out.write("\t            <div>Enter Room</div>\r\n");
      out.write("\t            <div>Enter Room</div>\r\n");
      out.write("\t            <div>Enter Room</div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</section>\t\r\n");
      out.write("</div>\r\n");
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
