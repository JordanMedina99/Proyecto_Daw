package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Participacion;

public class ParticipacionDao {
	
	 public List<Participacion> listarParticipaciones() throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        List<Participacion> lista = new ArrayList<>();

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("SELECT * FROM participacion");
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                int id_participacion = rs.getInt("id_participacion");
	                Date fecha = rs.getDate("fecha");
	                Time tiempo_empleado = rs.getTime("tiempo_empleado");
	                int tributo_id = rs.getInt("tributo_id");
	                int prueba_id = rs.getInt("prueba_id");

	                Participacion participacion = new Participacion(id_participacion, fecha, tiempo_empleado, tributo_id, prueba_id);
	                lista.add(participacion);
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
         
	 public void insertarParticipacion(Participacion participacion) throws ClassNotFoundException {
		    Connection conn = null;
		    PreparedStatement ps = null;

		    try {
		        conn = Conexion.getConnection();
		        ps = conn.prepareStatement("INSERT INTO participacion (id_participacion, fecha, tiempo_empleado, tributo_id, prueba_id) VALUES (?, ?, ?, ?, ?)");
		        ps.setInt(1, participacion.getid_participacion());
		        ps.setDate(2, participacion.getfecha());
		        ps.setTime(3, participacion.gettiempo_empleado());
		        ps.setInt(4, participacion.gettributo_id());
		        ps.setInt(5, participacion.getprueba_id());

		        ps.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        Conexion.close(ps);
		        Conexion.close(conn);
		    }
		}

 
	 public void actualizarParticipacion(Participacion participacion) throws ClassNotFoundException {
		    Connection conn = null;
		    PreparedStatement ps = null;

		    try {
		        conn = Conexion.getConnection();
		        ps = conn.prepareStatement("UPDATE participacion SET id_participacion=?, fecha=?, tiempo_empleado=?, tributo_id=?, prueba_id=? WHERE id_participacion=?");
		        ps.setInt(1, participacion.getid_participacion());
		        ps.setDate(2, participacion.getfecha());
		        ps.setTime(3, participacion.gettiempo_empleado());
		        ps.setInt(4, participacion.gettributo_id());
		        ps.setInt(5, participacion.getprueba_id());
		        ps.setInt(6, participacion.getid_participacion());
		        
		        ps.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        Conexion.close(ps);
		        Conexion.close(conn);
		    }
		}


	    public void eliminarParticipacion(int id_participacion) throws ClassNotFoundException {
	        Connection conn = null;
	        PreparedStatement ps = null;

	        try {
	            conn = Conexion.getConnection();
	            ps = conn.prepareStatement("DELETE FROM participacion WHERE id_participacion=?");
	            ps.setInt(1, id_participacion);

	            ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            Conexion.close(ps);
	            Conexion.close(conn);
	        }
	    }

}
