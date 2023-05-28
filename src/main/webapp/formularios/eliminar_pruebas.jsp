<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Prueba</title>
</head>
<body>
  <h1>Eliminar Prueba</h1>

  <form action="../EliminarPruebasServlet" method="post">
    <label for="id_prueba">id_prueba:</label>
    <input type="number" name="id_prueba" id="id_prueba" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
