<%-- 
    Document   : clientes
    Created on : 11-dic-2017, 16:51:14
    Author     : Oscar
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 60%;            
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1 style="text-align:center;">Banco DAW 2 - Clientes</h1>
        <% ArrayList<Cliente> milistacliente = (ArrayList<Cliente>) request.getAttribute("milistacliente");%>
        <table align="center">
            <tr>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Email</th>
                <th>Cuenta bancaria</th>
                <th>Acciones</th>
            </tr>
            <% for (Cliente client : milistacliente) {%>
            <tr>
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
            </tr>       
            <% }%>
        </table>
    </table>
</body>
</html