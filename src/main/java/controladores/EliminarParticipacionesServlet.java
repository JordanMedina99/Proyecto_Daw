package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.ParticipacionDao;

public class EliminarParticipacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro del formulario que indica el ID de la participación a eliminar
            int id_participacion = Integer.parseInt(request.getParameter("id_participacion"));

            // Crear una instancia de ParticipacionDao para realizar la eliminación
            ParticipacionDao participacionDao = new ParticipacionDao();

            // Eliminar la participación de la base de datos
            participacionDao.eliminarParticipacion(id_participacion);

            // Redirigir a la página de éxito o a la página de vista de participaciones
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar la participación");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
