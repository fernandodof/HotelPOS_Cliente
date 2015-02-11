
import br.com.pos.hotel.beans.Pessoa;
import br.com.pos.hotel.dao.GenericDAO;
import br.com.pos.hotel.dao.GenericDAOImp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filipe
 */
public class App {        
    
    public static void main(String[] args) {
        GenericDAO<Pessoa> genericDAO = new GenericDAOImp<>();
        Pessoa pessoa = new Pessoa("admin", "admin");
        genericDAO.save(pessoa);                
    }
    
}
