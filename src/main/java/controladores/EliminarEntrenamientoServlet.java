package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.EntrenamientoDao;


public class EliminarEntrenamientoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el ID del entrenamiento a eliminar
            int idEntrenamiento = Integer.parseInt(request.getParameter("id_entrenamiento"));

            // Crear una instancia de EntrenamientoDao para realizar la eliminación
            EntrenamientoDao entrenamientoDao = new EntrenamientoDao();

            // Eliminar el entrenamiento de la base de datos
            entrenamientoDao.eliminarEntrenamiento(idEntrenamiento);

            // Redirigir a la página de éxito o a la página de vista de entrenamientos
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar el entrenamiento");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
	

}
