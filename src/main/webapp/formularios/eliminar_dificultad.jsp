<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Dificultad</title>
</head>
<body>
  <h1>Eliminar Dificultad</h1>

  <form action="../EliminarDificultadServlet" method="post">
    <label for="id_dificultad">id_dificultad:</label>
    <input type="text" name="id_dificultad" id="id_dificultad" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
    