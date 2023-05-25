<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="modelos.Distrito" %>
<%@ page import = "java.util.*"%> 
    

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
  <img src="../images/logo_capitolio.png" alt="Logo"> <!-- Cambia "ruta-a-tu-imagen.jpg" por la ruta de tu imagen -->

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
        <th>porcentajes_mujeres</th>
        <th>lider_nombre</th>
      </tr>
    </thead>
    <tbody>
        <% 
      List<?> distritosRaw = (List<?>) request.getAttribute("distritos");
      List<Distrito> distritos = new ArrayList<>();
      
      /*
      for (Object obj : distritosRaw) {
          if (obj instanceof Distrito) {
              distritos.add((Distrito) obj);
          }
      }
      */
      if (distritosRaw != null) {
    	    for (Object obj : distritosRaw) {
    	        if (obj instanceof Distrito) {
    	            distritos.add((Distrito) obj);
    	        }
    	    }
    	  }
      
      %>
      
     
     


      <% for (Distrito distritoItem : distritos) { %>
            <tr>
                <td><%= distritoItem.getid_distrito() %></td>
                <td><%= distritoItem.getnombre() %></td>
                <td><%= distritoItem.getespecializacion() %></td>
                <td><%= distritoItem.getpuestos_trabajo() %></td>
                <td><%= distritoItem.getjuegos_ganados() %></td>
                <td><%= distritoItem.getcantidad_habitantes()%></td>
                <td><%= distritoItem.getubicacion() %></td>
                <td><%= distritoItem.getclima() %></td>
                <td><%= distritoItem.getporcentaje_hombres() %></td>
                <td><%= distritoItem.getporcentaje_mujeres() %></td>
                <td><%= distritoItem.getlider_nombre() %></td>
            </tr>
        <% } %>
    </tbody>
  </table>
</body>
</html>
