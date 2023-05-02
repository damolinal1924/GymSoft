/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * acceso.java
 *
 * Created on 15-jun-2013, 18:18:32
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class acceso extends javax.swing.JFrame {

   int cont=0;
   
    public acceso() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        btnacceso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuenta de Usuarios - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/limpiar.png"))); // NOI18N
        jButton2.setToolTipText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Symbol-Delete.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 70, -1));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, -1));

        txtclave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtclaveKeyPressed(evt);
            }
        });
        jPanel2.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        btnacceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acceder.png"))); // NOI18N
        btnacceso.setToolTipText("Acceder");
        btnacceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccesoActionPerformed(evt);
            }
        });
        btnacceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnaccesoKeyPressed(evt);
            }
        });
        jPanel2.add(btnacceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 210, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acceso.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        user2.setBackground(new java.awt.Color(255, 255, 255));
        user2.setForeground(new java.awt.Color(255, 255, 255));
        user2.setText("jLabel2");
        jPanel2.add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        txtusuario.requestFocus();
        txtclave.setText("");
        txtusuario.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnaccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccesoActionPerformed

        
        //
            String user=txtusuario.getText();
      String pass=String.valueOf(txtclave.getPassword());
        ResultSet r=null;
        
        String consul="select usuario, clave from usuario where usuario ='"+user+"' and clave='"+pass+"' ";
        
        try {
            
            r=conexion2.resul(r, consul);
            int x=0;
            while(r.next()){
                
                   
                   //JOptionPane.showMessageDialog(null," Acceso Concedido ");
                JOptionPane.showMessageDialog(this, "Acceso Concedido, Bienvenido ", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/entrar.png")));
                   
                              
            x++;
                
            //
           
        ResultSet r2=null;
        
        String consul2="select * from  usuario where usuario='"+txtusuario.getText()+"'";
        
        try {
            
            r2=conexion2.resul(r2, consul2);
            if (r2.next()) {
                
                user2.setText(r2.getString(3));
                
                 principal jF2 = new principal();
                    jF2.setVisible(true);
                    this.setVisible(false);
        
            jF2.txtusuario.setText(txtusuario.getText());     
                jF2.txtempleado.setText(user2.getText());
                            
            } 
            
            else{
                //JOptionPane.showMessageDialog(null,"Reporte No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
            }
            }  catch (Exception ex)
                
        {
            //JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }
            //
                }
                
            if(x==0){
                 JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecta ");
                        txtclave.setText("");
                        txtclave.requestFocus();
                        cont=cont+1;
                }
             if(cont==3){
                JOptionPane.showMessageDialog(this,"Usted a Exedido El Numero de Intentos","Verifique",1);
                System.exit(0);
              }
            
} catch (SQLException ex) {

}   
    }//GEN-LAST:event_btnaccesoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnaccesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaccesoKeyPressed
        

    }//GEN-LAST:event_btnaccesoKeyPressed

    private void txtclaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclaveKeyPressed
        
        if(evt.getKeyCode()==evt.VK_ENTER){
        btnaccesoActionPerformed(null);
        }
    }//GEN-LAST:event_txtclaveKeyPressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
       
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceso;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}
