package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelos.Tributo;
import modelos.Distrito;
import conexion.Conexion;

public class TributosPosicionesDao {
	
	  public List<Tributo> obtenerTributosConDistritos() throws ClassNotFoundException {
	        List<Tributo> tributos = new ArrayList<>();

	        Connection conn = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("SELECT t.nombre, d.nombre AS distrito_nombre " +
	                    "FROM tributo t " +
	                    "LEFT JOIN puntuacion p ON t.id_tributo = p.tributo_id " +
	                    "LEFT JOIN distrito d ON t.distrito_id = d.id_distrito " +
	                    "GROUP BY t.nombre, d.nombre " +
	                    "ORDER BY MAX(p.valor) DESC, t.nombre ASC");
	            rs = ps.executeQuery();

	            while (rs.next()) {
	            	String nombreTributo = rs.getString("nombre");
	            	String nombreDistrito = rs.getString("distrito_nombre");

	            	Tributo tributo = new Tributo(0, "", nombreTributo, "", 0, "", 0, 0);
	            	Distrito distrito = new Distrito(0, nombreDistrito, "", 0, 0, 0, "", "", 0, 0, "");

	            	tributo.setdistrito_id(distrito.getid_distrito());


	                tributos.add(tributo);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Conexion.close(rs);
	            Conexion.close(ps);
	            Conexion.close(conn);
	        }

	        return tributos;
	    }
       
}
