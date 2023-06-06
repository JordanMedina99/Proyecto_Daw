package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.CapitolioDao;

public class EliminarCapitolioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro del formulario que indica el ID del capitolio a eliminar
            int id_capitolio = Integer.parseInt(request.getParameter("id_capitolio"));

            // Crear una instancia de CapitolioDao para realizar la eliminación
            CapitolioDao capitolioDao = new CapitolioDao();

            // Eliminar el capitolio de la base de datos
            capitolioDao.eliminarCapitolio(id_capitolio);

            // Redirigir a la página de éxito o a la página de vista de capitolios
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar el capitolio");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
