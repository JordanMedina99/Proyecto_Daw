package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.DistritosDAO;


/**
 * Servlet implementation class EliminarDistritosServlet
 */
public class EliminarDistritosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro "id_distrito" del formulario
            int id_distrito = Integer.parseInt(request.getParameter("id_distrito"));

            // Crear una instancia de DistritosDAO para eliminar el distrito
            DistritosDAO distritosDAO = new DistritosDAO();

            // Eliminar el distrito de la base de datos
            distritosDAO.eliminarDistrito(id_distrito);

            // Redirigir a la página de éxito
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar el distrito");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }
	

}
