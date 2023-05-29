package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PuntuacionDao;

public class EliminarPuntuacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro del formulario que indica el ID de la puntuación a eliminar
            int id_puntuacion = Integer.parseInt(request.getParameter("id_puntuacion"));

            // Crear una instancia de PuntuacionDao para realizar la eliminación
            PuntuacionDao puntuacionDao = new PuntuacionDao();

            // Eliminar la puntuación de la base de datos
            puntuacionDao.eliminarPuntuacion(id_puntuacion);

            // Redirigir a la página de éxito o a la página de vista de puntuaciones
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar la puntuación");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
