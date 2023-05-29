<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Actualizar Puntuación</title>
</head>
<body>
  <h1>Actualizar Puntuación</h1>

  <form action="../ActualizarPuntuacionesServlet" method="post">
    <label for="id_puntuacion">id_puntuacion:</label>
    <input type="number" name="id_puntuacion" id="id_puntuacion" required>
    <br>

    <label for="valor">valor:</label>
    <input type="number" name="valor" id="valor" required>
    <br>

    <label for="tributo_id">tributo_id:</label>
    <input type="number" name="tributo_id" id="tributo_id" required>
    <br>

    <label for="prueba_id">prueba_id:</label>
    <input type="number" name="prueba_id" id="prueba_id" required>
    <br>

    <input type="submit" value="Actualizar">
  </form>
</body>
</html>
