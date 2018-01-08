/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Cliente;

/**
 *
 * @author Oscar
 */
public class ClienteController extends HttpServlet {

    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Cliente> milistacliente = new ArrayList<Cliente>();
        
        try {
            String sql = "SELECT * FROM cliente";
            Statement st;

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCli_id(rs.getInt("cli_id"));
                cliente.setCli_nombre(rs.getString("cli_nombre"));
                cliente.setCli_apellidos(rs.getString("cli_apellidos"));
                cliente.setCli_email(rs.getString("cli_email"));
                cliente.setCli_cuentabancaria(rs.getString("cli_cuentabancaria"));
                milistacliente.add(cliente);
            }

            //JOptionPane.showMessageDialog(null, "Hola he llegado al controller");
            request.setAttribute("milistacliente", milistacliente);

            //en una sola linea hago lo mismo que lo que hay abajo comentado
            request.getRequestDispatcher("clientes.jsp").forward(request, response);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     *
     * @throws IOException if an I/O error occurs
     */
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
