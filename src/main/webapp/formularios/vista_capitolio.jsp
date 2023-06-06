<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="modelos.Capitolio" %>
<%@ page import="java.util.List" %>
<%@ page import="datos.CapitolioDao" %>

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
    
   <h1>Esta es la tabla del capitolio </h1>
  <div class="button-container"> 
  <a href="formulario" class="button">Ingresar</a>
  <a href="formularijsp" class="button">Modificar</a>
  <a href="formulap" class="button">Eliminar</a>
  </div>
  
  <table>
    <thead>
    
       <tr>
        <th>id_capitolio</th>
        <th>nombre_presidente</th>
        <th>numero_habitantes</th>
        <th>ubicacion</th>
        <th>clima</th>
        <th>porcentaje_hombres</th>
        <th>porcentaje_mujeres</th>
        <th>lugares_interes</th>
      </tr>
    </thead>
    <tbody>
      <% 
      @SuppressWarnings("unchecked")
      List<Capitolio> capitolios = (List<Capitolio>) request.getAttribute("capitolios");
        if (capitolios != null) {
          for (Capitolio capitolio : capitolios) {
      %>
      <tr>
       <td><%= capitolio.getid_capitolio() %></td>
       <td><%= capitolio.getnombre_presidente() %></td>
       <td><%= capitolio.getnumero_habitantes() %></td>
       <td><%= capitolio.getubicacion() %></td>
       <td><%= capitolio.getclima() %></td>
       <td><%= capitolio.getporcentaje_hombres() %></td>
       <td><%= capitolio.getporcentaje_mujeres() %></td>
       <td><%= capitolio.getlugares_interes()%></td>
       </tr>
      <% 
          }
        }
      %>
    </tbody>
  </table>
</body>
</html>
    