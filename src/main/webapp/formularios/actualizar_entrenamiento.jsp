<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Actualizar Entrenamiento</title>
</head>
<body>
    <form action="../ActualizarEntrenamientoServlet" method="post">
        <h1>Actualizar Entrenamiento</h1>
        <label for="id_entrenamiento">id_entrenamiento:</label>
        <input type="number" id="id_entrenamiento" name="id_entrenamiento" required>
        
        <label for="tributo_id">tributo_id:</label>
        <input type="number" id="tributo_id" name="tributo_id" required>

        <label for="prueba_id">prueba_id:</label>
        <input type="number" id="prueba_id" name="prueba_id" required>

        <input type="submit" value="Actualizar">
    </form>
</body>
</html>