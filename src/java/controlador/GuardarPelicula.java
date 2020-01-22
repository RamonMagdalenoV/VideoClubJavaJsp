
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mysql.OperaMysql;

/**
 *
 * @author Ramón
 */
@WebServlet(name = "GuardarPelicula", urlPatterns = {"/GuardarPelicula"}) 
public class GuardarPelicula extends HttpServlet {               
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {             
        String Titulo = request.getParameter("titulo");        
        String Anio = request.getParameter("anio");
        String Duracion = request.getParameter("duracion");        
        String Sinopsis = request.getParameter("sinopsis");         
        String Genero = request.getParameter("genero");           
        String Clasificacion = request.getParameter("clasificacion");
        int Cantidad = Integer.parseInt(request.getParameter("cantidad"));
        mysql.OperaMysql obj = new OperaMysql();      
        obj.addPelicula(Titulo, Anio, Duracion, Sinopsis, Genero, Clasificacion, Cantidad);
        response.sendRedirect("index.jsp");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
