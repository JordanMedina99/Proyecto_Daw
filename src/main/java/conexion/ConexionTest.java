package conexion;


import java.sql.Connection;
import java.sql.SQLException;

public class ConexionTest {
	
	public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = Conexion.getConnection();
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos");
            } else {
                System.out.println("No se pudo establecer la conexión");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(conn);
        }
    }

}
