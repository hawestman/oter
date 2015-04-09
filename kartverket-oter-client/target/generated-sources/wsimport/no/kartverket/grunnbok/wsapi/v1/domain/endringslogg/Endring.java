
package no.kartverket.grunnbok.wsapi.v1.domain.endringslogg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObject;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectId;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.Timestamp;


/**
 * <p>Java class for Endring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Endring">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObject">
 *       &lt;sequence>
 *         &lt;element name="endringstidspunkt" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *         &lt;element name="endringstype" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/endringslogg}Endringstype"/>
 *         &lt;element name="endretBubbleId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endring", propOrder = {
    "endringstidspunkt",
    "endringstype",
    "endretBubbleId"
})
public class Endring
    extends GrunnbokBubbleObject
{

    @XmlElement(required = true)
    protected Timestamp endringstidspunkt;
    @XmlElement(required = true)
    protected Endringstype endringstype;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectId endretBubbleId;

    /**
     * Gets the value of the endringstidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getEndringstidspunkt() {
        return endringstidspunkt;
    }

    /**
     * Sets the value of the endringstidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setEndringstidspunkt(Timestamp value) {
        this.endringstidspunkt = value;
    }

    /**
     * Gets the value of the endringstype property.
     * 
     * @return
     *     possible object is
     *     {@link Endringstype }
     *     
     */
    public Endringstype getEndringstype() {
        return endringstype;
    }

    /**
     * Sets the value of the endringstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endringstype }
     *     
     */
    public void setEndringstype(Endringstype value) {
        this.endringstype = value;
    }

    /**
     * Gets the value of the endretBubbleId property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectId }
     *     
     */
    public GrunnbokBubbleObjectId getEndretBubbleId() {
        return endretBubbleId;
    }

    /**
     * Sets the value of the endretBubbleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectId }
     *     
     */
    public void setEndretBubbleId(GrunnbokBubbleObjectId value) {
        this.endretBubbleId = value;
    }

}
