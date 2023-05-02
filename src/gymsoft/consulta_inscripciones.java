/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * consulta_inscripciones.java
 *
 * Created on 24-jun-2013, 22:54:16
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEGO
 */
public class consulta_inscripciones extends javax.swing.JFrame {

  DefaultTableModel model;
  
  private EjecutarReporte jasper;
        String empleado;
        String fecha;
  
    public consulta_inscripciones() {
        initComponents();
       
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        jasper = new EjecutarReporte ();
        
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
        fecha2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        totalfacturas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        abc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtbase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        facturadomasbase = new javax.swing.JTextField();
        totalindividual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        reporteuser = new javax.swing.JRadioButton();
        txtnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inscripciones Y Ventas - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha2.setName("fecha2"); // NOI18N
        jPanel1.add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar3.png"))); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consulta123.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 36));
        jLabel3.setText("Realize Su Consulta..!!!");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 60, -1, -1));

        jLabel4.setText("Ingrese Dia A Consultar");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 20));

        txtfecha.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha.setText("fecha");
        txtfecha.setName("txtfecha"); // NOI18N
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "ESTATURA", "PESO", "TIPO", "FCHA INSCRIPCIÓN"
            }
        ));
        tabla.setName("tabla"); // NOI18N
        jScrollPane1.setViewportView(tabla);

        jScrollPane1.setBounds(2, 0, 790, 290);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inscripciones", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setName("jPanel4"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº FACTURA", "EMPLEADO", "FECHA PAGO", "FECHA VIGENCIA", "TIPO", "TOTAL"
            }
        ));
        tabla3.setName("tabla3"); // NOI18N
        jScrollPane3.setViewportView(tabla3);

        totalfacturas.setName("totalfacturas"); // NOI18N

        jLabel6.setText("Facturas");
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(totalfacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalfacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Facturas", jPanel4);

        jPanel3.setName("jPanel3"); // NOI18N

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setName("jDesktopPane2"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "EMPLEADO", "BASE", "TOTAL"
            }
        ));
        tabla2.setName("tabla2"); // NOI18N
        jScrollPane2.setViewportView(tabla2);

        jScrollPane2.setBounds(0, 0, 790, 240);
        jDesktopPane2.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Total Dia");
        jLabel5.setName("jLabel5"); // NOI18N
        jLabel5.setBounds(530, 275, 50, 14);
        jDesktopPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        abc.setEditable(false);
        abc.setName("abc"); // NOI18N
        abc.setBounds(590, 270, 180, 20);
        jDesktopPane2.add(abc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Ver");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(200, 255, 60, 23);
        jDesktopPane2.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtbase.setEditable(false);
        txtbase.setName("txtbase"); // NOI18N
        txtbase.setBounds(340, 245, 180, 20);
        jDesktopPane2.add(txtbase, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("Base");
        jLabel7.setName("jLabel7"); // NOI18N
        jLabel7.setBounds(300, 245, 34, 20);
        jDesktopPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        facturadomasbase.setEditable(false);
        facturadomasbase.setName("facturadomasbase"); // NOI18N
        facturadomasbase.setBounds(590, 245, 180, 20);
        jDesktopPane2.add(facturadomasbase, javax.swing.JLayeredPane.DEFAULT_LAYER);

        totalindividual.setEditable(false);
        totalindividual.setName("totalindividual"); // NOI18N
        totalindividual.setBounds(340, 270, 180, 20);
        jDesktopPane2.add(totalindividual, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("facturado");
        jLabel8.setName("jLabel8"); // NOI18N
        jLabel8.setBounds(270, 270, 70, 14);
        jDesktopPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("Total");
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.setBounds(550, 250, 30, 14);
        jDesktopPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas y Facturación", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 790, 320));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        jButton2.setText("Imprimir");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        reporteuser.setBackground(new java.awt.Color(255, 255, 255));
        reporteuser.setText("Reporte Usuario");
        reporteuser.setName("reporteuser"); // NOI18N
        jPanel1.add(reporteuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setText("rafael molina");
        txtnombre.setName("txtnombre"); // NOI18N
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza.png"))); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 830, -1));

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
        
        try {
            
            java.util.Date date = fecha2.getDate();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            txtfecha.setText(sdf.format(date));
                      
        } catch(NullPointerException ex) {
            txtfecha.setText("");
            
            JOptionPane.showMessageDialog(this, "Seleccione Una Fecha Válida!", "Error!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("gimnasio.gif")));
        return;
        }
        
       String fec=(txtfecha.getText());
        //void cargar(String valor){
    String[] titulos={"CEDULA","NOMBRE","APELLIDO","ESTATURA","PESO","TIPO","FECHA INSCRIPCIÓN"};
    String[] registros= new String[7];
 
    String sql ="select * from cliente where fechaingreso=('"+fec +"')";
   model=new DefaultTableModel(null,titulos);
    conectar m=new conectar();
    Connection cn=m.conexion();

    Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
            
            registros[0]=rs.getString("cedula");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellido");
            registros[3]=rs.getString("estatura");
            registros[4]=rs.getString("peso");
            registros[5]=rs.getString("tipo");
            registros[6]=rs.getString("fechaingreso");
            model.addRow(registros);
            }
            tabla.setModel(model);
                     
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                    
}
    //select count(*) as total from base_caja; 
        
      //String fec=(txtfecha.getText());
        //void cargar(String valor){
    
        //
        String[] titulos3={"Nº FACTURA","EMPLEADO","FECHA PAGO","FECHA VIGENCIA","TIPO","TOTAL"};
    String[] registros3= new String[6];
 
    String sql3 ="SELECT * FROM factura where fecha_factura=('"+fec+"')";
   model=new DefaultTableModel(null,titulos3);
    conectar m3=new conectar();
    Connection cn3=m3.conexion();

    Statement st3;
        try {
            st3 = (Statement) cn3.createStatement();
            ResultSet rs3 = st3.executeQuery(sql3);
            while(rs3.next()){
                
            
            registros3[0]=rs3.getString("num_factura");
            registros3[1]=rs3.getString("empleado");
            registros3[2]=rs3.getString("fecha_pago");
            registros3[3]=rs3.getString("fecha_vigencia");
            registros3[4]=rs3.getString("tipo");
            registros3[5]=rs3.getString("total");
           
            model.addRow(registros3);
            }
            tabla3.setModel(model);
                     
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                    
}   
        //
        String[] titulos2={"FECHA","EMPLEADO","BASE","TOTAL"};
    String[] registros2= new String[4];
 
    String sql2 ="SELECT * FROM base_caja where fecha=('"+fec+"')";
   model=new DefaultTableModel(null,titulos2);
    conectar m2=new conectar();
    Connection cn2=m2.conexion();

    Statement st2;
        try {
            st2 = (Statement) cn2.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);
            while(rs2.next()){
                
            
            registros2[0]=rs2.getString("fecha");
            registros2[1]=rs2.getString("empleado");
            registros2[2]=rs2.getString("dinero_base");
            registros2[3]=rs2.getString("total_dia");
           
            model.addRow(registros2);
            }
            tabla2.setModel(model);
                     
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                    
}   
       //suma venta y facturacion 
        double sumatoria1=0;
        int totalRow= tabla2.getRowCount();
        totalRow-=1; 
        for(int i=0;i<=(totalRow);i++)
        {
            double sumatoria= Double.parseDouble(String.valueOf(tabla2.getValueAt(i,3)));
    //en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria1+=sumatoria;
                         
        }     
        abc.setText(String.valueOf(sumatoria1));
        
        //suma facturas
         double sumatoria2=0;
        int totalRow2= tabla3.getRowCount();
        totalRow2-=1; 
        for(int i=0;i<=(totalRow2);i++)
        {
            double sumatorias2= Double.parseDouble(String.valueOf(tabla3.getValueAt(i,5)));
    //en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria2+=sumatorias2;
                         
        }     
        totalfacturas.setText(String.valueOf(sumatoria2));
        
        //suma dinero base
         double sumatoria3=0;
        int totalRow3= tabla2.getRowCount();
        totalRow3-=1; 
        for(int i=0;i<=(totalRow3);i++)
        {
            double sumatorias3= Double.parseDouble(String.valueOf(tabla2.getValueAt(i,2)));
    //en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria3+=sumatorias3;
                         
        }     
        txtbase.setText(String.valueOf(sumatoria3));
        //
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(reporteuser.getModel().isSelected()){ 
               
        empleado=(txtnombre.getText());
       fecha=(txtfecha.getText());
           jasper.runventas(empleado,fecha);
          }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    String nom=txtnombre.getText();
    String fe=txtfecha.getText();
    
         String[] titulos2={"FECHA","EMPLEADO","BASE","TOTAL"};
    String[] registros2= new String[4];
    
    
    String sql2 ="SELECT * FROM base_caja where fecha=('"+fe+"')and empleado=('"+nom+"')";
   model=new DefaultTableModel(null,titulos2);
    conectar m2=new conectar();
    Connection cn2=m2.conexion();

    Statement st2;
        try {
            st2 = (Statement) cn2.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);
            while(rs2.next()){
                
            
            registros2[0]=rs2.getString("fecha");
            registros2[1]=rs2.getString("empleado");
            registros2[2]=rs2.getString("dinero_base");
            registros2[3]=rs2.getString("total_dia");
           
            model.addRow(registros2);
            }
            tabla2.setModel(model);
                     
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);                    
}  
        //suma venta y facturacion 
        double sumatoria1=0;
        int totalRow= tabla2.getRowCount();
        totalRow-=1; 
        for(int i=0;i<=(totalRow);i++)
        {
            double sumatoria= Double.parseDouble(String.valueOf(tabla2.getValueAt(i,3)));
    //en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria1+=sumatoria;
                         
        }     
        totalindividual.setText(String.valueOf(sumatoria1));
        
         //suma dinero base
         double sumatoria3=0,facturado = 0;
         
        int totalRow3= tabla2.getRowCount();
        totalRow3-=1; 
        for(int i=0;i<=(totalRow3);i++)
        {
            double sumatorias3= Double.parseDouble(String.valueOf(tabla2.getValueAt(i,2)));
    //en la parte de arriba indica el primer parametro la fila y el segundo la columna la cual estaras //manejando
             sumatoria3+=sumatorias3;
             facturado=sumatoria3+sumatoria1;
             
                         
        }     
        txtbase.setText(String.valueOf(sumatoria3));
        facturadomasbase.setText(String.valueOf(facturado));
        //
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(consulta_inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta_inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta_inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta_inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new consulta_inscripciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abc;
    private javax.swing.JTextField facturadomasbase;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton reporteuser;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JTextField totalfacturas;
    private javax.swing.JTextField totalindividual;
    private javax.swing.JTextField txtbase;
    private javax.swing.JLabel txtfecha;
    public javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

    
}
