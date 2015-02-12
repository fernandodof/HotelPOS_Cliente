
import br.com.pos.hotel.cliente.ConsumidorPassagens;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import javax.xml.datatype.XMLGregorianCalendar;
import service.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class App3 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
    
        usuario.setLogin("fernando");
        
        XMLGregorianCalendar data = new XMLGregorianCalendarImpl();
        
        
        usuario.setDataNascimento(data);
        usuario.setSenha("123456");
        usuario.setNome("Fernando");
        
        ConsumidorPassagens consumidorPassagens = new ConsumidorPassagens();
        
        consumidorPassagens.salvarUsuario(usuario);
    }

}
