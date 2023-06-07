<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Eliminar Entrenamiento</title>
</head>
<body>
    <h1>Eliminar Entrenamiento</h1>
    <form action="../EliminarEntrenamientoServlet" method="post">
        <label for="id_entrenamiento">id_entrenamiento:</label>
        <input type="text" id="id_entrenamiento" name="id_entrenamiento" required>
        <br>
        <input type="submit" value="Eliminar">
    </form>
</body>
</html>