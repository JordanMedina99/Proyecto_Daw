<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Mentor</title>
</head>
<body>
  <h1>Ingresar Mentor</h1>

  <form action="../IngresarMentoresServlet" method="post">
    <label for="id_mentor">id_mentor:</label>
    <input type="number" name="id_mentor" id="id_mentor" required>
    <br>

    <label for="curp">curp:</label>
    <input type="text" name="curp" id="curp" required>
    <br>

    <label for="nombre">nombre:</label>
    <input type="text" name="nombre" id="nombre" required>
    <br>
    
    <label for="sexo">sexo:</label>
    <input type="text" name="nombre" id="sexo" required>
    <br>

    <label for="edad">edad:</label>
    <input type="number" name="edad" id="edad" required>
    <br>

    <label for="puesto">puesto:</label>
    <input type="text" name="puesto" id="puesto" required>
    <br>

    <label for="especialidad">especialidad:</label>
    <input type="text" name="especialidad" id="especialidad" required>
    <br>

    <label for="tributo_id">tributo_id:</label>
    <input type="number" name="tributo_id" id="tributo_id" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
