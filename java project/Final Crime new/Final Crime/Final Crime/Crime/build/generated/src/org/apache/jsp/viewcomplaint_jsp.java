package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewcomplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Criminal Status</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"allcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fourthcol\">\n");
      out.write("           <div id=\"header\" style=\"width: 100%; height:auto;background-image: url(img/bruisedbeauty.jpg);\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <img src=\"img/Maharashtra-Police.jpg\" width=\"100%\" height=\"200\" alt=\"hate-crime-banner\"/>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            </div>\n");
      out.write("                   <div id=\"menu\">\n");
      out.write("                <b><a href=\"HomePage.jsp\">Home</a></b>&nbsp;&nbsp;   <b><a href=\"AboutUS.html\">About Us</a></b>&nbsp;&nbsp;  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("               <div id=\"Wrapper\" style=\"height: 100%; top: auto;\">\n");
      out.write("                <div id=\"RegForm\"style=\"width: 100%;top: auto; height: 100%; left: 10%; \" >\n");
      out.write("                       <form action=\"SubmitServlet\" method=\"post\">\n");
      out.write("                           <table width=\"80%\" align=\"CENTER\" valign=\"middle\" border=\"3\" width=\"100%\" style=\"background-image: url(img/sparklestream.jpg);\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <th colspan=\"2\"><font size=\"5\" color=\"Blue\">Criminal Status</font></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                             <tr>\n");
      out.write("                                 <td>Complaint ID</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>Name</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Address</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                          \n");
      out.write("                                <td>Contact</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                         \n");
      out.write("                             \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Complaint Status</td>\n");
      out.write("                                <td><textarea name=\"address\" rows=\"4\" cols=\"20\">\n");
      out.write("                                    </textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Date</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>Time</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>City</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>Matter</td>\n");
      out.write("                                <td> </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr> \n");
      out.write("                                <td>Victim details:</td>\n");
      out.write("                                <td><b><a>Add Victim</a></b></td>\n");
      out.write("                             </tr>\n");
      out.write("                             <tr> \n");
      out.write("                                <td>Witness details:</td>\n");
      out.write("                                <td><b><a>Add Witness</a></b></td>\n");
      out.write("                             </tr>\n");
      out.write("                            \n");
      out.write("                             <tr>\n");
      out.write("                               <td align=\"right\"><input type=\"submit\" value=\"Submit\" /></td>  \n");
      out.write("                             <td align=\"center\" colspan=\"2\"><input type=\"reset\" value=\"Clear\" name=\"Clear\" /></td>\n");
      out.write("                                <td align=\"left\"><input type=\"reset\" value=\"Cancel\" name=\"Cancel\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("</table>\n");
      out.write("                        \n");
      out.write("                </form>   \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
