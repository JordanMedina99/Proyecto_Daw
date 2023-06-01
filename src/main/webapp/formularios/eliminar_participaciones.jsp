<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Eliminar Participación</title>
</head>
<body>
  <h1>Eliminar Participación</h1>

  <form action="../EliminarParticipacionesServlet" method="post">
    <label for="id_participacion">id_participacion:</label>
    <input type="number" name="id_participacion" id="id_participacion" required>
    <br>

    <input type="submit" value="Eliminar">
  </form>
</body>
</html>
