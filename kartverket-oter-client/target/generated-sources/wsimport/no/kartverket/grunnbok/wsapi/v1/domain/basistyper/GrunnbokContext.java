
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrunnbokContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="snapshotVersion" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokContext", propOrder = {
    "apiVersion",
    "clientIdentification",
    "locale",
    "snapshotVersion"
})
public class GrunnbokContext {

    @XmlElement(required = true)
    protected String apiVersion;
    @XmlElement(required = true)
    protected String clientIdentification;
    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected Timestamp snapshotVersion;

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the clientIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentification() {
        return clientIdentification;
    }

    /**
     * Sets the value of the clientIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentification(String value) {
        this.clientIdentification = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the snapshotVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getSnapshotVersion() {
        return snapshotVersion;
    }

    /**
     * Sets the value of the snapshotVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setSnapshotVersion(Timestamp value) {
        this.snapshotVersion = value;
    }

}
