/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.servlets;

import br.com.pos.hotel.cliente.Consumidor;
import br.com.pos.hotel.services.Quarto;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Fernando
 */
@WebServlet(name = "FazerReserva", urlPatterns = {"/FazerReserva"})
public class FazerReserva extends HttpServlet {

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
        try {
            request.setCharacterEncoding("UTF-8");

            Consumidor consumidor = new Consumidor();

            String nomePessoa = request.getParameter("nomePessoa");
            String documento = request.getParameter("documento");

            Date date = null;
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            date = df.parse(request.getParameter("dataEntrada"));
            GregorianCalendar cal = new GregorianCalendar();

            cal.setTime(date);
            XMLGregorianCalendar dataEntrada = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH) + 1, date.getHours(), date.getMinutes(), date.getSeconds(), DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG).normalize();
            //////////
            Date date1 = null;
            date1 = df.parse(request.getParameter("dataSaida"));
            GregorianCalendar cal1 = new GregorianCalendar();

            cal1.setTime(date1);
            XMLGregorianCalendar dataSaida = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH) + 1, cal1.get(Calendar.DAY_OF_MONTH) + 1, date1.getHours(), date.getMinutes(), date1.getSeconds(), DatatypeConstants.FIELD_UNDEFINED, cal1.getTimeZone().LONG).normalize();

            boolean retornoReserva = consumidor.reservar(((Quarto) request.getSession().getAttribute("quarto")).getId(), nomePessoa, documento, dataEntrada, dataSaida);

            if (retornoReserva == true) {
                request.setAttribute("reserva", true);
            } else {
                request.setAttribute("reserva", false);
            }
            request.getRequestDispatcher("reserva.jsp").forward(request, response);

        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(FazerReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FazerReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
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
