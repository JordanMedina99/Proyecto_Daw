<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Capitolio</title>
</head>
<body>
  <h1>Eliminar Capitolio</h1>

  <form action="../EliminarCapitolioServlet" method="post">
    <label for="id_capitolio">id_capitolio:</label>
    <input type="number" name="id_capitolio" id="id_capitolio" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
