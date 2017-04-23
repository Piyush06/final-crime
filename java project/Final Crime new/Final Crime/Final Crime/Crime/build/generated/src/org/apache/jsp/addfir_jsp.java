package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addfir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADD FIR</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"allcss.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fourthcol\">\n");
      out.write("       \n");
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
      out.write("                <div id=\"RegForm\" style=\"width: 100%;top: auto; height: 100%; left: 10%; \" >\n");
      out.write("                       <form action=\"FIRSubmit\" method=\"post\">\n");
      out.write("                           <table width=\"80%\" align=\"CENTER\" valign=\"middle\" border=\"3\" width=\"100%\" style=\"background-image: url(img/fantasia.jpg);\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <th colspan=\"2\"><font size=\"5\" color=\"red\">FIR Form</font></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                             \n");
      out.write("                            <tr>\n");
      out.write("                                <td>CRIME Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"cr_name\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Station Head Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"s_head\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                         \n");
      out.write("                             \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Matter</td>\n");
      out.write("                                <td><textarea name=\"matter\" rows=\"4\" cols=\"20\">\n");
      out.write("                                    </textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                          <tr>\n");
      out.write("                                <td>Date</td>\n");
      out.write("                                <td><input type=\"text\" name=\"date\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                <td>Time</td>\n");
      out.write("                                <td><input type=\"text\" name=\"time\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>Station Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"s_name\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>Crime Address</td>\n");
      out.write("                                <td><textarea name=\"cr_address\" rows=\"4\" cols=\"20\">\n");
      out.write("                                    </textarea></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td>City</td>\n");
      out.write("                                <td><input type=\"text\" name=\"city\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>State</td>\n");
      out.write("                                <td><input type=\"text\" name=\"state\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                             <tr>\n");
      out.write("                                 <td align=\"right\"><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                                 <td align=\"left\"><input type=\"reset\" value=\"Reset\" name=\"reset\" /></td>\n");
      out.write("                                \n");
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
