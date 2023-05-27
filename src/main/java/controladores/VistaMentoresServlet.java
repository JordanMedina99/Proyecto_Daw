package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Mentor;
import datos.MentoresDao;

public class VistaMentoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Crear una instancia de MentoresDao para obtener los mentores
	            MentoresDao mentoresDao = new MentoresDao();

	            // Obtener la lista de mentores
	            List<Mentor> mentores = mentoresDao.listarMentores();

	            // Agregar la lista de mentores como atributo en el request
	            request.setAttribute("mentores", mentores);

	            // Redirigir a tu página JSP para mostrar los mentores
	            request.getRequestDispatcher("formularios/vista_mentores.jsp").forward(request, response);
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al obtener los mentores");
	            request.getRequestDispatcher("error.jsp").forward(request, response);
	        }
	    }

}
