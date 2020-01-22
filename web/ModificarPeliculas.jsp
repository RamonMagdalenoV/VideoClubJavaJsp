<%-- 
    Document   : ModificarPeliculas
    Created on : 5/12/2016, 11:49:48 PM
    Author     : Ramón
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifica Pelicula</title>
    </head>
    <body>
         <form action="UpdatePelicula" method="post">
            <c:forEach var="dato" items="${regPelicula}">
              <input type="hidden" name="idpelicula" value="${dato[0]}"
              <br><br>
              Titulo <input type="text" name="Titulo" value="${dato[1]}">
            <br><br>
              Anio <input type="text" name="Anio" value="${dato[2]}">
            <br><br>
              Duracion <input type="text" name="Duracion" value="${dato[3]}">  
            <br><br>
              Sinopsis <input type="text" name="Sinopsis" value="${dato[4]}">
            <br><br>
              Genero <input type="text" name="Genero" value="${dato[5]}">
            <br><br>
              Clasificacion <input type="text" name="Clasificacion" value="${dato[6]}">
            <br><br>
              Cantidad <input type="text" name="Cantidad" value="${dato[7]}">
            <br><br>
            <input type="submit" value="GUARDAR!">
            </c:forEach>
            
        </form>
    </body>
</html>
