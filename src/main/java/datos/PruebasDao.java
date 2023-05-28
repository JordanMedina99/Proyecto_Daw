package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;

import modelos.Prueba;
import java.sql.Time;

public class PruebasDao {
	
	public List<Prueba> listarPruebas() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Prueba> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM prueba");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_prueba = rs.getInt("id_prueba");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String tipo = rs.getString("tipo");
                String dificultad_id = rs.getString("dificultad_id");
                int vencedor_id = rs.getInt("vencedor_id");
                Time tiempo_empleado = rs.getTime("tiempo_empleado");

                Prueba prueba = new Prueba(id_prueba, codigo, nombre, tipo, dificultad_id, vencedor_id, tiempo_empleado);
                lista.add(prueba);
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

    public void insertarPrueba(Prueba prueba) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("INSERT INTO prueba (id_prueba, codigo, nombre, tipo, dificultad_id, vencedor_id, tiempo_empleado) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, prueba.getid_prueba());
            ps.setString(2, prueba.getcodigo());
            ps.setString(3, prueba.getnombre());
            ps.setString(4, prueba.gettipo());
            ps.setString(5, prueba.getdificultad_id());
            ps.setInt(6, prueba.getvencedor_id());
            ps.setTime(7, prueba.gettiempo_empleado());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarPrueba(Prueba prueba) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE prueba SET id_prueba=?, codigo=?, nombre=?, tipo=?, dificultad_id=?, vencedor_id=?, tiempo_empleado=? WHERE id_prueba=?");
            ps.setInt(1, prueba.getid_prueba());
            ps.setString(2, prueba.getcodigo());
            ps.setString(3, prueba.getnombre());
            ps.setString(4, prueba.gettipo());
            ps.setString(5, prueba.getdificultad_id());
            ps.setInt(6, prueba.getvencedor_id());
            ps.setTime(7, prueba.gettiempo_empleado());
            ps.setInt(8, prueba.getid_prueba());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void eliminarPrueba(int id_prueba) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM prueba WHERE id_prueba=?");
            ps.setInt(1, id_prueba);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

}
