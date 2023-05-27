package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.TributosDao;

public class EliminarTributoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro del formulario que indica el ID del tributo a eliminar
            int id_tributo = Integer.parseInt(request.getParameter("id_tributo"));

            // Crear una instancia de TributosDao para realizar la eliminación
            TributosDao tributosDao = new TributosDao();

            // Eliminar el tributo de la base de datos
            tributosDao.eliminarTributo(id_tributo);

            // Redirigir a la página de éxito o a la página de vista de tributos
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar el tributo");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }
}
