<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Actualizar Dificultad</title>
</head>
<body>
  <h1>Actualizar Dificultad</h1>

  <form action="../ActualizarDificultadServlet" method="post">
    <label for="id_dificultad">id_dificultad:</label>
    <input type="text" name="id_dificultad" id="id_dificultad" required>
    <br>

    <label for="descripcion">descripcion:</label>
    <input type="text" name="descripcion" id="descripcion" required>
    <br>

    <input type="submit" value="Actualizar">
  </form>
</body>
</html>

