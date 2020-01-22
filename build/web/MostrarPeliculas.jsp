<%-- 
    Document   : MostrarPeliculas
    Created on : 5/12/2016, 10:53:03 PM
    Author     : Ramón
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Peliculas</title>
    </head>
    <body>
      <table width="100%">
        <tr>
          <td>
            <div id="principal">
              <h1>Lista de Peliculas</h1><hr><br>
                 <table width="900px" border="3" bordercolor="BLUE">
                   <td>ID PELICULA</td>
                   <td>TITULO</td>
                   <td>ANIO</td>
                   <td>DURACION</td>
                   <td>GENERO</td>
                   <td>SINOPSIS</td>
                   <td>CLASIFICACION</td>
                   <td>CANTIDAD</td>
                           <c:forEach var="dato" items="${datos}">
                                      <tr>
                                      <c:forEach var="registros"items="${dato}">
                                          <td>${registros}</td>
                                      </c:forEach>
                                      </tr>
                           </c:forEach>
                        </table>
                        <br><br>
                        
                        
                           <form action="ModPelicula" post="post">
                               ID PELICULA: <input type="text" name="idpelicula">   
                               <input type="submit" value="Modificar">
                           </form>
                        <br><br>
                        <a href="index.jsp"><b>HOME</b></a>
                    </div>
                </td>
            </tr>
        </table>
        
    </body>
</html>
