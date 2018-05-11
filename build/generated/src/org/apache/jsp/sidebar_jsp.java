package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    try {

        String user = (String) session.getAttribute("usuario");
        if (user.equals("")) {
            response.sendRedirect("login.jsp");
        }
    } catch (NullPointerException e) {
        response.sendRedirect("login.jsp");
    }


      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Gentelella Alela!</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <!-- menu profile quick info -->\n");
      out.write("            <div class=\"profile clearfix\">\n");
      out.write("              <div class=\"profile_pic\">\n");
      out.write("                <img src=\"images/img.jpg\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"profile_info\">\n");
      out.write("                <span>Welcome,</span>\n");
      out.write("                <h2>\n");
      out.write("                    ");
                    
                        out.print(session.getAttribute("user"));
                    
      out.write("\n");
      out.write("                </h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <!-- sidebar menu -->\n");
      out.write("            <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("              <div class=\"menu_section\">\n");
      out.write("                <h3>GERAL</h3>\n");
      out.write("                <ul class=\"nav side-menu\">\n");
      out.write("                  \n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> CADASTRO <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"cliente.jsp\">Cliente</a></li>\n");
      out.write("                      <li><a href=\"produto.jsp\">Produto</a></li>\n");
      out.write("                      <li><a href=\"fornecedor.jsp\">Fornecedor</a></li>\n");
      out.write("                      <li><a href=\"usuario.jsp\">Usuário</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"./Sair\"><i class=\"fa fa-power-off\"></i> SAIR </a>\n");
      out.write("                    \n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>");
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
