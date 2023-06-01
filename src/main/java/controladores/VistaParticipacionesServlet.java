package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import modelos.Participacion;
import datos.ParticipacionDao;

public class VistaParticipacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de ParticipacionDao para obtener las participaciones
            ParticipacionDao participacionDao = new ParticipacionDao();

            // Obtener la lista de participaciones
            List<Participacion> participaciones = participacionDao.listarParticipaciones();

            // Agregar la lista de participaciones como atributo en el request
            request.setAttribute("participaciones", participaciones);

            // Redirigir a tu página JSP para mostrar las participaciones
            request.getRequestDispatcher("formularios/vista_participaciones.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener las participaciones");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
