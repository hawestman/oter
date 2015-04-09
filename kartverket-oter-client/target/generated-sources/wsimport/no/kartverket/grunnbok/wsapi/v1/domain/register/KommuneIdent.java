
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;


/**
 * <p>Java class for KommuneIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KommuneIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="kommunenummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KommuneIdent", propOrder = {
    "kommunenummer"
})
public class KommuneIdent
    extends GrunnbokBubbleObjectIdent
{

    @XmlElement(required = true)
    protected String kommunenummer;

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

}
