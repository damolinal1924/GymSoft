


package gymsoft;

import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class registro_productos extends javax.swing.JFrame {

   Connection conectar2;
    Statement st;
    ResultSet rs;
    
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    
    public registro_productos() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        bloquear();
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gymsoft", "root", "123456");
            st = (Statement) conectar2.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from proveedor");
            modeloCombo.addElement("Ninguno");//es el primer registro q mostrara el combo
            
            proveedor.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
            
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nit"));
                
                proveedor.setModel(modeloCombo);
                
            }
 
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(registro_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registro_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     void bloquear(){
     
     
     descripcion.setEnabled(false);
     cantidad.setEnabled(false);
     pcosto.setEnabled(false);
     pventa.setEnabled(false);
     
     }
     void desbloquear(){
     descripcion.requestFocus();
     descripcion.setEnabled(true);
     cantidad.setEnabled(true);
     pcosto.setEnabled(true);
     pventa.setEnabled(true);
     
     }
     
     public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (descripcion.getText().equals("")) {//Si txtID esta vacio
            msj += "Por Favor Digite Descrpción del Producto. \n";
        }
        if (cantidad.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Ingrese Cantidad. \n";
        }
        if (pcosto.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Precio Costo. \n";
        }
        if (pventa.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Precio Venta. \n";
        }
      
      if (proveedor.getSelectedItem().equals("Ninguno")){
            msj += "Por Favor Seleccione Proveedor. \n";
        }
        return msj;//devuelve msj
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pcosto = new javax.swing.JTextField();
        pventa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proveedor = new javax.swing.JComboBox();
        descripcion = new javax.swing.JTextField();
        txtfechaingreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Productos - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Descripción");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        jPanel2.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 130, -1));

        jLabel3.setText("Cantidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setText("Precio Costo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        pcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcostoKeyTyped(evt);
            }
        });
        jPanel2.add(pcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        pventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pventaKeyTyped(evt);
            }
        });
        jPanel2.add(pventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        jLabel5.setText("Proveedor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, -1));

        jLabel6.setText("Precio Venta");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, -1));

        jLabel7.setText("Fecha Ingreso");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, -1));

        proveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proveedorKeyTyped(evt);
            }
        });
        jPanel2.add(proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, -1));
        jPanel2.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, -1));

        txtfechaingreso.setEditable(false);
        jPanel2.add(txtfechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 580, 200));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 110, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        jButton4.setText("Nuevo Registro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
         if(ValidarDatos().equals("")) {
       try {
               if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Insertar Un Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();
          
           String sentenciaInsert="insert into producto (descripcion,stock,precio_costo,precio_venta,nit,fecha_ingreso) values(?,?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,descripcion.getText());
            conectar.psPrepararSentencia.setString(2,cantidad.getText());
            conectar.psPrepararSentencia.setString(3,pcosto.getText());
            conectar.psPrepararSentencia.setString(4,pventa.getText());            
            conectar.psPrepararSentencia.setString(5,proveedor.getSelectedItem().toString());
            conectar.psPrepararSentencia.setString(6,txtfechaingreso.getText());
           
           conectar.psPrepararSentencia.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Se Registro Producto Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            bloquear();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null, "Este Producto Ya Existe");
        }
        
        descripcion.setText("");
        cantidad.setText("");
        pcosto.setText("");
        pventa.setText("");
         proveedor.setSelectedIndex(0);
         }
         else {
            JOptionPane.showMessageDialog(this, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);     
        }
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        desbloquear();
        descripcion.setText("");
        cantidad.setText("");
        pcosto.setText("");
        pventa.setText("");
         proveedor.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        bloquear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {//si se presiona enter
            //transfiere el foco
            cantidad.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (cantidad.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void pcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcostoKeyTyped
     
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {//si se presiona enter
            //transfiere el foco
            pcosto.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (pcosto.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pcostoKeyTyped

    private void pventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pventaKeyTyped
    
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {//si se presiona enter
            //transfiere el foco
            pventa.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (pventa.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pventaKeyTyped

    private void proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedorKeyTyped
        
        proveedor.transferFocus();
    }//GEN-LAST:event_proveedorKeyTyped

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
            java.util.logging.Logger.getLogger(registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new registro_productos().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pcosto;
    private javax.swing.JComboBox proveedor;
    private javax.swing.JTextField pventa;
    public javax.swing.JTextField txtfechaingreso;
    // End of variables declaration//GEN-END:variables
}
