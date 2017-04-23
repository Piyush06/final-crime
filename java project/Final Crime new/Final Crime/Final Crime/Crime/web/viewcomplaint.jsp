<%-- 
    Document   : viewcomplaint
    Created on : Jan 13, 2014, 5:43:19 PM
    Author     : Prabudha
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.DBconnect.DBconnect"%>
<%@page import="java.sql.ResultSet"%>
<%-- 
    Document   : viewcomplaintstat
    Created on : Jan 13, 2014, 5:25:47 PM
    Author     : Prabudha
--%>

<%-- 
    Document   : addmissing
    Created on : Jan 5, 2014, 10:40:33 AM
    Author     : Prabudha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criminal Status</title>
        <link rel="stylesheet" type="text/css" href="allcss.css"/>
    </head>
    <body class="fourthcol">
        <%
            String username = null;
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
            }
        %>
        <div id="header" style="width: 100%; height:auto;background-image: url(img/bruisedbeauty.jpg);">
            <div id="logo">
                <img src="img/Maharashtra-Police.jpg" width="100%" height="200" alt="hate-crime-banner"/>


            </div>
            <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>&nbsp;&nbsp;  <a href="<%=request.getContextPath()%>/LogOut">LogOut</a>
            </div>

            <div id="Wrapper" style="height: 100%; top: auto;">
                <div id="RegForm" style="width: 100%;top: auto; height: 100%; left: 10%; " >
                    <form action="SubmitServlet" method="post">
                        <table width="80%" align="CENTER" valign="middle" border="3" width="100%" style="background-image: url(img/bg5.jpg);">
                            <thead>
                                <tr>

                                    <th colspan="12" align="center"><font size="5" color="Blue">Complaint</font></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    DBconnect db = new DBconnect();
                                    Connection con = db.getDBconnection();
                                    Statement st = con.createStatement();
                                    String uname = "";
                                    String sname = "";
                                    if (cookies != null) {
                                        for (Cookie cookie : cookies) {
                                            if (cookie.getName().equals("station") || cookie.getName().equals("user")) {
                                                uname = cookie.getValue();
                                            }
                                        }
                                    }

                                    String qry = "SELECT * FROM stationdetails WHERE username='" + uname + "'";
                                    ResultSet rs1 = st.executeQuery(qry);
                                    while (rs1.next()) {
                                        sname = rs1.getString("StationName");
                                    }
                                    rs1.close();
                                    String qry1 = "SELECT * FROM firdetails WHERE StationName='" + sname + "'";
                                    ResultSet rs = st.executeQuery(qry1);
                                    out.println("<tr>");
                                    out.println("<td>Crime TYpe</td>");
                                    out.println("<td>Station Head </td>");
                                    out.println("<td>Matter</td>");
                                    out.println("<td>Date</td>");
                                    out.println("<td>Time</td>");
                                    out.println("<td>Station Name</td>");
                                    out.println("<td>Address</td>");
                                    out.println("<td>City</td>");
                                    out.println("<td>State</td>");
                                    out.println("<td>Add Victim Details</td>");
                                    out.println("<td>Add Witness Details</td>");
                                    out.println("<td>Update Complain Status</td>");
                                    out.println("</tr>");
                                    while (rs.next()) {
                                        out.println("<tr>");
                                        out.println("<td>" + rs.getString("cr_name") + "</td>");
                                        out.println("<td>" + rs.getString("StationHead") + "</td>");
                                        out.println("<td>" + rs.getString("matter") + "</td>");
                                        out.println("<td>" + rs.getString("date") + "</td>");
                                        out.println("<td>" + rs.getString("time") + "</td>");
                                        out.println("<td>" + rs.getString("StationName") + "</td>");
                                        out.println("<td>" + rs.getString("cr_address") + "</td>");
                                        out.println("<td>" + rs.getString("city") + "</td>");
                                        out.println("<td>" + rs.getString("state") + "</td>");
                                        out.println("<td><a href=\"addvictim.jsp?id=" + rs.getString("id") + "\">Add </a></td>");
                                        out.println("<td><a href=\"addwitnes.jsp?id=" + rs.getString("id") + "\">Add </a></td>");
                                         out.println("<td><a href=\"addstatus.jsp?id=" + rs.getString("id") + "\">Add </a></td>");
                                        out.println("</tr>");
                                    }
                                %>
                            </tbody>


                        </table>

                    </form>   


                </div>

            </div>
    </body>
</html>