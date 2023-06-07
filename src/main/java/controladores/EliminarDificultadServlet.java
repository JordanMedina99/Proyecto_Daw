package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.DificultadDao;


public class EliminarDificultadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Obtener el ID de la dificultad a eliminar
	            String idDificultad = request.getParameter("id_dificultad");

	            // Crear una instancia de DificultadDao para realizar la eliminación
	            DificultadDao dificultadDao = new DificultadDao();

	            // Eliminar la dificultad de la base de datos
	            dificultadDao.eliminarDificultad(idDificultad);

	            // Redirigir a la página de éxito o a la página de vista de dificultades
	            response.sendRedirect("formularios/exito.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al eliminar la dificultad");
	            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
	        }
	    }

}
