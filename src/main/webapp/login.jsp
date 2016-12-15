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
    <title>Login</title>
</head>
<body>
<form action="doLogin">
    <table>
        <tr>
            <td>User name</td><td><input type="text" name="login" size="20"></td>
        </tr>
        <tr>
            <td>Password</td><td><input type="password" name="pass" size="20"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Log in"></td>
        </tr>
    </table>
</form>
<form action="newuser.jsp">
    <input type="submit" value="Create new user">
</form>
</body>
</html>
