
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrettIdList;


/**
 * <p>Java class for OverdragelseAvRegisterenhetsrettIdListTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdragelseAvRegisterenhetsrettIdListTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overdragelseIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/overdragelse}OverdragelseAvRegisterenhetsrettIdList"/>
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
@XmlType(name = "OverdragelseAvRegisterenhetsrettIdListTransfer", propOrder = {
    "overdragelseIds",
    "bubbleObjects"
})
public class OverdragelseAvRegisterenhetsrettIdListTransfer {

    @XmlElement(required = true)
    protected OverdragelseAvRegisterenhetsrettIdList overdragelseIds;
    @XmlElement(required = true)
    protected GrunnbokBubbleObjectList bubbleObjects;

    /**
     * Gets the value of the overdragelseIds property.
     * 
     * @return
     *     possible object is
     *     {@link OverdragelseAvRegisterenhetsrettIdList }
     *     
     */
    public OverdragelseAvRegisterenhetsrettIdList getOverdragelseIds() {
        return overdragelseIds;
    }

    /**
     * Sets the value of the overdragelseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdragelseAvRegisterenhetsrettIdList }
     *     
     */
    public void setOverdragelseIds(OverdragelseAvRegisterenhetsrettIdList value) {
        this.overdragelseIds = value;
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
