/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.servlets.veiculos;

import br.com.pos.hotel.cliente.ConsumidorVeiculos;
import com.pos.services.Carro;
import com.pos.services.Pessoa;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fernando
 */
@WebServlet(name = "ReservarVeiculo", urlPatterns = {"/ReservarVeiculo"})
public class ReservarVeiculo extends HttpServlet {

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
            response.setContentType("text/html;charset=UTF-8");

            ConsumidorVeiculos consumidorVeiculos = new ConsumidorVeiculos();

            String nomePessoa = request.getParameter("nomePessoa");
            String documento = request.getParameter("documento");

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(nomePessoa);
            pessoa.setDocumento(documento);

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date dataInicio = df.parse(request.getParameter("dataInicio"));
            System.out.println(dataInicio.toString());
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(dataInicio);
            XMLGregorianCalendarImpl dataInicioXML = new XMLGregorianCalendarImpl(cal);

            Date dataFim = df.parse(request.getParameter("dataFim"));
            System.out.println(dataFim.toString());
            GregorianCalendar cal1 = new GregorianCalendar();
            cal1.setTime(dataFim);
            XMLGregorianCalendarImpl dataFimXML = new XMLGregorianCalendarImpl(cal1);

            int idVeiculo = ((Carro) request.getSession().getAttribute("veiculo")).getId();

            consumidorVeiculos.reservarVeiculo(idVeiculo, pessoa, dataInicioXML, dataFimXML);

            request.setAttribute("reserva", true);
            System.out.println("SERVLET RESERVAR VEICULO");
            request.getRequestDispatcher("Veiculos/fazerReserva.jsp").forward(request, response);
//            response.sendRedirect("/HotelPOS_Cliente/Veiculos/fazerReserva.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(ReservarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("reserva", false);
            request.getRequestDispatcher("Veiculos/fazerReserva.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("reserva", false);
            request.getRequestDispatcher("Veiculos/fazerReserva.jsp").forward(request, response);
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
