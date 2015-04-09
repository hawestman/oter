
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feilkode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feilkodebeskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationException", propOrder = {
    "feilkode",
    "feilkodebeskrivelse",
    "message"
})
public class ValidationException {

    protected String feilkode;
    protected String feilkodebeskrivelse;
    protected String message;

    /**
     * Gets the value of the feilkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilkode() {
        return feilkode;
    }

    /**
     * Sets the value of the feilkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilkode(String value) {
        this.feilkode = value;
    }

    /**
     * Gets the value of the feilkodebeskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilkodebeskrivelse() {
        return feilkodebeskrivelse;
    }

    /**
     * Sets the value of the feilkodebeskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilkodebeskrivelse(String value) {
        this.feilkodebeskrivelse = value;
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

}
