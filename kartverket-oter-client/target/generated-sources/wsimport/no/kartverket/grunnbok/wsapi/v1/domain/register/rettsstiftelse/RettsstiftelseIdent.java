
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentIdent;


/**
 * <p>Java class for RettsstiftelseIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelseIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="rettsstiftelsesnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dokumentIdent" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/dokument}DokumentIdent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsstiftelseIdent", propOrder = {
    "rettsstiftelsesnummer",
    "dokumentIdent"
})
public class RettsstiftelseIdent
    extends GrunnbokBubbleObjectIdent
{

    protected int rettsstiftelsesnummer;
    @XmlElement(required = true)
    protected DokumentIdent dokumentIdent;

    /**
     * Gets the value of the rettsstiftelsesnummer property.
     * 
     */
    public int getRettsstiftelsesnummer() {
        return rettsstiftelsesnummer;
    }

    /**
     * Sets the value of the rettsstiftelsesnummer property.
     * 
     */
    public void setRettsstiftelsesnummer(int value) {
        this.rettsstiftelsesnummer = value;
    }

    /**
     * Gets the value of the dokumentIdent property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentIdent }
     *     
     */
    public DokumentIdent getDokumentIdent() {
        return dokumentIdent;
    }

    /**
     * Sets the value of the dokumentIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentIdent }
     *     
     */
    public void setDokumentIdent(DokumentIdent value) {
        this.dokumentIdent = value;
    }

}
