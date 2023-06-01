package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import modelos.Entrenamiento;
import datos.EntrenamientoDao;

public class VistaEntrenamientoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de EntrenamientoDao para obtener los entrenamientos
            EntrenamientoDao entrenamientoDao = new EntrenamientoDao();

            // Obtener la lista de entrenamientos
            List<Entrenamiento> entrenamientos = entrenamientoDao.listarEntrenamientos();

            // Agregar la lista de entrenamientos como atributo en el request
            request.setAttribute("entrenamientos", entrenamientos);

            // Redirigir a tu página JSP para mostrar los entrenamientos
            request.getRequestDispatcher("formularios/vista_entrenamientos.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener los entrenamientos");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
       
   
}
