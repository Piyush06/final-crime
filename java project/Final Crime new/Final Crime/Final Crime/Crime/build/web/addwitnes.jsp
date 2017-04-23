<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.DBconnect.DBconnect"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD WITNESS</title>
        <link rel="stylesheet" type="text/css" href="allcss.css"/>
    </head>
    <body class="bgbody">
           <div id="header" style="width: 100%; height:auto;background-image: url(img/bruisedbeauty.jpg);">
            <div id="logo">
                <img src="img/Maharashtra-Police.jpg" width="100%" height="200" alt="hate-crime-banner"/>

           
            </div>
                   <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="AboutUS.html">About Us</a></b>&nbsp;&nbsp;  <a href="<%=request.getContextPath()%>/LogOut">LogOut</a>
            </div>

               <div id="Wrapper" style="height: 100%; top: auto;">
                <div id="RegForm"style="width: 100%;top: auto; height: 100%; left: 10%; " >
                       <form action="SubmitWitness" method="post">
                           <table width="80%" align="CENTER" valign="middle" border="3" width="100%" class="firstcol">
                        <thead>
                            <tr>

                                <th colspan="2"><font size="5" color="Green">ADD WITNESS</font></th>
                            </tr>
                        </thead>
                        <tbody>
                             <tr>
                                <td>Witness Name</td>
                                <td><input type="text" name="wname" value="" /></td>
                            </tr>
                           
   
                          <tr>
                                <td>Date</td>
                                <td><input type="text" name="date" value="" /></td>
                            </tr>
                            
                            
                            <tr>
                                 <%
                                        DBconnect db = new DBconnect();
                                        Connection con = db.getDBconnection();
                                        Statement st = con.createStatement();                                        
                                        String qry = "SELECT * FROM stationdetails";
                                        ResultSet rs = st.executeQuery(qry);
                                        out.println("<td id=\"s_name\">Station Name</td>");
                                        while(rs.next()){
                                            out.println("<td>");
                                      out.println("<input name=\"sname\" type=\"text\" value=\"" + rs.getString("StationName") + "\" readonly=\"readonly\">");
                                               out.println("</td>");                                 }
                                    %>
                            </tr>
                             
                            <tr>
                                <td>Witness Address</td>
                                <td><textarea name="address" rows="4" cols="20">
                                    </textarea></td>
                            </tr> 
                             <tr>
                                <td>Witness Contact</td>
                                <td><input type="text" name="w_contact" value="" /></td>
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
                                <td>Gender</td>
                                <td>
                                    <select name="Gender">
                                        
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select></td>
                            </tr>
                             <tr>
                                <td>Age</td>
                                <td><input type="text" name="age" value="" /></td>
                            </tr>
                             <tr>
                                <%
                                out.println("<td><input name=\"crid\" type=\"text\" value=\"" + request.getParameter("id") + "\" readonly=\"readonly\" hidden=\"\"></td>");
                                %>
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
