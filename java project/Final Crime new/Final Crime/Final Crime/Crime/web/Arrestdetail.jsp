<%-- 
    Document   : Arrestdetail
    Created on : Jan 3, 2014, 8:24:45 PM
    Author     : Prabudha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arrest Details</title>
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
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="AboutUS.html">About Us</a></b>&nbsp;&nbsp;  <a href="<%=request.getContextPath()%>/LogOut">LogOut</a>
            </div>

               <div id="Wrapper" style="height: 100%; top: auto;">
                <div id="RegForm" style="width: 100%;top: auto; height: 100%; left: 10%; " >
                       <form action="SubmitArrested" method="post">
                           <table width="80%" align="CENTER" valign="middle" border="3" width="100%" style="background-image: url(img/fantasia.jpg);">
                        <thead>
                            <tr>

                                <th colspan="2"><font size="5" color="red">Arrest Details</font></th>
                            </tr>
                        </thead>
                        <tbody>
                            
                             <tr>
                                <td>Arrest person Name</td>
                                <td><input type="text" name="prsn_name" value="" /></td>
                            </tr>
                            <tr>
                                <td>Station Head</td>
                                <td><input type="text" name="st_head" value="" /></td>
                            </tr>
                            
                         
                             
                            <tr>
                                <td>Matter</td>
                                <td><textarea name="matter" rows="4" cols="20">
                                    </textarea></td>
                            </tr>
                            <tr>
                                <td>Arrest Date</td>
                                <td><input type="text" name="arr_date" value="" /></td>
                            </tr>
                             <tr>
                                <td>Arrest Time</td>
                                <td><input type="text" name="arr_time" value="" /></td>
                            </tr>
                            
                            
                            <tr>
                                <td>Station Name</td>
                                <td><input type="text" name="st_name" value="" /></td>
                            </tr>
                             <tr>
                                <td>Arrest person Address</td>
                                <td><textarea name="address" rows="4" cols="20">
                                    </textarea></td>
                            </tr> 
                            <tr>
                                <td>City</td>
                                <td><input type="text" name="city" value="" /></td>
                            </tr>
                             <tr>
                                <td>State</td>
                                <td><input type="text" name="state" value="" /></td>
                            </tr>
                            
                             <tr>
                                 <td align="right"><input type="submit" value="Submit" /></td>
                                 <td align="left"><input type="reset" value="Reset" name="reset" /></td>
                                
                            </tr>
                        </tbody>
                
                    
</table>
                        
                </form>   
                    
                
            </div>
            
        </div>
    </body>
</html>
