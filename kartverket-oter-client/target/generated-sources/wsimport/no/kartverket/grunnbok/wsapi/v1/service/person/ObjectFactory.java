
package no.kartverket.grunnbok.wsapi.v1.service.person;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.person package. 
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

    private final static QName _FindPersonerResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/person", "findPersonerResponse");
    private final static QName _FindPersoner_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/person", "findPersoner");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPersoner }
     * 
     */
    public FindPersoner createFindPersoner() {
        return new FindPersoner();
    }

    /**
     * Create an instance of {@link FindPersonerResponse }
     * 
     */
    public FindPersonerResponse createFindPersonerResponse() {
        return new FindPersonerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/person", name = "findPersonerResponse")
    public JAXBElement<FindPersonerResponse> createFindPersonerResponse(FindPersonerResponse value) {
        return new JAXBElement<FindPersonerResponse>(_FindPersonerResponse_QNAME, FindPersonerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersoner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/person", name = "findPersoner")
    public JAXBElement<FindPersoner> createFindPersoner(FindPersoner value) {
        return new JAXBElement<FindPersoner>(_FindPersoner_QNAME, FindPersoner.class, null, value);
    }

}
