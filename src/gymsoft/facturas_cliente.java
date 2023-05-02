



package gymsoft;


import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEGO
 */
public class facturas_cliente extends javax.swing.JFrame {

    private EjecutarReporte jasper;
    String id;
    DefaultTableModel model;
    
    public facturas_cliente() {
        initComponents();
        jasper = new EjecutarReporte();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        panelRectTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 930, 300));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar3.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 100, -1));

        txtcedula.setName("txtcedula"); // NOI18N
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 440, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Listado de facturas");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza1100.png"))); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 430, 1050, 90));

        txtid.setName("txtid"); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 120, -1));

        panelRectTranslucidoComplete1.setName("panelRectTranslucidoComplete1"); // NOI18N
        panelRectTranslucidoComplete1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("Filtros de busqueda");
        jLabel3.setName("jLabel3"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setName("jTextField1"); // NOI18N
        panelRectTranslucidoComplete1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setName("jTextField2"); // NOI18N
        panelRectTranslucidoComplete1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha hasta");
        jLabel4.setName("jLabel4"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula");
        jLabel5.setName("jLabel5"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cliente");
        jLabel6.setName("jLabel6"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha desde");
        jLabel7.setName("jLabel7"); // NOI18N
        panelRectTranslucidoComplete1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jDateChooser1.setName("jDateChooser1"); // NOI18N
        panelRectTranslucidoComplete1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, -1));

        jDateChooser2.setName("jDateChooser2"); // NOI18N
        panelRectTranslucidoComplete1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        buttonTask1.setForeground(new java.awt.Color(255, 255, 255));
        buttonTask1.setText("Buscar");
        buttonTask1.setDefaultCapable(false);
        buttonTask1.setDescription("  ");
        buttonTask1.setName("buttonTask1"); // NOI18N
        panelRectTranslucidoComplete1.add(buttonTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        panelRectTranslucidoComplete1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 50));

        jPanel1.add(panelRectTranslucidoComplete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 170, 490));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consultar.png"))); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String ced=(txtcedula.getText());
        String[] titulos={"Nº FACTURAS","NOMBRE","APELLIDO","EMPLEADO","FECHA FACTURACIÓN","FECHA PAGO","FECHA VIGENCIA","TIPO","TOTAL"};
    String[] registros= new String[9];
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
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellido");
            registros[3]=rs.getString("empleado");
            registros[4]=rs.getString("fecha_factura");
            registros[5]=rs.getString("fecha_pago");
            registros[6]=rs.getString("fecha_vigencia");
            registros[7]=rs.getString("tipo");
            registros[8]=rs.getString("total");
            model.addRow(registros);
            }
            tabla.setModel(model);
                  txtcedula.setText("");   
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                    
}
    }//GEN-LAST:event_jButton1ActionPerformed
//String accion = "Insertar";
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
                new facturas_cliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
