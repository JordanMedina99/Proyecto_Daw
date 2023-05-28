package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelos.Prueba;
import datos.PruebasDao;
import java.sql.Time;
public class ActualizarPruebasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_prueba = Integer.parseInt(request.getParameter("id_prueba"));
            String codigo = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            String tipo = request.getParameter("tipo");
            String dificultad_id = request.getParameter("dificultad_id");
            int vencedor_id = Integer.parseInt(request.getParameter("vencedor_id"));
            Time tiempo_empleado = Time.valueOf(request.getParameter("tiempo_empleado"));

            // Crear un objeto Prueba con los datos ingresados
            Prueba prueba = new Prueba(id_prueba, codigo, nombre, tipo, dificultad_id, vencedor_id, tiempo_empleado);

            // Crear una instancia de PruebasDao para realizar la actualización
            PruebasDao pruebasDao = new PruebasDao();

            // Actualizar la prueba en la base de datos
            pruebasDao.actualizarPrueba(prueba);

            // Redirigir a la página de éxito o a la página de vista de pruebas
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar la prueba");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }
}


       
    

