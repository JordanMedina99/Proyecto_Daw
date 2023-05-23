package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionPruebaBd {
	
	
	public static void main(String[] args) {
		try {
		    Connection conn = Conexion.getConnection();

		    String sql = "SELECT * FROM capitolio";
		    PreparedStatement ps = conn.prepareStatement(sql);
		    ResultSet rs = ps.executeQuery();

		    while (rs.next()) {
		        int id_capitolio = rs.getInt("id_capitolio");
		        String nombre_presidente = rs.getString("nombre_presidente");
		        int numero_habitantes = rs.getInt("numero_habitantes");
		        String ubicacion = rs.getString("ubicacion");
		        String clima = rs.getString("clima");
		        float porcentaje_hombres = rs.getFloat("porcentaje_hombres");
		        float porcentaje_mujeres = rs.getFloat("porcentaje_mujeres");
		        String lugares_interes = rs.getString("lugares_interes");

		        System.out.printf("Id_capitolio: %d%nNombre_presidente: %s%nNumero_habitantes: %d%nUbicacion: %s%nClima: %s%nPorcentaje_hombres: %.2f%nPorcentaje_mujeres: %.2f%nLugares_interes: %s%n-----------------------------%n",
		                id_capitolio, nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes);
		    }

		    Conexion.close(rs);
		    Conexion.close(ps);
		    Conexion.close(conn);
		} catch (SQLException ex) {
		    ex.printStackTrace(System.out.printf("La conexión falló"));
		}

	  }

}
