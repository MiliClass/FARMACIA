/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.Marca;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Milagros
 */
public class MarcaBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarMarca() {

        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRE"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT idmarca,maNombre FROM marca";
        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("idmarca");
                registros[1] = rs.getString("maNombre");

                modelo.addRow(registros);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR MARCA", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }

    public boolean registrarMarca(Marca m) {
        boolean rpta = false;

        sql = "INSERT INTO marca(idmarca,maNombre) VALUES (0,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, m.getMaNombre());

            rpta = pst.executeUpdate() == 1 ? true : false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL REGISTRAR MARCA...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

    public boolean modificarMarca(Marca m) {
        boolean rpta = false;

        sql = "UPDATE marca SET  maNombre=? WHERE idmarca=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, m.getMaNombre());
            pst.setInt(2, m.getIdmarca());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return rpta;
        }
        return rpta;
    }

    public boolean eliminarMarca(int idmarca) {
        boolean rpta = false;
        sql = "DELETE FROM marca WHERE idmarca=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idmarca);
            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "PROBLEMAS AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

    public DefaultTableModel buscarMarca(String nombre) {
        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRE"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT idmarca,maNombre FROM marca WHERE maNombre LIKE ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, "%" + nombre + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idmarca");
                registros[1] = rs.getString("maNombre");

                modelo.addRow(registros);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar marca", JOptionPane.ERROR_MESSAGE);
            return null;

        }
        return modelo;

    }

}
