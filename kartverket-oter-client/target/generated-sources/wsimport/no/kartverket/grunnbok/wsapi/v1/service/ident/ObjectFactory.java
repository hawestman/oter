
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.ident package. 
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

    private final static QName _FindRegisterenhetsrettIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRegisterenhetsrettIdsForIdents");
    private final static QName _FindDokumentIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findDokumentIdsForIdentsResponse");
    private final static QName _FindRegisterenhetIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRegisterenhetIdsForIdents");
    private final static QName _FindRettsstiftelseIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRettsstiftelseIdsForIdentsResponse");
    private final static QName _FindBorettslagIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findBorettslagIdsForIdentsResponse");
    private final static QName _FindIdentsForIdsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findIdentsForIdsResponse");
    private final static QName _FindDokumentIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findDokumentIdsForIdents");
    private final static QName _FindBorettslagsandelIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findBorettslagsandelIdsForIdents");
    private final static QName _FindMatrikkelenhetIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findMatrikkelenhetIdsForIdents");
    private final static QName _FindKommuneIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findKommuneIdsForIdents");
    private final static QName _FindIdentsForIds_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findIdentsForIds");
    private final static QName _FindKommuneIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findKommuneIdsForIdentsResponse");
    private final static QName _FindRegisterenhetsrettIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRegisterenhetsrettIdsForIdentsResponse");
    private final static QName _FindMatrikkelenhetIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findMatrikkelenhetIdsForIdentsResponse");
    private final static QName _FindPersonIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findPersonIdsForIdents");
    private final static QName _FindBorettslagsandelIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findBorettslagsandelIdsForIdentsResponse");
    private final static QName _FindRegisterenhetIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRegisterenhetIdsForIdentsResponse");
    private final static QName _ValidationException_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "ValidationException");
    private final static QName _FindPersonIdsForIdentsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findPersonIdsForIdentsResponse");
    private final static QName _FindBorettslagIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findBorettslagIdsForIdents");
    private final static QName _FindRettsstiftelseIdsForIdents_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/ident", "findRettsstiftelseIdsForIdents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.ident
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindRettsstiftelseIdsForIdents }
     * 
     */
    public FindRettsstiftelseIdsForIdents createFindRettsstiftelseIdsForIdents() {
        return new FindRettsstiftelseIdsForIdents();
    }

    /**
     * Create an instance of {@link FindRegisterenhetIdsForIdentsResponse }
     * 
     */
    public FindRegisterenhetIdsForIdentsResponse createFindRegisterenhetIdsForIdentsResponse() {
        return new FindRegisterenhetIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link FindPersonIdsForIdentsResponse }
     * 
     */
    public FindPersonIdsForIdentsResponse createFindPersonIdsForIdentsResponse() {
        return new FindPersonIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindBorettslagIdsForIdents }
     * 
     */
    public FindBorettslagIdsForIdents createFindBorettslagIdsForIdents() {
        return new FindBorettslagIdsForIdents();
    }

    /**
     * Create an instance of {@link FindPersonIdsForIdents }
     * 
     */
    public FindPersonIdsForIdents createFindPersonIdsForIdents() {
        return new FindPersonIdsForIdents();
    }

    /**
     * Create an instance of {@link FindBorettslagsandelIdsForIdentsResponse }
     * 
     */
    public FindBorettslagsandelIdsForIdentsResponse createFindBorettslagsandelIdsForIdentsResponse() {
        return new FindBorettslagsandelIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindIdentsForIds }
     * 
     */
    public FindIdentsForIds createFindIdentsForIds() {
        return new FindIdentsForIds();
    }

    /**
     * Create an instance of {@link FindKommuneIdsForIdentsResponse }
     * 
     */
    public FindKommuneIdsForIdentsResponse createFindKommuneIdsForIdentsResponse() {
        return new FindKommuneIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindRegisterenhetsrettIdsForIdentsResponse }
     * 
     */
    public FindRegisterenhetsrettIdsForIdentsResponse createFindRegisterenhetsrettIdsForIdentsResponse() {
        return new FindRegisterenhetsrettIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindMatrikkelenhetIdsForIdentsResponse }
     * 
     */
    public FindMatrikkelenhetIdsForIdentsResponse createFindMatrikkelenhetIdsForIdentsResponse() {
        return new FindMatrikkelenhetIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindBorettslagsandelIdsForIdents }
     * 
     */
    public FindBorettslagsandelIdsForIdents createFindBorettslagsandelIdsForIdents() {
        return new FindBorettslagsandelIdsForIdents();
    }

    /**
     * Create an instance of {@link FindKommuneIdsForIdents }
     * 
     */
    public FindKommuneIdsForIdents createFindKommuneIdsForIdents() {
        return new FindKommuneIdsForIdents();
    }

    /**
     * Create an instance of {@link FindMatrikkelenhetIdsForIdents }
     * 
     */
    public FindMatrikkelenhetIdsForIdents createFindMatrikkelenhetIdsForIdents() {
        return new FindMatrikkelenhetIdsForIdents();
    }

    /**
     * Create an instance of {@link FindBorettslagIdsForIdentsResponse }
     * 
     */
    public FindBorettslagIdsForIdentsResponse createFindBorettslagIdsForIdentsResponse() {
        return new FindBorettslagIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindDokumentIdsForIdents }
     * 
     */
    public FindDokumentIdsForIdents createFindDokumentIdsForIdents() {
        return new FindDokumentIdsForIdents();
    }

    /**
     * Create an instance of {@link FindIdentsForIdsResponse }
     * 
     */
    public FindIdentsForIdsResponse createFindIdentsForIdsResponse() {
        return new FindIdentsForIdsResponse();
    }

    /**
     * Create an instance of {@link FindRettsstiftelseIdsForIdentsResponse }
     * 
     */
    public FindRettsstiftelseIdsForIdentsResponse createFindRettsstiftelseIdsForIdentsResponse() {
        return new FindRettsstiftelseIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindRegisterenhetsrettIdsForIdents }
     * 
     */
    public FindRegisterenhetsrettIdsForIdents createFindRegisterenhetsrettIdsForIdents() {
        return new FindRegisterenhetsrettIdsForIdents();
    }

    /**
     * Create an instance of {@link FindDokumentIdsForIdentsResponse }
     * 
     */
    public FindDokumentIdsForIdentsResponse createFindDokumentIdsForIdentsResponse() {
        return new FindDokumentIdsForIdentsResponse();
    }

    /**
     * Create an instance of {@link FindRegisterenhetIdsForIdents }
     * 
     */
    public FindRegisterenhetIdsForIdents createFindRegisterenhetIdsForIdents() {
        return new FindRegisterenhetIdsForIdents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterenhetsrettIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRegisterenhetsrettIdsForIdents")
    public JAXBElement<FindRegisterenhetsrettIdsForIdents> createFindRegisterenhetsrettIdsForIdents(FindRegisterenhetsrettIdsForIdents value) {
        return new JAXBElement<FindRegisterenhetsrettIdsForIdents>(_FindRegisterenhetsrettIdsForIdents_QNAME, FindRegisterenhetsrettIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDokumentIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findDokumentIdsForIdentsResponse")
    public JAXBElement<FindDokumentIdsForIdentsResponse> createFindDokumentIdsForIdentsResponse(FindDokumentIdsForIdentsResponse value) {
        return new JAXBElement<FindDokumentIdsForIdentsResponse>(_FindDokumentIdsForIdentsResponse_QNAME, FindDokumentIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterenhetIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRegisterenhetIdsForIdents")
    public JAXBElement<FindRegisterenhetIdsForIdents> createFindRegisterenhetIdsForIdents(FindRegisterenhetIdsForIdents value) {
        return new JAXBElement<FindRegisterenhetIdsForIdents>(_FindRegisterenhetIdsForIdents_QNAME, FindRegisterenhetIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRettsstiftelseIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRettsstiftelseIdsForIdentsResponse")
    public JAXBElement<FindRettsstiftelseIdsForIdentsResponse> createFindRettsstiftelseIdsForIdentsResponse(FindRettsstiftelseIdsForIdentsResponse value) {
        return new JAXBElement<FindRettsstiftelseIdsForIdentsResponse>(_FindRettsstiftelseIdsForIdentsResponse_QNAME, FindRettsstiftelseIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorettslagIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findBorettslagIdsForIdentsResponse")
    public JAXBElement<FindBorettslagIdsForIdentsResponse> createFindBorettslagIdsForIdentsResponse(FindBorettslagIdsForIdentsResponse value) {
        return new JAXBElement<FindBorettslagIdsForIdentsResponse>(_FindBorettslagIdsForIdentsResponse_QNAME, FindBorettslagIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIdentsForIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findIdentsForIdsResponse")
    public JAXBElement<FindIdentsForIdsResponse> createFindIdentsForIdsResponse(FindIdentsForIdsResponse value) {
        return new JAXBElement<FindIdentsForIdsResponse>(_FindIdentsForIdsResponse_QNAME, FindIdentsForIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDokumentIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findDokumentIdsForIdents")
    public JAXBElement<FindDokumentIdsForIdents> createFindDokumentIdsForIdents(FindDokumentIdsForIdents value) {
        return new JAXBElement<FindDokumentIdsForIdents>(_FindDokumentIdsForIdents_QNAME, FindDokumentIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorettslagsandelIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findBorettslagsandelIdsForIdents")
    public JAXBElement<FindBorettslagsandelIdsForIdents> createFindBorettslagsandelIdsForIdents(FindBorettslagsandelIdsForIdents value) {
        return new JAXBElement<FindBorettslagsandelIdsForIdents>(_FindBorettslagsandelIdsForIdents_QNAME, FindBorettslagsandelIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMatrikkelenhetIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findMatrikkelenhetIdsForIdents")
    public JAXBElement<FindMatrikkelenhetIdsForIdents> createFindMatrikkelenhetIdsForIdents(FindMatrikkelenhetIdsForIdents value) {
        return new JAXBElement<FindMatrikkelenhetIdsForIdents>(_FindMatrikkelenhetIdsForIdents_QNAME, FindMatrikkelenhetIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKommuneIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findKommuneIdsForIdents")
    public JAXBElement<FindKommuneIdsForIdents> createFindKommuneIdsForIdents(FindKommuneIdsForIdents value) {
        return new JAXBElement<FindKommuneIdsForIdents>(_FindKommuneIdsForIdents_QNAME, FindKommuneIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIdentsForIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findIdentsForIds")
    public JAXBElement<FindIdentsForIds> createFindIdentsForIds(FindIdentsForIds value) {
        return new JAXBElement<FindIdentsForIds>(_FindIdentsForIds_QNAME, FindIdentsForIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKommuneIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findKommuneIdsForIdentsResponse")
    public JAXBElement<FindKommuneIdsForIdentsResponse> createFindKommuneIdsForIdentsResponse(FindKommuneIdsForIdentsResponse value) {
        return new JAXBElement<FindKommuneIdsForIdentsResponse>(_FindKommuneIdsForIdentsResponse_QNAME, FindKommuneIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterenhetsrettIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRegisterenhetsrettIdsForIdentsResponse")
    public JAXBElement<FindRegisterenhetsrettIdsForIdentsResponse> createFindRegisterenhetsrettIdsForIdentsResponse(FindRegisterenhetsrettIdsForIdentsResponse value) {
        return new JAXBElement<FindRegisterenhetsrettIdsForIdentsResponse>(_FindRegisterenhetsrettIdsForIdentsResponse_QNAME, FindRegisterenhetsrettIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMatrikkelenhetIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findMatrikkelenhetIdsForIdentsResponse")
    public JAXBElement<FindMatrikkelenhetIdsForIdentsResponse> createFindMatrikkelenhetIdsForIdentsResponse(FindMatrikkelenhetIdsForIdentsResponse value) {
        return new JAXBElement<FindMatrikkelenhetIdsForIdentsResponse>(_FindMatrikkelenhetIdsForIdentsResponse_QNAME, FindMatrikkelenhetIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findPersonIdsForIdents")
    public JAXBElement<FindPersonIdsForIdents> createFindPersonIdsForIdents(FindPersonIdsForIdents value) {
        return new JAXBElement<FindPersonIdsForIdents>(_FindPersonIdsForIdents_QNAME, FindPersonIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorettslagsandelIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findBorettslagsandelIdsForIdentsResponse")
    public JAXBElement<FindBorettslagsandelIdsForIdentsResponse> createFindBorettslagsandelIdsForIdentsResponse(FindBorettslagsandelIdsForIdentsResponse value) {
        return new JAXBElement<FindBorettslagsandelIdsForIdentsResponse>(_FindBorettslagsandelIdsForIdentsResponse_QNAME, FindBorettslagsandelIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegisterenhetIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRegisterenhetIdsForIdentsResponse")
    public JAXBElement<FindRegisterenhetIdsForIdentsResponse> createFindRegisterenhetIdsForIdentsResponse(FindRegisterenhetIdsForIdentsResponse value) {
        return new JAXBElement<FindRegisterenhetIdsForIdentsResponse>(_FindRegisterenhetIdsForIdentsResponse_QNAME, FindRegisterenhetIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonIdsForIdentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findPersonIdsForIdentsResponse")
    public JAXBElement<FindPersonIdsForIdentsResponse> createFindPersonIdsForIdentsResponse(FindPersonIdsForIdentsResponse value) {
        return new JAXBElement<FindPersonIdsForIdentsResponse>(_FindPersonIdsForIdentsResponse_QNAME, FindPersonIdsForIdentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorettslagIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findBorettslagIdsForIdents")
    public JAXBElement<FindBorettslagIdsForIdents> createFindBorettslagIdsForIdents(FindBorettslagIdsForIdents value) {
        return new JAXBElement<FindBorettslagIdsForIdents>(_FindBorettslagIdsForIdents_QNAME, FindBorettslagIdsForIdents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRettsstiftelseIdsForIdents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/ident", name = "findRettsstiftelseIdsForIdents")
    public JAXBElement<FindRettsstiftelseIdsForIdents> createFindRettsstiftelseIdsForIdents(FindRettsstiftelseIdsForIdents value) {
        return new JAXBElement<FindRettsstiftelseIdsForIdents>(_FindRettsstiftelseIdsForIdents_QNAME, FindRettsstiftelseIdsForIdents.class, null, value);
    }

}
