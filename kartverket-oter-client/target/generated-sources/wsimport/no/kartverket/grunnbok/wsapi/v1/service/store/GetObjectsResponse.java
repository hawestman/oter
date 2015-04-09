
package no.kartverket.grunnbok.wsapi.v1.service.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectList;


/**
 * <p>Java class for getObjectsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getObjectsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectsResponse", propOrder = {
    "_return"
})
public class GetObjectsResponse {

    @XmlElement(name = "return")
    protected GrunnbokBubbleObjectList _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectList }
     *     
     */
    public GrunnbokBubbleObjectList getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectList }
     *     
     */
    public void setReturn(GrunnbokBubbleObjectList value) {
        this._return = value;
    }

}
