
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap;


/**
 * <p>Java class for findAndelerIRetterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndelerIRetterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAndelerIRetterResponse", propOrder = {
    "_return"
})
public class FindAndelerIRetterResponse {

    @XmlElement(name = "return")
    protected RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public void setReturn(RegisterenhetsrettIdTilRegisterenhetsrettsandelIdsMap value) {
        this._return = value;
    }

}
