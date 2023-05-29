package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import modelos.Puntuacion;
import datos.PuntuacionDao;


public class VistaPuntuacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de PuntuacionDao para obtener las puntuaciones
            PuntuacionDao puntuacionDao = new PuntuacionDao();

            // Obtener la lista de puntuaciones
            List<Puntuacion> puntuaciones = puntuacionDao.listarPuntuaciones();

            // Agregar la lista de puntuaciones como atributo en el request
            request.setAttribute("puntuaciones", puntuaciones);

            // Redirigir a tu página JSP para mostrar las puntuaciones
            request.getRequestDispatcher("formularios/vista_puntuaciones.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener las puntuaciones");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
	

}
