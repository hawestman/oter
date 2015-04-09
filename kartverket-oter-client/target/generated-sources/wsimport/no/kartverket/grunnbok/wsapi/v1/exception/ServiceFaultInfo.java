
package no.kartverket.grunnbok.wsapi.v1.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFaultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFaultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{http://kartverket.no/grunnbok/wsapi/v1/exception}ExceptionProperties"/>
 *         &lt;element name="stackTraceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exceptionDetail" type="{http://kartverket.no/grunnbok/wsapi/v1/exception}ExceptionDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFaultInfo", propOrder = {
    "category",
    "properties",
    "stackTraceText",
    "exceptionDetail"
})
public class ServiceFaultInfo {

    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected ExceptionProperties properties;
    @XmlElement(required = true)
    protected String stackTraceText;
    @XmlElement(required = true)
    protected ExceptionDetail exceptionDetail;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionProperties }
     *     
     */
    public ExceptionProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionProperties }
     *     
     */
    public void setProperties(ExceptionProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the stackTraceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTraceText() {
        return stackTraceText;
    }

    /**
     * Sets the value of the stackTraceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTraceText(String value) {
        this.stackTraceText = value;
    }

    /**
     * Gets the value of the exceptionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionDetail }
     *     
     */
    public ExceptionDetail getExceptionDetail() {
        return exceptionDetail;
    }

    /**
     * Sets the value of the exceptionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionDetail }
     *     
     */
    public void setExceptionDetail(ExceptionDetail value) {
        this.exceptionDetail = value;
    }

}
