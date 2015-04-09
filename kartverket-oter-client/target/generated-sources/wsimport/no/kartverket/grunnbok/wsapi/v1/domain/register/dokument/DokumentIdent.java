
package no.kartverket.grunnbok.wsapi.v1.domain.register.dokument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;


/**
 * <p>Java class for DokumentIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="dokumentnummer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dokumentaar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="embetenummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentIdent", propOrder = {
    "dokumentnummer",
    "dokumentaar",
    "embetenummer"
})
public class DokumentIdent
    extends GrunnbokBubbleObjectIdent
{

    protected long dokumentnummer;
    protected int dokumentaar;
    @XmlElement(required = true)
    protected String embetenummer;

    /**
     * Gets the value of the dokumentnummer property.
     * 
     */
    public long getDokumentnummer() {
        return dokumentnummer;
    }

    /**
     * Sets the value of the dokumentnummer property.
     * 
     */
    public void setDokumentnummer(long value) {
        this.dokumentnummer = value;
    }

    /**
     * Gets the value of the dokumentaar property.
     * 
     */
    public int getDokumentaar() {
        return dokumentaar;
    }

    /**
     * Sets the value of the dokumentaar property.
     * 
     */
    public void setDokumentaar(int value) {
        this.dokumentaar = value;
    }

    /**
     * Gets the value of the embetenummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbetenummer() {
        return embetenummer;
    }

    /**
     * Sets the value of the embetenummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbetenummer(String value) {
        this.embetenummer = value;
    }

}
