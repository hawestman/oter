
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdList;


/**
 * <p>Java class for RettsstiftelseIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelseIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rettsstiftelseIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseIdList"/>
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
@XmlType(name = "RettsstiftelseIdListTransfer", propOrder = {
    "rettsstiftelseIds",
    "bubbleObjects"
})
public class RettsstiftelseIdListTransfer {

    @XmlElement(required = true)
    protected RettsstiftelseIdList rettsstiftelseIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the rettsstiftelseIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public RettsstiftelseIdList getRettsstiftelseIds() {
        return rettsstiftelseIds;
    }

    /**
     * Sets the value of the rettsstiftelseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public void setRettsstiftelseIds(RettsstiftelseIdList value) {
        this.rettsstiftelseIds = value;
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
