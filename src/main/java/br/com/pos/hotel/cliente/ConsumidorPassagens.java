/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pos.hotel.cliente;

import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import service.AgenciaService;
import service.Cidade;
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
    
    public Voo getVooOrigemDestino(long origem, long destino){
        return port.getVoo(origem, destino);
    }
    
    public Usuario getUsuario(String cpf){
        return port.getUsuario(cpf);
    }
    
    public List<Voo> getTodosOsVoos(){
        return port.getTodosVoos();
    }
    
    public List<Cidade> getCidades(){
        return port.getCidades();        
    }
    
    public boolean venderPasssagem(long voo, Usuario usuario){
        return port.venderPassagem(voo, usuario);
    }                
    
    public Voo getVooPorId(long id){
        return port.getVooPorId(id);        
    }
    
    
}
