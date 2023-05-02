


package gymsoft;


import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class lista_producto extends javax.swing.JFrame {
  
    DefaultTableModel model;
    public String clave;
    
    public lista_producto() {
        initComponents();
        cargar("");
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        //model.addColumn("No.Ser");//Esta linea agrega una coluna al JTable mediante un modelo
//tabla.setModel(model);//Se establece el modelo al JTable
 this.setLocationRelativeTo(null);
          this.setResizable(false);
    }
    
void cargar(String valor){
    String[] titulos={"ID","DESCRIPCIÓN","PRECIO","STOCK"};
    String[] registros= new String[4];

    String sql ="SELECT * FROM producto where CONCAT(descripcion,'',id_producto) LIKE '%"+valor+"%'";
    model=new DefaultTableModel(null,titulos);
    conectar m=new conectar();
    Connection cn=m.conexion();

    Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
            
            registros[0]=rs.getString("id_producto");
            registros[1]=rs.getString("descripcion");
            registros[2]=rs.getString("precio_venta");
            registros[3]=rs.getString("stock");
            model.addRow(registros);
            }
            tabla.setModel(model);
            
            TableColumn tc = tabla.getColumn("ID"); //Obtienes la columna
            TableColumn tc2 = tabla.getColumn("DESCRIPCIÓN");
            TableColumn tc3 = tabla.getColumn("PRECIO");
            TableColumn tc4 = tabla.getColumn("STOCK");
            tc.setPreferredWidth(40); //Y le das un tamaño que tu quieras o necesites
            tc2.setPreferredWidth(220);
            tc3.setPreferredWidth(130);
            tc4.setPreferredWidth(100);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);     
    }
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
        buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Productos - SolucionesML");
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 380, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/forzabanner600.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 570, -1));

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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
        int fila = tabla.rowAtPoint(evt.getPoint());
    int columna = tabla.columnAtPoint(evt.getPoint());
    if ((fila > -1) && (columna > -1)) {
       
        //this.clave = String.valueOf(tabla.getValueAt(fila, 0).toString().trim());  
        variables_productos.id=tabla.getValueAt(fila,0).toString();
        variables_productos.descripcion=tabla.getValueAt(fila,1).toString();
        variables_productos.precio=tabla.getValueAt(fila,2).toString();
        variables_productos.stock=tabla.getValueAt(fila,3).toString();
            
    }
    dispose();

    }//GEN-LAST:event_tablaMouseClicked

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        
        cargar(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

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
            java.util.logging.Logger.getLogger(lista_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new lista_producto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
