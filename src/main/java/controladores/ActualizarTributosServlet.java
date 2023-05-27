package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Tributo;
import datos.TributosDao;
/**
 * Servlet implementation class ActualizarTributosServlet
 */
public class ActualizarTributosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_tributo = Integer.parseInt(request.getParameter("id_tributo"));
            String curp = request.getParameter("curp");
            String nombre = request.getParameter("nombre");
            String sexo = request.getParameter("sexo");
            int edad = Integer.parseInt(request.getParameter("edad"));
            String habilidad = request.getParameter("habilidad");
            int espectaculo_puntuacion = Integer.parseInt(request.getParameter("espectaculo_puntuacion"));
            int distrito_id = Integer.parseInt(request.getParameter("distrito_id"));

            // Crear un objeto Tributo con los datos ingresados
            Tributo tributo = new Tributo(id_tributo, curp, nombre, sexo, edad, habilidad,
                    espectaculo_puntuacion, distrito_id);

            // Crear una instancia de TributosDao para realizar la actualización
            TributosDao tributosDao = new TributosDao();

            // Actualizar el tributo en la base de datos
            tributosDao.actualizarTributo(tributo);

            // Redirigir a la página de éxito o a la página de vista de tributos
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar el tributo");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
