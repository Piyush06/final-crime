package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"allcss.css\"></link>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <SCRIPT LANGUAGE= \"JavaScript\">\n");
      out.write("            colours=new Array(\"Red\", \"Blue\")\n");
      out.write("            index=0\n");
      out.write("\n");
      out.write("            ref=setInterval(\"func()\",500)\n");
      out.write("            function func()\n");
      out.write("            {\n");
      out.write("                if(index>1)\n");
      out.write("                {\n");
      out.write("                    index=0\n");
      out.write("                    document.fgColor=colours[index]\n");
      out.write("                    index++\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.fgColor=colours[index]\n");
      out.write("                    index++\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </SCRIPT>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bgbody\">\n");
      out.write("\n");
      out.write("        <!-- start header -->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("\n");
      out.write("                <img src='img/criminal-banner.png' alt='NO content to show' height=200 width=\"100%\" />\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <marquee><h1 align=\"CENTER\"><b>Raising Hands Against Crime!!!</b></marquee>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <b><a href=\"HomePage.jsp\">Home</a></b>&nbsp;&nbsp;   <b><a href=\"aboutus.jsp\">About Us</a></b>&nbsp;&nbsp;  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"Wrapper\">\n");
      out.write("            <!-- start page -->\n");
      out.write("            <div id=\"missing\" class=\"firstcol\" style=\" height:100%; width:22%; position:fixed; top:auto; left:0%; \">\n");
      out.write("                <marquee behavior=\"sroll\" direction=\"up\" height=\"100%\"><h1 align=\"CENTER\"><b>MISSING PERSON </b></h1></marquee>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mostwanted\" class=\"secondcol\" style=\" height:100%; width:24%; position:fixed; top:auto; left:22%; \">\n");
      out.write("                <marquee behavior=\"sroll\" direction=\"up\"height=\"100%\"><h1 align=\"CENTER\"><b>MOST WANTED</b> </marquee>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"crimenews\" class=\"thirdcol\" style=\" height:100%; width:24%; position:fixed; top:auto; left:46%; \">\n");
      out.write("                <marquee behavior=\"sroll\" direction=\"up\" height=\"100%\"><h1 align=\"CENTER\"><b>CRIME NEWS</b></h1> </marquee>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"loginpanel\" class=\"fourthcol\" style=\" height:100%; width:30%; position:fixed; top:auto; left:70%; \">\n");
      out.write("                <form name=\"Login\" action=\"Login\" method=\"POST\">\n");
      out.write("                    <table BORDER=1  width=\"100%\" height=\"150\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td c colspan=\"2\">\n");
      out.write("                                <b> <input type=\"radio\" name=\"select\" value=\"u\" />User </b></br>\n");
      out.write("                                <b> <input type=\"radio\" name=\"select\" value=\"s\" />Station</b>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>USERNAME</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"uname\" value=\"\" />\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><b>PASSWORD</b></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"password\" name=\"pass\" value=\"\" />\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\"><input type=\"submit\" value=\"Login\" name=\"Login\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <a href=\"userreg.jsp\">NEW USER REGISTRATION</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td ALIGN=CENTER VALIGN=MIDDLE colspan=\"2\">\n");
      out.write("                                <a href=\"stationreg.jsp\">NEW STATION REGISTRATION</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\" align=\"center\">\n");
      out.write("            <p class=\"copyright\"><font size=2> </font></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
