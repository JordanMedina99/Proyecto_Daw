package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PuntuacionDao;
import modelos.Puntuacion;

public class ActualizarPuntuacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_puntuacion = Integer.parseInt(request.getParameter("id_puntuacion"));
            int valor = Integer.parseInt(request.getParameter("valor"));
            int tributo_id = Integer.parseInt(request.getParameter("tributo_id"));
            int prueba_id = Integer.parseInt(request.getParameter("prueba_id"));

            // Crear un objeto Puntuacion con los datos actualizados
            Puntuacion puntuacion = new Puntuacion(id_puntuacion, valor, tributo_id, prueba_id);

            // Crear una instancia de PuntuacionDao para realizar la actualización
            PuntuacionDao puntuacionDao = new PuntuacionDao();

            // Actualizar la puntuacion en la base de datos
            puntuacionDao.actualizarPuntuacion(puntuacion);

            // Redirigir a la página de éxito o a la página de vista de puntuaciones
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar la puntuación");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
