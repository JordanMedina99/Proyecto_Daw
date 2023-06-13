<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="modelos.Vigilante" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      background-color: #87ceeb; /* Color de fondo azul cielo */
      color: black; /* Color de texto negro */
    }

    table {
      width: 50%; /* Ancho de la tabla */
      margin: 0 auto; /* Centrar la tabla horizontalmente */
      border-collapse: collapse; /* Colapsar bordes de celda */
      border: 1px solid black; /* Borde negro de la tabla */
      overflow-y: scroll; /* Barra de desplazamiento vertical */
    }
    
    /* Estilos de los botones */
    .button-container {
      display: grid;
      grid-template-columns: repeat(3, 1fr);
      gap: 20px;
      justify-items: center;
      align-items: center;
      margin: 50px auto;
      max-width: 600px;
    }

    .button {
      display: inline-block;
      background-color: #e9e9e9;
      color: #333;
      padding: 20px;
      margin: 10px;
      text-decoration: none;
      border-radius: 5px;
      width: 100%;
      text-align: center;
      transition: box-shadow 0.3s ease;
    }

    .button:hover {
      box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
    }
    
    th, td {
      padding: 8px; /* Espaciado interno de celda */
      text-align: left; /* Alineación del texto a la izquierda */
      border-bottom: 1px solid #ddd; /* Borde inferior de celda */
    }

    th {
      background-color: #f2f2f2; /* Color de fondo de encabezado de columna */
    }

    img {
      float: left; /* Flotar la imagen a la izquierda */
      margin-right: 10px; /* Margen derecho para separar la imagen del contenido */
      width: 150px; /* Ancho de la imagen */
      height: 150px; /* Altura de la imagen */
    }
  </style>
</head>
<body>
  <img src="images/logo_capitolio.png" alt="Logo"> <!-- Cambia "ruta-a-tu-imagen.jpg" por la ruta de tu imagen -->
    
   <h1>Esta es la tabla de vigilantes existentes</h1>
  <div class="button-container"> 
  <a href="formularios/ingresar_vigilantes.jsp" class="button">Ingresar</a>
  <a href="formularios/actualizar_vigilantes.jsp" class="button">Modificar</a>
  <a href="formularios/eliminar_vigilantes.jsp" class="button">Eliminar</a>
  </div>
  
  <table>
    <thead>
      <tr>
        <th>id_vigilante</th>
        <th>curp</th>
        <th>nombre</th>
        <th>sexo</th>
        <th>edad</th>
        <th>puesto</th>
      </tr>
    </thead>
    <tbody>
        <%
@SuppressWarnings("unchecked")
List<Vigilante> vigilantes = (List<Vigilante>) request.getAttribute("vigilantes");
if (vigilantes != null) {
  for (Vigilante vigilante : vigilantes) {
%>
  <tr>
    <td><%= vigilante.getid_vigilante() %></td>
    <td><%= vigilante.getcurp() %></td>
    <td><%= vigilante.getnombre() %></td>
    <td><%= vigilante.getsexo() %></td>
    <td><%= vigilante.getedad() %></td>
    <td><%= vigilante.getpuesto() %></td>
  </tr>
<%
  }
}
%>
    </tbody>
  </table>
</body>
</html>
