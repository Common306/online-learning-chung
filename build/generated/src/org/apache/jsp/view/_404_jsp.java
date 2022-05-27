package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/base.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/404.css\">\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"home\" class=\"navbar-brand\">\n");
      out.write("                <h2><i class=\"fa-solid fa-book\"></i>eLEARNING</h2>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <div class=\"navbar-nav\">\n");
      out.write("                    <a href=\"home\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                    <a href=\"courses.html\" class=\"nav-item nav-link\">Courses</a>\n");
      out.write("                    <a href=\"blog.html\" class=\"nav-item nav-link\">Blog</a>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"login\" class=\"btn-primary\">Join Now<i class=\"fa-solid fa-arrow-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("\n");
      out.write("        <!-- Intro Start -->\n");
      out.write("\n");
      out.write("        <div class=\"intro\">\n");
      out.write("            <div class=\"intro-child\">\n");
      out.write("                <h1>Not Found</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Intro End -->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <i class=\"fa-solid fa-triangle-exclamation\"></i>\n");
      out.write("            <h1>404<h1>\n");
      out.write("            <p>We?re sorry, the page you have looked for does not exist in our website! Maybe go to our home page or try to use a search?</p>\n");
      out.write("            <a href=\"home\">Go to your home page</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
