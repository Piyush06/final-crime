<%-- 
    Document   : stationreg
    Created on : Dec 28, 2013, 4:48:28 PM
    Author     : Prabudha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STATION REGISTRATION</title>
        <link rel="stylesheet" type="text/css" href="allcss.css"/>
    </head>
    <body class="fourthcol">
           <div id="header" style="width: 100%; height:auto;background-image: url(img/bruisedbeauty.jpg);">
            <div id="logo">
                <img src="img/Maharashtra-Police.jpg" width="100%" height="200" alt="hate-crime-banner"/>

           
            </div>
                   <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="AboutUS.html">About Us</a></b>&nbsp;&nbsp;  
            </div>

               <div id="Wrapper" style="height: 100%; top: auto;">
                <div id="RegForm" style="width: 100%;top: auto; height: 100%; left: 10%; " >
                       <form action="SubmitStation" method="post">
                           <table width="80%" align="CENTER" valign="middle" border="3" width="100%" style="background-image: url(img/fantasia.jpg);">
                        <thead>
                            <tr>

                                <th colspan="2"><font size="5" color="red">Station Registration Form</font></th>
                            </tr>
                        </thead>
                        <tbody>
                             <tr>
                                <td>User Name</td>
                                <td><input type="text" name="uname" value="" /></td>
                            </tr>
                            <tr>
                                <td>Station Name</td>
                                <td><input type="text" name="s_name" value="" /></td>
                            </tr>
                            <tr>
                                <td>Station Head Name</td>
                                <td><input type="text" name="s_headname" value="" /></td>
                            </tr>
                            
                         
                              <tr>
                                 <td>Enter Password</td>
                                
                                <td><input type="password" name="password1" value=""   /></td>
                            </tr>
                           
                            <tr>
                                <td>ReEnter Password</td>
                                
                                <td><input type="password" name="repassword1" value=""   /></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><textarea name="address" rows="4" cols="20">
                                    </textarea></td>
                            </tr>
                            <tr>
                                <td>Contact No</td>
                                <td><input type="text" name="contactno" value="" /></td>
                            </tr>
                            <tr>
                                <td>Email Id</td>
                                <td><input type="text" name="email" value="" /></td>
                            </tr>
                            
                             <tr>
                                 <td align="CENTER" colspan="2"><input type="submit" value="Submit" /></td>
                                
                            </tr>
                        </tbody>
                
                    
</table>
                        
                </form>   
                    
                
            </div>
            
        </div>
    </body>
</html>
