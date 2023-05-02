/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * editar_cliente.java
 *
 * Created on 27-jun-2013, 13:05:02
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class editar_cliente extends javax.swing.JFrame {
 
    public editar_cliente() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

  public String ValidarDatos() {
        String msj = "";
        if (txtcedula.getText().equals("")) {
            msj += "Por Favor Digite Numero de Cedula. \n";
        }
        if (txtnombre.getText().equals("")) {
            msj += "Por Favor Digite Nombre. \n";
        }
        if (txtapellido.getText().equals("")) {
            msj += "Por Favor Digite El Apellido. \n";
        }     
         if (txtdireccion.getText().equals("")) {
            msj += "Por Favor Digite Direccion. \n";
        }      
         if (txttelefono.getText().equals("")) {
            msj += "Por Favor Ingrese Telefono. \n";
        }
         if (cbtipo.getSelectedItem().equals("<<Seleccione>>")){
             msj += "Por Favor Seleccione Tipo. \n";
         }
  
        return msj;
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
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JFormattedTextField();
        txtpeso = new javax.swing.JTextField();
        txtestatura = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox();
        txttipo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización de Clientes - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File.png"))); // NOI18N
        jButton5.setToolTipText("Nuevo");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setName("jButton5"); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Document.png"))); // NOI18N
        jButton1.setToolTipText("Modificar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print.png"))); // NOI18N
        jButton4.setToolTipText("Imprimir");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setName("jButton4"); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Close.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setName("jButton3"); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setName("txtnombre"); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));

        txtapellido.setName("txtapellido"); // NOI18N
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, -1));

        txtcedula.setEditable(false);
        txtcedula.setName("txtcedula"); // NOI18N
        jPanel2.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        jLabel2.setText("Cedula");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jLabel3.setText("Nombre");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel4.setText("Apellido");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel7.setText("Direccion");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        jLabel9.setText("Telefono");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        jLabel8.setText("Email");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jLabel5.setText("Peso");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 20));

        jLabel6.setText("Estatura");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        try {
            txttelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefono.setName("txttelefono"); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, -1));

        txtpeso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpeso.setName("txtpeso"); // NOI18N
        jPanel2.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 140, -1));

        txtestatura.setName("txtestatura"); // NOI18N
        jPanel2.add(txtestatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 140, -1));

        txtdireccion.setName("txtdireccion"); // NOI18N
        jPanel2.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, -1));

        txtcorreo.setName("txtcorreo"); // NOI18N
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 400, -1));

        jLabel11.setText("Tipo");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 196, -1, 20));

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Seleccione>>", "Normal", "Pionero", "Empresarial", "Otro" }));
        cbtipo.setName("cbtipo"); // NOI18N
        jPanel2.add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 196, 160, -1));

        txttipo.setBackground(new java.awt.Color(255, 255, 255));
        txttipo.setForeground(new java.awt.Color(255, 255, 255));
        txttipo.setText("jLabel1");
        txttipo.setName("txttipo"); // NOI18N
        jPanel2.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 530, 270));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
         if(!variables_productos.cedula.equals("")){
             txtcedula.setText(variables_productos.cedula);
            txtnombre.setText(variables_productos.nombre);
            txtapellido.setText(variables_productos.apellido);
            txtdireccion.setText(variables_productos.direccion);
            txttelefono.setText(variables_productos.telefono);
            txtcorreo.setText(variables_productos.correo);
            txtpeso.setText(variables_productos.peso);
            txtestatura.setText(variables_productos.estatura);
            txttipo.setText(variables_productos.tipo);
            cbtipo.setSelectedItem(variables_productos.tipo);
            variables_productos.cedula="";
            variables_productos.nombre="";
            variables_productos.apellido="";
            variables_productos.direccion="";
            variables_productos.telefono="";
            variables_productos.correo="";
            variables_productos.peso="";
            variables_productos.estatura="";
            variables_productos.tipo="";
            if (txttipo.getText().equals("Normal")){
            cbtipo.setSelectedIndex(1);
           }
             if (txttipo.getText().equals("Pionero")){
            cbtipo.setSelectedIndex(2);
          }
              if (txttipo.getText().equals("Empresarial")){
            cbtipo.setSelectedIndex(3);
          }
               if (txttipo.getText().equals("Otro")){
            cbtipo.setSelectedIndex(4);
          }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(ValidarDatos().equals("")) {
 
        try {
                  if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Actualizar El Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();

          String sentenciaInsert="update cliente set nombre='"+txtnombre.getText()+"', apellido='"+txtapellido.getText()+"',peso='"+txtpeso.getText()+"',estatura='"+txtestatura.getText()+"',direccion='"+txtdireccion.getText()+"',correo='"+txtcorreo.getText()+"',telefono='"+txttelefono.getText()+"',tipo='"+cbtipo.getSelectedItem().toString()+"' where cedula='"+txtcedula.getText()+"'";
           
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Se Actualizarón Los Datos Con Exito");
            JOptionPane.showMessageDialog(this, "Se Actualizarón Los Datos Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            
            txtcedula.setText("");
            txtnombre.setText("");
            txtpeso.setText("");
            txtapellido.setText("");
            txtestatura.setText("");
            txtdireccion.setText("");
            txttelefono.setText("");
            txtcorreo.setText("");
            txttipo.setText("");
            cbtipo.setSelectedIndex(0);
            
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
      }
        }
        else {
            JOptionPane.showMessageDialog(this, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
  }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        new registro_cliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
      
         int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada
         if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            txtnombre.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (txtnombre.getText().length() >= 30) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (30)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
     
         int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada
         if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            txtapellido.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (txtapellido.getText().length() >= 30) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (30)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       
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
            txttelefono.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (txttelefono.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new editar_cliente().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JFormattedTextField txttelefono;
    private javax.swing.JLabel txttipo;
    // End of variables declaration//GEN-END:variables
}
