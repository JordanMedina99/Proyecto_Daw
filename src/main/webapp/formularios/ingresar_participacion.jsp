<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Participación</title>
</head>
<body>
  <h1>Ingresar Participación</h1>

  <form action="../IngresarParticipacionesServlet" method="post">
    <label for="id_participacion">id_participacion:</label>
    <input type="number" name="id_participacion" id="id_participacion" required>
    <br>

    <label for="fecha">fecha:</label>
    <input type="date" name="fecha" id="fecha" required>
    <br>

    <label for="tiempo_empleado">tiempo_empleado:</label>
    <input type="time" name="tiempo_empleado" id="tiempo_empleado" step="1" required>
    <br>
    
    <label for="tributo_id">tributo_id:</label>
    <input type="number" name="tributo_id" id="tributo_id" required>
    <br>

    <label for="prueba_id">prueba_id:</label>
    <input type="number" name="prueba_id" id="prueba_id" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
