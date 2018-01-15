<%-- 
    Document   : clientenuevo
    Created on : 15-ene-2018, 15:25:08
    Author     : Oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo cliente</title>
    </head>
    <body>
        <form action="ClienteNuevoController" method="GET">            
            <input type="text" name="cli_nombre" placeholder="Nombre">
            <input type="text" name="cli_apellidos" placeholder="Apellidos">
            <input type="text" name="cli_email" placeholder="E-mail">
            <input type="text" name="cli_cuentabancaria" placeholder="Cuenta bancaria">
            <input type="submit" value="Crear">
        </form>
    </body>
</html>
