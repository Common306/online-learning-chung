package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reset_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link rel=\"dns-prefetch\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway:300,400,600\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"icon\" href=\"Favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("        <title>Forgot password</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light navbar-laravel\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"login\">Login</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"register\">Register</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <main class=\"login-form\">\r\n");
      out.write("            <div class=\"cotainer\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-8\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-header\">Forgot password</div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <form action=\"\" method=\"\">\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label for=\"email_address\" class=\"col-md-4 col-form-label text-md-right\">E-Mail\r\n");
      out.write("                                            Address</label>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <input type=\"text\" id=\"email_address\" class=\"form-control\" name=\"email-address\"\r\n");
      out.write("                                                   required autofocus>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-md-6 offset-md-4\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("                                            Send\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function submitForm() {\r\n");
      out.write("            var valueEmail = document.getElementById(\"email-address\").value;\r\n");
      out.write("            if (valueEmail === \"\") {\r\n");
      out.write("                document.getElementById(\"error-email\").innerHTML = \"Email must not be empty\";\r\n");
      out.write("                return false;\r\n");
      out.write("            } else {\r\n");
      out.write("                document.getElementById(\"error-email\").innerHTML = \"\";\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
