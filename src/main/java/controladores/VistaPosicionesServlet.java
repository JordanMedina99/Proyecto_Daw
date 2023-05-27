package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Tributo;
import datos.TributosPosicionesDao;

public class VistaPosicionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de TributosPosicionesDao para obtener los tributos con distritos
            TributosPosicionesDao tributosDao = new TributosPosicionesDao();

            // Obtener la lista de tributos con distritos
            List<Tributo> tributos = tributosDao.obtenerTributosConDistritos();

            // Agregar la lista de tributos como atributo en el request
            request.setAttribute("tributos", tributos);

            // Redirigir a tu página JSP para mostrar los tributos
            request.getRequestDispatcher("formularios/vista_posiciones.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener los tributos");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
