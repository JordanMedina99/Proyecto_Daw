<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Actualizar Prueba</title>
</head>
<body>
  <h1>Actualizar Prueba</h1>

  <form action="../ActualizarPruebasServlet" method="post">
    <label for="id_prueba">id_prueba:</label>
    <input type="number" name="id_prueba" id="id_prueba" required>
    <br>

    <label for="codigo">codigo:</label>
    <input type="text" name="codigo" id="codigo" required>
    <br>

    <label for="nombre">nombre:</label>
    <input type="text" name="nombre" id="nombre" required>
    <br>
    
    <label for="tipo">tipo:</label>
    <input type="text" name="tipo" id="tipo" required>
    <br>

    <label for="dificultad_id">dificultad_id:</label>
    <input type="text" name="dificultad_id" id="dificultad_id" required>
    <br>

    <label for="vencedor_id">vencedor_id:</label>
    <input type="number" name="vencedor_id" id="vencedor_id" required>
    <br>

    <label for="tiempo_empleado">tiempo_empleado (hh:mm:ss):</label>
    <input type="text" name="tiempo_empleado" id="tiempo_empleado" required>
    <br>

    <input type="submit" value="Actualizar">
  </form>
</body>
</html>
