
package gymsoft;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class conexion {

    Connection conectar;
    Statement stSentenciasSQL;
    ResultSet rsDatosResultado;
  PreparedStatement psPrepararSentencia;
    public conexion() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/gymsoft";
            conectar = DriverManager.getConnection(url, "root","");
            stSentenciasSQL = conectar.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (ClassNotFoundException ex) {
            throw ex;
        } catch (SQLException ex1) {
            throw ex1;
        }
    }
    //funcion para ejecutar sentencias SELECT
    public ResultSet consulta(String sql) throws SQLException {
        try {
            rsDatosResultado = stSentenciasSQL.executeQuery(sql);//para sentencias select nada mas

        } catch (SQLException ex) {
            throw ex;
        }
        return rsDatosResultado;
    }
    //funcion para ejecutar sentencias INSERT DELETE UPDATE

    public void ejecutar(String sql) throws SQLException {
        try {
            stSentenciasSQL.execute(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     public DefaultTableModel retornarDatosTabla(String SentenciaSQL) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            ResultSet rsDatos = consulta(SentenciaSQL);
            //optendremos lo metodos se la consulta 
            // del cual optenemos 
            ResultSetMetaData metaDatos = rsDatos.getMetaData();
            //optemos el nro de columnas
            int numeroColumnas = metaDatos.getColumnCount();//columnas
            //optener las etiquetas  de la tabla 
            Object[] etiquetas = new Object[numeroColumnas];//creamos de array de objetos dinamico
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);//las etiquetas comienzan desde 1e
            }
            //enlazar las etiquetas con el modelo 
            modelo.setColumnIdentifiers(etiquetas);//asignamos edentiofocadores de columnas 
            while (rsDatos.next()) {
                //creamos un objeto para almacenar un registro
                Object[] datosFila = new Object[modelo.getColumnCount()];
                //rellenar cada posicion del objeto con una de las columans de la tabla 
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    datosFila[i] = rsDatos.getObject(i + 1);
                }
                modelo.addRow(datosFila);
            }
        } catch (Exception e) {
        }
        return modelo;
    }
}
 