
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.BorettslagIdentTilBorettslagIdMap;


/**
 * <p>Java class for findBorettslagIdsForIdentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBorettslagIdsForIdentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}BorettslagIdentTilBorettslagIdMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBorettslagIdsForIdentsResponse", propOrder = {
    "_return"
})
public class FindBorettslagIdsForIdentsResponse {

    @XmlElement(name = "return")
    protected BorettslagIdentTilBorettslagIdMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagIdentTilBorettslagIdMap }
     *     
     */
    public BorettslagIdentTilBorettslagIdMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagIdentTilBorettslagIdMap }
     *     
     */
    public void setReturn(BorettslagIdentTilBorettslagIdMap value) {
        this._return = value;
    }

}
