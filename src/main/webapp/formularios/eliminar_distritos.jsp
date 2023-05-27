<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Distrito</title>
</head>
<body>
    <h1>Eliminar Distrito</h1>

    <form action="../EliminarDistritosServlet" method="post">
        <label for="id_distrito">id_distrito:</label>
        <input type="number" name="id_distrito" id="id_distrito" required>
        <br>

        <input type="submit" value="Eliminar">
    </form>
</body>
</html>