


package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class dinero_base extends javax.swing.JFrame implements Runnable{

    String hora,minutos,segundos,ampm;
    Thread h1;
    
    public dinero_base() {
        initComponents();
        txtbase.requestFocus();
        calcula ();
        run();
        h1 = new Thread(this);
    h1.start();
    setLocationRelativeTo(null);//para centrar la ventana
    setVisible(true);
        this.setResizable(false);
    }
    
    public void run(){
         
 Thread ct = Thread.currentThread();
 while(ct == h1) {   
  calcula();
  txthora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
  try {
   Thread.sleep(1000);
  }catch(InterruptedException e) {}
 }
}
     public void calcula () {        
Calendar calendario = new GregorianCalendar();
Date fechaHoraActual = new Date();


calendario.setTime(fechaHoraActual);
ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"":"";

if(ampm.equals("PM")){
 int h = calendario.get(Calendar.HOUR_OF_DAY)-0; //-12
 hora = h>9?""+h:"0"+h;
}else{
 hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
}
minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
}
     void desbloquear(){
         principal jF2 = new principal();
         jF2.setVisible(true);
         this.setVisible(false);
        
       //jF2.nfactura.setText(nfactura.getText());
    jF2.menufactura.setEnabled(true);
    jF2.menufacturaproducto.setEnabled(true);
    jF2.txtempleado.setText(txtempleado.getText());
    jF2.txtusuario.setText(txtusuario.getText());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtempleado = new javax.swing.JLabel();
        txtbase = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtusuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txthora = new javax.swing.JLabel();
        txttotaldia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Base de Caja - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Caja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Fecha");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel2.setText("Empleado");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Depositar");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 225, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel3.setText("Base");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        txtempleado.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtempleado.setText("carlos alberto");
        txtempleado.setName("txtempleado"); // NOI18N
        jPanel2.add(txtempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, -1));

        txtbase.setName("txtbase"); // NOI18N
        txtbase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbaseKeyTyped(evt);
            }
        });
        jPanel2.add(txtbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 162, -1));

        txtfecha.setEditable(false);
        txtfecha.setName("txtfecha"); // NOI18N
        jPanel2.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("usuario");
        txtusuario.setName("txtusuario"); // NOI18N
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 283, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 357, 334));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/caja.png"))); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 23, -1, 320));

        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setForeground(new java.awt.Color(255, 255, 255));
        txthora.setText("hora");
        txthora.setName("txthora"); // NOI18N
        jPanel1.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        txttotaldia.setBackground(new java.awt.Color(255, 255, 255));
        txttotaldia.setForeground(new java.awt.Color(255, 255, 255));
        txttotaldia.setText("0");
        txttotaldia.setName("txttotaldia"); // NOI18N
        jPanel1.add(txttotaldia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 20, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanners.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 350, 770, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtbase.getText().equals("")) {
           JOptionPane.showMessageDialog(null,"Ingrese Monto de La Base de Inicio" );
        }
        else{
        
        try {
           
          conectar=new conexion();
     
           String sentenciaInsert="insert into base_caja (dinero_base,total_dia,empleado,fecha,hora) values(?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,txtbase.getText());
            conectar.psPrepararSentencia.setString(2,txttotaldia.getText());
            conectar.psPrepararSentencia.setString(3,txtempleado.getText());
            conectar.psPrepararSentencia.setString(4,txtfecha.getText());
            conectar.psPrepararSentencia.setString(5,txthora.getText());
            
            conectar.psPrepararSentencia.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "El Dinero Inicial Fue Confirmado $ " + txtbase.getText() + " Pesos", "GymSoft", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Recursos/dinerobase.png")));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //System.out.println(ex.getMessage());
        }
        desbloquear();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbaseKeyTyped
       
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
            txtbase.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (txtbase.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "GymSoft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtbaseKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        principal jF2 = new principal();
         jF2.setVisible(true);
         this.setVisible(false);
         
    jF2.txtempleado.setText(txtempleado.getText());
    jF2.txtusuario.setText(txtusuario.getText());

       
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
            java.util.logging.Logger.getLogger(dinero_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dinero_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dinero_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dinero_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new dinero_base().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtbase;
    public javax.swing.JLabel txtempleado;
    public javax.swing.JTextField txtfecha;
    public javax.swing.JLabel txthora;
    private javax.swing.JLabel txttotaldia;
    public javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
