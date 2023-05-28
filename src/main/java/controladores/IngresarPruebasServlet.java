package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Time;
import modelos.Prueba;
import datos.PruebasDao;

public class IngresarPruebasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            String tipo = request.getParameter("tipo");
            String dificultad_id = request.getParameter("dificultad_id");
            int vencedor_id = Integer.parseInt(request.getParameter("vencedor_id"));
            Time tiempo_empleado = Time.valueOf(request.getParameter("tiempo_empleado"));

            // Crear un objeto Prueba con los datos ingresados
            Prueba prueba = new Prueba(0, codigo, nombre, tipo, dificultad_id, vencedor_id, tiempo_empleado);

            // Crear una instancia de PruebasDao para realizar la inserción
            PruebasDao pruebasDao = new PruebasDao();

            // Insertar la prueba en la base de datos
            pruebasDao.insertarPrueba(prueba);

            // Redirigir a la página de éxito o a la página de vista de pruebas
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al ingresar la prueba");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    } 
}
