

package gymsoft;



import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class registro_proveedor extends javax.swing.JFrame {

    
    public registro_proveedor() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        bloquear();
    }
    void bloquear(){
    
        nit.setEnabled(false);
        nomcomercial.setEnabled(false);
        direccion.setEnabled(false);
        nombre.setEnabled(false);
        apellido.setEnabled(false);      
        telefono.setEnabled(false);
        ciudad.setEnabled(false);
    
    }
    void desbloquear(){
        nit.requestFocus();
         nit.setEnabled(true);
        nomcomercial.setEnabled(true);
        direccion.setEnabled(true);
        nombre.setEnabled(true);
        apellido.setEnabled(true);      
        telefono.setEnabled(true);
        ciudad.setEnabled(true);
    }
    
    public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (nit.getText().equals("")) {//Si txtID esta vacio
            msj += "Por Favor Digite El Nit Del Proveedor. \n";
        }
        if (nomcomercial.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Nombre Comercial. \n";
        }
        if (apellido.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite El Apellido. \n";
        }
   if (nombre.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite El Nombre. \n";
        }
        if (direccion.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Dirección. \n";
        }
        
         if (ciudad.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Ciudad. \n";
        }
         if (telefono.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Ingrese Numero de Telefono. \n";
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        nomcomercial = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Proveedores - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nit");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 46, -1, -1));

        nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitKeyTyped(evt);
            }
        });
        jPanel2.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, -1));

        jLabel3.setText("Direccion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Ciudad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel5.setText("Nombre Comercial");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, -1));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, -1));

        jLabel7.setText("Apellidos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        jPanel2.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 200, -1));

        jLabel8.setText("Telefono");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 210, -1));

        jLabel9.setText("Fecha Registro");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 90, -1));

        fecha.setEditable(false);
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 170, -1));
        jPanel2.add(nomcomercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 200, -1));
        jPanel2.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 210, -1));
        jPanel2.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 200, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 573, 243));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 362, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        jButton1.setText("Nuevo Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 130, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 120, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 110, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(ValidarDatos().equals("")) {//Si el medoto ValidarDatos devuelve "", es decir, nada es porque
            //los dos campos estan llenos
        } else {//de lo contrario emite el mensaje
            JOptionPane.showMessageDialog(rootPane, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        
        return;
        
        }
         try {
                  if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Insertar Un Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();
          
          
           String sentenciaInsert="insert into proveedor values(?,?,?,?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,nit.getText());
            conectar.psPrepararSentencia.setString(2,nomcomercial.getText());
            conectar.psPrepararSentencia.setString(3,direccion.getText());
            conectar.psPrepararSentencia.setString(4,ciudad.getText());
            conectar.psPrepararSentencia.setString(5,nombre.getText());
            conectar.psPrepararSentencia.setString(6,apellido.getText());            
            conectar.psPrepararSentencia.setString(7,telefono.getText());
            conectar.psPrepararSentencia.setString(8,fecha.getText());
                 
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Se Registro Proveedor Con Exito");
            JOptionPane.showMessageDialog(this, "Se Registro Proveedor Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null, "El Proveedor Ya Existe");
            
        }
               
        bloquear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        nit.requestFocus();
        nit.setText("");
        nomcomercial.setText("");
        direccion.setText("");
        nombre.setText("");
        apellido.setText("");
        telefono.setText("");
        ciudad.setText("");
       desbloquear(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        bloquear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyTyped
       
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
            nit.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (nit.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nitKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
       
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
            telefono.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (telefono.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
      
         int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada
         if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            nombre.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (nombre.getText().length() >= 30) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (30)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        
         int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada
         if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 10) {//si se presiona enter
            //transfiere el foco
            apellido.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 20 caracteres
        if (apellido.getText().length() >= 30) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (30)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_apellidoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new registro_proveedor().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField direccion;
    public javax.swing.JTextField fecha;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nomcomercial;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
