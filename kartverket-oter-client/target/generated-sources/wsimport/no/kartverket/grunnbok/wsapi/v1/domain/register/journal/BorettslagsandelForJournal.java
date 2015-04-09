
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorettslagsandelForJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorettslagsandelForJournal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}RegisterenhetForJournal">
 *       &lt;sequence>
 *         &lt;element name="borettslagnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="andelsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorettslagsandelForJournal", propOrder = {
    "borettslagnummer",
    "andelsnummer"
})
public class BorettslagsandelForJournal
    extends RegisterenhetForJournal
{

    @XmlElement(required = true)
    protected String borettslagnummer;
    protected int andelsnummer;

    /**
     * Gets the value of the borettslagnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorettslagnummer() {
        return borettslagnummer;
    }

    /**
     * Sets the value of the borettslagnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorettslagnummer(String value) {
        this.borettslagnummer = value;
    }

    /**
     * Gets the value of the andelsnummer property.
     * 
     */
    public int getAndelsnummer() {
        return andelsnummer;
    }

    /**
     * Sets the value of the andelsnummer property.
     * 
     */
    public void setAndelsnummer(int value) {
        this.andelsnummer = value;
    }

}
