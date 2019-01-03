package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ini == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  ");
 response.sendRedirect(request.getContextPath() + "/Init"); 
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("  <title>My Project</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"css/navbar-fixed-top.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Fixed navbar -->\r\n");
      out.write("  <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\r\n");
      out.write("          aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Project name</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <li class=\"active\" id=\"lihome\"><a href=\"#home\" id=\"home\">Home</a></li>\r\n");
      out.write("          <li id=\"libookings\"><a href=\"ViewBookingServlet\" id=\"about\">Bookings</a></li>\r\n");
      out.write("          <li id=\"lidestination\"><a href=\"GetDestinationsServlet\" id=\"about\">Destination</a></li>\r\n");
      out.write("          <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("          <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown\r\n");
      out.write("              <span class=\"caret\"></span></a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li><a href=\"#\">Action</a></li>\r\n");
      out.write("              <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("              <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("              <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("              <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("              <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("              <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"navbar-form navbar-right\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Email\" class=\"form-control\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" class=\"form-control\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--/.nav-collapse -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main component for a primary marketing message or call to action -->\r\n");
      out.write("    <div class=\"jumbotron\">\r\n");
      out.write("      <h1>Navbar example</h1>\r\n");
      out.write("      <p>Fixed to top navbar</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"well\" id=\"wellhome\">\r\n");
      out.write("      <h1>Bootsrap Date</h1>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <form class=\"form-horizontal\" method=\"post\" action=\"InsertBookingServlet\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("              <legend>Legend</legend>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"select\" class=\"col-lg-3 control-label\">Selects</label>\r\n");
      out.write("                <div class=\"col-lg-9\">\r\n");
      out.write("                  <select class=\"form-control\" id=\"select\" name=\"destination\">\r\n");
      out.write("                      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"traveldate\" class=\"col-lg-3 control-label\">Travel Date</label>\r\n");
      out.write("                <div class=\"col-lg-9 input-group date\" id='datetimepicker1'>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"traveldate\" name=\"traveldate\" placeholder=\"Travel Date\">\r\n");
      out.write("                  <span class=\"input-group-addon\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-lg-9 col-lg-offset-3 pull-right\">\r\n");
      out.write("                  <button type=\"reset\" class=\"btn btn-default\">Cancel</button>\r\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div> <!-- /row -->\r\n");
      out.write("    </div> <!-- /well -->\r\n");
      out.write("\r\n");
      out.write("  </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("  <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/moment.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("  <script src=\"js/app.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.destinations}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                \r\n");
          out.write("                              <option value='");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('\'');
          out.write('>');
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\r\n");
          out.write("                      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }
}
