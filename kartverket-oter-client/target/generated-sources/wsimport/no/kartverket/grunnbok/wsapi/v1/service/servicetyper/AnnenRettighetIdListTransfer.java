
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.AnnenRettighetIdList;


/**
 * <p>Java class for AnnenRettighetIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnenRettighetIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annenRettighetIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}AnnenRettighetIdList"/>
 *         &lt;element name="bubbleObjects" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnenRettighetIdListTransfer", propOrder = {
    "annenRettighetIds",
    "bubbleObjects"
})
public class AnnenRettighetIdListTransfer {

    @XmlElement(required = true)
    protected AnnenRettighetIdList annenRettighetIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the annenRettighetIds property.
     * 
     * @return
     *     possible object is
     *     {@link AnnenRettighetIdList }
     *     
     */
    public AnnenRettighetIdList getAnnenRettighetIds() {
        return annenRettighetIds;
    }

    /**
     * Sets the value of the annenRettighetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnenRettighetIdList }
     *     
     */
    public void setAnnenRettighetIds(AnnenRettighetIdList value) {
        this.annenRettighetIds = value;
    }

    /**
     * Gets the value of the bubbleObjects property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectList }
     *     
     */
    public GrunnbokBubbleObjectList getBubbleObjects() {
        return bubbleObjects;
    }

    /**
     * Sets the value of the bubbleObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectList }
     *     
     */
    public void setBubbleObjects(GrunnbokBubbleObjectList value) {
        this.bubbleObjects = value;
    }

}
