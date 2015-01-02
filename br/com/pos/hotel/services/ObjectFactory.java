
package br.com.pos.hotel.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.pos.hotel.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListaQuartosDesocupados_QNAME = new QName("http://services.hotel.pos.com.br/", "getListaQuartosDesocupados");
    private final static QName _GetListaQuartosDesocupadosResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "getListaQuartosDesocupadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.pos.hotel.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListaQuartosDesocupados }
     * 
     */
    public GetListaQuartosDesocupados createGetListaQuartosDesocupados() {
        return new GetListaQuartosDesocupados();
    }

    /**
     * Create an instance of {@link GetListaQuartosDesocupadosResponse }
     * 
     */
    public GetListaQuartosDesocupadosResponse createGetListaQuartosDesocupadosResponse() {
        return new GetListaQuartosDesocupadosResponse();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaQuartosDesocupados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getListaQuartosDesocupados")
    public JAXBElement<GetListaQuartosDesocupados> createGetListaQuartosDesocupados(GetListaQuartosDesocupados value) {
        return new JAXBElement<GetListaQuartosDesocupados>(_GetListaQuartosDesocupados_QNAME, GetListaQuartosDesocupados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaQuartosDesocupadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getListaQuartosDesocupadosResponse")
    public JAXBElement<GetListaQuartosDesocupadosResponse> createGetListaQuartosDesocupadosResponse(GetListaQuartosDesocupadosResponse value) {
        return new JAXBElement<GetListaQuartosDesocupadosResponse>(_GetListaQuartosDesocupadosResponse_QNAME, GetListaQuartosDesocupadosResponse.class, null, value);
    }

}
