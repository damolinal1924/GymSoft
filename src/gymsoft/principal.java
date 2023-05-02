/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 15-jun-2013, 19:30:42
 */
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class principal extends javax.swing.JFrame implements Runnable{

     
    String hora,minutos,segundos,ampm;
Calendar calendario;    
Thread h1;

    public principal() {
        initComponents();
              Date now = new Date(System.currentTimeMillis());
SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

this.fecha.setText(date.format(now));
//System.out.println(date.format(now));
    this.setExtendedState(MAXIMIZED_BOTH);
        Calendar Cal= Calendar.getInstance();
String fecha=""+ Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+
        "/"+Cal.get(Cal.YEAR);

String año=""+Cal.get(Cal.YEAR);
//this.fecha.setText(fecha);
this.año.setText(año);

      calcula ();
        run();
        h1 = new Thread(this);
    h1.start();
    setLocationRelativeTo(null);//para centrar la ventana
    setVisible(true);
        this.setResizable(false);
       bloquear();
    }
    public void run(){
         
 Thread ct = Thread.currentThread();
 while(ct == h1) {   
  calcula();
  hora2.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
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
     void bloquear(){
menufactura.setEnabled(false);
menufacturaproducto.setEnabled(false);
     }
    @Override
     public Image getIconImage(){

Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/logo2.png"));

return retValue;
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cero = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        año = new javax.swing.JLabel();
        txtempleado = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nfactura = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menufactura = new javax.swing.JMenuItem();
        menufacturaproducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(800, 498));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cero.setBackground(new java.awt.Color(255, 255, 255));
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setText("0");
        getContentPane().add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setText("Fecha:");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        hora2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hora2.setText("Hora:");
        getContentPane().add(hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 149, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 50, -1));

        año.setBackground(new java.awt.Color(255, 255, 255));
        año.setForeground(new java.awt.Color(255, 255, 255));
        año.setText("año");
        getContentPane().add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtempleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtempleado.setText("Usuario");
        getContentPane().add(txtempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 480, -1));

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtusuario.setText("Usuario");
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user.png"))); // NOI18N
        jLabel2.setToolTipText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        nfactura.setBackground(new java.awt.Color(0, 0, 0));
        nfactura.setForeground(new java.awt.Color(255, 255, 255));
        nfactura.setText("jLabel6");
        getContentPane().add(nfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 80, -1));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("id");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/p5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/archi.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setToolTipText("Archivo");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Backup");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/base.png"))); // NOI18N
        jMenu7.setText("Abrir");
        jMenu7.setToolTipText("Abrir");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Dinero Base");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuBar1.add(jMenu7);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cliente.png"))); // NOI18N
        jMenu2.setText("Clientes");
        jMenu2.setToolTipText("Clientes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carrito.png"))); // NOI18N
        jMenu5.setText("Productos");
        jMenu5.setToolTipText("Productos");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Registrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Lista de Productos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Actualizar Stock");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/factura.png"))); // NOI18N
        jMenu3.setText("Factura");
        jMenu3.setToolTipText("Factura");

        menufactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menufactura.setText("Nueva Factura");
        menufactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menufacturaActionPerformed(evt);
            }
        });
        jMenu3.add(menufactura);

        menufacturaproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menufacturaproducto.setText("Factura Productos");
        menufacturaproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menufacturaproductoActionPerformed(evt);
            }
        });
        jMenu3.add(menufacturaproducto);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consultar.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setToolTipText("Consultas");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("ForzaGym");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Factura Cliente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Inscripciones y Ventas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/proveedor.png"))); // NOI18N
        jMenu6.setText("Proveedores");
        jMenu6.setToolTipText("Proveedores");

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Registrar Proveedor");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Lista Proveedores");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/acerca.png"))); // NOI18N
        jMenu8.setText("Acerca de...");
        jMenu8.setToolTipText("Acerca de...");

        jMenuItem5.setText("Acerca de...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ayuda.png"))); // NOI18N
        jMenu9.setText("Ayuda");
        jMenu9.setToolTipText("Ayuda");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu9KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu10.setText("Cerrar Sección");
        jMenu10.setToolTipText("Cerrar Sección");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        registro_cliente jF2 = new registro_cliente();
        jF2.setVisible(true);
       jF2.edad2.setText(año.getText());
       jF2.fingreso.setText(fecha.getText());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menufacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menufacturaActionPerformed
                
         String emp;
        emp=(txtempleado.getText());
        ResultSet r=null;
        
        String consul="select * from  base_caja where empleado='"+emp+"' order by idbase desc limit 0, 1";
        String consul2="Select Max(id_fact)+1 AS NUM From factura";
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                id.setText(r.getString(1));
           } 
            r=conexion2.resul(r, consul2);
            if (r.next()) {
                nfactura.setText(r.getString(1));
            }
            
        }  catch (Exception ex){
            }
     
     factura jF2 = new factura();
        jF2.setVisible(true);
        
       jF2.nfactura.setText(nfactura.getText());
       jF2.fecha.setText(fecha.getText());
       jF2.idbase.setText(id.getText());
       jF2.total.setText(cero.getText());
       jF2.txtusuario.setText(txtempleado.getText());
    }//GEN-LAST:event_menufacturaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        consultar jF2 = new consultar();
        jF2.setVisible(true);
          
      
       jF2.txtfechasistema.setText(fecha.getText());
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        registro_productos jF2 = new registro_productos();
        jF2.setVisible(true);
       jF2.txtfechaingreso.setText(fecha.getText());
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
        actualizar_stock jF2 = new actualizar_stock();
        jF2.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        
        registro_proveedor jF2 = new registro_proveedor();
        jF2.setVisible(true);
        
       jF2.fecha.setText(fecha.getText());
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void menufacturaproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menufacturaproductoActionPerformed
                         
         String emp;
        emp=(txtempleado.getText());
        ResultSet r=null;
        
        String consul="select * from  base_caja where empleado='"+emp+"' order by idbase desc limit 0, 1";
        String consul2="Select Max(id_fact_producto)+1 AS NUM From factura_producto";
        try {
            
            r=conexion2.resul(r, consul);
            if (r.next()) {
                
                id.setText(r.getString(1));
                            
            }
            r=conexion2.resul(r, consul2);
            if (r.next()) {
                nfactura.setText(r.getString(1));
            }
            
            }  catch (Exception ex)
                
        {
            
        }
     
     factura_producto jF2 = new factura_producto();
        jF2.setVisible(true);
        
       jF2.nfactura.setText(nfactura.getText());
       jF2.fecha.setText(fecha.getText());
       jF2.txtdescuento.setText(cero.getText());
       jF2.total.setText(cero.getText());
       jF2.idbase.setText(id.getText());
    }//GEN-LAST:event_menufacturaproductoActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        
        consulta_inscripciones jF2 = new consulta_inscripciones();
        jF2.setVisible(true);
        
        jF2.txtnombre.setText(txtempleado.getText());
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      
        dinero_base jF2 = new dinero_base();
        jF2.setVisible(true);
        this.setVisible(false);
        
       jF2.txtfecha.setText(fecha.getText());
       jF2.txtempleado.setText(txtempleado.getText());
       jF2.txtusuario.setText(txtusuario.getText());
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        buscar_cliente jF2 = new buscar_cliente();
        jF2.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

         lista_proveedores jF2 = new lista_proveedores();         jF2.setVisible(true);     }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

         lista_producto2 jF2 = new lista_producto2();         jF2.setVisible(true);     }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu9KeyPressed
        
        
    }//GEN-LAST:event_jMenu9KeyPressed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        
        JOptionPane.showMessageDialog(null,"Ayuda No Disponible... " );
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      
        new asistente_backup().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        acerca jF2 = new acerca();
        jF2.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
         consultas_vigencia f= new consultas_vigencia();
         f.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
          
         acceso jF2 = new acceso();
        jF2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel año;
    private javax.swing.JLabel cero;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora2;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JMenuItem menufactura;
    public javax.swing.JMenuItem menufacturaproducto;
    private javax.swing.JLabel nfactura;
    public javax.swing.JLabel txtempleado;
    public javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
