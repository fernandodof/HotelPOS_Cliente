
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

    private final static QName _GetHotelById_QNAME = new QName("http://services.hotel.pos.com.br/", "getHotelById");
    private final static QName _GetHoteisResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "getHoteisResponse");
    private final static QName _GetListaQuartosDesocupados_QNAME = new QName("http://services.hotel.pos.com.br/", "getListaQuartosDesocupados");
    private final static QName _GetHotelByIdResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "getHotelByIdResponse");
    private final static QName _GetHoteis_QNAME = new QName("http://services.hotel.pos.com.br/", "getHoteis");
    private final static QName _GetListaQuartosDesocupadosResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "getListaQuartosDesocupadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.pos.hotel.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHotelById }
     * 
     */
    public GetHotelById createGetHotelById() {
        return new GetHotelById();
    }

    /**
     * Create an instance of {@link GetListaQuartosDesocupados }
     * 
     */
    public GetListaQuartosDesocupados createGetListaQuartosDesocupados() {
        return new GetListaQuartosDesocupados();
    }

    /**
     * Create an instance of {@link GetHoteisResponse }
     * 
     */
    public GetHoteisResponse createGetHoteisResponse() {
        return new GetHoteisResponse();
    }

    /**
     * Create an instance of {@link GetHotelByIdResponse }
     * 
     */
    public GetHotelByIdResponse createGetHotelByIdResponse() {
        return new GetHotelByIdResponse();
    }

    /**
     * Create an instance of {@link GetListaQuartosDesocupadosResponse }
     * 
     */
    public GetListaQuartosDesocupadosResponse createGetListaQuartosDesocupadosResponse() {
        return new GetListaQuartosDesocupadosResponse();
    }

    /**
     * Create an instance of {@link GetHoteis }
     * 
     */
    public GetHoteis createGetHoteis() {
        return new GetHoteis();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getHotelById")
    public JAXBElement<GetHotelById> createGetHotelById(GetHotelById value) {
        return new JAXBElement<GetHotelById>(_GetHotelById_QNAME, GetHotelById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoteisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getHoteisResponse")
    public JAXBElement<GetHoteisResponse> createGetHoteisResponse(GetHoteisResponse value) {
        return new JAXBElement<GetHoteisResponse>(_GetHoteisResponse_QNAME, GetHoteisResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getHotelByIdResponse")
    public JAXBElement<GetHotelByIdResponse> createGetHotelByIdResponse(GetHotelByIdResponse value) {
        return new JAXBElement<GetHotelByIdResponse>(_GetHotelByIdResponse_QNAME, GetHotelByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoteis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "getHoteis")
    public JAXBElement<GetHoteis> createGetHoteis(GetHoteis value) {
        return new JAXBElement<GetHoteis>(_GetHoteis_QNAME, GetHoteis.class, null, value);
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
