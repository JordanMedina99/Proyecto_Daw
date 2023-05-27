<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Tributo</title>
</head>
<body>
  <h1>Ingresar Tributo</h1>

  <form action="../IngresarTributosServlet" method="post">
    <label for="id_tributo">id_tributo:</label>
    <input type="number" name="id_tributo" id="id_tributo" required>
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

    <label for="habilidad">habilidad:</label>
    <input type="text" name="habilidad" id="habilidad" required>
    <br>

    <label for="espectaculo_puntuacion">puntuacion_espectaculo:</label>
    <input type="number" name="espectaculo_puntuacion" id="espectaculo_puntuacion" required>
    <br>

    <label for="distrito_id">distrito_id:</label>
    <input type="number" name="distrito_id" id="distrito_id" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
