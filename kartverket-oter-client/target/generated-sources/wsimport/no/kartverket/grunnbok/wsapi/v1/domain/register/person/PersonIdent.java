
package no.kartverket.grunnbok.wsapi.v1.domain.register.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;


/**
 * <p>Java class for PersonIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="identifikasjonsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdent", propOrder = {
    "identifikasjonsnummer"
})
public class PersonIdent
    extends GrunnbokBubbleObjectIdent
{

    @XmlElement(required = true)
    protected String identifikasjonsnummer;

    /**
     * Gets the value of the identifikasjonsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifikasjonsnummer() {
        return identifikasjonsnummer;
    }

    /**
     * Sets the value of the identifikasjonsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifikasjonsnummer(String value) {
        this.identifikasjonsnummer = value;
    }

}
