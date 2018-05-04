package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-paw\"></i> \n");
      out.write("                  <span>Sistema JPA</span></a>\n");
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
      out.write("                <span>Bem Vindo,</span>\n");
      out.write("                <h2>Bruce Wayne</h2>\n");
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
      out.write("                <h3>Geral</h3>\n");
      out.write("                <ul class=\"nav side-menu\">\n");
      out.write("                  <li><a><i class=\"fa fa-home\"></i> Inicio <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"index.html\">Dashboard</a></li>\n");
      out.write("                      <li><a href=\"index2.html\">Dashboard2</a></li>\n");
      out.write("                      <li><a href=\"index3.html\">Dashboard3</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Cadastro <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"cliente.jsp\">Cliente</a></li>\n");
      out.write("                      <li><a href=\"produto.jsp\">Produto</a></li>\n");
      out.write("                      <li><a href=\"fornecedor.jsp\">Fornecedor</a></li>\n");
      out.write("                      <li><a href=\"usuario.jsp\">Usuário</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Relatório <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"form.html\">General Form</a></li>\n");
      out.write("                      <li><a href=\"form_advanced.html\">Advanced Components</a></li>\n");
      out.write("                      <li><a href=\"form_validation.html\">Form Validation</a></li>\n");
      out.write("                      <li><a href=\"form_wizards.html\">Form Wizard</a></li>\n");
      out.write("                      <li><a href=\"form_upload.html\">Form Upload</a></li>\n");
      out.write("                      <li><a href=\"form_buttons.html\">Form Buttons</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i> Configurações <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"form.html\">General Form</a></li>\n");
      out.write("                      <li><a href=\"form_advanced.html\">Advanced Components</a></li>\n");
      out.write("                      <li><a href=\"form_validation.html\">Form Validation</a></li>\n");
      out.write("                      <li><a href=\"form_wizards.html\">Form Wizard</a></li>\n");
      out.write("                      <li><a href=\"form_upload.html\">Form Upload</a></li>\n");
      out.write("                      <li><a href=\"form_buttons.html\">Form Buttons</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  <li><a href=\"form.html\"><i class=\"fa fa-edit\"></i> SAIR </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("        <div class=\"top_nav\">\n");
      out.write("          <div class=\"nav_menu\">\n");
      out.write("            <nav>\n");
      out.write("              <div class=\"nav toggle\">\n");
      out.write("                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"images/img.jpg\" alt=\"\">John Doe\n");
      out.write("                    <span class=\" fa fa-angle-down\"></span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\n");
      out.write("                    <li><a href=\"javascript:;\"> Profile</a></li>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                        <span class=\"badge bg-red pull-right\">50%</span>\n");
      out.write("                        <span>Settings</span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"javascript:;\">Help</a></li>\n");
      out.write("                    <li><a href=\"login.html\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                    <span class=\"badge bg-green\">6</span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"text-center\">\n");
      out.write("                        <a>\n");
      out.write("                          <strong>See All Alerts</strong>\n");
      out.write("                          <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /top navigation -->");
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
