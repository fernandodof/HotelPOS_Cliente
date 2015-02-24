/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.servlets.pasagens;

import br.com.pos.hotel.cliente.ConsumidorPassagens;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Usuario;

/**
 *
 * @author Fernando
 */
@WebServlet(name = "ReservarPassagem", urlPatterns = {"/Passagens/ReservarPassagem"})
public class ReservarPassagem extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ConsumidorPassagens passagens = new ConsumidorPassagens();
        
        long idVoo = Long.parseLong(request.getParameter("idVoo"));
        //long cpfUsuario = Long.parseLong(request.getParameter("cpfUsuario"));
        Usuario usuario = passagens.getUsuario(request.getParameter("cpfUsuario"));
                                
        
        System.out.println(idVoo);
        System.out.println(usuario.getNome());
        passagens.venderPasssagem(idVoo, usuario);
        
        request.getRequestDispatcher("/Passagens/sucesso.jsp").forward(request, response);
        
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
