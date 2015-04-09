
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.RegisterenhetsendringIdList;


/**
 * <p>Java class for RegisterenhetsendringIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsendringIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerenhetsendringIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}RegisterenhetsendringIdList"/>
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
@XmlType(name = "RegisterenhetsendringIdListTransfer", propOrder = {
    "registerenhetsendringIds",
    "bubbleObjects"
})
public class RegisterenhetsendringIdListTransfer {

    @XmlElement(required = true)
    protected RegisterenhetsendringIdList registerenhetsendringIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the registerenhetsendringIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsendringIdList }
     *     
     */
    public RegisterenhetsendringIdList getRegisterenhetsendringIds() {
        return registerenhetsendringIds;
    }

    /**
     * Sets the value of the registerenhetsendringIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsendringIdList }
     *     
     */
    public void setRegisterenhetsendringIds(RegisterenhetsendringIdList value) {
        this.registerenhetsendringIds = value;
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
