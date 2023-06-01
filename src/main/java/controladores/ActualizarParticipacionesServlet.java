package controladores;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.ParticipacionDao;
import modelos.Participacion;

public class ActualizarParticipacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_participacion = Integer.parseInt(request.getParameter("id_participacion"));
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            Time tiempo_empleado = Time.valueOf(request.getParameter("tiempo_empleado"));
            int tributo_id = Integer.parseInt(request.getParameter("tributo_id"));
            int prueba_id = Integer.parseInt(request.getParameter("prueba_id"));


            // Crear un objeto Participacion con los datos actualizados
            Participacion participacion = new Participacion(id_participacion, fecha, tiempo_empleado, tributo_id, prueba_id);

            // Crear una instancia de ParticipacionDao para realizar la actualización
            ParticipacionDao participacionDao = new ParticipacionDao();

            // Actualizar la participacion en la base de datos
            participacionDao.actualizarParticipacion(participacion);

            // Redirigir a la página de éxito o a la página de vista de participaciones
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar la participación");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
