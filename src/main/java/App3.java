
import br.com.pos.hotel.cliente.ConsumidorVeiculos;
import com.pos.services.Carro;
import com.pos.services.Locadora;
import java.util.List;

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
//        Usuario usuario = new Usuario();
//    
//        usuario.setLogin("fernando");
//        
//        XMLGregorianCalendar data = new XMLGregorianCalendarImpl();
//        
//        
//        usuario.setDataNascimento(data);
//        usuario.setSenha("123456");
//        usuario.setNome("Fernando");
//        
//        ConsumidorPassagens consumidorPassagens = new ConsumidorPassagens();
//        
//        consumidorPassagens.salvarUsuario(usuario);

        ConsumidorVeiculos cv = new ConsumidorVeiculos();
        List<Carro> carros = cv.getVeiculosDisponiveis();
        for (Carro carro : carros) {
            System.out.println(carro.getNome());
        }

        List<Locadora> locadoras = cv.getLocadoras();
        for (Locadora locadora : locadoras) {
            System.out.println(locadora.getNome());
        }
    }

}
