package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.Time;
import modelos.Participacion;
import datos.ParticipacionDao;

public class IngresarParticipacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int idParticipacion = Integer.parseInt(request.getParameter("id_participacion"));
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            Time tiempoEmpleado = Time.valueOf(request.getParameter("tiempo_empleado"));
            int tributoId = Integer.parseInt(request.getParameter("tributo_id"));
            int pruebaId = Integer.parseInt(request.getParameter("prueba_id"));

            // Crear un objeto Participacion con los datos ingresados
            Participacion participacion = new Participacion(idParticipacion, fecha, tiempoEmpleado, tributoId, pruebaId);

            // Crear una instancia de ParticipacionDao para realizar la inserción
            ParticipacionDao participacionDao = new ParticipacionDao();

            // Insertar la participación en la base de datos
            participacionDao.insertarParticipacion(participacion);

            // Redirigir a la página de éxito o a la página de vista de participaciones
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al ingresar la participación");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }
     

}
