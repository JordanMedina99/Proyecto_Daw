<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Actualizar Distrito</title>
</head>
<body>
    <h1>Actualizar Distrito</h1>

    <form action="../ActualizarDistritosServlet" method="post">
   
    <label for="id_distrito">id_distrito:</label>
    <input type="number" name="id_distrito" id="id_distrito" required>
    <br>

    <label for="nombre">nombre:</label>
    <input type="text" name="nombre" id="nombre" required>
    <br>

    <label for="especializacion">especializacion:</label>
    <input type="text" name="especializacion" id="especializacion" required>
    <br>

    <label for="puestos_trabajo">puestos_trabajo:</label>
    <input type="number" name="puestos_trabajo" id="puestos_trabajo" required>
    <br>
    
    <label for="juegos_ganados">juegos_ganados:</label>
    <input type="number" name="juegos_ganados" id="juegos_ganados" required>
    <br>

    <label for="cantidad_habitantes">cantidad_habitantes:</label>
    <input type="number" name="cantidad_habitantes" id="cantidad_habitantes" required>
    <br>

    <label for="ubicacion">ubicacion:</label>
    <input type="text" name="ubicacion" id="ubicacion" required>
    <br>

    <label for="clima">clima:</label>
    <input type="text" name="clima" id="clima" required>
    <br>

    <label for="porcentaje_hombres">porcentaje_hombres:</label>
    <input type="number" name="porcentaje_hombres" id="porcentaje_hombres" step="0.01" required>
    <br>

    <label for="porcentaje_mujeres">porcentaje_mujeres:</label>
    <input type="number" name="porcentaje_mujeres" id="porcentaje_mujeres" step="0.01" required>
    <br>

    <label for="lider_nombre">lider_nombre:</label>
    <input type="text" name="lider_nombre" id="lider_nombre" required>
    <br>

    <input type="submit" value="Cargar">
        
    </form>
</body>
</html>

    