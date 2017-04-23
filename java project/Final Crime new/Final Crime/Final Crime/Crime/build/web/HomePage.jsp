<%-- 
    Document   : HomePage
    Created on : Dec 28, 2013, 12:16:11 PM
    Author     : Prabudha
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.DBconnect.DBconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>
        <link rel="stylesheet" type="text/css" href="allcss.css"></link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    </head>
    <body class="bgbody">
        <%
            String username = null;
            String flag = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("station") || cookie.getName().equals("user")) {
                        username = cookie.getValue();
                        if (cookie.getName().equals("station")) {
                            flag = "s";
                        }
                        if (cookie.getName().equals("user")) {
                            flag = "u";
                        }
                    }
                }
            }
            if (username == null) {
            } else {
                if (flag == "s") {
                    response.sendRedirect("welcomestation.jsp");
                }
                if (flag == "u") {
                    response.sendRedirect("welcomeuser.jsp");
                }

            }


        %>
        <!-- start header -->
        <div id="header">
            <div id="logo">

                <img src='img/criminal-banner.png' alt='NO content to show' height=200 width="100%" />	
            </div>

            <marquee><h1 align="CENTER"><b>Raising Hands Against Crime!!!</b></marquee>
            <div id="menu"> 
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>&nbsp;&nbsp;  
            </div>

        </div>
        <div id="Wrapper">
            <!-- start page -->
             <div id="missing" class="firstcol" style=" height:100%; width:35%; position:fixed; top:auto; left:0%; ">
                <marquee behavior="sroll" direction="up" height="100%" onmouseover="this.setAttribute('scrollamount', 0, 0);" onmouseout="this.setAttribute('scrollamount', 6, 0);">
                    <table border="1" width="100%" class="thirdcol">
                    <thead>
                        <tr>
                            <th colspan="5">
                                These Are Missing Person...
                            </th>
                        </tr>
                    </thead>
                    <tbody>

                    
                    <tr>
                        <td>
                            Image
                        </td>
                        <td>
                            Name
                        </td>
                        <td>
                            Address
                        </td>
                        <td>
                            Station Name
                        </td>
                        <td>
                            Contact On 
                        </td>
                    </tr>
                    <%
                    try{
                        
                        DBconnect db = new DBconnect();
                        Connection con = db.getDBconnection();
                        Statement st1= con.createStatement();
                        
                        String qry = "SELECT * FROM missingdetails";
                        
                        ResultSet rs = st1.executeQuery(qry);
                       
                        while (rs.next()) {
                            out.println("<tr>");
                            out.println("<td><image src=\"DisplayImage?id="+ rs.getString("img_address") +"\" height=50 width=50 ></td>");
                            out.println("<td>" + rs.getString("mis_name") + "</td>");
                            out.println("<td>" + rs.getString("address") + "</td>");
                            out.println("<td>" + rs.getString("s_name") + "</td>");
                          out.println("<td>" + rs.getString("contact") + "</td>");
                           
                            out.println("</tr>");
                        }
                        
                    }catch(Exception e){
                        
                       out.println("hello"); 
                    }
                    %></tbody>
                </table>
                </marquee>
            </div>
            <div id="mostwanted" class="secondcol" style=" height:100%; width:35%; position:fixed; top:auto; left:35%; ">
                <marquee behavior="sroll" direction="down" height="100%" onmouseover="this.setAttribute('scrollamount', 0, 0);" onmouseout="this.setAttribute('scrollamount', 6, 0);">
                    <table border="1" width="100%" class="thirdcol">
                    <thead>
                        <tr>
                            <th colspan="5">
                                These Are MostWanted Person...
                            </th>
                        </tr>
                    </thead>
                    <tbody>

                    
                    <tr>
                        <td>
                            Image
                        </td>
                        <td>
                            Name
                        </td>
                        <td>
                            Gender
                        </td>
                        <td>
                            Station Name
                        </td>
                        <td>
                            Contact On 
                        </td>
                    </tr>
                    <%
                    try{
                        
                        DBconnect db = new DBconnect();
                        Connection con = db.getDBconnection();
                        Statement st1= con.createStatement();
                        
                        String qry = "SELECT * FROM criminaldetails WHERE isMW='Y'";
                        
                        ResultSet rs = st1.executeQuery(qry);
                       
                        while (rs.next()) {
                            out.println("<tr>");
                            out.println("<td><image src=\"DisplayImageMW?id="+ rs.getString("imgaddress") +"\" height=50 width=50 ></td>");
                            out.println("<td>" + rs.getString("CriminalName") + "</td>");
                            out.println("<td>" + rs.getString("Gender") + "</td>");
                            out.println("<td>" + rs.getString("StationName") + "</td>");
                          out.println("<td>" + rs.getString("contact") + "</td>");
                           
                            out.println("</tr>");
                        }
                        
                    }catch(Exception e){
                        
                      
                    }
                    %></tbody>
                </table>
                &nbsp;&nbsp;&nbsp;
              <table border="1" width="100%" class="thirdcol">
                    <thead>
                        <tr>
                            <th colspan="5">
                                Latest Crime News
                            </th>
                        </tr>
                    </thead>
                    <tbody>

                    
                    <tr>
                       
                        <td>
                           Title
                        </td>
                        <td>
                           Details
                        </td>
                    </tr>
                    <%
                    try{
                        
                        DBconnect db = new DBconnect();
                        Connection con = db.getDBconnection();
                        Statement st1= con.createStatement();
                        
                        String qry = "SELECT * FROM crimenews";
                        
                        ResultSet rs = st1.executeQuery(qry);
                       
                        while (rs.next()) {
                            out.println("<tr>");
                            
                            out.println("<td>" + rs.getString("Title") + "</td>");
                            out.println("<td>" + rs.getString("Description") + "</td>");
                         
                           
                            out.println("</tr>");
                        }
                        
                    }catch(Exception e){
                        
                      
                    }
                    %></tbody>
                </table>
                </marquee>
            </div>
           
            <div id="loginpanel" class="fourthcol" style=" height:100%; width:30%; position:fixed; top:auto; left:70%; ">
                <form name="Login" action="Login" method="POST">
                    <table BORDER=1  width="100%" height="150">
                        <tr>
                            <td c colspan="2">
                                <b> <input type="radio" name="select" value="u" />User </b></br>
                                <b> <input type="radio" name="select" value="s" />Station</b>
                            </td>

                        </tr>
                        <tr>
                            <td><b>USERNAME</b></td>
                            <td>
                                <input type="text" name="uname" value="" />
                            </td>

                        </tr>
                        <tr>
                            <td><b>PASSWORD</b></td>
                            <td>
                                <input type="password" name="pass" value="" />
                            </td>

                        </tr>
                        <tr>
                            <td ALIGN=CENTER VALIGN=MIDDLE colspan="2"><input type="submit" value="Login" name="Login" /></td>
                        </tr>
                        <tr>
                            <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <a href="userreg.jsp">NEW USER REGISTRATION</a>
                            </td>
                        </tr>



                    </table>
                </form>
            </div>
        </div>
        <div id="footer" align="center">
            <p class="copyright"><font size=2> </font></p>
        </div>



    </body>
</html>