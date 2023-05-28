package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.VigilantesDao;

public class EliminarVigilantesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Obtener el parámetro del formulario que indica el ID del vigilante a eliminar
	            int id_vigilante = Integer.parseInt(request.getParameter("id_vigilante"));

	            // Crear una instancia de VigilantesDao para realizar la eliminación
	            VigilantesDao vigilantesDao = new VigilantesDao();

	            // Eliminar el vigilante de la base de datos
	            vigilantesDao.eliminarVigilante(id_vigilante);

	            // Redirigir a la página de éxito o a la página de vista de vigilantes
	            response.sendRedirect("formularios/exito.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al eliminar el vigilante");
	            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
	        }
	    }
    

}
