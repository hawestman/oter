
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;


/**
 * <p>Java class for BorettslagIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorettslagIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="borettslagnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorettslagIdent", propOrder = {
    "borettslagnummer"
})
public class BorettslagIdent
    extends GrunnbokBubbleObjectIdent
{

    @XmlElement(required = true)
    protected String borettslagnummer;

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

}
