

package gymsoft;

import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class factura_producto extends javax.swing.JFrame {

    DefaultTableModel tabla=new DefaultTableModel();
    Connection conectar2;
    Statement st;
    ResultSet rs;
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    private EjecutarReporte jasper;
        String factura;
    
    public factura_producto() {
        initComponents();
        
        jasper = new EjecutarReporte();
        
        String Titulos[]={"Nº FACTURA","CODIGO","CANTIDAD","TOTAL"};
        tabla.setColumnIdentifiers(Titulos);
        this.tabla2.setModel(tabla);
        
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        
     bloquear();
     
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
void bloquear(){
btnbuscar.setEnabled(false);
txtdescuento.setEnabled(false);
txtcant.setEnabled(false);
btnreporte.setEnabled(false);


//fingreso.getCalendarButton().setEnabled(false);
        }
void desbloquear(){
btnbuscar.setEnabled(true);
txtdescuento.setEnabled(true);
txtcant.setEnabled(true);


        }
void desbloquear2(){
    btnreporte.setEnabled(true);
}
public String ValidarDatos() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (idproducto.getText().equals("")) {//Si txtID esta vacio
            msj += "No Ha Seleccionado Un Producto. \n";
        }
        if (txtcant.getText().equals("")) {//Si txtNombre esta vacio
            msj += "Por Favor Ingrese La Cantidad. \n";
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
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nfactura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        idproducto2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idproducto = new javax.swing.JTextField();
        tproducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnfacturar = new javax.swing.JButton();
        btnreporte = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        iva = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        to2 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        idbase = new javax.swing.JLabel();
        empleado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura de Ventas - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, -1));

        fecha.setText("Fecha:");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel7.setText("Nº Factura");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 20));

        nfactura.setEditable(false);
        jPanel1.add(nfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, -1));

        jLabel8.setText("Descripción");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, 20));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº FACTURA", "CODIGO", "CANTIDAD", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 560, 140));

        jLabel9.setText("Empleado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, 20));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar3.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 165, 30, -1));

        jLabel3.setText("Precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        txtprecio.setEditable(false);
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 140, -1));

        txtdesc.setEditable(false);
        jPanel1.add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 230, -1));

        txtstock.setEditable(false);
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, -1));

        idproducto2.setText("Codigo");
        jPanel1.add(idproducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 20));

        jLabel5.setText("Stock");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        txtcant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantKeyTyped(evt);
            }
        });
        jPanel1.add(txtcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 110, -1));

        txtdescuento.setEditable(false);
        txtdescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdescuentoKeyReleased(evt);
            }
        });
        jPanel1.add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, -1));

        jLabel10.setText("Descuento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel11.setText("Total Producto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        idproducto.setEditable(false);
        jPanel1.add(idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        tproducto.setEditable(false);
        jPanel1.add(tproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        jLabel12.setText("Producto");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/New File2.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 110, -1));

        btnfacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/facturar.png"))); // NOI18N
        btnfacturar.setText("Facturar");
        btnfacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnfacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print2.png"))); // NOI18N
        btnreporte.setText("Reporte");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 110, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        iva.setBackground(new java.awt.Color(255, 255, 255));
        iva.setForeground(new java.awt.Color(255, 255, 255));
        iva.setText("iva");
        jPanel1.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        subtotal.setBackground(new java.awt.Color(255, 255, 255));
        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        subtotal.setText("subtotal");
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        to2.setText("Valor a Pagar");
        jPanel1.add(to2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, 20));

        total.setEditable(false);
        total.setText("0");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 130, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/chulo.png"))); // NOI18N
        jButton5.setText("Registrar Factura");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 113, -1, -1));

        idbase.setBackground(new java.awt.Color(255, 255, 255));
        idbase.setForeground(new java.awt.Color(255, 255, 255));
        idbase.setText("idbase");
        idbase.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                idbaseAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(idbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 290, -1));

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

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
        new lista_producto().setVisible(true);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
        if(!variables_productos.id.equals("")){
            idproducto.setText(variables_productos.id);
            txtdesc.setText(variables_productos.descripcion);
            txtprecio.setText(variables_productos.precio);
            txtstock.setText(variables_productos.stock);
            variables_productos.id="";
            variables_productos.descripcion="";
            variables_productos.precio="";
            variables_productos.stock="";
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        //DecimalFormat decf = new DecimalFormat("###,###");
         if(ValidarDatos().equals("")) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR!! \n" + ValidarDatos(), "Validando Datos",
                    JOptionPane.ERROR_MESSAGE);
        
        return;
        }
 
        int s = Integer.parseInt(txtstock.getText());
        int c = Integer.parseInt(txtcant.getText());
                
        if ((s>c)&&(c>0)){
            
        String datos[]=new String[4];
        int total=0;
        double precio=0,iva,subtotal,desc,t;
        
        
     
        datos[0]=nfactura.getText();
        datos[1]=idproducto.getText();
        datos[2]=txtcant.getText();
        datos[3]=tproducto.getText();
        
        
        tabla.addRow(datos);
         total=tabla.getRowCount();
        for(int i=0; i<total; i++) {
            precio=precio+Double.parseDouble((String)tabla2.getValueAt(i,3));
        }
       
        iva=precio*0.16;
        subtotal=precio-iva;
        this.iva.setText(String.valueOf(iva));
        this.subtotal.setText(String.valueOf(subtotal));
        this.total.setText(String.valueOf(precio));
        
       
        int cant=Integer.parseInt(txtcant.getText());
        int id=Integer.parseInt(idproducto.getText());
        try {
                 
      
           conectar=new conexion();
          
          
           String sentenciaInsert="update producto set stock=stock -("+cant+") where id_producto=("+id+")";
           
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Stock Actualizado ");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
         //
         
        }
        else if (c <= 0){
            JOptionPane.showMessageDialog(null, "La Cantidad No Es Valida");
            return;
                       
        }
        
        else if (c>s){
          JOptionPane.showMessageDialog(null, "El stock del Producto No Soporta La Venta Por Favor Actualize el Stock");
      return;
     }
        idproducto.setText("");
        txtdesc.setText("");
        txtstock.setText("");
        txtprecio.setText("");
        txtcant.setText("");
        txtdescuento.setText("0");
        tproducto.setText("");
      
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtcantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantKeyReleased
       
        
        //DecimalFormat decf = new DecimalFormat("###,###");
        
        int totalp;      
        int descuento = Integer.parseInt(txtdescuento.getText());
        int precio = Integer.parseInt(txtprecio.getText());
        int cant = Integer.parseInt(txtcant.getText() );
        int des;
        if (descuento == 0)
        {
        totalp = precio*cant ;
        tproducto.setText(String.valueOf(totalp));
        //tproducto.setText(String.valueOf(totalp));
        }
        /*else
        {
        des = precio*desc;
        totalp=des-descuento;
        //otalp = (precio-porcent)*cant ;
        }*/
        
    }//GEN-LAST:event_txtcantKeyReleased

    private void txtdescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescuentoKeyReleased
        
         
        //DecimalFormat decf = new DecimalFormat("###,###");
        
        int totalp;      
        int descuento = Integer.parseInt(txtdescuento.getText());
        int precio = Integer.parseInt(txtprecio.getText());
        
        int cant = Integer.parseInt(txtcant.getText() );
        int des;
      
        
            des = precio*cant;
        totalp=des-descuento;
        tproducto.setText(String.valueOf(totalp));
        
        
        
        
       
    }//GEN-LAST:event_txtdescuentoKeyReleased

    private void btnfacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturarActionPerformed

         if(total.getText().equals("0")) {
             JOptionPane.showMessageDialog(null, "No Hay Registros Para Facturar ");
         
        } else {
            
         
      try {
                  if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Insertar Un Registro?", "GymSoft", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
           
          conectar=new conexion();
          
           for (int i = 0; i < tabla2.getRowCount(); i++) {
             String sentenciaInsert = "insert into  detalle_factura(factura, id_producto, cantidad, total_producto,fecha) values ( '" + tabla2.getValueAt(i, 0) + "' ,'" + tabla2.getValueAt(i, 1) + "', '" + tabla2.getValueAt(i, 2) + "', '" + tabla2.getValueAt(i, 3) + "',? )";
                       
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
         
            conectar.psPrepararSentencia.setString(1,fecha.getText());
            
            conectar.psPrepararSentencia.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Factura Generada Con Exito");
            btnfacturar.setEnabled(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //System.out.println(ex.getMessage());
        } 
      //hjhg
      try {
              
           
          conectar=new conexion();
          //String insertFoto="update table set foto="
          
           String sentenciaInsert="update factura_producto set total=("+total.getText()+") where factura=('"+nfactura.getText()+"')";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);       
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Factura actualizada");
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //System.out.println(ex.getMessage());
        }
     
       // "update factura set total_factura=?, IVA=? where Nnm_factura=?;");PARA ACTUALIZAR TOTAL
                
    try {
  
           conectar=new conexion();
          
           
           String sentenciaInsert="update base_caja set total_dia=total_dia +("+total.getText()+") where idbase=("+idbase.getText()+")";
          
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.executeUpdate();
            //JOptionPane.showMessageDialog(null,"DIOS ES AMOR ");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        desbloquear2();
         }
    }//GEN-LAST:event_btnfacturarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         if (empleado.getSelectedItem().equals("<<Seleccione>>")){
           JOptionPane.showMessageDialog(null,"Por Favor Ingrese Empleado");
            }
         else{ 
        try {
                             
          conectar=new conexion();
          
          
           String sentenciaInsert="insert into  factura_producto(factura,empleado,fecha_factura,total) values(?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            
            conectar.psPrepararSentencia.setString(1,nfactura.getText());
            conectar.psPrepararSentencia.setString(2,empleado.getSelectedItem().toString());
            conectar.psPrepararSentencia.setString(3,fecha.getText());
            conectar.psPrepararSentencia.setString(4,this.total.getText());
                            
            conectar.psPrepararSentencia.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Factura Registrada ");
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //System.out.println(ex.getMessage());
        }
        desbloquear();
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idbaseAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_idbaseAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_idbaseAncestorAdded

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        
        factura=(nfactura.getText());
            jasper.runproductos(factura);
    }//GEN-LAST:event_btnreporteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        ResultSet r=null;
        String consul="Select Max(id_fact_producto)+1 AS NUM From factura_producto";
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                nfactura.setText(r.getString(1));
           }   
        }  catch (Exception ex){
            }
         
         empleado.requestFocus();
         idproducto.setText("");
         txtcant.setText("");
         txtdesc.setText("");
         txtdescuento.setText("0");
         txtstock.setText("");
         tproducto.setText("");
         empleado.setSelectedIndex(0);
         iva.setText("");
         subtotal.setText("");
         total.setText("0");
         btnfacturar.setEnabled(true);
         bloquear();
         int total, i;
        total=tabla.getRowCount();
        if (total>0)
            for (i=0; i<total; i++)
                tabla.removeRow(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantKeyTyped
    
         int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada

        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Dora Soft",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (k == 241 || k == 209) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Dora Soft",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {//si se presiona enter
            //transfiere el foco
            txtcant.transferFocus();
        }

        //Limitar el numero de caracteres. Solo se pueden ingresar 5 caracteres
        if (txtcant.getText().length() >= 20) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de caracteres!!! (20)", "Dora Soft",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcantKeyTyped

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
            java.util.logging.Logger.getLogger(factura_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new factura_producto().setVisible(true);
            }
        });
    }
    
    conexion conectar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnfacturar;
    private javax.swing.JButton btnreporte;
    private javax.swing.JComboBox empleado;
    public javax.swing.JLabel fecha;
    public javax.swing.JLabel idbase;
    private javax.swing.JTextField idproducto;
    private javax.swing.JLabel idproducto2;
    private javax.swing.JLabel iva;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nfactura;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable tabla2;
    private javax.swing.JLabel to2;
    public javax.swing.JTextField total;
    private javax.swing.JTextField tproducto;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtdesc;
    public javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
