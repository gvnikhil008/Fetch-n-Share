package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <title>Towards</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("<body id=\"top\">\n");
      out.write("     <div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"hoc clear\"> \n");
      out.write("    \n");
      out.write("      <div id=\"logo\" style=\"align-content: center\">\n");
      out.write("   <center>   <h3 style=\"font-family: Poppins-Regular;font-size: 24px; padding: 20px;\"><a style=\"text-decoration: none; \" href=\"index.html\" >Fetch n Share</a></h3></center>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("       <div class=\"wrapper row2\" >\n");
      out.write("  <nav id=\"mainav\" class=\"hoc clear\"> \n");
      out.write("    <ul class=\"clear\" style=\"float: center\">\n");
      out.write("       <li><a style=\"text-decoration: none;\" href=\"index.html\">Home</a></li>\n");
      out.write("      <li><a style=\"text-decoration: none;\" href=\"osignin.jsp\">Data Owner</a></li>\n");
      out.write("      <li><a style=\"text-decoration: none;\" href=\"usignin.jsp\">Data User</a></li>\n");
      out.write("      <li class=\"active\"><a href=\"Admin.jsp\">Admin</a></li>\n");
      out.write("    </ul>  \n");
      out.write("  </nav>\n");
      out.write("</div>\n");
      out.write("       <div style=\"background-image: url(images/admin.png); background-repeat:no-repeat; background-position:center; background-size:cover;\">\n");
      out.write("    <div>\n");
      out.write("        <center> <br> <br><br><br>\n");
      out.write("            <h1 style=\"color:whitesmoke\"></h1> <br> <div class=\"wrap-login100\" >\n");
      out.write("             <form id=\"verify\" action=\"Adminverify.jsp\" method=\"post\">\n");
      out.write("                                        <div class=\"wrap-input100 validate-input\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"Username\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\" data-placeholder=\"Username\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"wrap-input100 validate-input\">\n");
      out.write("                                            <span class=\"focus-input100\" data-placeholder=\"Password\"></span>\n");
      out.write("                                            <input class=\"input100\" type=\"password\" name=\"Password\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("                                                        <button type=\"submit\" form=\"verify\"  class=\"login100-form-btn\">\n");
      out.write("                                                          Sign In\n");
      out.write("                                                        </button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("         \n");
      out.write("          </center>\n");
      out.write("       <br> <br><br><br>\n");
      out.write("       </div>\n");
      out.write("    <div id=\"copyright\" class=\"hoc clear\"> \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"wrapper row5\">\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("    </html>");
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
