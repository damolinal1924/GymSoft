


package gymsoft;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



 
 
public class conexion2 {
static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    static String bd = "gymsoft";
    static String user="root";
    static String pass="";
    static String url="jdbc:mysql://localhost/"+bd;
    
    


    public static Connection enlace(Connection conn) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection(url,user,pass);

        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error al conectar base de datos");
        }
        return conn;
    }
    public static Statement sta(Statement st) throws SQLException{

            conn=enlace(conn);
            st=(Statement) conn.createStatement();

            return st;
    }
    public static ResultSet resul(ResultSet rs, String sql) throws SQLException{
        st=sta(st);
        rs=st.executeQuery(sql);
        return rs;

    }
    public static void sql(String sqlcod){
        try{
            conn=enlace(conn);
            st=sta(st);
            st.executeUpdate(sqlcod);
            st.close();
            conn.close();
           JOptionPane.showMessageDialog(null, "Los Datos Se Han Modificado Correctamente");
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "¡¡¡¡ERROR!!!!");
        }

    }

    static void sql() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

   

