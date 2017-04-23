package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Registration</title>\n");
      out.write("        <script>\n");
      out.write("            function validateform(form)\n");
      out.write("            {\n");
      out.write("                if(document.insert.fname.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"First Name should not be empty\");\n");
      out.write("                    document.insert.fname.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.insert.mname.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Middle Name should not be empty\");\n");
      out.write("                    document.insert.mname.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.insert.txtpassword.value!=document.insert.txtpassword1.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Passwod doesnt match\");\n");
      out.write("                    document.insert.txtpassword1.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.insert.lname.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Last Name should not be empty\");\n");
      out.write("                    document.insert.lname.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.insert.contactno.value!=\"\")\n");
      out.write("                {\n");
      out.write("                    var y=document.insert.contactno.value;\n");
      out.write("                    if(isNaN(y)||y.indexOf(\" \")!=-1)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Invalid Mobile No.\");\n");
      out.write("                        document.insert.contactno.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (y.length>10 || y.length<10)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Mobile No. should be 10 digit\");\n");
      out.write("                        document.insert.contactno.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (!(y.charAt(0)==\"9\" || y.charAt(0)==\"8\" || y.charAt(0)==\"7\"))\n");
      out.write("                    {\n");
      out.write("                        alert(\"Mobile No. should start with 9 ,8 or 7 \");\n");
      out.write("                        document.insert.contactno.focus();\n");
      out.write("                        return false\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                if(document.insert.email.value!=\"\")\n");
      out.write("                {\n");
      out.write("                    var str=document.insert.email.value;\n");
      out.write("                    var at=\"@\"\n");
      out.write("                    var dot=\".\"\n");
      out.write("                    if (str.indexOf(at)<1 ){\n");
      out.write("                        alert(\"Invalid E-mail ID\")\n");
      out.write(" \n");
      out.write("                        return false\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" style=\"width: 100%; background-image: url(img/bruisedbeauty.jpg);\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <img src=\"img/criminal-banner.png\" width=\"100%\" height=\"200\" alt=\"hate-crime-banner\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <b><a href=\"HomePage.jsp\">Home</a></b>&nbsp;&nbsp;   <b><a href=\"AboutUS.html\">About Us</a></b>&nbsp;&nbsp;  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"Wrapper\">\n");
      out.write("                <div id=\"RegForm\" style=\"width: 100%; height: auto; top: auto;  \" >\n");
      out.write("                    <form action=\"SubmitUser\" method=\"post\" name=\"insert\"  onsubmit=\"return validateform(this);\">\n");
      out.write("                        <table  border=\"3\" width=\"80%\" ALIGN=CENTER VALIGN=MIDDLE >\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th colspan=\"2\"><font size=\"5\" color=\"blue\">User Registration Form</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>First Name</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"fname\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Middle Name</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"mname\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Last Name</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"lname\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Gender</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"Gender\">\n");
      out.write("\n");
      out.write("                                            <option>Male</option>\n");
      out.write("                                            <option>Female</option>\n");
      out.write("                                        </select></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Enter UserName</td>\n");
      out.write("\n");
      out.write("                                    <td><input type=\"text\" name=\"txtusername\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Enter Password</td>\n");
      out.write("\n");
      out.write("                                    <td><input type=\"password\" name=\"txtpassword\" value=\"\"  /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>ReEnter Password</td>\n");
      out.write("\n");
      out.write("                                    <td><input type=\"password\" name=\"txtpassword1\" value=\"\"   /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Address</td>\n");
      out.write("                                    <td><textarea name=\"address\" rows=\"4\" cols=\"20\">\n");
      out.write("                                        </textarea></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Contact No</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"contactno\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Email Id</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"email\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Date of Birth(dd/mm/yyyy)</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"DOB\" value=\"\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td align=\"CENTER\" colspan=\"2\"><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
