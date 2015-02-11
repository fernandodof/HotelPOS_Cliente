/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.cliente;

import br.com.pos.hotel.services.Hotel;
import br.com.pos.hotel.services.Quarto;
import br.com.pos.hotel.services.ServicoInterno;
import br.com.pos.hotel.services.ServicoInternoService;

/**
 *
 * @author Fernando
 */
public class ConsumidorInterno {

    ServicoInternoService service = new ServicoInternoService();
    ServicoInterno port = service.getServicoInternoPort();
    
    public boolean addHotel(Hotel hotel){
        return port.addHotel(hotel);
    }
    
    public boolean addQuarto(int idHotel ,Quarto quarto){
        return port.addQuarto(idHotel, quarto);
    }
}
