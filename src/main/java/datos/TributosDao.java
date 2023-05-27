package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Tributo;

public class TributosDao {
	
	 public List<Tributo> listarTributos() throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        List<Tributo> lista = new ArrayList<>();

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("SELECT * FROM tributo");
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                int id_tributo = rs.getInt("id_tributo");
	                String curp = rs.getString("curp");
	                String nombre = rs.getString("nombre");
	                String sexo = rs.getString("sexo");
	                int edad = rs.getInt("edad");
	                String habilidad = rs.getString("habilidad");
	                int espectaculo_puntuacion = rs.getInt("espectaculo_puntuacion");
	                int distrito_id = rs.getInt("distrito_id");

	                Tributo tributo = new Tributo(id_tributo, curp, nombre, sexo, edad, habilidad, espectaculo_puntuacion, distrito_id);
	                lista.add(tributo);
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

	 public void insertarTributo(Tributo tributo) throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("INSERT INTO tributo (curp, nombre, sexo, edad, habilidad, espectaculo_puntuacion, distrito_id) VALUES (?, ?, ?, ?, ?, ?, ?)");
	            ps.setString(1, tributo.getcurp());
	            ps.setString(2, tributo.getnombre());
	            ps.setString(3, tributo.getsexo());
	            ps.setInt(4, tributo.getedad());
	            ps.setString(5, tributo.gethabilidad());
	            ps.setInt(6, tributo.getespectaculo_puntuacion());
	            ps.setInt(7, tributo.getdistrito_id());

	            ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Conexion.close(ps);
	            Conexion.close(conn);
	        }
	    }

	 public void actualizarTributo(Tributo tributo) throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("UPDATE tributo SET curp=?, nombre=?, sexo=?, edad=?, habilidad=?, espectaculo_puntuacion=?, distrito_id=? WHERE id_tributo=?");
	            ps.setString(1, tributo.getcurp());
	            ps.setString(2, tributo.getnombre());
	            ps.setString(3, tributo.getsexo());
	            ps.setInt(4, tributo.getedad());
	            ps.setString(5, tributo.gethabilidad());
	            ps.setInt(6, tributo.getespectaculo_puntuacion());
	            ps.setInt(7, tributo.getdistrito_id());
	            ps.setInt(8, tributo.getid_tributo());

	            ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Conexion.close(ps);
	            Conexion.close(conn);
	        }
	    }

	    public void eliminarTributo(int id_tributo) throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("DELETE FROM tributo WHERE id_tributo=?");
	            ps.setInt(1, id_tributo);

	            ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Conexion.close(ps);
	            Conexion.close(conn);
	        }
	    }

}
