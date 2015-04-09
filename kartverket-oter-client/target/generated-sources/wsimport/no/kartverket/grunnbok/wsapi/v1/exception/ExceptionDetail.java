
package no.kartverket.grunnbok.wsapi.v1.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cause" type="{http://kartverket.no/grunnbok/wsapi/v1/exception}ExceptionDetail"/>
 *         &lt;element name="stackTraceElements" type="{http://kartverket.no/grunnbok/wsapi/v1/exception}StackTraceElementList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionDetail", propOrder = {
    "className",
    "message",
    "cause",
    "stackTraceElements"
})
public class ExceptionDetail {

    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true, nillable = true)
    protected ExceptionDetail cause;
    @XmlElement(required = true)
    protected StackTraceElementList stackTraceElements;

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionDetail }
     *     
     */
    public ExceptionDetail getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionDetail }
     *     
     */
    public void setCause(ExceptionDetail value) {
        this.cause = value;
    }

    /**
     * Gets the value of the stackTraceElements property.
     * 
     * @return
     *     possible object is
     *     {@link StackTraceElementList }
     *     
     */
    public StackTraceElementList getStackTraceElements() {
        return stackTraceElements;
    }

    /**
     * Sets the value of the stackTraceElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link StackTraceElementList }
     *     
     */
    public void setStackTraceElements(StackTraceElementList value) {
        this.stackTraceElements = value;
    }

}
