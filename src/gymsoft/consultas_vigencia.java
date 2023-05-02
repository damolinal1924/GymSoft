



package gymsoft;


import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEGO
 */
public class consultas_vigencia extends javax.swing.JFrame {

    private EjecutarReporte jasper;
    String id;
    String fecha1;
    String fecha2;
    DefaultTableModel model;
    
    public consultas_vigencia() {
        initComponents();
        jasper = new EjecutarReporte();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtcedula.requestFocus();
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        txtid.setVisible(false);
        this.fecha.setText(date.format(now));
    }
@Override
     public Image getIconImage(){

Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/logo2.png"));

return retValue;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRectTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datefecha2 = new com.toedter.calendar.JDateChooser();
        datefecha1 = new com.toedter.calendar.JDateChooser();
        btnbuscar = new org.edisoncor.gui.button.ButtonTask();
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon3 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        rdfpago = new javax.swing.JRadioButton();
        rdfvigencia = new javax.swing.JRadioButton();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfecha1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfecha2 = new javax.swing.JLabel();
        nfactura = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        jPopupMenu1.setName("jPopupMenu1"); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        jMenuItem1.setText("Imprimir");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturas Clientes - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº FACTURAS", "NOMBRE", "APELLIDO", "EMPLEADO", "FECHA FACTURACIÓN", "FECHA PAGO", "FECHA VIGENCIA", "TIPO", "TOTAL"
            }
        ));
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setName("tabla"); // NOI18N
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 900, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Listado de facturas");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        panelRectTranslucidoComplete1.setBackground(new java.awt.Color(255, 255, 255));
        panelRectTranslucidoComplete1.setForeground(new java.awt.Color(255, 255, 255));
        panelRectTranslucidoComplete1.setAnchoDeBorde(0.0F);
        panelRectTranslucidoComplete1.setAnchoDeSegundoBorde(0.0F);
        panelRectTranslucidoComplete1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        panelRectTranslucidoComplete1.setColorPrimario(new java.awt.Color(255, 0, 153));
        panelRectTranslucidoComplete1.setName("panelRectTranslucidoComplete1"); // NOI18N
        panelRectTranslucidoComplete1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Filtros de busqueda");
        jLabel3.setName("jLabel3"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtcedula.setBackground(new java.awt.Color(0, 0, 0));
        txtcedula.setForeground(new java.awt.Color(255, 255, 255));
        txtcedula.setName("txtcedula"); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha hasta");
        jLabel4.setName("jLabel4"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula");
        jLabel5.setName("jLabel5"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha desde");
        jLabel7.setName("jLabel7"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        datefecha2.setEnabled(false);
        datefecha2.setName("datefecha2"); // NOI18N
        panelRectTranslucidoComplete1.add(datefecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        datefecha1.setEnabled(false);
        datefecha1.setName("datefecha1"); // NOI18N
        panelRectTranslucidoComplete1.add(datefecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.setDefaultCapable(false);
        btnbuscar.setDescription("  ");
        btnbuscar.setName("btnbuscar"); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 40));

        buttonIcon1.setBackground(new java.awt.Color(255, 0, 153));
        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.setName("buttonIcon1"); // NOI18N
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(buttonIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 40, 40));

        buttonIcon3.setBackground(new java.awt.Color(255, 0, 153));
        buttonIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        buttonIcon3.setText("buttonIcon1");
        buttonIcon3.setName("buttonIcon3"); // NOI18N
        buttonIcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon3ActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(buttonIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        buttonIcon2.setBackground(new java.awt.Color(255, 0, 153));
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon1");
        buttonIcon2.setName("buttonIcon2"); // NOI18N
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(buttonIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 40));

        rdfpago.setBackground(new java.awt.Color(255, 0, 153));
        buttonGroup1.add(rdfpago);
        rdfpago.setText("F. Pago");
        rdfpago.setName("rdfpago"); // NOI18N
        rdfpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfpagoActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(rdfpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, -1, -1));

        rdfvigencia.setBackground(new java.awt.Color(255, 0, 153));
        buttonGroup1.add(rdfvigencia);
        rdfvigencia.setText("F. Vigencia");
        rdfvigencia.setName("rdfvigencia"); // NOI18N
        rdfvigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfvigenciaActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete1.add(rdfvigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jPanel1.add(panelRectTranslucidoComplete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 40, 175, 480));

        txtid.setName("txtid"); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza1100.png"))); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-118, 420, 1050, 90));

        txtfecha1.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha1.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha1.setName("txtfecha1"); // NOI18N
        jPanel1.add(txtfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 60, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/banner_consulta.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtfecha2.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha2.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha2.setName("txtfecha2"); // NOI18N
        jPanel1.add(txtfecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 60, 20));

        nfactura.setForeground(new java.awt.Color(255, 255, 255));
        nfactura.setText("jLabel8");
        nfactura.setName("nfactura"); // NOI18N
        jPanel1.add(nfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("jLabel8");
        fecha.setName("fecha"); // NOI18N
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        String id = (String) tabla.getValueAt(tabla.getSelectedRow(), 0);
        txtid.setText(String.valueOf(id));
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        // TODO add your handling code here:
         //String id = (String) tabla.getValueAt(tabla.getSelectedRow(), 0);
        //txtdato.setText(String.valueOf(id));
    }//GEN-LAST:event_tablaKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        int filasel;
        
        try {
            filasel = tabla.getSelectedRow();
            if(filasel == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            } else {
                
                model = (DefaultTableModel) tabla.getModel();
                id = (String) model.getValueAt(filasel, 0); 
                txtcedula.setText(String.valueOf(id));
                //id=(txtid.getText());
            jasper.runparametro(id);
            }
            
        } catch (Exception e) {
            
        }  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        String ced=(txtcedula.getText());
        String[] titulos={"Nº FACTURAS","CEDULA","NOMBRE","APELLIDO","EMPLEADO","FECHA FACTURACIÓN","FECHA PAGO","FECHA VIGENCIA","TIPO","TOTAL"};
    String[] registros= new String[10];
     String sql ="SELECT factura.*,cliente.* from factura, cliente WHERE factura.cedula=('"+ced+"') and cliente.cedula=('"+ced+"')ORDER BY factura.num_factura DESC";
     
   model=new DefaultTableModel(null,titulos);
    conectar m=new conectar();
    Connection cn=m.conexion();

    Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){                
            
            registros[0]=rs.getString("num_factura");
            registros[1]=rs.getString("cedula");
            registros[2]=rs.getString("nombre");
            registros[3]=rs.getString("apellido");
            registros[4]=rs.getString("empleado");
            registros[5]=rs.getString("fecha_factura");
            registros[6]=rs.getString("fecha_pago");
            registros[7]=rs.getString("fecha_vigencia");
            registros[8]=rs.getString("tipo");
            registros[9]=rs.getString("total");
            model.addRow(registros);
            }
            tabla.setModel(model);
            txtcedula.setText("");   
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);    
        }
       
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        
        if(evt.getKeyCode()==evt.VK_ENTER){
            btnbuscarActionPerformed(null);
        }
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        
         try {
            
            Date date = datefecha1.getDate();
            Date date2 = datefecha2.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 
            txtfecha1.setText(sdf.format(date));
            txtfecha2.setText(sdf.format(date2)); 
            
        } catch(NullPointerException ex) {

     JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("gimnasio.gif")));
        }
        if(rdfpago.getModel().isSelected()){
            if(!txtfecha1.getText().equals("") && !txtfecha2.getText().equals("")){
             
          fecha1=(txtfecha1.getText());
          fecha2=(txtfecha2.getText());
          jasper.fechapago(fecha1, fecha2); 
            }
        }            
        
        else if(rdfvigencia.getModel().isSelected()){
        if(!txtfecha1.getText().equals("") && !txtfecha2.getText().equals("")){
          fecha1=(txtfecha1.getText());
          fecha2=(txtfecha2.getText());
          jasper.fechavigencia(fecha1, fecha2);
        }
        } 
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void rdfpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfpagoActionPerformed
        datefecha1.setEnabled(true);
        datefecha2.setEnabled(true);
    }//GEN-LAST:event_rdfpagoActionPerformed

    private void rdfvigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfvigenciaActionPerformed
        
         datefecha1.setEnabled(true);
         datefecha2.setEnabled(true);
    }//GEN-LAST:event_rdfvigenciaActionPerformed

    private void buttonIcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon3ActionPerformed

        ResultSet r=null;
        String consul="Select Max(id_fact_producto)+1 AS NUM From factura_producto";
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                nfactura.setText(r.getString(1));
           }   
        }  catch (Exception ex){
            }
        factura_producto frm= new factura_producto();
        frm.setVisible(true);
        this.setVisible(false);
        frm.nfactura.setText(nfactura.getText());
        frm.fecha.setText(fecha.getText());
    }//GEN-LAST:event_buttonIcon3ActionPerformed

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
       
        dispose();
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(facturas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturas_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new consultas_vigencia().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon3;
    private com.toedter.calendar.JDateChooser datefecha1;
    private com.toedter.calendar.JDateChooser datefecha2;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nfactura;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete1;
    private javax.swing.JRadioButton rdfpago;
    private javax.swing.JRadioButton rdfvigencia;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JLabel txtfecha1;
    private javax.swing.JLabel txtfecha2;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
