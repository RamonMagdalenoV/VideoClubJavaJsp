<%-- 
    Document   : ModificarSocios
    Created on : 8/12/2016, 06:45:43 PM
    Author     : Hector
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifica Socios</title>
    </head>
    <body>
        <form action="UpdateSocio" method="post">
            <c:forEach var="dato" items="${regSocio}">
                <input type="hidden" name="idsocio" value="${dato[0]}"><br>
              Nombre: <input type="text" name="nombre" value="${dato[1]}">
              <br><br>
              Direccion: <input type="text" name="dir" value="${dato[2]}">
              <br><br>
              Fecha Inscripcion: <input type="text" name="fecha_inscripcion" value="${dato[3]}">
              <br><br>
              <input type="submit" value="GUARDAR!">

            </c:forEach>
        </form>
    </body>
</html>
