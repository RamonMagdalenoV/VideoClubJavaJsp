<%-- 
    Document   : uno
    Created on : 4/12/2016, 07:41:12 PM
    Author     : Ramón
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agrega Peliculas!!</title>
    </head>
    <body>
        <h1>Agregar Peliculas!</h1>
        <hr>
        <form action="GuardarPelicula" method="post">
            Titulo  <input type="text" name="titulo"> 
            <br><br><!--Saltos de lineas-->
              Anio  <input type="text" name="anio">   
            <br><br>
              Duracion <input type="text" name="duracion">
            <br><br>
              Sinopsis <input type="text" name="sinopsis">
            <br><br>
              Genero <input type="text" name="genero">           
            <br><br>
              Clasificacion <input type="text" name="clasificacion">
            <br><br>
              Cantidad <input type="text" name="cantidad">
            <br><br>
            <input type="submit" value="Guardar">  
            <br><br>
            <a href="index.jsp"><b>HOME</b></a>     
        </form>

    </body>
</html>
