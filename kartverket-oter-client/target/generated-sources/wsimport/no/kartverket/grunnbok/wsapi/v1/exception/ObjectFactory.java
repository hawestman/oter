
package no.kartverket.grunnbok.wsapi.v1.exception;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.exception package. 
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

    private final static QName _ServiceException_QNAME = new QName("http://kartverket.no/grunnbok/wsapi/v1/exception", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.exception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionProperties }
     * 
     */
    public ExceptionProperties createExceptionProperties() {
        return new ExceptionProperties();
    }

    /**
     * Create an instance of {@link ServiceFaultInfo }
     * 
     */
    public ServiceFaultInfo createServiceFaultInfo() {
        return new ServiceFaultInfo();
    }

    /**
     * Create an instance of {@link ExceptionDetail }
     * 
     */
    public ExceptionDetail createExceptionDetail() {
        return new ExceptionDetail();
    }

    /**
     * Create an instance of {@link StackTraceElementList }
     * 
     */
    public StackTraceElementList createStackTraceElementList() {
        return new StackTraceElementList();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link ExceptionProperties.Entry }
     * 
     */
    public ExceptionProperties.Entry createExceptionPropertiesEntry() {
        return new ExceptionProperties.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kartverket.no/grunnbok/wsapi/v1/exception", name = "ServiceException")
    public JAXBElement<ServiceFaultInfo> createServiceException(ServiceFaultInfo value) {
        return new JAXBElement<ServiceFaultInfo>(_ServiceException_QNAME, ServiceFaultInfo.class, null, value);
    }

}
