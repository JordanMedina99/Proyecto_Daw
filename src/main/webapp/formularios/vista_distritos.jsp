<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="modelos.Distrito" %>
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
    
   <h1>esta es la tabla de distritos existentes</h1>
    
  <table>
    <thead>
    
       <tr>
        <th>id_distrito</th>
        <th>nombre</th>
        <th>especializacion</th>
        <th>puestos_trabajo</th>
        <th>juegos_ganados</th>
        <th>cantidad_habitantes</th>
        <th>ubicacion</th>
        <th>clima</th>
        <th>porcentaje_hombres</th>
        <th>porcentaje_mujeres</th>
        <th>lider_nombre</th>
      </tr>
    </thead>
    <tbody>
      <% 
      @SuppressWarnings("unchecked")
      List<Distrito> distritos = (List<Distrito>) request.getAttribute("distritos");
        if (distritos != null) {
          for (Distrito distrito : distritos) {
      %>
      <tr>
       <td><%= distrito.getid_distrito() %></td>
       <td><%= distrito.getnombre() %></td>
       <td><%= distrito.getespecializacion() %></td>
       <td><%= distrito.getpuestos_trabajo() %></td>
       <td><%= distrito.getjuegos_ganados() %></td>
       <td><%= distrito.getcantidad_habitantes() %></td>
       <td><%= distrito.getubicacion() %></td>
       <td><%= distrito.getclima() %></td>
       <td><%= distrito.getporcentaje_hombres() %></td>
       <td><%= distrito.getporcentaje_mujeres() %></td>
       <td><%= distrito.getlider_nombre() %></td>
       </tr>
      <% 
          }
        }
      %>
    </tbody>
  </table>
</body>
</html>



