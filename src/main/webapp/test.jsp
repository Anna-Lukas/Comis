<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: student
  Date: 14.12.2019
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testowa strona jsp</title>
</head>
<body>
<%!int counter = 0;%>
<%counter++;%>

<br><br>

<%= LocalDate.now()%>

<br><br>

<ul>
    <%for(int i = 0; i<10;i++){%>
    <%--<% out.print(i); %>--%>
    <li>
        <%= i%><br>

    </li>
    <%}%>

</ul>
</body>
</html>
