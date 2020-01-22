<%-- 
    Document   : AgregarSocio
    Created on : 8/12/2016, 05:18:07 PM
    Author     : Hector
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Socios!</h1><hr>
        <br>
        <form action="GuardarSocio" method="post">
            Nombre:    <input type="text" name="nombre"><br><br>
            Direccion: <input type="text" name="dir"><br><br>                   
            Fecha Inscripción: <input type="text" name="fecha_inscripcion"><br><br>
            Recargo: <input type="text" name="recargo"><br><br>
            <input type="submit" value="Guardar Socio!"><br><br>            
        </form>
        <a href="index.jsp"><b>HOME</b></a>
    </body>
</html>
