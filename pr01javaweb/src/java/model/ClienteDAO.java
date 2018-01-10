/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conexion;

public class ClienteDAO {

    // Conecta con la BBDD
    Conexion conexion = new Conexion();
    Connection con = conexion.conectar();

    // Se crea una clase vacia con el id que se recogerá del clientes.jsp
    public void eliminarClient(int id) {
        // String con la eliminación del cliente segun el id
        String sql = "DELETE from cliente where cli_id=?";
        try {
            // Se prepara el statamente para la consulta sql
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            // Se ejecuta 
            int n = pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    

}
