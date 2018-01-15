/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ClienteDAO;
import model.Conexion;

public class ClienteNuevoController extends HttpServlet {

    // Se conecta a la BBDD
    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();

    // Crea el constructor vacio
    ClienteDAO cdao = new ClienteDAO();

    String cli_nombre;
    String cli_apellidos;
    String cli_email;
    String cli_cuentabancaria;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        cli_nombre = request.getParameter("cli_nombre");
        cli_apellidos = request.getParameter("cli_apellidos");
        cli_email = request.getParameter("cli_email");
        cli_cuentabancaria = request.getParameter("cli_cuentabancaria");

        cdao.nuevoCliente(cli_nombre, cli_apellidos, cli_email, cli_cuentabancaria);
        response.sendRedirect("ClienteController");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
