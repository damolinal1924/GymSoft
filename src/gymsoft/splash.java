
package gymsoft;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class splash extends javax.swing.JFrame implements Runnable {

    int num = 0;
    Thread t;
  
    public splash() {
        initComponents();
        
    }

    public void Llena_Barra() {
        if (Barra.getValue() <= 100) {
            num += 3;//Valor con el que se va llenar el ProgressBar. Se llenará de 3 en 3
            //Le podemos dar un valor mas alto para que se llene mas rapido o un valor mas bajo
            //para que se llene mas lento
            Barra.setValue(num);
            Barra.setStringPainted(true);
        } else {
            Barra.setValue(0);
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

        Barra = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 266, 450, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargandosoft.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/diseñosplasgym.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        Hilo hl = new Hilo(this);
        hl.start();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new splash().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
public void run() {
        try {
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            t.sleep(6000);//Tiempo que deseamos que se muestre nuestro Splash: 6000 milisegundos = 6 segundos
                         //Debemos ajustarlo bien para que nuestro Splash desaparezaca justo cuando el ProgressBar
                        //acabe de llenarse.
            this.dispose();
            acceso p = new acceso();
            p.setLocationRelativeTo(null);
            p.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
