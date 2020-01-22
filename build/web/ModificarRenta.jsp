<%-- 
    Document   : ModificarRenta
    Created on : 9/12/2016, 01:50:29 PM
    Author     : Hector
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Rentas</title>
        
    </head>
    <body>
        <form action="UpdateRenta" method="post">
            <c:forEach var="dato" items="${regRenta}">
              <input type="hidden" name="idrenta" value="${dato[0]}"
              <br><br>
              Titulo <input type="text" name="titulo" value="${dato[1]}">
            <br><br>
              Clasificacion <input type="text" name="clasificacion" value="${dato[2]}">
            <br><br>
              Cantidad <input type="text" name="cantidad" value="${dato[3]}">
            <br><br>
              Fecha Renta <input type="text" name="fechaRenta" value="${dato[4]}">
            <br><br>
              Fecha Entrega<input type="text" name="fechaEntrega" value="${dato[5]}">
            <br><br>
              Recargo <input type="text" name="recargo" value="${dato[6]}">
            <br><br>
              Id Pelicula <input type="text" name="idpelicula" value="${dato[7]}">
            <br><br>
            Nombre Socio <input type="text" name="nombreSocio" value="${dato[8]}">
            <br><br>
            <input type="submit" value="GUARDAR!">
            </c:forEach>
            
        </form>
    </body>
</html>
