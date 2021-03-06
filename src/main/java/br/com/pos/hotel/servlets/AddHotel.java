/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.servlets;

import br.com.pos.hotel.cliente.ConsumidorInterno;
import br.com.pos.hotel.services.Endereco;
import br.com.pos.hotel.services.Hotel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fernando
 */
@WebServlet(name = "AddHotel", urlPatterns = {"/AddHotel"})
public class AddHotel extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ConsumidorInterno consumidor = new ConsumidorInterno();

        Hotel hotel = new Hotel();
        hotel.setNome(request.getParameter("nomeHotel"));

        Endereco endereco = new Endereco();
        endereco.setLogradouro(request.getParameter("logradouro"));
        endereco.setCidade(request.getParameter("cidade"));
        endereco.setEstado(request.getParameter("estado"));
        endereco.setCep(request.getParameter("cep"));
        endereco.setNumero(request.getParameter("numero"));
        //
        hotel.setEndereco(endereco);

        if (consumidor.addHotel(hotel)) {
            request.setAttribute("hotelSalvo", true);
        } else {
            request.setAttribute("hotelSalvo", false);
        }
        request.getRequestDispatcher("manipulaHotel.jsp").forward(request, response);

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
