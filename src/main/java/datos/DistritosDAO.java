package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Distrito;

public class DistritosDAO {

	public List<Distrito> listarDistritos() throws ClassNotFoundException {
	    Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    List<Distrito> lista = new ArrayList<>();

	    try {
	        conn = Conexion.getConnection();
	        ps = conn.prepareStatement("SELECT * FROM distrito");
	        rs = ps.executeQuery();
	        while (rs.next()) {
	            int id_distrito = rs.getInt("id_distrito");
	            String nombre = rs.getString("nombre");
	            String especializacion = rs.getString("especializacion");
	            int puestos_trabajo = rs.getInt("puestos_trabajo");
	            int juegos_ganados = rs.getInt("juegos_ganados");
	            int cantidad_habitantes = rs.getInt("cantidad_habitantes");
	            String ubicacion = rs.getString("ubicacion");
	            String clima = rs.getString("clima");
	            float porcentaje_hombres = rs.getFloat("porcentaje_hombres");
	            float porcentaje_mujeres = rs.getFloat("porcentaje_mujeres");
	            String lider_nombre = rs.getString("lider_nombre");

	            Distrito distrito = new Distrito(id_distrito, nombre, especializacion, puestos_trabajo, juegos_ganados,
	                    cantidad_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lider_nombre);
	            lista.add(distrito);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Conexion.close(rs);
	        Conexion.close(ps);
	        Conexion.close(conn);
	    }

	    return lista;
	}

}


