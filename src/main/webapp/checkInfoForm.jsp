<%--
  Created by IntelliJ IDEA.
  User: K
  Date: 15.12.2019
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<jsp:useBean id = "samochód" class = "pl.altkom.CarBean" scope="session"/>
<%--<jsp:setProperty name="autko" property="make"/>--%>
<%--<jsp:setProperty name="autko" property="type"/>--%>
<%--<jsp:setProperty name="autko" property="year"/>--%>
<%--<jsp:setProperty name="autko" property="distance"/>--%>
<%--<jsp:setProperty name="autko" property="capacity"/>--%>

<jsp:setProperty name="samochód" property="*"/>

<table>
    <tr>
        <td>Marka</td>
        <td><c:out value=" ${samochód.make}"/>
        </td>
      <%--  powyżej jest odwołanie do pola zmiennej zamiast tego poniżej
        <td><jsp:getProperty name="samochód" property="make"/></td>--%>
    </tr>
    <tr>
        <td>Typ</td>
        <td><c:out value=" ${samochód.type}"/>
    </tr>
    <tr>
        <td>Rok produkcji</td>
        <td><c:out value=" ${samochód.year}"/>
    </tr>
    <tr>
        <td>Przebieg</td>
        <td><c:out value=" ${samochód.distance}"/>
    </tr>
    <tr>
        <td>Pojemność</td>
        <td><c:out value=" ${samochód.capacity}"/>
    </tr>
</table>

<form action="carInfoForm.jsp">
    <input type="submit" value="Edytuj">

</form>

<form action="add_car_info">
    <input type="submit" value="Zapisz samochód">
    <%--<input type="hidden" name="make" value='<%= request.getParameter("make")%>'>
    <input type="hidden" name="type" value='<%= request.getParameter("type")%>'>
    <input type="hidden" name="year" value='<%= request.getParameter("production_year")%>'>
    <input type="hidden" name="distance" value='<%= request.getParameter("millage")%>'>
    <input type="hidden" name="capacity" value='<%= request.getParameter("capacity")%>'>
    <input type="submit" value="Zapisz samochód">--%>
</form>

<%@include file="footer.html"%>
</body>
</html>
