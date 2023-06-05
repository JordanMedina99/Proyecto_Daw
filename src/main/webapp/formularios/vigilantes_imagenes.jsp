<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Imagenes de los mentores</title>
  <style>
    body {
      margin: 0;
      padding: 20px;
      background-color: gray;
    }

    .logo {
      display: block;
      width: 100px;
      height: 100px;
      margin: 10px 0;
    }

    .image-grid {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      grid-gap: 10px;
      margin-top: 20px;
    }

    .image-grid img {
      display: block;
      width: 100%;
      height: auto;
    }

    .image-grid .image-container {
      text-align: center;
    }

    .image-grid .caption {
      margin-top: 5px;
      font-size: 14px;
    }

    .name {
      margin-top: 20px;
      font-size: 18px;
      text-align: center;
    }
  </style>
</head>
<body>
  <img class="logo" src="../images/logosd_.jpg" alt="Logo">

  <div class="image-grid">
    <div class="image-container">
      <img src="../images/vigilantes/Santiago.jpg" alt="Image 1">
      <p class="caption">Nombre: Santiago  </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Valentina.jpg" alt="Image 2">
      <p class="caption">Nombre: Valentina  </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Alejandro.jpg" alt="Image 3">
      <p class="caption">Nombre: Alejandro </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Sofia.jpg" alt="Image 4">
      <p class="caption">Nombre: Sofia  </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Gabriel.jpg" alt="Image 5">
      <p class="caption">Nombre: Gabriel </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Isabella.jpg" alt="Image 6">
      <p class="caption">Nombre: Isabella </p>
    </div>
    <div class="image-container">
      <img src="../images/vigilantes/Sebastian.jpg" alt="Image 7">
      <p class="caption">Nombre: Sebastian</p>
    </div>
    <div class="image-container">
      <img src="../images/mentores/Victoria.jpg" alt="Image 8">
      <p class="caption">Nombre: Victoria </p>
    </div>
    <div class="image-container">
      <img src="../images/mentores/Mateo.jpg" alt="Image 9">
      <p class="caption">Nombre: Mateo</p>
    </div>
    <div class="image-container">
      <img src="../images/mentores/Camilla.jpg" alt="Image 10">
      <p class="caption">Nombre: Camilla</p>
    </div>
    
     </div>
  <div class="name">
    Nombres de los vigilantes
  </div>
</body>
</html>