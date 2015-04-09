
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.ServituttIdList;


/**
 * <p>Java class for ServituttIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServituttIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servituttIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}ServituttIdList"/>
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
@XmlType(name = "ServituttIdListTransfer", propOrder = {
    "servituttIds",
    "bubbleObjects"
})
public class ServituttIdListTransfer {

    @XmlElement(required = true)
    protected ServituttIdList servituttIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the servituttIds property.
     * 
     * @return
     *     possible object is
     *     {@link ServituttIdList }
     *     
     */
    public ServituttIdList getServituttIds() {
        return servituttIds;
    }

    /**
     * Sets the value of the servituttIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServituttIdList }
     *     
     */
    public void setServituttIds(ServituttIdList value) {
        this.servituttIds = value;
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
