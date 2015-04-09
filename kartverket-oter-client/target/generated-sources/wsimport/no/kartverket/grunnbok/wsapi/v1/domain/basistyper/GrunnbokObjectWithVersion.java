
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrunnbokObjectWithVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokObjectWithVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObject">
 *       &lt;sequence>
 *         &lt;element name="oppdateringsdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokObjectWithVersion", propOrder = {
    "oppdateringsdato"
})
@XmlSeeAlso({
    GrunnbokObjectWithHistory.class
})
public class GrunnbokObjectWithVersion
    extends GrunnbokBubbleObject
{

    @XmlElement(required = true, nillable = true)
    protected Timestamp oppdateringsdato;

    /**
     * Gets the value of the oppdateringsdato property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getOppdateringsdato() {
        return oppdateringsdato;
    }

    /**
     * Sets the value of the oppdateringsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setOppdateringsdato(Timestamp value) {
        this.oppdateringsdato = value;
    }

}
