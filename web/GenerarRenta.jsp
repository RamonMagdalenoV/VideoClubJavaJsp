<%-- 
    Document   : GenerarRenta
    Created on : 9/12/2016, 12:27:35 AM
    Author     : Hector
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generar Renta</title>
    </head>
    <body>
       <table width="100%"><tr><td>
            <div id="principal"><hr> 
                <h2><center>Generar Rentas</center></h2><hr>
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
            </div> </td></tr>
       </table>
        
        <table width="900px" border="3" bordercolor="BLUE"> 
             <td>ID SOCIO</td>
            <td>NOMBRE</td>
            <td>DIRECCION</td>
            <td>FECHA INSCRIPCION</td>
            
            <c:forEach var="dato" items="${registros}">
              <tr>
                  <c:forEach var="regs" items="${dato}">
                      <td>${regs}</td>
                  </c:forEach>
              </tr>
           </c:forEach>
        </table>
        <br><br>
        
        <form action="GenRenta" method="post">
            Id Pelicula <input type="text" name="idpelicula">
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Nombre Socio &emsp;&emsp;<input type="text" name="socio"><br><br>
            Titulo <input type="text" name="titulo">&emsp;
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Clasificacion &nbsp;&emsp;&emsp;<input type="text" name="clasificacion">
            <br><br>                                                   
            Cantidad <input type="text" name="cantidad">
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            Fecha de Renta &emsp;<input type="date" name="fechaRenta">
            <br><br>
            Fecha Entrega <input type="text" name="fechaEntrega" value="0000-00-00">
            &emsp;&emsp;&emsp;&emsp;&emsp;
            Recargo &nbsp;&nbsp;&nbsp; &nbsp; &emsp;&emsp;<input type="text" name="recargo"><br><br>
            <input type="submit" value="Generar Renta"><br><br>
        </form>
        <a href="index.jsp"><b>HOME</b></a>
    </body>
</html>
