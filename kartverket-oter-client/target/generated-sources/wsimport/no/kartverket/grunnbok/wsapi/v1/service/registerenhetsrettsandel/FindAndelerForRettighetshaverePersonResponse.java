
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.PersonIdTilRegisterenhetsrettsandelIdsMap;


/**
 * <p>Java class for findAndelerForRettighetshaverePersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndelerForRettighetshaverePersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}PersonIdTilRegisterenhetsrettsandelIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAndelerForRettighetshaverePersonResponse", propOrder = {
    "_return"
})
public class FindAndelerForRettighetshaverePersonResponse {

    @XmlElement(name = "return")
    protected PersonIdTilRegisterenhetsrettsandelIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public PersonIdTilRegisterenhetsrettsandelIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public void setReturn(PersonIdTilRegisterenhetsrettsandelIdsMap value) {
        this._return = value;
    }

}
