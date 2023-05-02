


package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class registro_cliente extends javax.swing.JFrame {

   
    public registro_cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
          this.setResizable(false);
        bloquear();
    }
void bloquear(){
cedula.setEnabled(false);
nombre.setEnabled(false);
apellido.setEnabled(false);
fechan.setEnabled(false);
sexo.setEnabled(false);
direccion.setEnabled(false);
barrio.setEnabled(false);
telefono.setEnabled(false);
estatura.setEnabled(false);
btnregistrar.setEnabled(false);
peso.setEnabled(false);
fingreso.setEnabled(false);
correo.setEnabled(false);
//fingreso.getCalendarButton().setEnabled(false);
        }
void desbloquear(){
cedula.setEnabled(true);
nombre.setEnabled(true);
apellido.setEnabled(true);
fechan.setEnabled(true);
sexo.setEnabled(true);
direccion.setEnabled(true);
barrio.setEnabled(true);
telefono.setEnabled(true);
estatura.setEnabled(true);
btnregistrar.setEnabled(true);
peso.setEnabled(true);
fingreso.setEnabled(true);
correo.setEnabled(true);
        }

public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (cedula.getText().equals("")) {//Si txtID esta vacio
            msj += "Por Favor Digite Numero de Cedula. \n";
        }
        if (nombre.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Nombre. \n";
        }
        if (apellido.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite El Apellido. \n";
        }
        if(fechan.getDate() == null){
            msj += "Por Favor Digite Una Fecha Valida \n";
        }   
        if (sexo.getSelectedItem().equals("<<Seleccione>>")){
            msj += "Por Favor Seleccione Sexo. \n"; 
        }
        if (tipo.getSelectedItem().equals("<<Seleccione>>")){
            msj += "Por Favor Seleccione Tipo. \n"; 
        }
        
         if (direccion.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Digite Direccion. \n";
        }
         if (barrio.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Ingrese Barrio. \n";
        }
         if (telefono.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Ingrese Telefono. \n";
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechan = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        barrio = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        estatura = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        tipo2 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        telefono = new javax.swing.JTextField();
        fingreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfnacimiento = new javax.swing.JLabel();
        edad2 = new javax.swing.JLabel();
        edad3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Clientes - SolucionesML ");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel2.setText("Cedula");

        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        jLabel3.setText("Fecha de Nacimiento");

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        jLabel4.setText("Sexo");

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Seleccione>>", "Masculino", "Femenino" }));
        sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sexoKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellidos");

        jLabel6.setText("Nombres");

        fechan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechanKeyTyped(evt);
            }
        });

        jLabel7.setText("Edad");

        edad.setEditable(false);

        jLabel8.setText("Direccion");

        jLabel9.setText("Barrio");

        jLabel10.setText("Telefono");

        jLabel11.setText("Estatura");

        jLabel12.setText("Peso");

        jLabel13.setText("Fecha de Ingreso");

        jLabel14.setText("E-mail");

        tipo2.setText("tipo");

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Seleccione>>", "Normal", "Pionero", "Empresarial", "Otro" }));

        fingreso.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(fechan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barrio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tipo2)
                        .addGap(10, 10, 10)
                        .addComponent(tipo, 0, 222, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo2))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 810, 230));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 130, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 130, -1));

        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 130, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        jButton5.setText("Nuevo Registro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        txtfnacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtfnacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtfnacimiento.setText("fnacimiento");
        jPanel1.add(txtfnacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        edad2.setBackground(new java.awt.Color(255, 255, 255));
        edad2.setForeground(new java.awt.Color(255, 255, 255));
        edad2.setText("edad");
        jPanel1.add(edad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 40, -1));

        edad3.setBackground(new java.awt.Color(255, 255, 255));
        edad3.setForeground(new java.awt.Color(255, 255, 255));
        edad3.setText("edad3");
        jPanel1.add(edad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 50, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        cedula.requestFocus();        
cedula.setText("");
nombre.setText("");
apellido.setText("");
((JTextField)fechan.getDateEditor().getUiComponent()).setText("");
sexo.setSelectedIndex(0);
tipo.setSelectedIndex(0);
direccion.setText("");
barrio.setText("");
correo.setText("");
edad.setText("");
telefono.setText("");
estatura.setText("");
peso.setText("");
//fingreso.setText("");
//((JTextField)fingreso.getDateEditor().getUiComponent()).setText("");
        desbloquear();     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        bloquear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
         if(ValidarDatos().equals("")) {
      try {
            
            java.util.Date date = fechan.getDate();
            //java.util.Date date2 = fingreso.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
           // SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYY");
            txtfnacimiento.setText(sdf.format(date));
            //txtfechaingreso.setText(sdf2.format(date2));           
            
            int año = fechan.getCalendar().get(Calendar.YEAR);
            
            edad3.setText("" + año);
        } catch(NullPointerException ex) {
            txtfnacimiento.setText("");
            
            //JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("mrbean.gif")));
        }
        
        int edades,edadcliente,año2;
        
        edades=Integer.parseInt(edad2.getText());
        año2=Integer.parseInt(edad3.getText());
        
        edadcliente=edades-año2;
        
        edad.setText(String.valueOf(edadcliente));
        
        try {
                 // if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Insertar Un Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();
         
           String sentenciaInsert="insert into cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,cedula.getText());
            conectar.psPrepararSentencia.setString(2,nombre.getText());
            conectar.psPrepararSentencia.setString(3,apellido.getText());
            conectar.psPrepararSentencia.setString(4,sexo.getSelectedItem().toString());
            conectar.psPrepararSentencia.setString(5,txtfnacimiento.getText());
            conectar.psPrepararSentencia.setString(6,edad.getText());
            conectar.psPrepararSentencia.setString(7,direccion.getText());
            conectar.psPrepararSentencia.setString(8,barrio.getText());
            conectar.psPrepararSentencia.setString(9,telefono.getText());
            conectar.psPrepararSentencia.setString(10,correo.getText());           
            conectar.psPrepararSentencia.setString(11,estatura.getText());
            conectar.psPrepararSentencia.setString(12,peso.getText());
            conectar.psPrepararSentencia.setString(13,fingreso.getText());
            conectar.psPrepararSentencia.setString(14,tipo.getSelectedItem().toString());
            
            conectar.psPrepararSentencia.executeUpdate();
           
            JOptionPane.showMessageDialog(this, "Cliente Registrado Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            bloquear();
            //}
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Cliente Forza Ya Existe");
        }
         }
         else {
            JOptionPane.showMessageDialog(this, "ERROR!! \n" + ValidarDatos(), "Validando Datos",JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnregistrarActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
       
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
            cedula.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (cedula.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cedulaKeyTyped

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

    private void fechanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechanKeyTyped
        
        fechan.transferFocus();
    }//GEN-LAST:event_fechanKeyTyped

    private void sexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexoKeyTyped
        
        sexo.transferFocus();
    }//GEN-LAST:event_sexoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new registro_cliente().setVisible(true);
            }
        });
    }
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField barrio;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    public javax.swing.JLabel edad2;
    private javax.swing.JLabel edad3;
    private javax.swing.JTextField estatura;
    private com.toedter.calendar.JDateChooser fechan;
    public javax.swing.JTextField fingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    private javax.swing.JComboBox sexo;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox tipo;
    private javax.swing.JLabel tipo2;
    private javax.swing.JLabel txtfnacimiento;
    // End of variables declaration//GEN-END:variables
}
