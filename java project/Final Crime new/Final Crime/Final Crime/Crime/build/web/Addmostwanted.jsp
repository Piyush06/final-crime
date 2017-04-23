<%-- 
    Document   : Addmostwanted
    Created on : Feb 26, 2014, 10:54:57 PM
    Author     : Vishal
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.DBconnect.DBconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="allcss.css"></link>
        <title>Add MostWanted</title>
    </head>
    <body class="secondcol">
        <%
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


        %>
        <!-- start header -->
        <div id="header">
            <div id="logo">

                <img src='img/Crime-scene-do-not-cross-banner.jpg' alt='NO content to show' height=200 width="100%" />

            </div>
            <marquee><h1><font color="Green" size="5">Welcome station you are successfully logged In</font></h1></marquee>

            <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>&nbsp;&nbsp;  <b><a href="<%=request.getContextPath()%>/LogOut">LogOut</a></b>
            </div>

        </div>
        <div id="Wrapper">
            <!-- start page -->          
          
            <div id="crimenews" class="thirdcol" >
                  <table  align="CENTER" align="center" border="3" width="100%" style="background-image: url(img/bg5.jpg);">
                      
                            
                                <th colspan="9" align="center"><font size="5" color="Blue">Criminal</font></th>

                        <tbody>
                               <%
                       DBconnect db=new DBconnect();
                        Connection con = db.getDBconnection();
                        Statement st = con.createStatement();
                        String uname = "";
                        if (cookies != null) {
                            for (Cookie cookie : cookies) {
                                 if (cookie.getName().equals("station")) {
                                    uname = cookie.getValue();
                                }
                            }
                        }
                        String qry = "SELECT * FROM criminaldetails";
                        ResultSet rs = st.executeQuery(qry);
                        out.println("<tr>");
                         out.println("<td>Photo</td>");
                        out.println("<td>Criminal Name</td>");
                        out.println("<td>Station Name </td>");
                        out.println("<td>Address</td>");
                        out.println("<td>City</td>");
                        out.println("<td>State</td>");
                        out.println("<td> Gender</td>");
                        out.println("<td>Age</td>");
                       out.println("<td>Add MostWanted</td>");
                        out.println("</tr>");
                        while (rs.next()) {
                            out.println("<tr>");
                             out.println("<td><image src=\"DisplayImageMW?id="+ rs.getString("imgaddress") +"\" height=50 width=50 ></td>");
                            out.println("<td>" + rs.getString("CriminalName") + "</td>");
                            out.println("<td>" + rs.getString("StationName") + "</td>");
                            out.println("<td>" + rs.getString("CrimrAddress") + "</td>");
                            out.println("<td>" + rs.getString("City") + "</td>");
                            out.println("<td>" + rs.getString("State") + "</td>");
                            out.println("<td>" + rs.getString("Gender") + "</td>");
                            out.println("<td>" + rs.getString("Age") + "</td>");
                       out.println("<td><a href=\"addMW?id=" + rs.getString("id") + "\">Add MostWanted </a></td>");
                            out.println("</tr>");
                        }
                    %>
                        </tbody>


                    </table>
            </div>

            <div id="footer" align="center">
                <p class="copyright"><font size=2> </font></p>
            </div>



    </body>
</html>
