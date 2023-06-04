<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Logo y Matriz de Imágenes</title>
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
      <img src="../images/tributos/katniss.jpg" alt="Image 1">
      <p class="caption">Nombre: Annie Distrito: 2</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/peeta.jpg" alt="Image 2">
      <p class="caption">Descripción de la imagen 5</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Jhoanna.jpg" alt="Image 3">
      <p class="caption">Descripción de la imagen 3</p>
    </div>
    <!-- Repite este bloque para las demás imágenes -->
    <div class="image-container">
      <img src="../images/tributos/Rue.jpg" alt="Image 4">
      <p class="caption">Descripción de la imagen 4</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Primrose.jpg" alt="Image 5">
      <p class="caption">Descripción de la imagen 5</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Haymitch.jpg" alt="Image 6">
      <p class="caption">Descripción de la imagen 6</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Cato.jpg" alt="Image 7">
      <p class="caption">Descripción de la imagen 7</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Glimmer.jpg" alt="Image 8">
      <p class="caption">Descripción de la imagen 8</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Marvelios.jpg" alt="Image 9">
      <p class="caption">Descripción de la imagen 9</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Clove.jpg" alt="Image 10">
      <p class="caption">Descripción de la imagen 10</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Foxface.jpg" alt="Image 11">
      <p class="caption">Descripción de la imagen 11</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Thresh.jpg" alt="Image 12">
      <p class="caption">Descripción de la imagen 12</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Wires.jpg" alt="Image 13">
      <p class="caption">Descripción de la imagen 13</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Beetee.jpg" alt="Image 14">
      <p class="caption">Descripción de la imagen 14</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Cashmere.jpg" alt="Image 15">
      <p class="caption">Descripción de la imagen 15</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Gloss.jpg" alt="Image 16">
      <p class="caption">Descripción de la imagen 16</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Enobaria.jpg" alt="Image 17">
      <p class="caption">Descripción de la imagen 17</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Mags.jpg" alt="Image 18">
      <p class="caption">Descripción de la imagen 18</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Annie.jpg" alt="Image 19">
      <p class="caption">Descripción de la imagen 19</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Boggs.jpg" alt="Image 20">
      <p class="caption">Descripción de la imagen 20</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Lyme.jpg" alt="Image 21">
      <p class="caption">Descripción de la imagen 21</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Chaff.jpg" alt="Image 22">
      <p class="caption">Descripción de la imagen 22</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Seeder.jpg" alt="Image 23">
      <p class="caption">Descripción de la imagen 23</p>
    </div>
    <div class="image-container">
      <img src="../images/tributos/Percy.jpg" alt="Image 24">
      <p class="caption">Descripción de la imagen 24</p>
    </div>
  </div>

  <div class="name">
    Nombre del Álbum
  </div>
</body>
</html>
    