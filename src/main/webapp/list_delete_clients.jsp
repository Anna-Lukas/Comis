<%@ page import="java.util.List" %>
<%@ page import="pl.altkom.Client" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 15.12.2019
  Time: 10:28
  To change this template use File | Settings | File Templates.


  1. Serwlet odczytuje listę użytkowników
  2. servlet dodaje użytkowników jako artybuty requesta
  3.servlet forevarduje requesta i responsa do strony jsp
  4. strona jsp pokazuje drop listę z użytkownikami
  5. strona jsp przekazuje wybranego użytkownika do serwletu
  6.serwlet usuwa użytkownika


--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%Object oClients = request.getAttribute("clients");%>
<% List clients = (List) oClients;%>

<form action="delete_client">
    <select name = "client">
        <%for(Object o :clients){%>
        <% Client c = (Client)  o;%>
        <option><%= c.getFirstName()%> <%= c.getLastName()%></option>
        <%}%>
        </select>
    <input type = "submit" value="Usuń"/>
</form>
    </body>
</html>
