
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de voo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="voo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVoo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://service/}cidade" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="origem" type="{http://service/}cidade" minOccurs="0"/>
 *         &lt;element name="vagas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voo", propOrder = {
    "dataVoo",
    "destino",
    "id",
    "origem",
    "vagas",
    "valor"
})
public class Voo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVoo;
    protected Cidade destino;
    protected long id;
    protected Cidade origem;
    protected Integer vagas;
    protected Double valor;

    /**
     * Obtém o valor da propriedade dataVoo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVoo() {
        return dataVoo;
    }

    /**
     * Define o valor da propriedade dataVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVoo(XMLGregorianCalendar value) {
        this.dataVoo = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setDestino(Cidade value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setOrigem(Cidade value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade vagas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVagas() {
        return vagas;
    }

    /**
     * Define o valor da propriedade vagas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVagas(Integer value) {
        this.vagas = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

}
