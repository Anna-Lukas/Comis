/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-15 16:47:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Arrays;

public final class carInfoForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    List<String> makes = Arrays.asList("Fiat", "Volkswagen",
            "Ford", "Volvo", "Honda", "Citroen");

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.html", Long.valueOf(1576426249650L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Dodaj auto</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"checkInfoForm.jsp\" method=\"post\">\r\n");
      out.write("    Marka\r\n");
      out.write("    <select name=\"make\">\r\n");
      out.write("        ");
 for (String m : makes) { 
      out.write("\r\n");
      out.write("        <option>");
      out.print(m);
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("    <br>\r\n");
      out.write("    Typ\r\n");
      out.write("    <input type=\"text\" name=\"type\"> <br>\r\n");
      out.write("    Rok produkcji\r\n");
      out.write("    <select name=\"production_year\">\r\n");
      out.write("        ");
for (int i = 2019; i >= 1980; i--) { 
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </select><br>\r\n");
      out.write("    Przebieg\r\n");
      out.write("    <select name=\"milage\">\r\n");
      out.write("        ");
for (int i = 0; i <= 1000000; i+= 100000) { 
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </select><br>\r\n");
      out.write("    Pojemność\r\n");
      out.write("    <select name=\"capacity\">\r\n");
      out.write("        ");
for (int i = 1; i <= 9; i++) { 
      out.write("\r\n");
      out.write("        <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("    <input type=\"submit\" value=\"Wyślij\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h5>Altkom Akademia, ChÅodna 51, Warszawa</h5>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
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
