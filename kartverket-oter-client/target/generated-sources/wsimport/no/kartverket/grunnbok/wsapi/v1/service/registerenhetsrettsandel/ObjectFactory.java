
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel package. 
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

    private final static QName _FindAndelerForRettighetshavereRegisterenhet_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerForRettighetshavereRegisterenhet");
    private final static QName _FindAndelerIRetter_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerIRetter");
    private final static QName _FindAndelerIRetterResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerIRetterResponse");
    private final static QName _FindAndelerForRettighetshaverePerson_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerForRettighetshaverePerson");
    private final static QName _FindAndelerForRettighetshaverePersonResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerForRettighetshaverePersonResponse");
    private final static QName _FindAndelerForRettighetshavereRegisterenhetResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", "findAndelerForRettighetshavereRegisterenhetResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAndelerForRettighetshavereRegisterenhetResponse }
     * 
     */
    public FindAndelerForRettighetshavereRegisterenhetResponse createFindAndelerForRettighetshavereRegisterenhetResponse() {
        return new FindAndelerForRettighetshavereRegisterenhetResponse();
    }

    /**
     * Create an instance of {@link FindAndelerForRettighetshaverePersonResponse }
     * 
     */
    public FindAndelerForRettighetshaverePersonResponse createFindAndelerForRettighetshaverePersonResponse() {
        return new FindAndelerForRettighetshaverePersonResponse();
    }

    /**
     * Create an instance of {@link FindAndelerForRettighetshaverePerson }
     * 
     */
    public FindAndelerForRettighetshaverePerson createFindAndelerForRettighetshaverePerson() {
        return new FindAndelerForRettighetshaverePerson();
    }

    /**
     * Create an instance of {@link FindAndelerIRetterResponse }
     * 
     */
    public FindAndelerIRetterResponse createFindAndelerIRetterResponse() {
        return new FindAndelerIRetterResponse();
    }

    /**
     * Create an instance of {@link FindAndelerIRetter }
     * 
     */
    public FindAndelerIRetter createFindAndelerIRetter() {
        return new FindAndelerIRetter();
    }

    /**
     * Create an instance of {@link FindAndelerForRettighetshavereRegisterenhet }
     * 
     */
    public FindAndelerForRettighetshavereRegisterenhet createFindAndelerForRettighetshavereRegisterenhet() {
        return new FindAndelerForRettighetshavereRegisterenhet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerForRettighetshavereRegisterenhet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerForRettighetshavereRegisterenhet")
    public JAXBElement<FindAndelerForRettighetshavereRegisterenhet> createFindAndelerForRettighetshavereRegisterenhet(FindAndelerForRettighetshavereRegisterenhet value) {
        return new JAXBElement<FindAndelerForRettighetshavereRegisterenhet>(_FindAndelerForRettighetshavereRegisterenhet_QNAME, FindAndelerForRettighetshavereRegisterenhet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerIRetter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerIRetter")
    public JAXBElement<FindAndelerIRetter> createFindAndelerIRetter(FindAndelerIRetter value) {
        return new JAXBElement<FindAndelerIRetter>(_FindAndelerIRetter_QNAME, FindAndelerIRetter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerIRetterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerIRetterResponse")
    public JAXBElement<FindAndelerIRetterResponse> createFindAndelerIRetterResponse(FindAndelerIRetterResponse value) {
        return new JAXBElement<FindAndelerIRetterResponse>(_FindAndelerIRetterResponse_QNAME, FindAndelerIRetterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerForRettighetshaverePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerForRettighetshaverePerson")
    public JAXBElement<FindAndelerForRettighetshaverePerson> createFindAndelerForRettighetshaverePerson(FindAndelerForRettighetshaverePerson value) {
        return new JAXBElement<FindAndelerForRettighetshaverePerson>(_FindAndelerForRettighetshaverePerson_QNAME, FindAndelerForRettighetshaverePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerForRettighetshaverePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerForRettighetshaverePersonResponse")
    public JAXBElement<FindAndelerForRettighetshaverePersonResponse> createFindAndelerForRettighetshaverePersonResponse(FindAndelerForRettighetshaverePersonResponse value) {
        return new JAXBElement<FindAndelerForRettighetshaverePersonResponse>(_FindAndelerForRettighetshaverePersonResponse_QNAME, FindAndelerForRettighetshaverePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAndelerForRettighetshavereRegisterenhetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/registerenhetsrettsandel", name = "findAndelerForRettighetshavereRegisterenhetResponse")
    public JAXBElement<FindAndelerForRettighetshavereRegisterenhetResponse> createFindAndelerForRettighetshavereRegisterenhetResponse(FindAndelerForRettighetshavereRegisterenhetResponse value) {
        return new JAXBElement<FindAndelerForRettighetshavereRegisterenhetResponse>(_FindAndelerForRettighetshavereRegisterenhetResponse_QNAME, FindAndelerForRettighetshavereRegisterenhetResponse.class, null, value);
    }

}
