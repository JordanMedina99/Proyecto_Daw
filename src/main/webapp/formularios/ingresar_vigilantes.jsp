<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Vigilante</title>
</head>
<body>
  <h1>Ingresar Vigilante</h1>

  <form action="../IngresarVigilantesServlet" method="post">
    <label for="id_vigilante">id_vigilante:</label>
    <input type="number" name="id_vigilante" id="id_vigilante" required>
    <br>

    <label for="curp">curp:</label>
    <input type="text" name="curp" id="curp" required>
    <br>

    <label for="nombre">nombre:</label>
    <input type="text" name="nombre" id="nombre" required>
    <br>

    <label for="sexo">sexo:</label>
    <input type="text" name="sexo" id="sexo" required>
    <br>

    <label for="edad">edad:</label>
    <input type="number" name="edad" id="edad" required>
    <br>

    <label for="puesto">puesto:</label>
    <input type="text" name="puesto" id="puesto" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
