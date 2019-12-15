<%@ page import="java.util.List" %>
<%@ page import="pl.altkom.Client" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 15.12.2019
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Imie</th>
        <th>Nazwisko</th>
        <th>Wiek</th>
        <th>Region</th>
        <th>Plec</th>
        <th>Akcja</th>
    </tr>



    <%Object oClient = request.getAttribute("clients");%>
    <%List clients = (List) oClient;%>
    <%for (Object o : clients) {%>
    <% Client c = (Client) o;%>

    <tr>
        <td><%=c.getId() %></td>
        <td><%=c.getFirstName()%></td>
        <td><%=c.getLastName()%></td>
        <td><%=c.getAge()%></td>
        <td><%=c.getRegion()%></td>
        <td><%=c.getSex()%></td>

        <td>
        <form action="delete_user_by_ID">
            <input type = "text" name="id" value="<%=c.getId()%>"> <%-- taki farmulaż umieszcza tu id--%>
            <input type="submit" value="Usuń">
        </form>
        </td>
    </tr>
    <%}%>

</table>
</body>
</html>
