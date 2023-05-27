<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Mentor</title>
</head>
<body>
  <h1>Eliminar Mentor</h1>

  <form action="../EliminarMentoresServlet" method="post">
    <label for="id_mentor">id_mentor:</label>
    <input type="number" name="id_mentor" id="id_mentor" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
