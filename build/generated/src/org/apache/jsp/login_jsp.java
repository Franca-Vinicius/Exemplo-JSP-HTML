package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <body class=\"login\">\n");
      out.write("    <div>\n");
      out.write("      <a class=\"hiddenanchor\" id=\"signup\"></a>\n");
      out.write("      <a class=\"hiddenanchor\" id=\"signin\"></a>\n");
      out.write("\n");
      out.write("      <div class=\"login_wrapper\">\n");
      out.write("        <div class=\"animate form login_form\">\n");
      out.write("          <section class=\"login_content\">\n");
      out.write("            <form>\n");
      out.write("              <h1>Login Form</h1>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" required=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <a class=\"btn btn-default submit\" href=\"index.html\">Log in</a>\n");
      out.write("                <a class=\"reset_pass\" href=\"#\">Lost your password?</a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("              <div class=\"separator\">\n");
      out.write("                <p class=\"change_link\">New to site?\n");
      out.write("                  <a href=\"#signup\" class=\"to_register\"> Create Account </a>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                  <h1><i class=\"fa fa-paw\"></i> Gentelella Alela!</h1>\n");
      out.write("                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"register\" class=\"animate form registration_form\">\n");
      out.write("          <section class=\"login_content\">\n");
      out.write("            <form>\n");
      out.write("              <h1>Create Account</h1>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" required=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"email\" class=\"form-control\" placeholder=\"Email\" required=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <a class=\"btn btn-default submit\" href=\"index.html\">Submit</a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("              <div class=\"separator\">\n");
      out.write("                <p class=\"change_link\">Already a member ?\n");
      out.write("                  <a href=\"#signin\" class=\"to_register\"> Log in </a>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                  <h1><i class=\"fa fa-paw\"></i> Gentelella Alela!</h1>\n");
      out.write("                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
