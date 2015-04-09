
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RegisterenhetIdTilRegisterenhetsrettsandelIdsMap;


/**
 * <p>Java class for findAndelerForRettighetshavereRegisterenhetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndelerForRettighetshavereRegisterenhetResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RegisterenhetIdTilRegisterenhetsrettsandelIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAndelerForRettighetshavereRegisterenhetResponse", propOrder = {
    "_return"
})
public class FindAndelerForRettighetshavereRegisterenhetResponse {

    @XmlElement(name = "return")
    protected RegisterenhetIdTilRegisterenhetsrettsandelIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public RegisterenhetIdTilRegisterenhetsrettsandelIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetIdTilRegisterenhetsrettsandelIdsMap }
     *     
     */
    public void setReturn(RegisterenhetIdTilRegisterenhetsrettsandelIdsMap value) {
        this._return = value;
    }

}
