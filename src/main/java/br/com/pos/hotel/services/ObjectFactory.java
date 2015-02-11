
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

    private final static QName _AddQuartoResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "addQuartoResponse");
    private final static QName _AddHotel_QNAME = new QName("http://services.hotel.pos.com.br/", "addHotel");
    private final static QName _AddHotelResponse_QNAME = new QName("http://services.hotel.pos.com.br/", "addHotelResponse");
    private final static QName _AddQuarto_QNAME = new QName("http://services.hotel.pos.com.br/", "addQuarto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.pos.hotel.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddQuartoResponse }
     * 
     */
    public AddQuartoResponse createAddQuartoResponse() {
        return new AddQuartoResponse();
    }

    /**
     * Create an instance of {@link AddHotel }
     * 
     */
    public AddHotel createAddHotel() {
        return new AddHotel();
    }

    /**
     * Create an instance of {@link AddQuarto }
     * 
     */
    public AddQuarto createAddQuarto() {
        return new AddQuarto();
    }

    /**
     * Create an instance of {@link AddHotelResponse }
     * 
     */
    public AddHotelResponse createAddHotelResponse() {
        return new AddHotelResponse();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuartoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "addQuartoResponse")
    public JAXBElement<AddQuartoResponse> createAddQuartoResponse(AddQuartoResponse value) {
        return new JAXBElement<AddQuartoResponse>(_AddQuartoResponse_QNAME, AddQuartoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "addHotel")
    public JAXBElement<AddHotel> createAddHotel(AddHotel value) {
        return new JAXBElement<AddHotel>(_AddHotel_QNAME, AddHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "addHotelResponse")
    public JAXBElement<AddHotelResponse> createAddHotelResponse(AddHotelResponse value) {
        return new JAXBElement<AddHotelResponse>(_AddHotelResponse_QNAME, AddHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuarto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.hotel.pos.com.br/", name = "addQuarto")
    public JAXBElement<AddQuarto> createAddQuarto(AddQuarto value) {
        return new JAXBElement<AddQuarto>(_AddQuarto_QNAME, AddQuarto.class, null, value);
    }

}
