<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 13/05/2024
  Time: 11:47 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro de Usuario</title>
        <link rel="stylesheet" type="text/css" href="styles/register.css">
    </head>
<body>
<h2>Registro de Usuario</h2>

<form action="register" method="post">
    <label for="username">Nombre de Usuario:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="Registrarse">
</form>

</body>
</html>

