package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Mentor;
public class MentoresDao {
	
	public List<Mentor> listarMentores() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Mentor> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM mentor");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_mentor = rs.getInt("id_mentor");
                String curp = rs.getString("curp");
                String nombre = rs.getString("nombre");
                String sexo = rs.getString("sexo");
                int edad = rs.getInt("edad");
                String puesto = rs.getString("puesto");
                String especialidad = rs.getString("especialidad");
                int tributo_id = rs.getInt("tributo_id");

                Mentor mentor = new Mentor(id_mentor, curp, nombre, sexo, edad, puesto, especialidad, tributo_id);
                lista.add(mentor);
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

    public void insertarMentor(Mentor mentor) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("INSERT INTO mentor (curp, nombre, edad, sexo, puesto, especialidad, tributo_id) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, mentor.getcurp());
            ps.setString(2, mentor.getnombre());
            ps.setString(3, mentor.getsexo());
            ps.setInt(4, mentor.getedad());
            ps.setString(5, mentor.getpuesto());
            ps.setString(6, mentor.getespecialidad());
            ps.setInt(7, mentor.gettributo_id());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarMentor(Mentor mentor) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE mentor SET curp=?, nombre=?, edad=?, puesto=?, especialidad=?, tributo_id=? WHERE id_mentor=?");
            ps.setString(1, mentor.getcurp());
            ps.setString(2, mentor.getnombre());
            ps.setInt(3, mentor.getedad());
            ps.setString(4, mentor.getpuesto());
            ps.setString(5, mentor.getespecialidad());
            ps.setInt(6, mentor.gettributo_id());
            ps.setInt(7, mentor.getid_mentor());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void eliminarMentor(int id_mentor) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM mentor WHERE id_mentor=?");
            ps.setInt(1, id_mentor);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }


}
