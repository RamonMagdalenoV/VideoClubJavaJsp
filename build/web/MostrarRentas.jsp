<%-- 
    Document   : MostrarRentas
    Created on : 9/12/2016, 02:36:58 PM
    Author     : Hector
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rentas</title>
    </head>
    <body>
        <table width="100%">
        <tr>
            <td>
                <div id="principal">
                    <h1>Rentas</h1><hr><br>
                    <table width="900px" border="3" bordercolor="BLUE">
                        <td>ID RENTAS</td>
                        <td>TITULO</td>
                        <td>CLASIFICACION</td>
                        <td>CANTIDAD</td>
                        <td>FECHA RENTA</td>
                        <td>FECHA ENTREGA</td>
                        <td>RECARGO</td>
                        <td>ID PELICULA</td>
                        <td>NOMBRE SOCIO</td>
                        <c:forEach var="dato" items="${renta}">
                              <tr>
                              <c:forEach var="registros"items="${dato}">
                                  <td>${registros}</td>
                              </c:forEach>
                              </tr>
                       </c:forEach>
                    </table>
                    <br><br>
                    <form action="ModRenta" post="post">
                           ID RENTA: <input type="text" name="idrenta">
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
