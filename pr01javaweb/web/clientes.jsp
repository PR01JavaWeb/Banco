<%-- 
    Document   : clientes
    Created on : 11-dic-2017, 16:51:14
    Author     : Oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Clientes</h1>
        <p>Aqui va la tabla</p>
        <a href="clientemodificarcontroller?id=<% out.println(cliente.getCli_id()); %>">Modificar</a>
    </body>
</html>
