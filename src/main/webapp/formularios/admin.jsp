<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Usuario Administrador</title>
  <style>
    /* Estilos globales */
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    /* Estilos del encabezado */
    header {
      background-color: #f2f2f2;
      padding: 20px;
      text-align: center;
    }

    header img {
      height: 150px;
    }

    /* Estilos de los botones */
    .button-container {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      gap: 20px;
      justify-items: center;
      align-items: center;
      margin: 50px auto;
      max-width: 800px;
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

    /* Estilos del pie de página */
    footer {
      background-color: #f2f2f2;
      padding: 10px;
      text-align: center;
      position: absolute;
      bottom: 0;
      width: 100%;
    }
  </style>
</head>
<body>
  <header>
    <img src="images/logo_capitolio.png" alt="Logo">
  </header>
  
  <main>
    <div class="button-container">
      <a href="VistaDistritosServlet" class="button">Distritos</a>
      <a href="VistaTributosServlet" class="button">Tributos</a>
      <a href="VistaPosicionesServlet" class="button">Posiciones</a>
      <a href="VistaVigilantesServlet" class="button">Vigilantes</a>
      <a href="VistaMentoresServlet" class="button">Mentores</a>
      <a href="VistaPruebasServlet" class="button">Pruebas</a>
      <a href="VistaPuntuacionesServlet" class="button">Puntuacion</a>
      <a href="VistaParticipacionesServlet" class="button">Participacion</a>
      <a href="VistaDificultadesServlet" class="button">difcultad</a>
      <a href="VistaEntrenamientoServlet" class="button">entrenamiento</a>
      <a href="VistaCapitolioServlet" class="button">Capitolio</a>
      <a href="formularios/pagina_web.jsp" class="button">Pagina web</a>
      <a href="index.jsp" class="button">Cerrar sesión</a> <!-- Botón para cerrar sesión -->
    </div>
  </main>
  
  <footer>
    <p>Derechos de autor copy Jordan Medina Tafolla; 2023</p>
  </footer>
</body>
</html>
