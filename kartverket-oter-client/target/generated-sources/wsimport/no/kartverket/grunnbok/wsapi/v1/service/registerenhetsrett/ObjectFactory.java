
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrett;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrett package. 
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

    private final static QName _FindRetterForEnheterResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrett", "findRetterForEnheterResponse");
    private final static QName _FindRetterForEnheter_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrett", "findRetterForEnheter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrett
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindRetterForEnheterResponse }
     * 
     */
    public FindRetterForEnheterResponse createFindRetterForEnheterResponse() {
        return new FindRetterForEnheterResponse();
    }

    /**
     * Create an instance of {@link FindRetterForEnheter }
     * 
     */
    public FindRetterForEnheter createFindRetterForEnheter() {
        return new FindRetterForEnheter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRetterForEnheterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrett", name = "findRetterForEnheterResponse")
    public JAXBElement<FindRetterForEnheterResponse> createFindRetterForEnheterResponse(FindRetterForEnheterResponse value) {
        return new JAXBElement<FindRetterForEnheterResponse>(_FindRetterForEnheterResponse_QNAME, FindRetterForEnheterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRetterForEnheter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrett", name = "findRetterForEnheter")
    public JAXBElement<FindRetterForEnheter> createFindRetterForEnheter(FindRetterForEnheter value) {
        return new JAXBElement<FindRetterForEnheter>(_FindRetterForEnheter_QNAME, FindRetterForEnheter.class, null, value);
    }

}
