package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Entrenamiento;

public class EntrenamientoDao {
     
	public List<Entrenamiento> listarEntrenamientos() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Entrenamiento> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM entrenamiento");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_entrenamiento = rs.getInt("id_entrenamiento");
                int tributo_id = rs.getInt("tributo_id");
                int prueba_id = rs.getInt("prueba_id");

                Entrenamiento entrenamiento = new Entrenamiento(id_entrenamiento, tributo_id, prueba_id);
                lista.add(entrenamiento);
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
	
	public void insertarEntrenamiento(Entrenamiento entrenamiento) throws ClassNotFoundException {
	    Connection conn = null;
	    PreparedStatement ps = null;

	    try {
	        conn = Conexion.getConnection();
	        ps = conn.prepareStatement("INSERT INTO entrenamiento (id_entrenamiento, tributo_id, prueba_id) VALUES (?, ?, ?)");
	        ps.setInt(1, entrenamiento.getid_entrenamiento());
	        ps.setInt(2, entrenamiento.gettributo_id());
	        ps.setInt(3, entrenamiento.getprueba_id());

	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Conexion.close(ps);
	        Conexion.close(conn);
	    }
	}

    public void eliminarEntrenamiento(int id_entrenamiento) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM entrenamiento WHERE id_entrenamiento=?");
            ps.setInt(1, id_entrenamiento);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarEntrenamiento(Entrenamiento entrenamiento) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE entrenamiento SET tributo_id=?, prueba_id=? WHERE id_entrenamiento=?");
            ps.setInt(1, entrenamiento.gettributo_id());
            ps.setInt(2, entrenamiento.getprueba_id());
            ps.setInt(3, entrenamiento.getid_entrenamiento());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }
}
