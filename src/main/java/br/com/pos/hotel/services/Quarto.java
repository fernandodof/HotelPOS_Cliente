
package br.com.pos.hotel.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de quarto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="quarto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ocupado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quarto", propOrder = {
    "capacidade",
    "id",
    "ocupado",
    "valor"
})
public class Quarto {

    protected int capacidade;
    protected int id;
    protected boolean ocupado;
    protected double valor;

    /**
     * Obtém o valor da propriedade capacidade.
     * 
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Define o valor da propriedade capacidade.
     * 
     */
    public void setCapacidade(int value) {
        this.capacidade = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade ocupado.
     * 
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Define o valor da propriedade ocupado.
     * 
     */
    public void setOcupado(boolean value) {
        this.ocupado = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
