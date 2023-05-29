<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Puntuaciones</title>
</head>
<body>
  <h1>Ingresar Puntuaciones</h1>

  <form action="../IngresarPuntuacionesServlet" method="post">
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

    <input type="submit" value="Guardar">
  </form>
</body>
</html>
