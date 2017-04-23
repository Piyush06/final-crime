<%-- 
    Document   : addstatus
    Created on : Feb 26, 2014, 12:41:57 PM
    Author     : Vishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="allcss.css"/>
        <title>Add Complaint Status</title>
    </head>
       <body class="fourthcol">
        <%
            String username = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("station")||cookie.getName().equals("user")) {
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
                    <form action="AddCompStatus" method="post">
                 
                        <table width="80%" align="CENTER" valign="middle" border="3" width="100%" style="background-image: url(img/sparklestream.jpg);">
                            <thead>
                                <tr>
                                    <th colspan="2">
                                        Update Complain Status
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                 <tr>
                                    <td>Complaint Id</td>
                                    <td><input type="text" name="cmp_id" value="<%= request.getParameter("id") %>" readonly="readonly" /></td>
                                </tr>
                                <tr>
                                    <td>Complaint Status</td>
                                    <td><textarea name="status" rows="10" cols="20">
                                        </textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2" VALIGN="center"><input type="submit" value="Submit" name="Submit" /></td>
                                    
                                </tr>
                            </tbody>
                        </table>
                    </form>   


                </div>

            </div>
    </body>
</html>
