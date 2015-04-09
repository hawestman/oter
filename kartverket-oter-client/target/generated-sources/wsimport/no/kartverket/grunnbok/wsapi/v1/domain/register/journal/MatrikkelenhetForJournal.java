
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrikkelenhetForJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrikkelenhetForJournal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}RegisterenhetForJournal">
 *       &lt;sequence>
 *         &lt;element name="kommunenummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gaardsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bruksnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="festenummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seksjonsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrikkelenhetForJournal", propOrder = {
    "kommunenummer",
    "gaardsnummer",
    "bruksnummer",
    "festenummer",
    "seksjonsnummer"
})
public class MatrikkelenhetForJournal
    extends RegisterenhetForJournal
{

    @XmlElement(required = true)
    protected String kommunenummer;
    protected int gaardsnummer;
    protected int bruksnummer;
    protected int festenummer;
    protected int seksjonsnummer;

    /**
     * Gets the value of the kommunenummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunenummer() {
        return kommunenummer;
    }

    /**
     * Sets the value of the kommunenummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunenummer(String value) {
        this.kommunenummer = value;
    }

    /**
     * Gets the value of the gaardsnummer property.
     * 
     */
    public int getGaardsnummer() {
        return gaardsnummer;
    }

    /**
     * Sets the value of the gaardsnummer property.
     * 
     */
    public void setGaardsnummer(int value) {
        this.gaardsnummer = value;
    }

    /**
     * Gets the value of the bruksnummer property.
     * 
     */
    public int getBruksnummer() {
        return bruksnummer;
    }

    /**
     * Sets the value of the bruksnummer property.
     * 
     */
    public void setBruksnummer(int value) {
        this.bruksnummer = value;
    }

    /**
     * Gets the value of the festenummer property.
     * 
     */
    public int getFestenummer() {
        return festenummer;
    }

    /**
     * Sets the value of the festenummer property.
     * 
     */
    public void setFestenummer(int value) {
        this.festenummer = value;
    }

    /**
     * Gets the value of the seksjonsnummer property.
     * 
     */
    public int getSeksjonsnummer() {
        return seksjonsnummer;
    }

    /**
     * Sets the value of the seksjonsnummer property.
     * 
     */
    public void setSeksjonsnummer(int value) {
        this.seksjonsnummer = value;
    }

}
