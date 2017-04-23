
<html>
    <head>
        <title>Welcome User</title>
        <link rel="stylesheet" type="text/css" href="allcss.css"></link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 

    </head>
    <body class="secondcol">
                 <%
            String username = null;
            String flag = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user")) {
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
            <marquee><h1><font color="red" size="5">Welcome you are successfully logged In</font></h1></marquee>
           
           <div id="menu">
               <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>  &nbsp;&nbsp;<b>  <a href="<%=request.getContextPath()%>/LogOut">LogOut</a></b>
            </div>
            
        </div>
        <div id="Wrapper">
            <!-- start page -->
            <div id="missing" class="firstcol" style=" height:70%; width:25%; position:fixed; top:auto; left:0%; ">
                <img src='img/hate-crime-banner.png' alt='NO content to show' height=100% width="100%" />
            </div>
            <div id="mostwanted" class="bgbody" style=" height:70%; width:50%; position:fixed; top:auto; left:25%; ">
                <table BORDER=1  width="100%" height="80%">
                     <thead>
                            <tr>

                                <th colspan="2"><font size="5" color="red">User Panel</font></th>
                            </tr>
                        </thead>
                        <tbody>
                    <tr>
                        <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                            <b><a href="addfir.jsp" ><font size="4" color="maroon">Add FIR</font></a></b></br>
                           
                        </td>

                    </tr>
                    <tr>
                       <td  ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                           <b><a href="viewcomplaintstat.jsp" ><font size="4" color="maroon">View Complaint Status</font></a></b></br>
                           
                        </td> 
                   </tr>
                   <tr>
                       <td  ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                           <b><font color="maroon"><a href="missphoto.jsp" ><font size="4" color="maroon">Add Missing Report</font></a></font></b></br>
                           
                        </td>
                        
                   </tr>
                  
                  
                    <tr>
                       <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                           <h1><font color="red">Contact Station:100</font></h1>
                       </td>
                   </tr>
                        </tbody>
                   
                </table>
            </div>
            <div id="crimenews" class="thirdcol" style=" height:70%; width:25%; position:fixed; top:auto; left:75%; ">
               <img src='img/Maharashtra-Police.jpg' alt='NO content to show' height=100% width="100%" />
            </div>
           
        <div id="footer" align="center">
            <p class="copyright"><font size=2> </font></p>
        </div>



    </body>
</html>

