
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
 * @author Fernando
 */
public class App1 {

    public static void main(String[] args) {
        GenericDAO genericoDao = new GenericDAOImp();

        Pessoa pessoa = new Pessoa("admin", "admin");
        genericoDao.save(pessoa);
    }
}
