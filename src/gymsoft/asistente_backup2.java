/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * asistente_backup2.java
 *
 * Created on 29-jun-2013, 19:56:11
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class asistente_backup2 extends javax.swing.JFrame {

    /** Creates new form asistente_backup2 */
    public asistente_backup2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        rgenerar = new javax.swing.JRadioButton();
        restaurar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asistente Backup - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rgenerar.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rgenerar);
        rgenerar.setFont(new java.awt.Font("Tahoma", 1, 14));
        rgenerar.setForeground(new java.awt.Color(255, 255, 255));
        rgenerar.setText("Generar Copia de Seguridad");
        rgenerar.setContentAreaFilled(false);
        rgenerar.setName("rgenerar"); // NOI18N
        getContentPane().add(rgenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        restaurar.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(restaurar);
        restaurar.setFont(new java.awt.Font("Tahoma", 1, 14));
        restaurar.setForeground(new java.awt.Color(255, 255, 255));
        restaurar.setText("Restaurar base de datos");
        restaurar.setContentAreaFilled(false);
        restaurar.setName("restaurar"); // NOI18N
        getContentPane().add(restaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jButton1.setText("Atrás");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 80, -1));

        jButton2.setText("Siguiente");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 90, -1));

        jButton3.setText("Cancelar");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/asistente4.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(rgenerar.getModel().isSelected()){
        
        new asistente_backup3().setVisible(true);
        this.setVisible(false);
        }
        if(restaurar.getModel().isSelected()){
            
            JOptionPane.showMessageDialog(null,"No Tiene Permiso Para Restaurar ");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        int opc=JOptionPane.showConfirmDialog(null, "Realmente Desea Cancelar el proceso ");
        
        if(opc==0){
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        new asistente_backup().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(asistente_backup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistente_backup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistente_backup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistente_backup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new asistente_backup2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton restaurar;
    private javax.swing.JRadioButton rgenerar;
    // End of variables declaration//GEN-END:variables
}
