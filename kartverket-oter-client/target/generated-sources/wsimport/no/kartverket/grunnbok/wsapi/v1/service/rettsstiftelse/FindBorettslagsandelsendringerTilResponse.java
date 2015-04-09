
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RegisterenhetIdTilBorettslagsandelsendringIdsMap;


/**
 * <p>Java class for findBorettslagsandelsendringerTilResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBorettslagsandelsendringerTilResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RegisterenhetIdTilBorettslagsandelsendringIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBorettslagsandelsendringerTilResponse", propOrder = {
    "_return"
})
public class FindBorettslagsandelsendringerTilResponse {

    @XmlElement(name = "return")
    protected RegisterenhetIdTilBorettslagsandelsendringIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetIdTilBorettslagsandelsendringIdsMap }
     *     
     */
    public RegisterenhetIdTilBorettslagsandelsendringIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetIdTilBorettslagsandelsendringIdsMap }
     *     
     */
    public void setReturn(RegisterenhetIdTilBorettslagsandelsendringIdsMap value) {
        this._return = value;
    }

}
