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
    <title>New Article</title>
</head>
<body>
<form action="CreateNewArticle">
    <table>
        <tr>
            <td><input type="text" name="title" width="30%" height="10%"></td>
        </tr>
        <tr>
            <td><input type="text" name="text" width="60%" height="40%"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Post article"></td>
        </tr>
    </table>
</form>
</body>
</html>
