
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap;


/**
 * <p>Java class for findRettsstiftelsestypeKoderForRettstypeKoderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettsstiftelsestypeKoderForRettstypeKoderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRettsstiftelsestypeKoderForRettstypeKoderResponse", propOrder = {
    "_return"
})
public class FindRettsstiftelsestypeKoderForRettstypeKoderResponse {

    @XmlElement(name = "return")
    protected RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap }
     *     
     */
    public RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap }
     *     
     */
    public void setReturn(RettstypeKodeIdTilRettsstiftelsestypeKodeIdsMap value) {
        this._return = value;
    }

}
