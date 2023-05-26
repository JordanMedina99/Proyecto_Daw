<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Distrito</title>
</head>
<body>
  <h1>Ingresar Distrito</h1>

  <form action="ingresarServlet" method="post">
    <label for="id_distrito">ID Distrito:</label>
    <input type="text" name="id_distrito" id="id_distrito" required>
    <br>

    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" id="nombre" required>
    <br>

    <label for="especializacion">Especialización:</label>
    <input type="text" name="especializacion" id="especializacion" required>
    <br>

    <label for="puestos_trabajo">Puestos de Trabajo:</label>
    <input type="text" name="puestos_trabajo" id="puestos_trabajo" required>
    <br>

    <label for="cantidad_habitantes">Cantidad de Habitantes:</label>
    <input type="text" name="cantidad_habitantes" id="cantidad_habitantes" required>
    <br>

    <label for="ubicacion">Ubicación:</label>
    <input type="text" name="ubicacion" id="ubicacion" required>
    <br>

    <label for="clima">Clima:</label>
    <input type="text" name="clima" id="clima" required>
    <br>

    <label for="porcentaje_hombres">Porcentaje de Hombres:</label>
    <input type="text" name="porcentaje_hombres" id="porcentaje_hombres" required>
    <br>

    <label for="porcentaje_mujeres">Porcentaje de Mujeres:</label>
    <input type="text" name="porcentaje_mujeres" id="porcentaje_mujeres" required>
    <br>

    <label for="lider_nombre">Nombre del Líder:</label>
    <input type="text" name="lider_nombre" id="lider_nombre" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
