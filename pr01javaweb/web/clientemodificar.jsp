<%-- 
    Document   : clientemodifcar
    Created on : 08-ene-2018, 16:10:47
    Author     : RJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ClienteModificarController" method="POST">
            <input type="hidden" name="cli_id" value="${cliente.getCli_id()}">
            <input type="text" name="cli_nombre" value="${cliente.getCli_nombre()}">
            <input type="text" name="cli_apellidos" value="${cliente.getCli_apellidos()}">
            <input type="text" name="cli_email" value="${cliente.getCli_email()}">
            <input type="text" name="cli_cuentabancaria" value="${cliente.getCli_cuentabancaria()}">
            <input type="submit" value="Modificar">
        </form>
    </body>
</html>
