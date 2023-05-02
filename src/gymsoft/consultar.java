/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * consultar.java
 *
 * Created on 17-jun-2013, 19:53:58
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class consultar extends javax.swing.JFrame {

    /** Creates new form consultar */
    public consultar() {
        initComponents();
        
        this.setLocationRelativeTo(null);
          this.setResizable(false);
          txtcodigo.requestFocus();
          getRootPane().setDefaultButton(btnconsultar);
          
          
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
        txtcodigo = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        txtfechasistema = new javax.swing.JLabel();
        txtfechavigencia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, -1));

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mano.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 40, 130, -1));

        txtfechasistema.setBackground(new java.awt.Color(255, 255, 255));
        txtfechasistema.setForeground(new java.awt.Color(255, 255, 255));
        txtfechasistema.setText("fecha");
        jPanel1.add(txtfechasistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtfechavigencia.setBackground(new java.awt.Color(255, 255, 255));
        txtfechavigencia.setForeground(new java.awt.Color(255, 255, 255));
        txtfechavigencia.setText("jLabel3");
        jPanel1.add(txtfechavigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consulta.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannermini.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 330, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        
        if(txtcodigo.getText().equals("")){
        
             JOptionPane.showMessageDialog(null,"Campo Vacio Verifique Los Datos","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        String identi;
        identi=(txtcodigo.getText());
        ResultSet r=null;
        
        String consul="select * from factura where cedula=('"+identi+"') order by id_fact desc limit 0, 1";
        
 
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                txtfechavigencia.setText(r.getString(7));
                            
            } else{
                JOptionPane.showMessageDialog(null,"Cliente No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
            txtcodigo.setText("");
            
            return;
            }
            
        }  catch (Exception ex)
                
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
            return;
        }
        
         String cadena01;
String cadena03;
cadena01=(txtfechavigencia.getText());
cadena03=(txtfechasistema.getText());

SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");


Date fecha1 = null;
        try {
            fecha1 = sdf.parse (cadena01);
        } catch (ParseException ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
Date fecha3 = null;
        try {
            fecha3 = sdf.parse (cadena03);
        } catch (ParseException ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }

if (fecha1.compareTo (fecha3)>0) {
    JOptionPane.showMessageDialog(null, " RUTINA DISPONIBLE VIGENCIA " + cadena01 );  //fecha1
txtcodigo.setText("");
} else if(fecha1.compareTo (fecha3)<0) {
    
JOptionPane.showMessageDialog(null, " CUPO NO DISPONIBLE RECARGUE SU GYMCARD " + " SU CUPO EXPIRO EL DIA " + cadena01 ); //fecha1
txtcodigo.setText("");
}
else{
    JOptionPane.showMessageDialog(null, "RUTINA DISPONIBLE ATENCION QUE EL SERVICIO CADUCA HOY " + cadena01);
txtcodigo.setText("");
}
}//GEN-LAST:event_btnconsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new consultar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcodigo;
    public javax.swing.JLabel txtfechasistema;
    private javax.swing.JLabel txtfechavigencia;
    // End of variables declaration//GEN-END:variables
}
