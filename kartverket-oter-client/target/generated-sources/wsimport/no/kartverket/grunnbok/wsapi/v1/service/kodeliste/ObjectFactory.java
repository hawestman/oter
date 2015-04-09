
package no.kartverket.grunnbok.wsapi.v1.service.kodeliste;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.kodeliste package. 
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

    private final static QName _GetKodeliste_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", "getKodeliste");
    private final static QName _GetKodelister_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", "getKodelister");
    private final static QName _GetKodelisteResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", "getKodelisteResponse");
    private final static QName _GetKodelisterResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", "getKodelisterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.kodeliste
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetKodelisterResponse }
     * 
     */
    public GetKodelisterResponse createGetKodelisterResponse() {
        return new GetKodelisterResponse();
    }

    /**
     * Create an instance of {@link GetKodelisteResponse }
     * 
     */
    public GetKodelisteResponse createGetKodelisteResponse() {
        return new GetKodelisteResponse();
    }

    /**
     * Create an instance of {@link GetKodelister }
     * 
     */
    public GetKodelister createGetKodelister() {
        return new GetKodelister();
    }

    /**
     * Create an instance of {@link GetKodeliste }
     * 
     */
    public GetKodeliste createGetKodeliste() {
        return new GetKodeliste();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodeliste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", name = "getKodeliste")
    public JAXBElement<GetKodeliste> createGetKodeliste(GetKodeliste value) {
        return new JAXBElement<GetKodeliste>(_GetKodeliste_QNAME, GetKodeliste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodelister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", name = "getKodelister")
    public JAXBElement<GetKodelister> createGetKodelister(GetKodelister value) {
        return new JAXBElement<GetKodelister>(_GetKodelister_QNAME, GetKodelister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodelisteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", name = "getKodelisteResponse")
    public JAXBElement<GetKodelisteResponse> createGetKodelisteResponse(GetKodelisteResponse value) {
        return new JAXBElement<GetKodelisteResponse>(_GetKodelisteResponse_QNAME, GetKodelisteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodelisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/kodeliste", name = "getKodelisterResponse")
    public JAXBElement<GetKodelisterResponse> createGetKodelisterResponse(GetKodelisterResponse value) {
        return new JAXBElement<GetKodelisterResponse>(_GetKodelisterResponse_QNAME, GetKodelisterResponse.class, null, value);
    }

}
