/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package gymsoft;


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class asistente_backup3 extends javax.swing.JFrame {

   
    public asistente_backup3() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        acepto = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asistente Backup - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Los soportes de almacenamiento portátiles\nson elementos físicos y deben ser gestionados\nsólo por personas de confianza.\n\nEstablecer una cadena de confianza individual\nes crítico para defender la seguridad de los\ndatos.\n\nUn esquema de copia de seguridad efectiva debe\ntener en consideración las limitaciones de la\nsituación.\n\nTodo esquema de copia de seguridad tiene cierto\nimpacto en el sistema que ha sido copiado.\n\nSi este impacto es significativo, la copia de\nseguridad debe ser acotada en el tiempo.\n\nTodos los soportes de almacenamiento tienen una\ncapacidad finita y un coste real. \n\nBuscar la cantidad correcta de capacidad acorde\ncon las necesidades de la copia de seguridad es\nuna parte importante del diseño del esquema de\nla copia.\n\nEl proceso por el cual los dueños de los datos\npueden obtener información considerando como\nfueron copiados esos datos.\n\nEl mismo proceso es también usado para probar\nconformidad para los cuerpos reguladores fuera\nde la organización.\n\nTerrorismo, complejidad de datos, valores de\ndatos y aumento de la dependencia sobre volúmenes\nde datos crecientes, todos contribuyen a una\nansiedad alrededor y dependencia sobre copias de\nseguridad satisfactorias.\n\nPor ello varias organizaciones normalmente relegan\nsobre terceras personas o soluciones independientes\nla averiguacion, validación, optimización y el\nhacerse cargo de sus operaciones de copia de\nseguridad.\n\nAlgunos progaramas de copias de seguridad modernas\nhan incorporado capacidades de validación.");
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 440, 240));

        acepto.setText("Acepto Condiciones");
        acepto.setContentAreaFilled(false);
        acepto.setName("acepto"); // NOI18N
        jPanel1.add(acepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jButton1.setText("Atrás");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 70, -1));

        jButton2.setText("Siguiente");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jButton3.setText("Cancelar");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/backup2.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(acepto.isSelected()) {
    new generar_backup().setVisible(true);
    this.setVisible(false);
    
        }
        
else {
     JOptionPane.showMessageDialog(null, " Debe Aceptar Las Condiciones Para Seguir ");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        int opc=JOptionPane.showConfirmDialog(null, "Realmente Desea Cancelar el proceso ");
        
        if(opc==0){
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        new asistente_backup2().setVisible(true);
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
            java.util.logging.Logger.getLogger(asistente_backup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistente_backup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistente_backup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistente_backup3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new asistente_backup3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acepto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
