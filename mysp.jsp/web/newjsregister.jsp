<%-- 
    Document   : newjsregister.jsp
    Created on : Feb 26, 2020, 12:08:31 PM
    Author     : Nimasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registation</title>
    </head>
<body style="background-color: bisque;">
    <center>
        <div class="container">
            <form action="register" method="post" name="newjsregister">
            <br>
            <br>
             <table border="1"  cellpadding="10"style="background-color: white;">
                  <thead>
                  <th colspan="2"><b><font size="4">Registration Form</b></font></th>
                         </thead>
                         <br>
                <tbody>
                   
                    <tr>          
                        <td>User Name :</td>
            <br>
            <td><input type="text" name="username" required/></td>
             </tr>
           
            <tr>
             <td>Password:</td>
            <td> <input type="password" name="password" required/></td>
             </tr>
            
           
            <tr>
            <td>Email :</td>
            <td> <input type="text" name="email" required/></td>
            </tr>

        </div>
</center>
    </body>
</html>
          <tr>
            <td> Address:</td>
           
                <td><input type="text" name="address" required/></td>
             </tr>
             <tr>
                
            <br>
            <td colspan="2" align="center"><input type="Submit" value="register" >
        <p> Already have a account?<a href="shop.jsp">Go Back</a></p></td>
             
</tr>
            </tbody>
            </table>
        </fo