<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    body {
      margin: 0;
      padding: 0;
    }

    .navbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: #333;
      color: #fff;
      padding: 10px;
    }

    .logo {
      margin-left: 20px;
    }

    .navbar a {
      color: #fff;
      text-decoration: none;
      margin: 0 10px;
      font-size: 18px; /* Tamaño de fuente ajustado */
    }

    .container {
      text-align: center;
      height: calc(100vh - 60px); /* Restar el tamaño del navbar al alto total de la ventana */
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .image {
      max-width: 100%;
      max-height: 100%;
      object-fit: contain; /* Ajustar la imagen dentro del contenedor sin perder la relación de aspecto */
    }
    .center-text {
      font-size: 28px; /* Ajustar el tamaño de fuente a tu preferencia */
    }
  </style>
  <title>Static Image</title>
</head>
<body>
  <nav class="navbar">
    <div class="logo">
      <img src="../images/logosd_.jpg" alt="Logo" width="150px" height="150px">
    </div>
    <div class="center-text">
      Sorpresas próximamente
    </div>
    <div class="links">
      <a href="../index.jsp" style="font-size: 24px;">Home</a>
      <a href="tributos_imagenes.jsp" style="font-size: 24px;">Tributos</a>
      <a href="mentores_imagenes.jsp" style="font-size: 24px;">Mentores</a>
      <a href="vigilantes_imagenes.jsp" style="font-size: 24px;">Vigilantes</a>
    </div>
  </nav>
  <div class="container">
    <img class="image" src="../images/imagen_promo.jpg" alt="Static Image">
  </div>
</body>
</html>
