<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 14.12.2019
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr,th,td {border: 1px solid; border-collapse: collapse; text-alin:center}
    </style>
</head>
<body>



<%!
    int silnia(int n){
    if (n <= 1) return 1;
    return n*silnia(n-1);
}
%>

<% int n = 0;%> <%--//Zmienna lokalna tworzona naczas pisania zapytania--%>
<%Object p = request.getParameter("n");%>
<%if (p!= null) n =Integer.parseInt(p.toString());%>

<table>
    <tr>
        <th>n</th>
        <th>n!</th>
    </tr>

    <%for (int i = 1; i<=n; i++){%>
    </tr>
    <td><%= i%></td>
    <td><%=silnia(i)%></td>

    </tr>
    <%}%>
</table>
</body>
</html>
