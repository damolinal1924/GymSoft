


package gymsoft;


import com.mysql.jdbc.Statement;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class factura extends javax.swing.JFrame {
    
    DefaultTableModel tabla=new DefaultTableModel();
     
    Connection conectar2;
    Statement st;
    ResultSet rs;
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
     
    private EjecutarReporte jasper;
        String id;
        
    public factura() {
        initComponents();
        bloqear();
        this.setLocationRelativeTo(null);
          this.setResizable(false);
       String Titulos[]={"Nº Factura","Tipo","Valor","Descuento","Empleado"};
        tabla.setColumnIdentifiers(Titulos);
        this.tabla2.setModel(tabla);
        
        jasper = new EjecutarReporte ();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gymsoft", "root", "123456");
            st = (Statement) conectar2.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from usuario");
            modeloCombo.addElement("<<Seleccione>>");//es el primer registro q mostrara el combo
            
            empleado.setModel(modeloCombo);//con esto lo agregamos al objeto al jcombobox
            
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombres"));
                
                empleado.setModel(modeloCombo);
                
            }
 
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (cedula.getText().equals("")) {//Si txtID esta vacio
            msj += "Faltan Datos Del Cliente. \n";
        }
       if(fechapago.getDate() == null){
            msj += "Por Favor Especifique Fecha de Pago \n";
        }
        if (empleado.getSelectedItem().equals("<<Seleccione>>")){
            msj += "Por Favor Seleccione Empleado. \n"; 
        }
        if(fechavigencia.getDate() == null){
            msj += "Por Favor Especifique Fecha de Vigencia \n";
        }
        
        return msj;
    }
void bloqear(){
    btnreporte.setEnabled(false);
}
void desbloqear(){
    btnreporte.setEnabled(true);
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
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fechapago = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        fechavigencia = new com.toedter.calendar.JDateChooser();
        descuento = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnfacturar = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        txtvigencia = new javax.swing.JLabel();
        txtpago = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        idfactura = new javax.swing.JLabel();
        idbase = new javax.swing.JLabel();
        empleado = new javax.swing.JComboBox();
        iva = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        nfactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        txtusuario = new javax.swing.JLabel();
        txtusuario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bannerforza.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 810, 90));

        fecha.setText("Fecha");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 30, 60, -1));

        cedula.setEditable(false);
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 70, 20));

        jLabel6.setText("Nombres");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        nombre.setEditable(false);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, -1));

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 60, 20));

        apellido.setEditable(false);
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 106, 30, -1));

        jLabel7.setText("Nº Factura");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 20));

        telefono.setEditable(false);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 200, -1));

        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 20));

        direccion.setEditable(false);
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 200, -1));

        jLabel9.setText("Dirección");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, 20));

        jLabel10.setText("Tipo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 30, 20));

        txttipo.setEditable(false);
        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });
        jPanel1.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, -1));

        jLabel11.setText("Valor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 50, 20));

        fechapago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechapagoMouseClicked(evt);
            }
        });
        jPanel1.add(fechapago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, -1));

        jLabel12.setText("Fecha Vigencia");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 100, 20));

        fechavigencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechavigenciaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechavigenciaMousePressed(evt);
            }
        });
        fechavigencia.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fechavigenciaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(fechavigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 120, -1));

        descuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "5%", "10%", "15%", "20%" }));
        jPanel1.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 60, -1));

        jLabel13.setText("Fecha de Pago");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 100, 20));

        jLabel14.setText("Descuento");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 70, 20));

        correo.setEditable(false);
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 200, -1));

        jLabel15.setText("E-Mail");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 50, 30));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Factura", "Tipo", "Valor", "Descuento", "Empleado"
            }
        ));
        jScrollPane1.setViewportView(tabla2);
        tabla2.getColumnModel().getColumn(4).setResizable(false);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 700, 100));

        jLabel16.setText("Empleado");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 70, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13));
        jLabel19.setText("Total");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 50, 20));

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 150, -1));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 110, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 110, -1));

        btnfacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/facturar.png"))); // NOI18N
        btnfacturar.setText("Facturar");
        btnfacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnfacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 120, -1));

        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        btnreporte.setText("Reporte");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 120, -1));

        txtvigencia.setBackground(new java.awt.Color(255, 255, 255));
        txtvigencia.setForeground(new java.awt.Color(255, 255, 255));
        txtvigencia.setText("fechavigencia");
        jPanel1.add(txtvigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        txtpago.setBackground(new java.awt.Color(255, 255, 255));
        txtpago.setForeground(new java.awt.Color(255, 255, 255));
        txtpago.setText("fechapago");
        jPanel1.add(txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remover.png"))); // NOI18N
        jButton6.setText("Remover");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        idfactura.setBackground(new java.awt.Color(255, 255, 255));
        idfactura.setForeground(new java.awt.Color(255, 255, 255));
        idfactura.setText("13");
        jPanel1.add(idfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 20, -1));

        idbase.setBackground(new java.awt.Color(255, 255, 255));
        idbase.setForeground(new java.awt.Color(255, 255, 255));
        idbase.setText("idbase");
        jPanel1.add(idbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, -1));

        iva.setBackground(new java.awt.Color(255, 255, 255));
        iva.setForeground(new java.awt.Color(255, 255, 255));
        iva.setText("iva");
        jPanel1.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        subtotal.setBackground(new java.awt.Color(255, 255, 255));
        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        subtotal.setText("subtotal");
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        nfactura.setText("jLabel2");
        jPanel1.add(nfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, -1));

        jLabel2.setText("FACT-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        valor.setEditable(false);
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 150, -1));

        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("jLabel20");
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        txtusuario2.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario2.setText("jLabel20");
        jPanel1.add(txtusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

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

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(ValidarDatos().equals("")) {
            
            try {
            
            java.util.Date date = fechapago.getDate();
            java.util.Date date2 = fechavigencia.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("YYY-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("YYY-MM-dd");
            txtpago.setText(sdf.format(date));
            txtvigencia.setText(sdf2.format(date2));           
            
//Comparo fecha si es menor o mayor    
            String cadena01;
String cadena03;
cadena01=(txtvigencia.getText());
cadena03=(txtpago.getText());

SimpleDateFormat sdf3 = new SimpleDateFormat ("yyyy-MM-dd");

Date fecha1 = null;
        try {
            fecha1 = sdf3.parse (cadena01);
        } catch (ParseException ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
Date fecha3 = null;
        try {
            fecha3 = sdf3.parse (cadena03);
        } catch (ParseException ex) {
            Logger.getLogger(consultar.class.getName()).log(Level.SEVERE, null, ex);
        }

if (fecha1.compareTo (fecha3)>0) {
    //JOptionPane.showMessageDialog(null, " mayor " + cadena01 );  //fecha1

} else if(fecha1.compareTo (fecha3)<0) {
    
JOptionPane.showMessageDialog(null, " La Fecha de Vigencia No Puede ser Menor a La Fecha de Pago " ); //fecha1
return;
}
        } catch(NullPointerException ex) {
            txtpago.setText("");
            txtvigencia.setText("");
            JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("gimnasio.gif")));
        return;
        }
       //DecimalFormat decf = new DecimalFormat("###,###");
       //DecimalFormat sindecimales = new DecimalFormat("###");
        
        String datos[]=new String[5];
        int total=0;
        double precio=0,iva,subtotal,desc,t;
        
        if (descuento.getSelectedItem().equals("0%")){
     
        datos[0]=nfactura.getText();
        datos[1]=txttipo.getText();
        datos[2]=valor.getText();
        datos[3]=(String)descuento.getSelectedItem();
        datos[4]=(String)empleado.getSelectedItem();
        
        tabla.addRow(datos);
         total=tabla.getRowCount();
        for(int i=0; i<total; i++) {
            precio=precio+Double.parseDouble((String)tabla2.getValueAt(i,2));
        }
       
        iva=precio*0.16;
        subtotal=precio-iva;
        this.iva.setText(String.valueOf(iva));
        this.subtotal.setText(String.valueOf(subtotal));
        this.total.setText(String.valueOf(precio));
        }
     
       if (descuento.getSelectedItem().equals("5%")){
      JOptionPane.showMessageDialog(null,"Aun No Estan Habilitados Los Descuento");
        }
        if (descuento.getSelectedItem().equals("10%")){
      JOptionPane.showMessageDialog(null,"Aun No Estan Habilitados Los Descuento");
        }
        
        if (descuento.getSelectedItem().equals("15%")){
      JOptionPane.showMessageDialog(null,"Aun No Estan Habilitados Los Descuento");
        }
        
        if (descuento.getSelectedItem().equals("20%")){
      JOptionPane.showMessageDialog(null,"Aun No Estan Habilitados Los Descuento");
         }
        }
        else {
            JOptionPane.showMessageDialog(this, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE); 
     }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnfacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturarActionPerformed

        if(total.getText().equals("0")) {
             JOptionPane.showMessageDialog(null, "No Hay Registros Para Facturar ");
        }
        else {
        try {
                  if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Insertar Un Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();
         
          
           String sentenciaInsert="insert into factura (num_factura,cedula,empleado,fecha_factura,fecha_pago,fecha_vigencia,tipo,iva,subtotal,total) values(?,?,?,?,?,?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,nfactura.getText());
            conectar.psPrepararSentencia.setString(2,cedula.getText());
            conectar.psPrepararSentencia.setString(3,empleado.getSelectedItem().toString());
            conectar.psPrepararSentencia.setString(4,fecha.getText());
            conectar.psPrepararSentencia.setString(5,txtpago.getText());
            conectar.psPrepararSentencia.setString(6,txtvigencia.getText());
            conectar.psPrepararSentencia.setString(7,txttipo.getText());
            conectar.psPrepararSentencia.setString(8,this.iva.getText());
            conectar.psPrepararSentencia.setString(9,this.subtotal.getText());
            conectar.psPrepararSentencia.setString(10,this.total.getText());
              
            conectar.psPrepararSentencia.executeUpdate();
            JOptionPane.showMessageDialog(null,"Factura Generada Con Exito");
            btnfacturar.setEnabled(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //System.out.println(ex.getMessage());
        }
        try {
  
           conectar=new conexion();
                    
           String sentenciaInsert="update base_caja set total_dia=total_dia +("+total.getText()+") where idbase=("+idbase.getText()+")";
          
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"DIOS ES AMOR ");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        desbloqear();
        }
    }//GEN-LAST:event_btnfacturarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        //DecimalFormat decf = new DecimalFormat("###,###");
        
        double iva,subtotal,desc,t;
        
        int fila,total=0;
        int precio=0;
        fila=tabla2.getSelectedRow();
        if (fila>=0) {
            tabla.removeRow(fila);
            total=tabla.getRowCount();
            for(int i=0;i<total;i++){
                precio=precio+Integer.parseInt((String)tabla2.getValueAt(i,2));
            }
            //desc=precio*0.05;
            //t=precio-desc;
            iva=precio*0.16;
            subtotal=precio-iva;
            //this.total.setText(String.valueOf(decf.format(t)));
            //this.txtdesc.setText(String.valueOf(decf.format(desc)));
            this.iva.setText(String.valueOf(iva));
            this.subtotal.setText(String.valueOf(subtotal));
            this.total.setText(String.valueOf(precio));
        } else
            JOptionPane.showMessageDialog(null,"No Ha Seleccionado o Agregado Nada");
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
        ResultSet r=null;
       
         String consul="select * from cliente where cedula=('"+JOptionPane.showInputDialog("Digite Numero de Cedula Del Cliente")+"')";                                                                                           
                                                                                                            
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                cedula.setText(r.getString(1));
                nombre.setText(r.getString(2));
                apellido.setText(r.getString(3));
                direccion.setText(r.getString(7));
                telefono.setText(r.getString(9));
                correo.setText(r.getString(10));
                txttipo.setText(r.getString(14));
                
                if(cedula.getText().equals("21-1067844754")){valor.setText(String.valueOf("12000")); txttipo.setText(String.valueOf("Dia"));}
                
                else{
                if (txttipo.getText().equals("Normal")){
                    valor.setText(String.valueOf("80000"));
                }
                if (txttipo.getText().equals("Pionero")){
                    valor.setText(String.valueOf("70000"));
                }
                if (txttipo.getText().equals("Otro")){
                    valor.setText(String.valueOf("60000"));
                }
                if (txttipo.getText().equals("Empresarial")){
                    valor.setText(String.valueOf("60000"));
                }               }
              }
            else{
                JOptionPane.showMessageDialog(null,"Cliente No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
                 if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Redistrar Un Nuevo Cliente?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
                 new registro_cliente2().setVisible(true);
                 this.setVisible(false);
                 }
                }
        }  catch (Exception ex)
                
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
      
        ResultSet r=null;
        String consul="Select Max(id_fact)+1 AS NUM From factura";
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                nfactura.setText(r.getString(1));
           }   
        }  catch (Exception ex){
            }
         cedula.requestFocus();
         cedula.setText("");
         nombre.setText("");
         apellido.setText("");
         direccion.setText("");
         telefono.setText("");
         correo.setText("");
         empleado.setSelectedIndex(0);
         txttipo.setText("0");
         ((JTextField)fechapago.getDateEditor().getUiComponent()).setText("");
         ((JTextField)fechavigencia.getDateEditor().getUiComponent()).setText("");
         txttipo.setText("");
         descuento.setSelectedIndex(0);
         iva.setText("");
         subtotal.setText("");
         total.setText("0");
         btnfacturar.setEnabled(true);
         bloqear();
         int total, i;
        total=tabla.getRowCount();
        if (total>0)
            for (i=0; i<total; i++)
                tabla.removeRow(0);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
       
        String identi;
        identi=(cedula.getText());
        ResultSet r=null;
        //String consul="select * from factura where cedula="+identi;
        String consul="select * from factura where cedula=('"+identi+"') order by id_fact desc limit 0, 1";
        //SELECT * FROM factura2 WHERE cedula=1073 ORDER BY id_fact DESC LIMIT 0, 1;   
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                idfactura.setText(r.getString(1));
                            
            } else
                JOptionPane.showMessageDialog(null,"Reporte No Encontrado","Verifique el Registro a Consultar",JOptionPane.ERROR_MESSAGE);
        }  catch (Exception ex)
                
        {
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }
        
          id=(idfactura.getText());
            jasper.runparametro(id);
    }//GEN-LAST:event_btnreporteActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void fechavigenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechavigenciaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechavigenciaMouseClicked

    private void fechavigenciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fechavigenciaAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechavigenciaAncestorAdded

    private void fechavigenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechavigenciaMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechavigenciaMousePressed

    private void fechapagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechapagoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechapagoMouseClicked

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        
    /* String user=(empleado.getSelectedItem().toString());
      
       
          ResultSet r10=null;
       
         String consul10="select * from usuario where nombres ='"+user+"'";                                                                                        
                                                                                                            
        try {
            
            r10=conexion2.resul(r10, consul10);
            if (r10.next()) {
                txtusuario2.setText(r10.getString("nombres"));
 
              }
            if (txtusuario2.getText().equals(txtusuario.getText())){
             
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario No Valido");
             empleado.setSelectedIndex(0);
            }
            
        }  catch (Exception ex)
                
        {
           // JOptionPane.showMessageDialog(null, "Hubo un problema al intentar obtener los datos");
        }*/
        
    }//GEN-LAST:event_empleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new factura().setVisible(true);
            }
        });
    }
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnfacturar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnreporte;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox descuento;
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox empleado;
    public javax.swing.JLabel fecha;
    private com.toedter.calendar.JDateChooser fechapago;
    private com.toedter.calendar.JDateChooser fechavigencia;
    public javax.swing.JLabel idbase;
    private javax.swing.JLabel idfactura;
    private javax.swing.JLabel iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel nfactura;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField telefono;
    public javax.swing.JTextField total;
    private javax.swing.JLabel txtpago;
    private javax.swing.JTextField txttipo;
    public javax.swing.JLabel txtusuario;
    private javax.swing.JLabel txtusuario2;
    private javax.swing.JLabel txtvigencia;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
