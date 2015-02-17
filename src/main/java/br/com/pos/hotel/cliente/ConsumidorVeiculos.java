/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.cliente;

import com.pos.services.Carro;
import com.pos.services.LocaService;
import com.pos.services.LocaService_Service;
import com.pos.services.Locadora;
import com.pos.services.Pessoa;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Fernando
 */
public class ConsumidorVeiculos {
    LocaService_Service locaService_Service = new LocaService_Service();
    LocaService port = locaService_Service.getLocaServicePort();
    
    public List<Carro> getVeiculosDisponiveis(){
        return port.getCarrosDisponiveis();
    }
    
    public Carro getVeiculoPorId(int id){
        return port.getCarroPorId(id);
    }
    
    public List<Carro> getVeiculosDisponiveisPorIdLocadora(int id){
        return port.getCarrosDisponiveisPorIdLocadora(id);
    }
    
    public List<Locadora> getLocadoras(){
        return port.getLocadoras();
    }
    
    public Locadora getLocadoraPorId(int id){
        return port.getLocadoraPorId(id);
    }
    
    public void reservarVeiculo(int idCarro, Pessoa pessoa, XMLGregorianCalendar dataInicial, XMLGregorianCalendar dataFinal){
        port.reservarCarro(idCarro, pessoa, dataInicial, dataFinal);
    }
    
}
