<%-- 
    Document   : MostrarSocios
    Created on : 8/12/2016, 06:04:20 PM
    Author     : Hector
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Socios</title>
    </head>
    <body>
        <table width="100%">
            <tr>
                <td>
                    <div id = "principal">
                        <h1>Lista de Socios</h1><hr><br>
                        <table width="900px" border="3" bordercolor="BLUE">
                            <td>ID SOCIO</td>
                            <td>NOMBRE</td>
                            <td>DIRECCION</td>
                            <td>FECHA INSCRIPCION</td>
                          
                            <c:forEach var="dato" items="${registros}">
                                      <tr>
                                      <c:forEach var="regs"items="${dato}">
                                          <td>${regs}</td>
                                      </c:forEach>
                                      </tr>
                           </c:forEach>
                        </table>
                        <br><br>
                           <form action="ModSocio" post="post">
                               ID SOCIO: <input type="text" name="idsocio">
                               <input type="submit" value="Modificar Socio!">
                           </form>
                        <br><br>
                        <a href="index.jsp"><b>HOME</b></a>
                    </div>
                </td>
            </tr>
        </table>
       
    </body>
</html>
