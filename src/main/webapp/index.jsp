<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
   <title>Capitolio</title>
   <style>
      body {
         display: flex;
         justify-content: center;
         align-items: center;
         height: 100vh;
         flex-direction: column;
      }
      
      .login-container {
         display: flex;
         flex-direction: column;
         align-items: center;
         background-color: #fff;
         padding: 20px;
         border-radius: 5px;
      }
      
      .login-container img {
         width: 200px; /* Ajusta el tamaño de la imagen según sea necesario */
         margin-bottom: 20px;
      }
      
      table {
         border-collapse: collapse;
      }
      
      table td {
         padding: 5px;
      }
      
      h1 {
         text-align: center;
         color: #000; /* Cambia el color del texto a negro */
      }
   </style>
</head>
<body>
   <img src="images/capitol.jpg" alt="Imagen de fondo">
   <div class="login-container">
      <h1>Login</h1>
      <form action="LoginServlet" method="post">
         <table>
            <tr>
               <td>Enter name:</td>
               <td><input type="text" name="username"></td>
            </tr>
            <tr>
               <td>Enter Password:</td>
               <td><input type="password" name="password"></td>
            </tr>
            <tr>
               <td colspan="2" style="text-align: center;">
                  <input type="submit" name="Login">
                  <input type="reset">
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>

