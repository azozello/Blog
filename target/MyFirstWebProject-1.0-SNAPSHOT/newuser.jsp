<%@ page import="classes.Article" %>
<%@ page import="classes.DataBase" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.12.2016
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<form action="CreateNewUser">
    <table>
        <tr>
            <td>User name</td><td><input type="text" name="login" size="20"></td>
        </tr>
        <tr>
            <td>Password</td><td><input type="password" name="pass1" size="20"></td>
        </tr>
        <tr>
            <td>ConfirmPassword</td><td><input type="password" name="pass2" size="20"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create new user"></td>
        </tr>
    </table>
</form>
</body>
</html>
