
<html>
    <head>
        <title>Welcome Station</title>
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
            <marquee><h1><font color="purple" size="5">Welcome station you are successfully logged In</font></h1></marquee>

            <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="aboutus.jsp">About Us</a></b>&nbsp;&nbsp;  <b><a href="<%=request.getContextPath()%>/LogOut">LogOut</a></b>
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

                            <th colspan="2"><font size="5" color="red">Station Panel</font></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <b><a href="addfir.jsp" >Add FIR TO STATION</a></b></br>

                            </td>

                        </tr>
                        <tr>
                            <td  ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <b><a href="viewcomplaint.jsp" >View Complaint Status</a></b></br>

                            </td> 
                        </tr>
                        <tr>
                            <td  ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <b><a href="mwphoto.jsp" >ADD New Criminal Record</a></b></br>

                            </td>

                        </tr>
                        <tr>
                            <td  ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <b><a href="Addmostwanted.jsp" >ADD MostWanted</a></b></br>

                            </td>

                        </tr>

                        <tr>
                            <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <a href="missphoto.jsp"><b>ADD Missing Person</b></a>
                            </td>
                        </tr>
                        <tr>
                            <td ALIGN=CENTER VALIGN=MIDDLE colspan="2">
                                <h1><font color="Blue">24*7 SERVICE</font></h1>
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

