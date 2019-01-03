package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Destination;
import java.util.ArrayList;

public final class addnewdestination_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>My Project</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/navbar-fixed-top.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Project name</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li id=\"lihome\"><a href=\"index.jsp\" id=\"home\">Home</a></li>\n");
      out.write("                    <li id=\"libookings\"><a href=\"ViewBookingServlet\" id=\"about\">Bookings</a></li>\n");
      out.write("                    <li class=\"active\" id=\"lidestination\"><a href=\"GetDestinationsServlet\" id=\"about\">Destination</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("                            aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Action</a></li>\n");
      out.write("                            <li><a href=\"#\">Another action</a></li>\n");
      out.write("                            <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                            <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                            <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                            <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                            <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"navbar-form navbar-right\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <!-- Main component for a primary marketing message or call to action -->\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1>Navbar example</h1>\n");
      out.write("            <p>Fixed to top navbar</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"well\" id=\"wellhome\">\n");
      out.write("            <h1>Add Destinations</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form class=\"form-horizontal\" action=\"destination/InsertDestinationServlet\" method=\"post\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"name\" class=\"col-lg-2 control-label\">name</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"name\" type=\"text\"\n");
      out.write("                                        required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"status\" class=\"col-lg-2 control-label\">status</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <select class=\"form-control\" id=\"status\" name=\"status\" required>\n");
      out.write("                                        <option value=\"0\">deactivate</option>\n");
      out.write("                                        <option value=\"1\">activate</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"image\" class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input class=\"form-control\" id=\"image\" name=\"image\" placeholder=\"image\" type=\"file\"\n");
      out.write("                                        required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                    <button class=\"btn btn-default\">Cancel</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> <!-- /row -->\n");
      out.write("        </div> <!-- /well -->\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/moment.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("    <script src=\"js/app.js\"></script>\n");
      out.write("</body>\n");
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
