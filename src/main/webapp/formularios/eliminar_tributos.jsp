<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Tributo</title>
</head>
<body>
  <h1>Eliminar Tributo</h1>

  <form action="../EliminarTributoServlet" method="post">
    <label for="id_tributo">id_tributo:</label>
    <input type="number" name="id_tributo" id="id_tributo" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
