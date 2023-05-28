<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Vigilante</title>
</head>
<body>
  <h1>Eliminar Vigilante</h1>

  <form action="../EliminarVigilantesServlet" method="post">
    <label for="id_vigilante">id_vigilante:</label>
    <input type="number" name="id_vigilante" id="id_vigilante" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
