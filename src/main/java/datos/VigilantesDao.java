package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Vigilante;

public class VigilantesDao {
	
	public List<Vigilante> listarVigilantes() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Vigilante> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM vigilante");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_vigilante = rs.getInt("id_vigilante");
                String curp = rs.getString("curp");
                String nombre = rs.getString("nombre");
                String sexo = rs.getString("sexo");
                int edad = rs.getInt("edad");
                String puesto = rs.getString("puesto");

                Vigilante vigilante = new Vigilante(id_vigilante, curp, nombre, sexo, edad, puesto);
                lista.add(vigilante);
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

    public void insertarVigilante(Vigilante vigilante) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("INSERT INTO vigilante (id_vigilante, curp, nombre, sexo, edad, puesto) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, vigilante.getid_vigilante());
            ps.setString(2, vigilante.getcurp());
            ps.setString(3, vigilante.getnombre());
            ps.setString(4, vigilante.getsexo());
            ps.setInt(5, vigilante.getedad());
            ps.setString(6, vigilante.getpuesto());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarVigilante(Vigilante vigilante) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE vigilante SET id_vigilante=?, curp=?, nombre=?, sexo=?, edad=?, puesto=? WHERE id_vigilante=?");
            ps.setInt(1, vigilante.getid_vigilante());
            ps.setString(2, vigilante.getcurp());
            ps.setString(3, vigilante.getnombre());
            ps.setString(4, vigilante.getsexo());
            ps.setInt(5, vigilante.getedad());
            ps.setString(6, vigilante.getpuesto());
            ps.setInt(7, vigilante.getid_vigilante()); 

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }
    public void eliminarVigilante(int id_vigilante) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM vigilante WHERE id_vigilante=?");
            ps.setInt(1, id_vigilante);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

}
