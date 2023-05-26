package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Distrito;
import datos.DistritosDAO;

public class IngresarDistritosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public IngresarDistritosServlet() {
        super();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_distrito = Integer.parseInt(request.getParameter("id_distrito"));
            String nombre = request.getParameter("nombre");
            String especializacion = request.getParameter("especializacion");
            int puestos_trabajo = Integer.parseInt(request.getParameter("puestos_trabajo"));
            int juegos_ganados = Integer.parseInt(request.getParameter("juegos_ganados"));
            int cantidad_habitantes = Integer.parseInt(request.getParameter("cantidad_habitantes"));
            String ubicacion = request.getParameter("ubicacion");
            String clima = request.getParameter("clima");
            float porcentaje_hombres = Float.parseFloat(request.getParameter("porcentaje_hombres"));
            float porcentaje_mujeres = Float.parseFloat(request.getParameter("porcentaje_mujeres"));
            String lider_nombre = request.getParameter("lider_nombre");

            // Crear una instancia de DistritosDAO para realizar la inserción
            DistritosDAO distritosDAO = new DistritosDAO();

            // Crear un objeto Distrito con los datos ingresados
            Distrito distrito = new Distrito(id_distrito, nombre, especializacion, puestos_trabajo, juegos_ganados,
                    cantidad_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lider_nombre);

            // Insertar el distrito en la base de datos
            distritosDAO.insertarDistrito(distrito);

            // Redirigir  a la página de vista de distritos
            response.sendRedirect("exito.jsp"); 
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al ingresar el distrito");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}


