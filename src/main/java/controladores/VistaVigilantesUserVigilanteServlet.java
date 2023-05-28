package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import modelos.Vigilante;
import datos.VigilantesDao;

public class VistaVigilantesUserVigilanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de VigilantesDao para obtener los vigilantes
            VigilantesDao vigilantesDao = new VigilantesDao();

            // Obtener la lista de vigilantes
            List<Vigilante> vigilantes = vigilantesDao.listarVigilantes();

            // Agregar la lista de vigilantes como atributo en el request
            request.setAttribute("vigilantes", vigilantes);

            // Redirigir a tu página JSP para mostrar los vigilantes
            request.getRequestDispatcher("formularios/vista_vigilantes_user_vigilante.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener los vigilantes");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
