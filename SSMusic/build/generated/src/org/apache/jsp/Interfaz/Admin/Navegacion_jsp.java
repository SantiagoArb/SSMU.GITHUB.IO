package org.apache.jsp.Interfaz.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Navegacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  t:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_t_if_0.setPageContext(_jspx_page_context);
      _jspx_th_t_if_0.setParent(null);
      _jspx_th_t_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionNombre']!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_t_if_0 = _jspx_th_t_if_0.doStartTag();
      if (_jspx_eval_t_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
 response.sendRedirect("../../index.html");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_t_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
        return;
      }
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--header start-->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">\r\n");
      out.write("<meta name=\"author\" content=\"GeeksLabs\">\r\n");
      out.write("<meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"../../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../../css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../../css/elegant-icons-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../../css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../../css/interfaz.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../../css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"../../css/modal.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"../../css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.datatables.net/v/bs4/jszip-2.5.0/dt-1.10.16/af-2.2.2/b-1.5.1/b-colvis-1.5.1/b-flash-1.5.1/b-html5-1.5.1/b-print-1.5.1/cr-1.4.1/fc-3.2.4/fh-3.1.3/kt-2.3.2/r-2.2.1/rg-1.0.2/sc-1.4.4/datatables.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"header dark-bg\">\r\n");
      out.write("    <div class=\"toggle-nav\">\r\n");
      out.write("        <div class=\"icon-reorder tooltips\" data-original-title=\"Navegación\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--logo start-->\r\n");
      out.write("    <a href=\"Inicio.jsp\" class=\"logo\"><span>S&S</span> Music</a>\r\n");
      out.write("    <!--logo end-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"top-nav notification-row\">                \r\n");
      out.write("        <!-- notificatoin dropdown start-->\r\n");
      out.write("        <ul class=\"nav pull-right top-menu\">\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("                <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"\">\r\n");
      out.write("                    <span class=\"profile-ava\">\r\n");
      out.write("                        <img alt=\"\" src=\"../../img/avatar1_small.jpg\">\r\n");
      out.write("                        <p id=\"iduser\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['ID_USUARIO']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        <script>document.getElementById(\"iduser\").style=\"display:none\";</script>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionNombre']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                    ");
 String usuario = String.valueOf(request.getSession().getAttribute("sessionNombre"));
      out.write("\r\n");
      out.write("                    <b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                    <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                    <li class=\"eborder-top\">\r\n");
      out.write("                        <a href=\"Perfil.jsp\"><i class=\"icon_profile\"></i> Mi perfil</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <form action=\"../../Logout\">\r\n");
      out.write("                            <a style=\"font-size: large\" href=\"../../Ingreso_Registro/Acceso.jsp\" ><i class=\"icon_key_alt\"></i> Salir</a>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <!-- user login dropdown end -->\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- notificatoin dropdown end-->\r\n");
      out.write("    </div>\r\n");
      out.write("                   \r\n");
      out.write("</header>      \r\n");
      out.write("<!--sidebar start-->\r\n");
      out.write("<aside>\r\n");
      out.write("    <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("        <!-- sidebar menu start-->\r\n");
      out.write("        <ul class=\"sidebar-menu\">                \r\n");
      out.write("            <li class=\"active\">\r\n");
      out.write("                <a class=\"\" href=\"Inicio.jsp\">\r\n");
      out.write("                    <i class=\"icon_house_alt\"></i>\r\n");
      out.write("                    <span>Inicio</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"sub-menu\">\r\n");
      out.write("                <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                    <i class=\"icon_document_alt\"></i>\r\n");
      out.write("                    <span>Contacto</span>\r\n");
      out.write("                    <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"sub\">\r\n");
      out.write("                    <li><a class=\"\" href=\"\">Enviar Correo</a></li>                          \r\n");
      out.write("                    <li><a class=\"\" href=\"\">Reportar Problemas</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>                       \r\n");
      out.write("            <li class=\"sub-menu\">\r\n");
      out.write("                <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                    <i class=\"icon_table\"></i>\r\n");
      out.write("                    <span>Moderación</span>\r\n");
      out.write("                    <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"sub\">   \r\n");
      out.write("                    <li><a class=\"\" href=\"Gestion.jsp\">Gestión</a></li>\r\n");
      out.write("                    <li><a class=\"\" href=\"Empresas.jsp\">Información Empresas</a></li>\r\n");
      out.write("                    <li><a onclick=\"ServletArtista();\" class=\"\" href=\"info_artistas.jsp\">Información Artistas</a></li>\r\n");
      out.write("                    <li><a onclick=\"\" class=\"\" href=\"Operarios.jsp\">Gestión Operarios</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- sidebar menu end-->\r\n");
      out.write("    </div>\r\n");
      out.write("     \r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("<!--sidebar end-->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/jquery-1.8.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../js/jquery-ui-1.10.4.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/jquery-ui-1.9.2.custom.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/bootstrap.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/jquery.scrollTo.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../js/jquery.customSelect.min.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"../../js/scripts.js\" type=\"text/javascript\" ></script>    \r\n");
      out.write("<script src=\"../../js/DataTables.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/v/bs4/jszip-2.5.0/dt-1.10.16/af-2.2.2/b-1.5.1/b-colvis-1.5.1/b-flash-1.5.1/b-html5-1.5.1/b-print-1.5.1/cr-1.4.1/fc-3.2.4/fh-3.1.3/kt-2.3.2/r-2.2.1/rg-1.0.2/sc-1.4.4/datatables.min.js\" type=\"text/javascript\"></script>\r\n");
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
