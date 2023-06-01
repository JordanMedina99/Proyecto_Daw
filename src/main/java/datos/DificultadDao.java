package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Dificultad;

public class DificultadDao {
    
	public List<Dificultad> listarDificultades() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Dificultad> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM dificultad");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idDificultad = rs.getString("Id_Dificultad");
                String descripcion = rs.getString("descripcion");

                Dificultad dificultad = new Dificultad(idDificultad, descripcion);
                lista.add(dificultad);
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

    public void eliminarDificultad(String idDificultad) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM dificultad WHERE Id_Dificultad=?");
            ps.setString(1, idDificultad);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarDificultad(Dificultad dificultad) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE dificultad SET descripcion=? WHERE Id_Dificultad=?");
            ps.setString(1, dificultad.getdescripcion());
            ps.setString(2, dificultad.getId_Dificultad());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }
}
