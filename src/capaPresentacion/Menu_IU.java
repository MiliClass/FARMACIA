/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Milagros
 */
public class Menu_IU extends javax.swing.JFrame {

    /**
     * Creates new form Menu_IU
     */
    public Menu_IU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/capaImagenes/FONDO.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jToolBar1 = new javax.swing.JToolBar();
        btnProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCompras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnIngresos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEgresos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCaja = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_mantenimiento = new javax.swing.JMenu();
        menu_item_tipoUsuario = new javax.swing.JMenuItem();
        menu_item_usuario = new javax.swing.JMenuItem();
        menu_item_turno = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menu_item_marca = new javax.swing.JMenuItem();
        menu_item_categoria = new javax.swing.JMenuItem();
        menu_item_medida = new javax.swing.JMenuItem();
        menu_item_producto = new javax.swing.JMenuItem();
        menu_item_composicion = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRESA X");
        setExtendedState(6);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(65, 145, 151));
        jToolBar1.setRollover(true);

        btnProductos.setBackground(new java.awt.Color(65, 145, 151));
        btnProductos.setForeground(new java.awt.Color(204, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/box.png"))); // NOI18N
        btnProductos.setEnabled(false);
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);
        jToolBar1.add(jSeparator1);

        btnCompras.setBackground(new java.awt.Color(65, 145, 151));
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/compra.png"))); // NOI18N
        btnCompras.setEnabled(false);
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);
        jToolBar1.add(jSeparator2);

        btnIngresos.setBackground(new java.awt.Color(65, 145, 151));
        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/ingresos.png"))); // NOI18N
        btnIngresos.setEnabled(false);
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);
        jToolBar1.add(jSeparator3);

        btnEgresos.setBackground(new java.awt.Color(65, 145, 151));
        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/egresos.png"))); // NOI18N
        btnEgresos.setEnabled(false);
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);
        jToolBar1.add(jSeparator4);

        btnVentas.setBackground(new java.awt.Color(65, 145, 151));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/venta1.png"))); // NOI18N
        btnVentas.setEnabled(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator5);

        btnCaja.setBackground(new java.awt.Color(65, 145, 151));
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/caja_1.png"))); // NOI18N
        btnCaja.setEnabled(false);
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCaja);
        jToolBar1.add(jSeparator7);

        btnCerrar.setBackground(new java.awt.Color(65, 145, 151));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/cerrar2.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar);

        menu_mantenimiento.setText("MANTENIMIENTO");

        menu_item_tipoUsuario.setText("Tipo de usuarios");
        menu_item_tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_tipoUsuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_tipoUsuario);

        menu_item_usuario.setText("Usuario");
        menu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_usuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_usuario);

        menu_item_turno.setText("Turno");
        menu_item_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_turnoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_turno);
        menu_mantenimiento.add(jSeparator6);

        menu_item_marca.setText("Laboratorio");
        menu_item_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_marcaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_marca);

        menu_item_categoria.setText("Categoria");
        menu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_categoriaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_categoria);

        menu_item_medida.setText("Medida");
        menu_item_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_medidaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_medida);

        menu_item_producto.setText("Producto");
        menu_item_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_productoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_producto);

        menu_item_composicion.setText("Composición");
        menu_item_composicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_composicionActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_composicion);

        jMenuBar1.add(menu_mantenimiento);

        menu_compras.setText("COMPRAS");
        menu_compras.setEnabled(false);
        jMenuBar1.add(menu_compras);

        menu_inventario.setText("INVENTARIO");
        menu_inventario.setEnabled(false);
        jMenuBar1.add(menu_inventario);

        menu_ventas.setText("VENTAS");
        menu_ventas.setEnabled(false);
        jMenuBar1.add(menu_ventas);

        menu_caja.setText("CAJA");
        menu_caja.setEnabled(false);
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_tipoUsuarioActionPerformed
        // TODO add your handling code here:
        TipoUsuario_IU frame= new TipoUsuario_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_tipoUsuarioActionPerformed

    private void menu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_usuarioActionPerformed
        // TODO add your handling code here:
         Usuario_IU frame= new Usuario_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_usuarioActionPerformed

    private void menu_item_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_turnoActionPerformed
        // TODO add your handling code here:
        Turno_IU frame= new Turno_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_turnoActionPerformed

    private void menu_item_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_marcaActionPerformed
        // TODO add your handling code here:
        Marca_IU frame= new Marca_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_marcaActionPerformed

    private void menu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_categoriaActionPerformed
        // TODO add your handling code here:
         Categoria_IU frame= new Categoria_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_categoriaActionPerformed

    private void menu_item_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_medidaActionPerformed
        // TODO add your handling code here:
           Medida_IU frame= new Medida_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_medidaActionPerformed

    private void menu_item_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_productoActionPerformed
        // TODO add your handling code here:
         Producto_IU frame= new Producto_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_productoActionPerformed

    private void menu_item_composicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_composicionActionPerformed
        // TODO add your handling code here:
        Composicion_IU frame= new Composicion_IU();
        escritorio.add(frame);
        Dimension desKtopSize= escritorio.getSize();
        Dimension FrameSize= frame.getSize();
        frame.setLocation((desKtopSize.width - FrameSize.width)/2, (desKtopSize.height - FrameSize.height)/2);
        
        frame.show();
    }//GEN-LAST:event_menu_item_composicionActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCaja;
    public static javax.swing.JButton btnCerrar;
    public static javax.swing.JButton btnCompras;
    public static javax.swing.JButton btnEgresos;
    public static javax.swing.JButton btnIngresos;
    public static javax.swing.JButton btnProductos;
    public static javax.swing.JButton btnVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JMenu menu_caja;
    public static javax.swing.JMenu menu_compras;
    public static javax.swing.JMenu menu_inventario;
    private javax.swing.JMenuItem menu_item_categoria;
    private javax.swing.JMenuItem menu_item_composicion;
    private javax.swing.JMenuItem menu_item_marca;
    private javax.swing.JMenuItem menu_item_medida;
    private javax.swing.JMenuItem menu_item_producto;
    private javax.swing.JMenuItem menu_item_tipoUsuario;
    private javax.swing.JMenuItem menu_item_turno;
    private javax.swing.JMenuItem menu_item_usuario;
    public static javax.swing.JMenu menu_mantenimiento;
    public static javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
