package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelos.Tributo;
import conexion.Conexion;

public class TributosPosicionesDao {

	public List<Tributo> obtenerTributosConDistritos() throws ClassNotFoundException {
        List<Tributo> tributos = new ArrayList<>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement("SELECT t.nombre, t.edad, t.distrito_id " +
                    "FROM tributo t " +
                    "LEFT JOIN puntuacion p ON t.id_tributo = p.tributo_id " +
                    "LEFT JOIN distrito d ON t.distrito_id = d.id_distrito " +
                    "GROUP BY t.nombre, t.edad, t.distrito_id " +
                    "ORDER BY MAX(p.valor) DESC, t.nombre ASC");
            rs = ps.executeQuery();

            while (rs.next()) {
                String nombreTributo = rs.getString("nombre");
                int edadTributo = rs.getInt("edad");
                int distritoId = rs.getInt("distrito_id");

                Tributo tributo = new Tributo(0, "", nombreTributo, "", edadTributo, "", 0, distritoId);
                tributos.add(tributo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }

        return tributos;
    }
}

