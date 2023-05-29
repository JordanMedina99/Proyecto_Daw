package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Puntuacion;

public class PuntuacionDao {
	
	public List<Puntuacion> listarPuntuaciones() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Puntuacion> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM puntuacion");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_puntuacion = rs.getInt("id_puntuacion");
                int valor = rs.getInt("valor");
                int tributo_id = rs.getInt("tributo_id");
                int prueba_id = rs.getInt("prueba_id");

                Puntuacion puntuacion = new Puntuacion(id_puntuacion, valor, tributo_id, prueba_id);
                lista.add(puntuacion);
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

    public void insertarPuntuacion(Puntuacion puntuacion) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("INSERT INTO puntuacion (id_puntuacion, valor, tributo_id, prueba_id) VALUES (?, ?, ?, ?)");
            ps.setInt(1, puntuacion.getid_puntuacion());
            ps.setInt(2, puntuacion.getvalor());
            ps.setInt(3, puntuacion.gettributo_id());
            ps.setInt(4, puntuacion.getprueba_id());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarPuntuacion(Puntuacion puntuacion) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE puntuacion SET valor=?, tributo_id=?, prueba_id=? WHERE id_puntuacion=?");
            ps.setInt(1, puntuacion.getvalor());
            ps.setInt(2, puntuacion.gettributo_id());
            ps.setInt(3, puntuacion.getprueba_id());
            ps.setInt(4, puntuacion.getid_puntuacion());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void eliminarPuntuacion(int id_puntuacion) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM puntuacion WHERE id_puntuacion=?");
            ps.setInt(1, id_puntuacion);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

}
