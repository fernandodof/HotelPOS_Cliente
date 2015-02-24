package br.com.pos.hotel.servlets.pasagens;

import br.com.pos.hotel.cliente.ConsumidorPassagens;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.io.PrintWriter;
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
import service.AgenciaService;
import service.SalvarUsuario;
import service.Usuario;

/**
 *
 * @author filipe
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/Passagens/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Usuario usuario = new Usuario();
            ConsumidorPassagens consumidorPassagens = new ConsumidorPassagens();
            
            GregorianCalendar cal = new GregorianCalendar();            
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            
            Date dataNascimento = df.parse(request.getParameter("nascimento"));
            cal.setTime(dataNascimento);
            XMLGregorianCalendarImpl dataNascimentoXML = new XMLGregorianCalendarImpl(cal);
            
            usuario.setDataNascimento(dataNascimentoXML);
            usuario.setNome(request.getParameter("nome"));            
            usuario.setCpf(request.getParameter("cpf"));                       
                        
            request.getSession().setAttribute("usuario", usuario);
            
            consumidorPassagens.salvarUsuario(usuario);
            
            request.getRequestDispatcher("/Passagens/fazerReserva.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
