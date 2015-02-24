
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de venderPassagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="venderPassagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arg1" type="{http://service/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venderPassagem", propOrder = {
    "arg0",
    "arg1"
})
public class VenderPassagem {

    protected long arg0;
    protected Usuario arg1;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     */
    public long getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     */
    public void setArg0(long value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setArg1(Usuario value) {
        this.arg1 = value;
    }

}
