
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIdList;


/**
 * <p>Java class for HeftelseIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeftelseIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heftelseIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIdList"/>
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
@XmlType(name = "HeftelseIdListTransfer", propOrder = {
    "heftelseIds",
    "bubbleObjects"
})
public class HeftelseIdListTransfer {

    @XmlElement(required = true)
    protected HeftelseIdList heftelseIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the heftelseIds property.
     * 
     * @return
     *     possible object is
     *     {@link HeftelseIdList }
     *     
     */
    public HeftelseIdList getHeftelseIds() {
        return heftelseIds;
    }

    /**
     * Sets the value of the heftelseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeftelseIdList }
     *     
     */
    public void setHeftelseIds(HeftelseIdList value) {
        this.heftelseIds = value;
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
