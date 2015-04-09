
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RettsstiftelseIdentTilRettsstiftelseIdMap;


/**
 * <p>Java class for findRettsstiftelseIdsForIdentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettsstiftelseIdsForIdentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RettsstiftelseIdentTilRettsstiftelseIdMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRettsstiftelseIdsForIdentsResponse", propOrder = {
    "_return"
})
public class FindRettsstiftelseIdsForIdentsResponse {

    @XmlElement(name = "return")
    protected RettsstiftelseIdentTilRettsstiftelseIdMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdentTilRettsstiftelseIdMap }
     *     
     */
    public RettsstiftelseIdentTilRettsstiftelseIdMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdentTilRettsstiftelseIdMap }
     *     
     */
    public void setReturn(RettsstiftelseIdentTilRettsstiftelseIdMap value) {
        this._return = value;
    }

}
