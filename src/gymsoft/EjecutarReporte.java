package gymsoft;

import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.view.save.JRPdfSaveContributor.*;
import net.sf.jasperreports.view.JRViewer.*;
import net.sf.jasperreports.view.save.JRMultipleSheetsXlsSaveContributor.*;

public class EjecutarReporte {

    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String ruta = "jdbc:mysql://localhost/gymsoft";
    public static final String user = "root";
    public static final String password = "";
    public static Connection con;

    public void startReport(int id) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String reporte = System.getProperty("user.dir") + "/reportes/reporte_factura.jasper";
            //  String dir_current = System.getProperty("user.dir") ;
            //String file_report = dir_current+"/reporte/reporte.jasper";
            /*String template="/src/reporte/reporte.jasper";
            JasperReport reporte=null;
            reporte=(JasperReport) JRLoader.loadObject(template);*/

            Map param = new HashMap();
            param.put("id", id);

            JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, con);
            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Reportes GymSoft");
            visor.setVisible(true);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);

        }
    }

    public void runparametro(String id) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String master = System.getProperty("user.dir") + "/reportes/reporte_factura.jasper";
            if (master == null) {
                System.out.println("no encuentro el reporte");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte" + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();

            parametro.put("id", id);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, EjecutarReporte.con);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Reportes GymSoft");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }
    }
    //

    public void runventas(String empleado, String fecha) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String master = System.getProperty("user.dir") + "/reportes/reporte_venta.jasper";
            if (master == null) {
                System.out.println("no encuentro el reporte");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte" + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();

            parametro.put("empleado", empleado);
            parametro.put("fecha", fecha);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, EjecutarReporte.con);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Reportes GymSoft");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }
    }

    //
    public void runproductos(String factura) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String master = System.getProperty("user.dir") + "/reportes/reporte_productos.jasper";
            if (master == null) {
                System.out.println("no encuentro el reporte");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte" + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();

            parametro.put("factura", factura);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, EjecutarReporte.con);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Reportes GymSoft");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }
    }

    public void fechapago(String fecha1, String fecha2) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String master = System.getProperty("user.dir") + "/reportes/reporte_fpago.jasper";
            if (master == null) {
                System.out.println("no encuentro el reporte");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte" + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();

            parametro.put("fecha1", fecha1);
            parametro.put("fecha2", fecha2);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, EjecutarReporte.con);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Reporte Fecha de pagos");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }
    }

    public void fechavigencia(String fecha1, String fecha2) {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, password);
            javax.swing.JOptionPane.showMessageDialog(null, "Imprimiendo Reporte");

            String master = System.getProperty("user.dir") + "/reportes/reporte_fvigencia.jasper";
            if (master == null) {
                System.out.println("no encuentro el reporte");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte" + e.getMessage());
                System.exit(3);
            }
            Map parametro = new HashMap();

            parametro.put("fecha1", fecha1);
            parametro.put("fecha2", fecha2);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, EjecutarReporte.con);

            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Reporte Fecha de vigencias");
            jviewer.setVisible(true);
        } catch (Exception j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }
    }

}
