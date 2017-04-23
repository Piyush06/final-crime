<%-- 
    Document   : missphoto
    Created on : Feb 24, 2014, 12:52:48 AM
    Author     : Vishal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="allcss.css"></link>
        <title>Upload Photo</title>
    </head>
    <body class="secondcol">
                
        <!-- start header -->
        <div id="header">
            <div id="logo">

                <img src='img/Crime-scene-do-not-cross-banner.jpg' alt='NO content to show' height=200 width="100%" />
               
            </div>
           
           <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>&nbsp;&nbsp;  
            
        </div>
             
        <%
            String username = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("station") || cookie.getName().equals("user")) {
                        username = cookie.getValue();
                    }
                }
            }
            if (username == null) {
                response.sendRedirect("HomePage.jsp");
            }
        %>
        
        <form action="UploadMissing" method="POST" enctype="multipart/form-data">
            <table border="1" ALIGN="center" class="thirdcol">
                <tr>
                    <td colspan="2">
                        Upload Missing Person's Photo
                    </td>
                    
                </tr>
                 <tr>
                    <td>
                        Select Photo
                    </td>
                     <td>
                         <input type="file" name="photo" value="" />
                    </td>
                </tr>
                 <tr>
                   
                     <td  colspan="2" ALIGN="center">
                         <input type="submit" value="Upload" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
