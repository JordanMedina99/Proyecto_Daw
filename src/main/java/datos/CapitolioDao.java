package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelos.Capitolio;

public class CapitolioDao {
	
	public List<Capitolio> listarCapitolios() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Capitolio> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT * FROM capitolio");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_capitolio = rs.getInt("id_capitolio");
                String nombre_presidente = rs.getString("nombre_presidente");
                int numero_habitantes = rs.getInt("numero_habitantes");
                String ubicacion = rs.getString("ubicacion");
                String clima = rs.getString("clima");
                float porcentaje_hombres = rs.getFloat("porcentaje_hombres");
                float porcentaje_mujeres = rs.getFloat("porcentaje_mujeres");
                String lugares_interes = rs.getString("lugares_interes");

                Capitolio capitolio = new Capitolio(id_capitolio, nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes);
                lista.add(capitolio);
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

    public void insertarCapitolio(Capitolio capitolio) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("INSERT INTO capitolio (id_capitolio, nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, capitolio.getid_capitolio());
            ps.setString(2, capitolio.getnombre_presidente());
            ps.setInt(3, capitolio.getnumero_habitantes());
            ps.setString(4, capitolio.getubicacion());
            ps.setString(5, capitolio.getclima());
            ps.setFloat(6, capitolio.getporcentaje_hombres());
            ps.setFloat(7, capitolio.getporcentaje_mujeres());
            ps.setString(8, capitolio.getlugares_interes());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void actualizarCapitolio(Capitolio capitolio) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("UPDATE capitolio SET id_capitolio=?, nombre_presidente=?, numero_habitantes=?, ubicacion=?, clima=?, porcentaje_hombres=?, porcentaje_mujeres=?, lugares_interes=? WHERE id_capitolio=?");
            ps.setInt(1, capitolio.getid_capitolio());
            ps.setString(2, capitolio.getnombre_presidente());
            ps.setInt(3, capitolio.getnumero_habitantes());
            ps.setString(4, capitolio.getubicacion());
            ps.setString(5, capitolio.getclima());
            ps.setFloat(6, capitolio.getporcentaje_hombres());
            ps.setFloat(7, capitolio.getporcentaje_mujeres());
            ps.setString(8, capitolio.getlugares_interes());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }


    public void eliminarCapitolio(int id_capitolio) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("DELETE FROM capitolio WHERE id_capitolio=?");
            ps.setInt(1, id_capitolio);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

}
