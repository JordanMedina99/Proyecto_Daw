<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Ingresar Entrenamiento</title>
</head>
<body>
  <h1>Ingresar Entrenamiento</h1>
  
  <form action="../IngresarEntrenamientoServlet" method="post">
    <label for="id_entreanmiento">id_entrenamiento:</label>
    <input type="text" id="id_entrenamiento" name="id_entrenamiento" required>
  
    <label for="tributo_id">tributo_id:</label>
    <input type="text" id="tributo_id" name="tributo_id" required>
    
    <label for="prueba_id">prueba_id:</label>
    <input type="text" id="prueba_id" name="prueba_id" required>
    
    <input type="submit" value="Guardar">
  </form>
  
 
</body>
</html>