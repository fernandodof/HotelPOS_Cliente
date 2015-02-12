/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.servlets;

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
@WebServlet(name = "BuscaVoosPorData", urlPatterns = {"/BuscaVoosPorData"})
public class BuscaVoosPorData extends HttpServlet {

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
//        try {
            response.setContentType("text/html;charset=UTF-8");

//            ConsumidorPassagens passagens = new ConsumidorPassagens();
//
//            Date date = null;
//            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//            date = df.parse(request.getParameter("data"));
//            GregorianCalendar cal = new GregorianCalendar();
//
//            cal.setTime(date);
//            XMLGregorianCalendar data = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH) + 1, date.getHours(), date.getMinutes(), date.getSeconds(), DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG).normalize();
//
//            List<Voo> listaVoos = passagens.getVoosPorData(data);
//
//            for (Voo listaVoo : listaVoos) {
//                System.out.println(listaVoo.getDestino());
//            }
//            
//            request.setAttribute("voos", listaVoos);
//            request.getRequestDispatcher("/HotelPOS_Cliente/Passagens/listaDeVoosPorData.jsp").forward(request, response);
            response.sendRedirect("/HotelPOS_Cliente/Passagens/listaDeVoosPorData.jsp");

//        } catch (ParseException ex) {
//            Logger.getLogger(BuscaVoosPorData.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DatatypeConfigurationException ex) {
//            Logger.getLogger(BuscaVoosPorData.class.getName()).log(Level.SEVERE, null, ex);
//        }

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
