<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">


    <title>Dodaj użytkownika</title>
</head>
<body>
<form action = "add_user" method="post">
    Imię: <input type = "text" name="firstName"><br>
    Nazwiko: <input type = "text" name="lastName"><br>
    Wiek:

    <select name = "age">
        <% for (int i=1; i<=100; i ++){%>
        <option> <%= i%></option>
        <%}%>

    </select><br>
    Region:
    <select name = "region">
        <option>małopolska</option>
        <option>wielkopolska</option>
    </select><br>

      Płeć:<br>
        <input type="radio" name = "sex" value="Male"> Meżczyzna<br>
        <input type="radio" name = "sex" value="Male"> Kobieta<br>
        <input type="submit" value="Utwórz użytkownika">

</form>
</body>
</html>