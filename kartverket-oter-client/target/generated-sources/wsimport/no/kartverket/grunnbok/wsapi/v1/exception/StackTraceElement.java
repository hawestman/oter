
package no.kartverket.grunnbok.wsapi.v1.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StackTraceElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StackTraceElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="declaringClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StackTraceElement", propOrder = {
    "declaringClass",
    "methodName",
    "fileName",
    "lineNumber"
})
public class StackTraceElement {

    @XmlElement(required = true)
    protected String declaringClass;
    @XmlElement(required = true)
    protected String methodName;
    @XmlElement(required = true, nillable = true)
    protected String fileName;
    protected int lineNumber;

    /**
     * Gets the value of the declaringClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaringClass() {
        return declaringClass;
    }

    /**
     * Sets the value of the declaringClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaringClass(String value) {
        this.declaringClass = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

}
