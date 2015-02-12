/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.cliente;

import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import service.AgenciaService;
import service.Passagens;
import service.Usuario;
import service.Voo;

/**
 *
 * @author Fernando
 */
public class ConsumidorPassagens {

   
    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();
    
    
    public boolean salvarUsuario(Usuario usuario){
        return port.salvarUsuario(usuario);
    }
    
    public List<Voo> getVoosPorData(XMLGregorianCalendar data){
        return port.getVoosPorData(data);
        
    }
    
    public Usuario getUsuario(String login){
        return port.getUsuario(login);
    }
    
    public List<Voo> getTodosOsVoos(){
        return port.getTodosVoos();
    }
    
    public boolean venderPasssagem(Voo voo, Usuario usuario){
        return port.venderPassagem(voo, usuario);
    }
    
    
    
    
}
