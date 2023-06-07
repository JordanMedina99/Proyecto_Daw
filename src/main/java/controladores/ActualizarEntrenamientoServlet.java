package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Entrenamiento;
import datos.EntrenamientoDao;

public class ActualizarEntrenamientoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_entrenamiento = Integer.parseInt(request.getParameter("id_entrenamiento"));
            int tributo_id = Integer.parseInt(request.getParameter("tributo_id"));
            int prueba_id = Integer.parseInt(request.getParameter("prueba_id"));

            // Crear un objeto Entrenamiento con los datos ingresados
            Entrenamiento entrenamiento = new Entrenamiento(id_entrenamiento, tributo_id, prueba_id);

            // Crear una instancia de EntrenamientoDao para realizar la actualización
            EntrenamientoDao entrenamientoDao = new EntrenamientoDao();

            // Actualizar el entrenamiento en la base de datos
            entrenamientoDao.actualizarEntrenamiento(entrenamiento);

            // Redirigir a la página de éxito o a la página de vista de entrenamientos
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar el entrenamiento");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
