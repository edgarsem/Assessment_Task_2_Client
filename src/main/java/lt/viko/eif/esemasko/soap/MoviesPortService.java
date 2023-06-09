
package lt.viko.eif.esemasko.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

import jakarta.xml.ws.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebServiceClient(name = "MoviesPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "http://localhost:8080/ws/movies.wsdl")
public class MoviesPortService
        extends Service {

    private final static URL MOVIESPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESPORTSERVICE_EXCEPTION;
    private final static QName MOVIESPORTSERVICE_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "MoviesPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/movies.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESPORTSERVICE_WSDL_LOCATION = url;
        MOVIESPORTSERVICE_EXCEPTION = e;
    }

    public MoviesPortService() {
        super(__getWsdlLocation(), MOVIESPORTSERVICE_QNAME);
    }

    public MoviesPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESPORTSERVICE_QNAME, features);
    }

    public MoviesPortService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESPORTSERVICE_QNAME);
    }

    public MoviesPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESPORTSERVICE_QNAME, features);
    }

    public MoviesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MoviesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns MoviesPort
     */
    @WebEndpoint(name = "MoviesPortSoap11")
    public MoviesPort getMoviesPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "MoviesPortSoap11"), MoviesPort.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns MoviesPort
     */
    @WebEndpoint(name = "MoviesPortSoap11")
    public MoviesPort getMoviesPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "MoviesPortSoap11"), MoviesPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESPORTSERVICE_EXCEPTION != null) {
            throw MOVIESPORTSERVICE_EXCEPTION;
        }
        return MOVIESPORTSERVICE_WSDL_LOCATION;
    }

}
