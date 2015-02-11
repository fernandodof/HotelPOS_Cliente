
package br.com.pos.hotel.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de reserva complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEntrada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pessoa" type="{http://services.hotel.pos.com.br/}pessoa" minOccurs="0"/>
 *         &lt;element name="quarto" type="{http://services.hotel.pos.com.br/}quarto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "dataEntrada",
    "dataSaida",
    "id",
    "pessoa",
    "quarto"
})
public class Reserva {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEntrada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected int id;
    protected Pessoa pessoa;
    protected Quarto quarto;

    /**
     * Obtém o valor da propriedade dataEntrada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Define o valor da propriedade dataEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEntrada(XMLGregorianCalendar value) {
        this.dataEntrada = value;
    }

    /**
     * Obtém o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
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
     * Obtém o valor da propriedade pessoa.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Define o valor da propriedade pessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

    /**
     * Obtém o valor da propriedade quarto.
     * 
     * @return
     *     possible object is
     *     {@link Quarto }
     *     
     */
    public Quarto getQuarto() {
        return quarto;
    }

    /**
     * Define o valor da propriedade quarto.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarto }
     *     
     */
    public void setQuarto(Quarto value) {
        this.quarto = value;
    }

}
