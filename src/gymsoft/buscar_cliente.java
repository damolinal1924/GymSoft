



package gymsoft;


import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class buscar_cliente extends javax.swing.JFrame {
//DefaultTableModel tabla=new DefaultTableModel();
    DefaultTableModel model;
    
    public buscar_cliente() {
        initComponents();
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
       
        cargar("");
        //tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
    }
void cargar(String valor){
    String[] titulos={"CEDULA","NOMBRE","APELLIDO","TIPO","DIRECCIÓN","TELEFONO","CORREO","ESTATURA","PESO"};
    String[] registros= new String[9];

    String sql ="SELECT * FROM cliente where CONCAT(cedula,'',nombre,'',apellido,'',correo,'',tipo) LIKE '%"+valor+"%'";
   
    model=new DefaultTableModel(null,titulos);
    conectar m=new conectar();
    Connection cn=m.conexion();

    Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
         
            registros[0]=rs.getString("cedula");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellido");
            registros[3]=rs.getString("tipo");
            registros[4]=rs.getString("direccion");
            registros[5]=rs.getString("telefono");
            registros[6]=rs.getString("correo");
            registros[7]=rs.getString("estatura");
            registros[8]=rs.getString("peso");

            model.addRow(registros);
            }
            tabla.setModel(model);
            
            TableColumn tc = tabla.getColumn("CEDULA"); //Obtienes la columna
            TableColumn tc2 = tabla.getColumn("NOMBRE");
            TableColumn tc3 = tabla.getColumn("APELLIDO");
            TableColumn tc4 = tabla.getColumn("TIPO");
            TableColumn tc5 = tabla.getColumn("DIRECCIÓN");
            TableColumn tc6 = tabla.getColumn("TELEFONO");
            TableColumn tc7 = tabla.getColumn("CORREO");
            TableColumn tc8 = tabla.getColumn("ESTATURA");
            TableColumn tc9 = tabla.getColumn("PESO");
            tc.setPreferredWidth(120); //Y le das un tamaño que tu quieras o necesites
            tc2.setPreferredWidth(130);
            tc3.setPreferredWidth(130);
            tc4.setPreferredWidth(90);
            tc5.setPreferredWidth(120);
            tc6.setPreferredWidth(110);
            tc7.setPreferredWidth(200);
            tc8.setPreferredWidth(80);
            tc9.setPreferredWidth(50);
            
            int n;
        n=tabla.getRowCount();
        this.lbltotal.setText(String.valueOf(""+n));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);     
    }
        
}
@Override
     public Image getIconImage(){

Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/logo2.png"));

return retValue;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Clientes - SolucionesML");
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
                "CEDULA", "NOMBRE", "APELLIDO", "TIPO", "DIRECCION", "TELEFONO", "CORREO"
            }
        ));
        tabla.setName("tabla"); // NOI18N
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getColumn(0).setMinWidth(200);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabla.getColumnModel().getColumn(0).setMaxWidth(200);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1030, 480));

        buscar.setName("buscar"); // NOI18N
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 420, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar1.png"))); // NOI18N
        jButton2.setToolTipText("Actualizar");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 40, 30));

        lbltotal.setText("jLabel4");
        lbltotal.setName("lbltotal"); // NOI18N
        jPanel1.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Total Registros:");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        jLabel1.setText("Buscar");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza1100.png"))); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 610, 1100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int fila = tabla.rowAtPoint(evt.getPoint());
    int columna = tabla.columnAtPoint(evt.getPoint());
    if ((fila > -1) && (columna > -1)) {
       
        //this.clave = String.valueOf(tabla.getValueAt(fila, 0).toString().trim());  
        variables_productos.cedula=tabla.getValueAt(fila,0).toString();
        variables_productos.nombre=tabla.getValueAt(fila,1).toString();
        variables_productos.apellido=tabla.getValueAt(fila,2).toString();
        variables_productos.tipo=tabla.getValueAt(fila,3).toString();
        variables_productos.direccion=tabla.getValueAt(fila,4).toString();
        variables_productos.telefono=tabla.getValueAt(fila,5).toString();
        variables_productos.correo=tabla.getValueAt(fila,6).toString();
        variables_productos.estatura=tabla.getValueAt(fila,7).toString();
        variables_productos.peso=tabla.getValueAt(fila,8).toString();
     }
    //dispose();
    
    editar_cliente jF2= new editar_cliente();
    jF2.setVisible(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        
        cargar(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String valor = buscar.getText();
         cargar(valor);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new buscar_cliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
