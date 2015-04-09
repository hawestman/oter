
package no.kartverket.grunnbok.wsapi.v1.service.store;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.service.store package. 
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

    private final static QName _GetVersions_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getVersions");
    private final static QName _GetVersionsForListResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getVersionsForListResponse");
    private final static QName _GetObjectsIgnoreMissingResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObjectsIgnoreMissingResponse");
    private final static QName _GetVersionsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getVersionsResponse");
    private final static QName _GetObjects_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObjects");
    private final static QName _GetObject_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObject");
    private final static QName _GetObjectsResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObjectsResponse");
    private final static QName _GetObjectsIgnoreMissing_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObjectsIgnoreMissing");
    private final static QName _GetObjectResponse_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getObjectResponse");
    private final static QName _GetVersionsForList_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/service/store", "getVersionsForList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.service.store
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObjects }
     * 
     */
    public GetObjects createGetObjects() {
        return new GetObjects();
    }

    /**
     * Create an instance of {@link GetVersionsResponse }
     * 
     */
    public GetVersionsResponse createGetVersionsResponse() {
        return new GetVersionsResponse();
    }

    /**
     * Create an instance of {@link GetObjectsIgnoreMissingResponse }
     * 
     */
    public GetObjectsIgnoreMissingResponse createGetObjectsIgnoreMissingResponse() {
        return new GetObjectsIgnoreMissingResponse();
    }

    /**
     * Create an instance of {@link GetVersionsForListResponse }
     * 
     */
    public GetVersionsForListResponse createGetVersionsForListResponse() {
        return new GetVersionsForListResponse();
    }

    /**
     * Create an instance of {@link GetVersions }
     * 
     */
    public GetVersions createGetVersions() {
        return new GetVersions();
    }

    /**
     * Create an instance of {@link GetVersionsForList }
     * 
     */
    public GetVersionsForList createGetVersionsForList() {
        return new GetVersionsForList();
    }

    /**
     * Create an instance of {@link GetObjectResponse }
     * 
     */
    public GetObjectResponse createGetObjectResponse() {
        return new GetObjectResponse();
    }

    /**
     * Create an instance of {@link GetObjectsIgnoreMissing }
     * 
     */
    public GetObjectsIgnoreMissing createGetObjectsIgnoreMissing() {
        return new GetObjectsIgnoreMissing();
    }

    /**
     * Create an instance of {@link GetObjectsResponse }
     * 
     */
    public GetObjectsResponse createGetObjectsResponse() {
        return new GetObjectsResponse();
    }

    /**
     * Create an instance of {@link GetObject }
     * 
     */
    public GetObject createGetObject() {
        return new GetObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getVersions")
    public JAXBElement<GetVersions> createGetVersions(GetVersions value) {
        return new JAXBElement<GetVersions>(_GetVersions_QNAME, GetVersions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionsForListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getVersionsForListResponse")
    public JAXBElement<GetVersionsForListResponse> createGetVersionsForListResponse(GetVersionsForListResponse value) {
        return new JAXBElement<GetVersionsForListResponse>(_GetVersionsForListResponse_QNAME, GetVersionsForListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsIgnoreMissingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObjectsIgnoreMissingResponse")
    public JAXBElement<GetObjectsIgnoreMissingResponse> createGetObjectsIgnoreMissingResponse(GetObjectsIgnoreMissingResponse value) {
        return new JAXBElement<GetObjectsIgnoreMissingResponse>(_GetObjectsIgnoreMissingResponse_QNAME, GetObjectsIgnoreMissingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getVersionsResponse")
    public JAXBElement<GetVersionsResponse> createGetVersionsResponse(GetVersionsResponse value) {
        return new JAXBElement<GetVersionsResponse>(_GetVersionsResponse_QNAME, GetVersionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObjects")
    public JAXBElement<GetObjects> createGetObjects(GetObjects value) {
        return new JAXBElement<GetObjects>(_GetObjects_QNAME, GetObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObject")
    public JAXBElement<GetObject> createGetObject(GetObject value) {
        return new JAXBElement<GetObject>(_GetObject_QNAME, GetObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObjectsResponse")
    public JAXBElement<GetObjectsResponse> createGetObjectsResponse(GetObjectsResponse value) {
        return new JAXBElement<GetObjectsResponse>(_GetObjectsResponse_QNAME, GetObjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsIgnoreMissing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObjectsIgnoreMissing")
    public JAXBElement<GetObjectsIgnoreMissing> createGetObjectsIgnoreMissing(GetObjectsIgnoreMissing value) {
        return new JAXBElement<GetObjectsIgnoreMissing>(_GetObjectsIgnoreMissing_QNAME, GetObjectsIgnoreMissing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getObjectResponse")
    public JAXBElement<GetObjectResponse> createGetObjectResponse(GetObjectResponse value) {
        return new JAXBElement<GetObjectResponse>(_GetObjectResponse_QNAME, GetObjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionsForList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/service/store", name = "getVersionsForList")
    public JAXBElement<GetVersionsForList> createGetVersionsForList(GetVersionsForList value) {
        return new JAXBElement<GetVersionsForList>(_GetVersionsForList_QNAME, GetVersionsForList.class, null, value);
    }

}
