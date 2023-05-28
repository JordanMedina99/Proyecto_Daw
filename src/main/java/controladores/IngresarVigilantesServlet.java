package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Vigilante;
import datos.VigilantesDao;

public class IngresarVigilantesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_vigilante = Integer.parseInt(request.getParameter("id_vigilante"));
            String curp = request.getParameter("curp");
            String nombre = request.getParameter("nombre");
            String sexo = request.getParameter("sexo");
            int edad = Integer.parseInt(request.getParameter("edad"));
            String puesto = request.getParameter("puesto");

            // Crear un objeto Vigilante con los datos ingresados
            Vigilante vigilante = new Vigilante(id_vigilante, curp, nombre, sexo, edad, puesto);

            // Crear una instancia de VigilantesDao para realizar la inserción
            VigilantesDao vigilantesDao = new VigilantesDao();

            // Insertar el vigilante en la base de datos
            vigilantesDao.insertarVigilante(vigilante);

            // Redirigir a la página de éxito o a la página de vista de vigilantes
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al ingresar el vigilante");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    } 
}
