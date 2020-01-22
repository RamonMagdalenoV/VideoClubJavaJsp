
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
 * @author Hector
 */
@WebServlet(name = "GenRenta", urlPatterns = {"/GenRenta"})
public class GenRenta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titulo = request.getParameter("titulo");
        String clasificacion = request.getParameter("clasificacion");
        String cantidad = request.getParameter("cantidad");
        String fechaRenta = request.getParameter("fechaRenta");           
        String fechaEntrega = request.getParameter("fechaEntrega");
        String recargo = request.getParameter("recargo");
        String idp = request.getParameter("idpelicula");
        String socio = request.getParameter("socio");
        OperaMysql op = new OperaMysql();
       
        op.addRenta(titulo, clasificacion, cantidad, fechaRenta, fechaEntrega, recargo, idp, socio);
        op.UpdateCantP(cantidad, idp);
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
