package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PruebasDao;
public class EliminarPruebasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener el parámetro del formulario que indica el ID de la prueba a eliminar
            int id_prueba = Integer.parseInt(request.getParameter("id_prueba"));

            // Crear una instancia de PruebasDao para realizar la eliminación
            PruebasDao pruebasDao = new PruebasDao();

            // Eliminar la prueba de la base de datos
            pruebasDao.eliminarPrueba(id_prueba);

            // Redirigir a la página de éxito o a la página de vista de pruebas
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al eliminar la prueba");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
