<%-- 
    Document   : clientes
    Created on : 11-dic-2017, 16:51:14
    Author     : Oscar
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 65%;
            border: 3px solid #ddd;
        }

        td, th {
            border: 2px solid #ddd;
            text-align: center;
            padding: 8px;
        }
        th {
            background-color: #dddddd;
            text-align: center;
        }

    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1 style="text-align:center;">Banco DAW 2 - Clientes <a href="clientenuevo.jsp" class="btn btn-info" role="button">Crear</a></h1>
        <% ArrayList<Cliente> milistacliente = (ArrayList<Cliente>) request.getAttribute("milistacliente");%>
        <table align="center">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Email</th>
                <th>Cuenta bancaria</th>
                <th>Acciones</th>
            </tr>
            <% for (Cliente client : milistacliente) {%>
            <tr>
                <td>
                    <% out.println(client.getCli_id());%>
                </td>
                <td>
                    <% out.println(client.getCli_nombre());%>
                </td>
                <td>
                    <% out.println(client.getCli_apellidos());%>
                </td>
                <td>
                    <% out.println(client.getCli_email());%>
                </td>
                <td>
                    <% out.println(client.getCli_cuentabancaria());%>
                </td>
                <td> 
                    <a href="ClienteModificarController?id=<% out.println(client.getCli_id()); %>" class="btn btn-primary" role="button">Modificar</a>
                    <a href="ClienteEliminarController?id=<% out.println(client.getCli_id()); %>" class="btn btn-danger" role="button">Eliminar</a>
                </td>
            </tr>       
            <% }%>
        </table>
</body>
</html>
