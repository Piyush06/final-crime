package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomestation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Welcome Station</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"allcss.css\"></link>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"secondcol\">\n");
      out.write("        ");

            String username = null;
            String flag = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("station")) {
                        username = cookie.getValue();
                        
                    }
                }
            }
            if (username == null) {
                response.sendRedirect("HomePage.jsp");
            } else {
            }


        
      out.write("\n");
      out.write("        <!-- start header -->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("\n");
      out.write("                <img src='img/Crime-scene-do-not-cross-banner.jpg' alt='NO content to show' height=200 width=\"100%\" />\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <marquee><h1><font color=\"Green\" size=\"5\">Welcome station you are successfully logged In</font></h1></marquee>\n");
      out.write("\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <b><a href=\"HomePage.jsp\">Home</a></b>&nbsp;&nbsp;   <b><a href=\"AboutUS.html\">About Us</a></b>&nbsp;&nbsp;  <b><a href=\"");
      out.print(request.getContextPath());
      out.write("/LogOut\">LogOut</a></b>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Wrapper\">\n");
      out.write("            <!-- start page -->\n");
      out.write("            <div id=\"missing\" class=\"firstcol\" style=\" height:70%; width:25%; position:fixed; top:auto; left:0%; \">\n");
      out.write("                <img src='img/hate-crime-banner.png' alt='NO content to show' height=100% width=\"100%\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mostwanted\" class=\"bgbody\" style=\" height:70%; width:50%; position:fixed; top:auto; left:25%; \">\n");
      out.write("                <table BORDER=1  width=\"100%\" height=\"80%\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <th colspan=\"2\"><font size=\"5\" color=\"red\">User Panel</font></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <b><a href=\"addfir.jsp\" >ADD FIR TO STATION</a></b></br>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td  ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <b><a href=\"viewcomplaint.jsp\" >View COmplaint Status</a></b></br>\n");
      out.write("\n");
      out.write("                            </td> \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td  ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <b><a href=\"AddCriminalDetails.jsp\" >ADD Most Wanted Criminal</a></b></br>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <a href=\"addmissing.jsp\">ADD Missing Person</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <h1><font color=\"Blue\">24*7 SERVICE</font></h1>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"crimenews\" class=\"thirdcol\" style=\" height:70%; width:25%; position:fixed; top:auto; left:75%; \">\n");
      out.write("                <img src='img/Maharashtra-Police.jpg' alt='NO content to show' height=100% width=\"100%\" />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\" align=\"center\">\n");
      out.write("                <p class=\"copyright\"><font size=2> </font></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
