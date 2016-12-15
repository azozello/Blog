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
    <%
        Article a = DataBase.getArticle(Integer.parseInt(request.getParameter("id")));
        String title = a.getTitle();
        String text = a.getText();
    %>
    <title><%=title%></title>
</head>
<body>
<p>
<form action="Logout">
    <input type="submit" value="Logout">
</form>
<h1><%=title%></h1>
<h3><%=text%></h3>
</p>
</body>
</html>
