/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaNegocio;

import capaConexion.Conexion;
import capaDatos.DetalleCuentasBancarias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Milagros
 */
public class DetalleCuentaBancariasBD {
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;
    
     public DefaultTableModel buscarDetalleCuentasBancarias(String ruc) {
        DefaultTableModel tabla_temporal;
        String[] titulos = {"ID", "BANCO", "CUENTA", "NROCUENTA", "RUC"};
        String[] registros = new String[5];
        tabla_temporal = new DefaultTableModel(null, titulos);
        sql = "SELECT iddetallecuentasbancarias,banco,cuenta,nroCuenta,provRuc FROM detallecuentasbancarias "
                + "WHERE provRuc=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, ruc);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("iddetallecuentasbancarias");
                registros[1] = rs.getString("banco");
                registros[2] = rs.getString("cuenta");
                registros[3] = rs.getString("nroCuenta");
                registros[4] = rs.getString("provRuc");
             
               
                tabla_temporal.addRow(registros);
            }
            return tabla_temporal;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar DetalleCuentasBancarias BD", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }
     
      public boolean registrarDetalleCuentasBancarias(DetalleCuentasBancarias d) {
        boolean rpta = false;
        sql = "INSERT INTO detallecuentasbancarias(iddetallecuentasbancarias,banco,cuenta,nroCuenta,provRuc) VALUES(NULL,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, d.getBanco());
            pst.setString(2, d.getCuenta());
            pst.setString(3, d.getNroCuenta());
            pst.setString(4, d.getProvRuc());
            

            rpta = pst.executeUpdate() == 1 ? true : false;
            
            pst.close();
            cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar DetalleCuentaBancarias BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }
      
      
        public boolean eliminarDetalleCuentaBancarias(int idcuentas) {
        boolean rpta = false;
        sql = "DELETE FROM detallecuentasbancarias WHERE iddetallecuentasbancarias=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idcuentas);

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar Detalle Cuentas Bancarias BD", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;

    }
    
}
