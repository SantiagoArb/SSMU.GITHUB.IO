package org.apache.jsp.Ingreso_005fRegistro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;

public final class Acceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\">\r\n");
      out.write("        <title>S&SMusic</title>\r\n");
      out.write("        <meta name=\"description\" content=\"Free Bootstrap Theme by BootstrapMade.com\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"free website templates, free bootstrap themes, free template, free bootstrap, free website template\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/jquery.bxslider.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\">   \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"loader\"></div>\r\n");
      out.write("        <div id=\"myDiv\">\r\n");
      out.write("            <!--HEADER-->\r\n");
      out.write("            <header id=\"main-header\">\r\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed-top\" style=\"background-color: rgb(73, 84, 105)\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"../index.html\">S&S<span class=\"logo-dec\"><img src=\"../img/ser01.png\">USIC</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li class=\"active\"><a href=\"#\">Inicio</a></li>\r\n");
      out.write("                                <li class=\"\"><a href=\"#contact\">Contactenos</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!--/ HEADER-->\r\n");
      out.write("            <section id=\"blog\" class=\"section-padding wow fadeInUp delay-05s\">    \r\n");
      out.write("            </section>\r\n");
      out.write("            <section id=\"blog\" class=\"section-padding wow fadeInUp delay-05s\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 text-center\">\r\n");
      out.write("                            <h2 class=\"service-title pad-bt15\">Bienvenido</h2>\r\n");
      out.write("                            <hr class=\"bottom-line\">\r\n");
      out.write("                            <div id=\"formDiv\">\r\n");
      out.write("                                <p id=\"P_confirmacion\" style=\"color: #ff0000\"></p>\r\n");
      out.write("                                <!--<form id=\"Registro\" class=\"form_in\" method=\"post\" action=\"\">   -->\r\n");
      out.write("                                <div class=\"container\">\r\n");
      out.write("                                <div class=\"col-sm-4\"></div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <input name=\"nick\" id=\"nick\" class=\"form-control\" type=\"text\" placeholder=\"&#128100; Usuario\" required autofocus>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br/>\r\n");
      out.write("                                <div class=\"container\">\r\n");
      out.write("                                    <div class=\"col-sm-4\"></div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <input name=\"password\" id=\"password\" class=\"form-control\" type=\"password\" placeholder=\"&#128273; Contraseña\" required autofocus>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    <a href=\"../Ingreso_Registro/Inicio.jsp\" style=\"font-size: small; text-align: left\">¿Olvidaste tu contraseña?</a>\r\n");
      out.write("                                    <div class=\"btn_form\">\r\n");
      out.write("                                        <button id=\"btn_ingreso\" onclick=\"Login();\" class=\"btn_submit\">Iniciar</button>\r\n");
      out.write("                                       <!-- <input class=\"btn_submit\" type=\"submit\" value=\"Ingresar\">-->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                              <!--  </fordsadsadsadm>-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("                                \r\n");
      out.write("                                <script>\r\n");
      out.write("            var xMLHttpRequest = new XMLHttpRequest();\r\n");
      out.write("            function Login() {\r\n");
      out.write("               \r\n");
      out.write("                xMLHttpRequest.open(\"Get\", \"../Ingreso?nick=\"+document.getElementById(\"nick\").value+\"&password=\"+document.getElementById(\"password\").value, true);\r\n");
      out.write("                xMLHttpRequest.onreadystatechange = processLogin;\r\n");
      out.write("                xMLHttpRequest.send(null);\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            function clean(){\r\n");
      out.write("                document.getElementById(\"P_confirmacion\").style=\"display:none;\";\r\n");
      out.write("            }\r\n");
      out.write("            function processLogin(){\r\n");
      out.write("                  if (xMLHttpRequest.readyState == 4 && xMLHttpRequest.status == 200) {\r\n");
      out.write("                       var resp = eval('(' + xMLHttpRequest.responseText + ')');\r\n");
      out.write("                       console.log(resp);\r\n");
      out.write("                      if(resp.respuesta[0].ID_USUARIO !== 0 || resp.respuesta[0].TIPO_PERFIL !== null){\r\n");
      out.write("                          if(resp.respuesta[0].TIPO_PERFIL === \"Admin\"){\r\n");
      out.write("                          window.location.replace(\"http://localhost:7001/SSMusic/Interfaz/Admin/Inicio.jsp\");    \r\n");
      out.write("                      }else if(resp.respuesta[0].TIPO_PERFIL === \"Oper\"){\r\n");
      out.write("                          window.location.replace(\"http://localhost:7001/SSMusic/Interfaz/Operario/Inicio_op.jsp\");\r\n");
      out.write("                      }\r\n");
      out.write("                      }else{\r\n");
      out.write("                          document.getElementById(\"P_confirmacion\").style=\"display:inline;\";\r\n");
      out.write("                          document.getElementById(\"P_confirmacion\").style=\"color:red; font: message-box; font-size: x-large;\";\r\n");
      out.write("                          \r\n");
      out.write("                          document.getElementById(\"P_confirmacion\").innerHTML=\"Usuario y/o contraseña Incorrecto\";\r\n");
      out.write("                          myVar = setTimeout(clean, 5000);\r\n");
      out.write("                          \r\n");
      out.write("                      }\r\n");
      out.write("                  }\r\n");
      out.write("            }\r\n");
      out.write("                                </script>\r\n");
      out.write("            <!---->\r\n");
      out.write("            <section id=\"contact\" class=\"section-padding wow fadeInUp delay-05s\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 text-center white\">\r\n");
      out.write("                            <h2 class=\"service-title pad-bt15\">Mantente en contacto con nosotros</h2>\r\n");
      out.write("                            <p class=\"sub-title pad-bt15\">Si tienes alguna duda, con respecto a ¿quienes somos? o ¿como funciona el programa?, <br>puedes contactarnos</p>\r\n");
      out.write("                            <hr class=\"bottom-line white-bg\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("                            <div class=\"loction-info white\">\r\n");
      out.write("                                <p><i class=\"fa fa-map-marker fa-fw pull-left fa-2x\"></i>Politecnico Colombiano J.I.C<br>Medellin, Antioquia</p>\r\n");
      out.write("                                <p><i class=\"fa fa-envelope-o fa-fw pull-left fa-2x\"></i>santiago_cardona82141@elpoli.edu.co <br>santiago_arbelaez82141@elpoli.edu.co</p>\r\n");
      out.write("                                <p><i class=\"fa fa-phone fa-fw pull-left fa-2x\"></i>+57 302-420-9853</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("                            <div class=\"contact-form\">\r\n");
      out.write("                                <div id=\"sendmessage\">Tu mensaje ha sido enviado. Gracias!</div>\r\n");
      out.write("                                <div id=\"errormessage\"></div>\r\n");
      out.write("                                <form action=\"\" method=\"post\" role=\"form\" class=\"contactForm\">\r\n");
      out.write("                                    <div class=\"col-md-6 padding-right-zero\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Nombre\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\" />\r\n");
      out.write("                                            <div class=\"validation\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-6\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Correo electronico\" data-rule=\"email\" data-msg=\"Please enter a valid email\" />\r\n");
      out.write("                                            <div class=\"validation\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" placeholder=\"Titulo\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 8 chars of subject\" />\r\n");
      out.write("                                            <div class=\"validation\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <textarea class=\"form-control\" name=\"message\" rows=\"5\" data-rule=\"required\" data-msg=\"Por favor, escriba algo para nosotros\" placeholder=\"Mensaje\"></textarea>\r\n");
      out.write("                                            <div class=\"validation\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-submit\">ENVIAR</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!---->\r\n");
      out.write("            <!---->\r\n");
      out.write("            <footer id=\"footer\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row text-center\">\r\n");
      out.write("                        <p>&copy;Santiago Cardona & Santiago Arbelaez. Todos los Derechos Reservados.</p>\r\n");
      out.write("                        <div class=\"credits\">\r\n");
      out.write("                            Tema Diseñador por <a href=\"https://bootstrapmade.com/\">Bootstrap Themes</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!---->\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/jquery.easing.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/wow.js\"></script>\r\n");
      out.write("        <script src=\"../js/jquery.bxslider.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
