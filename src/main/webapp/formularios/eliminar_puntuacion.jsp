<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Puntuaci�n</title>
</head>
<body>
  <h1>Eliminar Puntuaci�n</h1>

  <form action="../EliminarPuntuacionesServlet" method="post">
    <label for="id_puntuacion">id_puntuacion:</label>
    <input type="number" name="id_puntuacion" id="id_puntuacion" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
