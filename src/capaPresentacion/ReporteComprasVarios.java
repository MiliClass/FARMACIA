/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacion;

import capaNegocio.CompraBD;
import capaNegocio.DetalleCompraBD;
import capaNegocio.ProveedorBD;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Milagros
 */
public class ReporteComprasVarios extends javax.swing.JInternalFrame {

    DefaultTableModel tabla_temporal_compras, tabla_temporal_detalle_compras;

    /**
     * Creates new form ReporteComprasVarios
     */
    public ReporteComprasVarios() {
        initComponents();
        cargarProveedores();
    }

    private void cargarProveedores() {
        try {
            cmbProveedor.removeAllItems();
            ProveedorBD oProveedorBD = new ProveedorBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = oProveedorBD.reportarProveedor();

            cmbProveedor.addItem("Seleccionar");
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                String proveedor = String.valueOf(tabla_temporal.getValueAt(i, 1));

                cmbProveedor.addItem(proveedor);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar proveedor", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void limpiar_tabla_formulario() {
        tabla_temporal_compras = (DefaultTableModel) tabla_reporte_compras.getModel();
        tabla_temporal_compras.setRowCount(0);

        tabla_temporal_detalle_compras = (DefaultTableModel) tabla_reporte_detalle_compras.getModel();
        tabla_temporal_detalle_compras.setRowCount(0);
    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    private double dineroGastado() {
        tabla_temporal_compras = (DefaultTableModel) tabla_reporte_compras.getModel();
        int maxPedido = tabla_temporal_compras.getRowCount();
        double total = 0;

        for (int i = 0; i < maxPedido; i++) {
            total = total + Double.parseDouble(tabla_temporal_compras.getValueAt(i, 8).toString());

        }
        return total;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        dcFechaFinal = new com.toedter.calendar.JDateChooser();
        btnBuscarComprasFechas = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dcFechaInicioDocumento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dcFechaFinalDocumento = new com.toedter.calendar.JDateChooser();
        cmbDocumento = new javax.swing.JComboBox<>();
        btnBuscarDocumentos = new javax.swing.JButton();
        btnImprimirDocumentos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotalComprasDocumentos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dcFechaInicioProveedor = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dcFechaFinalProveedor = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        btnBuscarComprasProveedor = new javax.swing.JButton();
        btnImprimirProveedor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTotalComprasProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_compras = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_reporte_detalle_compras = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REPORTE DE COMPRAS");

        jLabel1.setText("FECHA INICIO");

        jLabel2.setText("FECHA FINAL");

        btnBuscarComprasFechas.setText("...");
        btnBuscarComprasFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComprasFechasActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/impresora1.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capaImagenes/eliminar2.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarComprasFechas)
                .addGap(36, 36, 36)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarComprasFechas)
                        .addComponent(btnImprimir)
                        .addComponent(btnEliminar))
                    .addComponent(dcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPRAS X FECHAS", jPanel1);

        jLabel3.setText("FECHA INCIO");

        jLabel4.setText("FECHA FINAL");

        cmbDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLETA", "FACTURA" }));

        btnBuscarDocumentos.setText("...");
        btnBuscarDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocumentosActionPerformed(evt);
            }
        });

        btnImprimirDocumentos.setText("IMPRIMIR");

        jLabel6.setText("TOTAL COMPRAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFechaInicioDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFechaFinalDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarDocumentos)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirDocumentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalComprasDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarDocumentos)
                        .addComponent(btnImprimirDocumentos)
                        .addComponent(jLabel6)
                        .addComponent(txtTotalComprasDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcFechaFinalDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(dcFechaInicioDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPRAS X DOCUMENTOS", jPanel2);

        jLabel5.setText("FECHA INICIO");

        jLabel7.setText("FECHA FINAL");

        jLabel8.setText("PROVEEDOR");

        btnBuscarComprasProveedor.setText("...");
        btnBuscarComprasProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComprasProveedorActionPerformed(evt);
            }
        });

        btnImprimirProveedor.setText("IMPRIMIR");

        jLabel9.setText("TOTAL COMPRAS");

        txtTotalComprasProveedor.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFechaInicioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcFechaFinalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarComprasProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimirProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalComprasProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarComprasProveedor)
                        .addComponent(btnImprimirProveedor)
                        .addComponent(txtTotalComprasProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(dcFechaFinalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dcFechaInicioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPRAS X PROVEEDOR", jPanel3);

        tabla_reporte_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCOMPRA", "FECHA", "RUC", "PROVEEDOR", "DOCUMENTO", "CORRELATIVO", "TIPOPAGO", "FORMAPAGO", "TOTAL", "USUARIO", "TIENDA"
            }
        ));
        tabla_reporte_compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_comprasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_compras);

        tabla_reporte_detalle_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla_reporte_detalle_compras);

        jLabel10.setText("DETALLE DE LA COMPRA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarComprasFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComprasFechasActionPerformed
        // TODO add your handling code here:
        try {
            limpiar_tabla_formulario();
            CompraBD oCompraBD = new CompraBD();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            if (dcFechaFinal.getDate() != null) {
                if (dcFechaInicio.getDate() != null) {
                    setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                    String fechaInicio = dcn.format(dcFechaInicio.getDate());
                    String fechaFinal = dcn.format(dcFechaFinal.getDate());
                    DefaultTableModel tabla_temporal;
                    tabla_temporal = oCompraBD.reportarCompraFechas(fechaInicio, fechaFinal);
                    int cant = tabla_temporal.getRowCount();
                    for (int i = 0; i < cant; i++) {
                        String idcompra = tabla_temporal.getValueAt(i, 0).toString();
                        String fecha = tabla_temporal.getValueAt(i, 1).toString();
                        String ruc = tabla_temporal.getValueAt(i, 12).toString();
                        String proveedor = tabla_temporal.getValueAt(i, 2).toString();
                        String documento = tabla_temporal.getValueAt(i, 3).toString();
                        String correlativo = tabla_temporal.getValueAt(i, 4).toString();
                        String tipo_pago = tabla_temporal.getValueAt(i, 5).toString();
                        String forma_pago = tabla_temporal.getValueAt(i, 6).toString();
                        String total = tabla_temporal.getValueAt(i, 11).toString();
                        String tienda = Login_IU.tienda;
                        String uDni = Login_IU.dni_publico;

                        Object[] data = {idcompra, fecha, ruc, proveedor, documento, correlativo, tipo_pago, forma_pago, total, uDni, tienda};
                        tabla_temporal_compras.addRow(data);

                    }
                    tabla_reporte_compras.setModel(tabla_temporal_compras);
                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                } else {
                    advertencia("Ingrese la fecha de Inicio");
                }
            } else {

                advertencia("Ingrese la fecha de final");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarComprasFechasActionPerformed

    private void tabla_reporte_comprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_comprasMousePressed
        // TODO add your handling code here:
        int fila_seleccionada = tabla_reporte_compras.getSelectedRow();
        DetalleCompraBD oDetalleCompraBD = new DetalleCompraBD();

        int idcompra = Integer.parseInt(tabla_temporal_compras.getValueAt(fila_seleccionada, 0).toString());

        tabla_temporal_detalle_compras = oDetalleCompraBD.buscarDetalleCompra(idcompra);

        tabla_reporte_detalle_compras.setModel(tabla_temporal_detalle_compras);

    }//GEN-LAST:event_tabla_reporte_comprasMousePressed

    private void btnBuscarDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocumentosActionPerformed
        // TODO add your handling code here:

        try {
            limpiar_tabla_formulario();
            CompraBD oCompraBD = new CompraBD();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");

            if (dcFechaInicioDocumento.getDate() != null) {
                if (dcFechaFinalDocumento.getDate() != null) {
                    setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                    String fechaInicio = dcn.format(dcFechaInicioDocumento.getDate());
                    String fechaFinal = dcn.format(dcFechaFinalDocumento.getDate());
                    String documento = cmbDocumento.getSelectedItem().toString();
                    DefaultTableModel tabla_temporal;
                    tabla_temporal = oCompraBD.reportarCompraDocumento(fechaInicio, fechaFinal, documento);
                    int cant = tabla_temporal.getRowCount();

                    for (int i = 0; i < cant; i++) {
                        String idCompra = tabla_temporal.getValueAt(i, 0).toString();
                        String fecha = tabla_temporal.getValueAt(i, 1).toString();
                        String ruc = tabla_temporal.getValueAt(i, 12).toString();
                        String proveedor = tabla_temporal.getValueAt(i, 2).toString();
                        String doccumento = tabla_temporal.getValueAt(i, 3).toString();
                        String correlativo = tabla_temporal.getValueAt(i, 4).toString();
                        String tipo_pago = tabla_temporal.getValueAt(i, 5).toString();
                        String forma_pago = tabla_temporal.getValueAt(i, 6).toString();
                        String total = tabla_temporal.getValueAt(i, 11).toString();

                        String tienda = Login_IU.tienda;
                        String uDni = Login_IU.dni_publico;

                        Object[] data = {idCompra, fecha, ruc, proveedor, doccumento, correlativo, tipo_pago, forma_pago, total, uDni, tienda};
                        tabla_temporal_compras.addRow(data);

                    }

                    tabla_reporte_compras.setModel(tabla_temporal_compras);
                    double total_compra_documento = dineroGastado();
                    BigDecimal numero = new BigDecimal(total_compra_documento);
                    BigDecimal decimal = numero.setScale(2, RoundingMode.DOWN);
                    txtTotalComprasDocumentos.setText("" + decimal);

                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                } else {
                    advertencia("Ingrese la fecha de inicio...");

                }
            } else {
                advertencia("Ingrese la fecha de final...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnBuscarDocumentosActionPerformed

    private void btnBuscarComprasProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComprasProveedorActionPerformed
        // TODO add your handling code here:
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            limpiar_tabla_formulario();
            CompraBD oCompraBD = new CompraBD();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            if (dcFechaInicioProveedor.getDate() != null) {

                if (dcFechaFinalProveedor.getDate() != null) {

                    String fechaInicio = dcn.format(dcFechaInicioProveedor.getDate());
                    String fechaFinal = dcn.format(dcFechaFinalProveedor.getDate());
                    String proveedor = cmbProveedor.getSelectedItem().toString();
                    DefaultTableModel tabla_temporal;
                    tabla_temporal = oCompraBD.reportarCompraProveedor(fechaInicio, fechaFinal, proveedor);
                    int cant = tabla_temporal.getRowCount();
                    for (int i = 0; i < cant; i++) {
                        String idCompra = tabla_temporal.getValueAt(i, 0).toString();
                        String fecha = tabla_temporal.getValueAt(i, 1).toString();
                        String ruc = tabla_temporal.getValueAt(i, 12).toString();
                        proveedor = tabla_temporal.getValueAt(i, 2).toString();
                        String doccumento = tabla_temporal.getValueAt(i, 3).toString();
                        String correlativo = tabla_temporal.getValueAt(i, 4).toString();
                        String tipo_pago = tabla_temporal.getValueAt(i, 5).toString();
                        String forma_pago = tabla_temporal.getValueAt(i, 6).toString();
                        String total = tabla_temporal.getValueAt(i, 11).toString();

                        String tienda = Login_IU.tienda;
                        String uDni = Login_IU.dni_publico;

                        Object[] data = {idCompra, fecha, ruc, proveedor, doccumento, correlativo, tipo_pago, forma_pago, total, uDni, tienda};
                        tabla_temporal_compras.addRow(data);
                    }
                    tabla_reporte_compras.setModel(tabla_temporal_compras);
                    double total_compra_documento = dineroGastado();
                    BigDecimal numero = new BigDecimal(total_compra_documento);
                    BigDecimal decimal = numero.setScale(2, RoundingMode.DOWN);
                    txtTotalComprasDocumentos.setText("" + decimal);

                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                } else {
                    advertencia("Ingrese la fecha de inicio...");
                }

            } else {
                advertencia("Ingrese la fecha de final...");
            }

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarComprasProveedorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila_seleccionada= tabla_reporte_compras.getSelectedRow();
        if (fila_seleccionada > -1) {
            int aviso= JOptionPane.showConfirmDialog(rootPane, "Estás seguro de eliminar");
            if (aviso == 0) {
                CompraBD oCompraBD= new CompraBD();
                DetalleCompraBD oDetalleCompraBD= new DetalleCompraBD();
                
                int idcompra= Integer.parseInt(tabla_reporte_compras.getValueAt(fila_seleccionada, 0).toString());
                
                boolean rpta1= oDetalleCompraBD.eliminarDetalleCompra(idcompra);
                boolean rpta= oCompraBD.eliminarCompra(idcompra);
                if (rpta) {
                    advertencia("Se elimino su compra..");
                    limpiar_tabla_formulario();
                    
                    
                } else {
                    advertencia("Tienes problemas al eliminar" + rpta + rpta1);
                }
                
            }
            
        } else {
              advertencia("Seleccione una fila para saber que compra quiere eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarComprasFechas;
    private javax.swing.JButton btnBuscarComprasProveedor;
    private javax.swing.JButton btnBuscarDocumentos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirDocumentos;
    private javax.swing.JButton btnImprimirProveedor;
    private javax.swing.JComboBox<String> cmbDocumento;
    private javax.swing.JComboBox<String> cmbProveedor;
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaFinalDocumento;
    private com.toedter.calendar.JDateChooser dcFechaFinalProveedor;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private com.toedter.calendar.JDateChooser dcFechaInicioDocumento;
    private com.toedter.calendar.JDateChooser dcFechaInicioProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_reporte_compras;
    private javax.swing.JTable tabla_reporte_detalle_compras;
    private javax.swing.JTextField txtTotalComprasDocumentos;
    private javax.swing.JTextField txtTotalComprasProveedor;
    // End of variables declaration//GEN-END:variables
}