package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.MentoresDao;

public class EliminarMentoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Obtener el parámetro del formulario que indica el ID del mentor a eliminar
	            int id_mentor = Integer.parseInt(request.getParameter("id_mentor"));

	            // Crear una instancia de MentoresDao para realizar la eliminación
	            MentoresDao mentoresDao = new MentoresDao();

	            // Eliminar el mentor de la base de datos
	            mentoresDao.eliminarMentor(id_mentor);

	            // Redirigir a la página de éxito o a la página de vista de mentores
	            response.sendRedirect("formularios/exito.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al eliminar el mentor");
	            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
	        }
	    }

}
