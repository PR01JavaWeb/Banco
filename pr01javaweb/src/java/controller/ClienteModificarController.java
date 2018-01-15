package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Conexion;

/**
 *
 * @author RJ
 */
@WebServlet(name = "ClienteModificarController", urlPatterns = {"/ClienteModificarController"})
public class ClienteModificarController extends HttpServlet {

    Conexion cn = new Conexion();
    Connection con = cn.conectar();
  int id;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            id = Integer.valueOf(request.getParameter("id"));
            //Recupera los datos del usuario
            String sql = "SELECT * FROM cliente WHERE cli_id=" + id;
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Avanza una posición del Result Set porque por defecto esta en la posición -1.
            rs.next();

            Cliente cliente = new Cliente();
            cliente.setCli_id(rs.getInt("cli_id"));
            cliente.setCli_nombre(rs.getString("cli_nombre"));
            cliente.setCli_apellidos(rs.getString("cli_apellidos"));
            cliente.setCli_email(rs.getString("cli_email"));
            cliente.setCli_cuentabancaria(rs.getString("cli_cuentabancaria"));

            request.setAttribute("cliente", cliente);

            request.getRequestDispatcher("clientemodificar.jsp").forward(request, response);
        } catch (SQLException ex) {
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

      
        String cli_nombre = request.getParameter("cli_nombre");
        String cli_apellidos = request.getParameter("cli_apellidos");
        String cli_email = request.getParameter("cli_email");
        String cli_cuentabancaria = request.getParameter("cli_cuentabancaria");        

        try {
            PreparedStatement ps = con.prepareStatement("UPDATE cliente SET cli_nombre=?, cli_apellidos=?, cli_email=?, cli_cuentabancaria=? WHERE cli_id=?");

            ps.setString(1, cli_nombre);
            ps.setString(2, cli_apellidos);
            ps.setString(3, cli_email);
            ps.setString(4, cli_cuentabancaria);
            ps.setInt(5, id);

            ps.executeUpdate();
            
            response.sendRedirect("ClienteController");
            
        } catch (SQLException ex) {

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
