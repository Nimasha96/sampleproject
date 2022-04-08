<%-- 
    Document   : shop.jsp
    Created on : Feb 26, 2020, 12:39:36 AM
    Author     : Nimasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Pge</title>
    </head>
    <body>
        <html>
    <head>
        <title>login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body style="background-color: lightgrey;">
    <center>
        <form action="shop" method="post">
            <table border="1"  cellpadding="5" style="background-color: white;" >
                <thead>
                    <tr>
                        <th colspan="2"><font size="4"><b>Login Form</b></font></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><input type="text" name="username" placeholder="User name" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="Password" name="password" placeholder="Password" required/>
                        </td>
                    </tr>
                <br> 
                <br>
                    <tr>
                        <td colspan="2" align="center" ><input type="submit" value="Login"/>
                            &nbsp;&nbsp;
                             <p>Need a Account?<a href="newjsregister.jsp">Register</a>
                        </td>
                    </tr>   
                </tbody>
            </table>
        </form> 
    </center>
    </body>
</html>

    </body>
</html>
