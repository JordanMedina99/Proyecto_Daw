<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>Ingresar Capitolio</title>
</head>
<body>
  <h1>Ingresar Capitolio</h1>

  <form action="../IngresarCapitolioServlet" method="post">
    <label for="id_capitolio">id_capitolio:</label>
    <input type="number" name="id_capitolio" id="id_capitolio" required>
    <br>

    <label for="nombre_presidente">nombre_presidente:</label>
    <input type="text" name="nombre_presidente" id="nombre_presidente" required>
    <br>

    <label for="numero_habitantes">numero_habitantes:</label>
    <input type="number" name="numero_habitantes" id="numero_habitantes" required>
    <br>

    <label for="ubicacion">ubicacion:</label>
    <input type="text" name="ubicacion" id="ubicacion" required>
    <br>

    <label for="clima">clima:</label>
    <input type="text" name="clima" id="clima" required>
    <br>

    <label for="porcentaje_hombres">porcentaje_hombres:</label>
    <input type="number" name="porcentaje_hombres" id="porcentaje_hombres" required>
    <br>

    <label for="porcentaje_mujeres">porcentaje_mujeres:</label>
    <input type="number" name="porcentaje_mujeres" id="porcentaje_mujeres" required>
    <br>

    <label for="lugares_interes">lugares_interes:</label>
    <input type="text" name="lugares_interes" id="lugares_interes" required>
    <br>

    <input type="submit" value="Cargar">
  </form>
</body>
</html>
