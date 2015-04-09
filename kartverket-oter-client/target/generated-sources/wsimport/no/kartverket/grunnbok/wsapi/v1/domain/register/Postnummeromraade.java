
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;


/**
 * <p>Java class for Postnummeromraade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Postnummeromraade">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="postnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poststednavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Postnummeromraade", propOrder = {
    "postnummer",
    "poststednavn"
})
public class Postnummeromraade
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected String postnummer;
    @XmlElement(required = true)
    protected String poststednavn;

    /**
     * Gets the value of the postnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostnummer() {
        return postnummer;
    }

    /**
     * Sets the value of the postnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostnummer(String value) {
        this.postnummer = value;
    }

    /**
     * Gets the value of the poststednavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoststednavn() {
        return poststednavn;
    }

    /**
     * Sets the value of the poststednavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoststednavn(String value) {
        this.poststednavn = value;
    }

}
