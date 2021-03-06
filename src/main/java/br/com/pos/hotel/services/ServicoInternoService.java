
package br.com.pos.hotel.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicoInternoService", targetNamespace = "http://services.hotel.pos.com.br/", wsdlLocation = "http://localhost:8080/HotelPOS/ServicoInternoService?WSDL")
public class ServicoInternoService
    extends Service
{

    private final static URL SERVICOINTERNOSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICOINTERNOSERVICE_EXCEPTION;
    private final static QName SERVICOINTERNOSERVICE_QNAME = new QName("http://services.hotel.pos.com.br/", "ServicoInternoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelPOS/ServicoInternoService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICOINTERNOSERVICE_WSDL_LOCATION = url;
        SERVICOINTERNOSERVICE_EXCEPTION = e;
    }

    public ServicoInternoService() {
        super(__getWsdlLocation(), SERVICOINTERNOSERVICE_QNAME);
    }

    public ServicoInternoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICOINTERNOSERVICE_QNAME, features);
    }

    public ServicoInternoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICOINTERNOSERVICE_QNAME);
    }

    public ServicoInternoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICOINTERNOSERVICE_QNAME, features);
    }

    public ServicoInternoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicoInternoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicoInterno
     */
    @WebEndpoint(name = "ServicoInternoPort")
    public ServicoInterno getServicoInternoPort() {
        return super.getPort(new QName("http://services.hotel.pos.com.br/", "ServicoInternoPort"), ServicoInterno.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicoInterno
     */
    @WebEndpoint(name = "ServicoInternoPort")
    public ServicoInterno getServicoInternoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.hotel.pos.com.br/", "ServicoInternoPort"), ServicoInterno.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICOINTERNOSERVICE_EXCEPTION!= null) {
            throw SERVICOINTERNOSERVICE_EXCEPTION;
        }
        return SERVICOINTERNOSERVICE_WSDL_LOCATION;
    }

}
