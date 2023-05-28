<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="modelos.Mentor" %>
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
    
   <h1>Esta es la tabla de mentores existentes</h1>
  <div class="button-container"> 
  <a href="formularios/ingresar_mentores.jsp" class="button">Ingresar</a>
  <a href="formularios/modificar_mentor.jsp" class="button">Modificar</a>
  <a href="formularios/eliminar_mentores.jsp" class="button">Eliminar</a>
  </div>
  
  <table>
    <thead>
      <tr>
        <th>id_mentor</th>
        <th>curp</th>
        <th>nombre</th>
        <th>sexo</th>
        <th>edad</th>
        <th>puesto</th>
        <th>especialidad</th>
        <th>tributo_id</th>
      </tr>
    </thead>
    <tbody>
          
              <%
     @SuppressWarnings("unchecked")
     List<Mentor> mentores = (List<Mentor>) request.getAttribute("mentores");
     if (mentores != null) {
       for (Mentor mentor : mentores) {
      %>
  <tr>
    <td><%= mentor.getid_mentor() %></td>
    <td><%= mentor.getcurp() %></td>
    <td><%= mentor.getnombre() %></td>
    <td><%= mentor.getsexo() %></td>
    <td><%= mentor.getedad() %></td>
    <td><%= mentor.getpuesto() %></td>
    <td><%= mentor.getespecialidad() %></td>
    <td><%= mentor.gettributo_id() %></td>
  </tr>
    <% 
        }
      }
     %>
          
    </tbody>
  </table>
</body>
</html>
