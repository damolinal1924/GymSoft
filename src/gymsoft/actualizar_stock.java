/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * actualizar_stock.java
 *
 * Created on 22-jun-2013, 19:16:30
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class actualizar_stock extends javax.swing.JFrame {

    /** Creates new form actualizar_stock */
    public actualizar_stock() {
        initComponents();
         this.setLocationRelativeTo(null);
          this.setResizable(false);
    }

    public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
       
        if (snuevo.getText().equals("")) {
            msj += "Por Favor Ingrese El Nuevo Stock. \n";
        }
         if (descripcion.getText().equals("")) {
            msj += "Por Favor Realize La Busqueda del Producto \n";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        rdnombre = new javax.swing.JRadioButton();
        rdid = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sactual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        snuevo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización del Stock - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 20));
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 260, -1));

        rdnombre.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdnombre);
        rdnombre.setText("Por Nombre");
        jPanel1.add(rdnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        rdid.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdid);
        rdid.setText("Por ID");
        jPanel1.add(rdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 81, -1));

        jLabel2.setText("Descripción Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 380, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 600, -1));

        jLabel4.setText("Stock Actual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));
        jPanel1.add(sactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        jLabel5.setText("Nuevo Stock");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 20));

        snuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snuevoKeyTyped(evt);
            }
        });
        jPanel1.add(snuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 130, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar3.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 75, 30, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 110, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 120, -1));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Document.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Close.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(txtbuscar.getText().equals("")){
          JOptionPane.showMessageDialog(null, "No Ha Seleccionado El Tipo De Busqueda ");  
        }
        if(rdnombre.getModel().isSelected()){
            
        String nombre=(txtbuscar.getText());
        
         ResultSet r=null;
        // String consul="select * from producto where descripcion=("+nombre+")";
         String consul="select * from producto where descripcion= ('"+nombre+"')";
         
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                descripcion.setText(r.getString(2));
                sactual.setText(r.getString(3));      
                
            } else
                JOptionPane.showMessageDialog(null,"Producto No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
        }  catch (Exception ex)
                
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }
        }
       //
        if(rdid.getModel().isSelected()){
            
        int id=Integer.parseInt(txtbuscar.getText());
        
         ResultSet r=null;
         String consul="select * from producto where id_producto="+id;
        //String consul="select * from cliente where cedula="+JOptionPane.showInputDialog("Digite Numero de Cedula Del Cliente");
       
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                descripcion.setText(r.getString(2));
                sactual.setText(r.getString(3));      
                
            } else
                JOptionPane.showMessageDialog(null,"Producto No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
        }  catch (Exception ex)
                
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(ValidarDatos().equals("")) {//Si el medoto ValidarDatos devuelve "", es decir, nada es porque
            //los dos campos estan llenos
        } else {//de lo contrario emite el mensaje
            JOptionPane.showMessageDialog(rootPane, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        String descp=(descripcion.getText());
        int stocknuevo=Integer.parseInt(snuevo.getText());
        
        if (stocknuevo <=0){
            JOptionPane.showMessageDialog(null, "La Cantidad No Es Valida");
        }
        else {
            
    try {
                  //if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "desea insertar un registro?", "Insertar Datos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
      
           conectar=new conexion();
          
           
           String sentenciaInsert="update producto set stock=stock +("+stocknuevo+") where descripcion=('"+descp+"')";
          
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            JOptionPane.showMessageDialog(null,"Stock Actualizado ");
            //}
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
     int a,b,c;
        a=Integer.parseInt(sactual.getText());
        b=Integer.parseInt(snuevo.getText());
        
        c=a+b;
        sactual.setText(String.valueOf(c));
        }
       
        
        
        snuevo.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void snuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snuevoKeyTyped
       
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
            snuevo.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (snuevo.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_snuevoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        registro_productos jF2 = new registro_productos();
        jF2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if(rdnombre.getModel().isSelected()){
        try {
                
           
          conectar=new conexion();
         
          String sentenciaInsert="update producto set descripcion='"+descripcion.getText()+"', stock='"+sactual.getText()+"' where descripcion='"+txtbuscar.getText()+"'";
           
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Se Actualizarón Los Datos Con Exito");
            JOptionPane.showMessageDialog(this, "Se Actualizarón Los Datos Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            
            txtbuscar.setText("");
            descripcion.setText("");
            sactual.setText("");
            
         
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
        if(rdid.getModel().isSelected()){
            try {
                
           
          conectar=new conexion();
         
          String sentenciaInsert="update producto set descripcion='"+descripcion.getText()+"', stock='"+sactual.getText()+"' where id_producto='"+txtbuscar.getText()+"'";
           
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Se Actualizarón Los Datos Con Exito");
            JOptionPane.showMessageDialog(this, "Se Actualizarón Los Datos Con Exito", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/guardado.png")));
            
            txtbuscar.setText("");
            descripcion.setText("");
            sactual.setText("");
            
         
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(actualizar_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new actualizar_stock().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rdid;
    private javax.swing.JRadioButton rdnombre;
    private javax.swing.JTextField sactual;
    private javax.swing.JTextField snuevo;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
