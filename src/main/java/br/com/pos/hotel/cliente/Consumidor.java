/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.cliente;

import br.com.pos.hotel.services.Hotel;
import br.com.pos.hotel.services.Quarto;
import br.com.pos.hotel.services.ReservaService;
import br.com.pos.hotel.services.ReservaServiceService;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Consumidor {
    ReservaServiceService service = new ReservaServiceService();
    ReservaService port = service.getReservaServicePort();
    
    public List<Quarto> getListaDesocupadosHotel(String nomeHotel){
        return port.getListaQuartosDesocupados(nomeHotel);
    }
    
    public List<Hotel> getListaHoteis(){
        return port.getHoteis();
    }
    
    public Hotel getHotelById(int idHotel){
        return port.getHotelById(idHotel);
    }
}
