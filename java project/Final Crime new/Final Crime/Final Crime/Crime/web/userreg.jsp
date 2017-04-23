<%-- 
    Document   : userreg
    Created on : Dec 28, 2013, 2:50:09 PM
    Author     : Prabudha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" type="text/css" href="allcss.css"/>

        <title>User Registration</title>
        <script>
            function validateform(form)
            {
                if(document.insert.fname.value=="")
                {
                    alert("First Name should not be empty");
                    document.insert.fname.focus();
                    return false;
                }
                if(document.insert.mname.value=="")
                {
                    alert("Middle Name should not be empty");
                    document.insert.mname.focus();
                    return false;
                }
                if(document.insert.lname.value=="")
                {
                    alert("Last Name should not be empty");
                    document.insert.lname.focus();
                    return false;
                }
                if(document.insert.txtusername.value=="")
                {
                    alert("UserName should not be empty");
                    document.insert.txtusername.focus();
                    return false;
                }
                if(document.insert.txtpassword.value=="")
                {
                    alert("Passwod doesnt match");
                    document.insert.txtpassword1.focus();
                    return false;
                }
                if(document.insert.txtpassword.value!="")
                {
                     var y=document.insert.txtpassword.value;
                      var x=document.insert.txtpassword1.value;
                      if(x!=y)
                          {
                            alert("Passwod doesnt match");
                    document.insert.txtpassword1.focus();
                    return false;   
                          }
                   
                }
                if(document.insert.contactno.value=="")
                {
                    alert("Contact No Is Compulsary.....");
                    document.insert.contactno.focus();
                    return false;
                }
                if(document.insert.contactno.value!="")
                {
                    var y=document.insert.contactno.value;
                    if(isNaN(y)||y.indexOf(" ")!=-1)
                    {
                        alert("Invalid Mobile No.");
                        document.insert.contactno.focus();
                        return false;
                    }

                    if (y.length>10 || y.length<10)
                    {
                        alert("Mobile No. should be 10 digit");
                        document.insert.contactno.focus();
                        return false;
                    }
                    if (!(y.charAt(0)=="9" || y.charAt(0)=="8" || y.charAt(0)=="7"))
                    {
                        alert("Mobile No. should start with 9 ,8 or 7 ");
                        document.insert.contactno.focus();
                        return false
                    }
                }
                 if(document.insert.email.value=="")
                     {
                          alert("Email should not be empty..");
                        document.insert.email.focus();
                        return false;
                     }
                if(document.insert.email.value!="")
                {
                    var str=document.insert.email.value;
                    var at="@"
                    var dot="."
                    if (str.indexOf(at)<1 ){
                        alert("Invalid E-mail ID")
 
                        return false
                    }
                }
            }
        
        </script>
    </head>
    <body>
        <div id="header" style="width: 100%;" class="fourthcol">
            <div id="logo">
                <img src="img/criminal-banner.png" width="100%" height="200" alt="hate-crime-banner"/>


            </div>
            <div id="menu">
                <b><a href="HomePage.jsp">Home</a></b>&nbsp;&nbsp;   <b><a href="AboutUS.html">About Us</a></b>&nbsp;&nbsp;  
            </div>
        </div>
        <div id="Wrapper" class="fourthcol">
                <div id="RegForm" style="width: 100%; height: auto; top: auto;  " >
                    <form action="SubmitUser" method="post" name="insert"  onsubmit="return validateform(this);">
                        <table  border="3" width="80%" ALIGN=CENTER VALIGN=MIDDLE >
                            <thead>
                                <tr>

                                    <th colspan="2"><font size="5" color="blue">User Registration Form</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>First Name</td>
                                    <td><input type="text" name="fname" value="" /></td>
                                </tr>
                                <tr>
                                    <td>Middle Name</td>
                                    <td><input type="text" name="mname" value="" /></td>
                                </tr>
                                <tr>
                                    <td>Last Name</td>
                                    <td><input type="text" name="lname" value="" /></td>
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
                                    <td>Enter UserName</td>

                                    <td><input type="text" name="txtusername" value="" /></td>
                                </tr>
                                <tr>

                                </tr>
                                <tr>
                                    <td>Enter Password</td>

                                    <td><input type="password" name="txtpassword" value=""  /></td>
                                </tr>
                                <tr>
                                    <td>ReEnter Password</td>

                                    <td><input type="password" name="txtpassword1" value=""   /></td>
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
                                    <td>Date of Birth(dd/mm/yyyy)</td>
                                    <td><input type="text" name="DOB" value="" /></td>
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
