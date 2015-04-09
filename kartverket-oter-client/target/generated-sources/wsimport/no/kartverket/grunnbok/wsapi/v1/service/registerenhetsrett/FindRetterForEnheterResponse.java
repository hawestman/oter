
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrett;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RegisterenhetIdTilRegisterenhetsrettIdsMap;


/**
 * <p>Java class for findRetterForEnheterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRetterForEnheterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RegisterenhetIdTilRegisterenhetsrettIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRetterForEnheterResponse", propOrder = {
    "_return"
})
public class FindRetterForEnheterResponse {

    @XmlElement(name = "return")
    protected RegisterenhetIdTilRegisterenhetsrettIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetIdTilRegisterenhetsrettIdsMap }
     *     
     */
    public RegisterenhetIdTilRegisterenhetsrettIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetIdTilRegisterenhetsrettIdsMap }
     *     
     */
    public void setReturn(RegisterenhetIdTilRegisterenhetsrettIdsMap value) {
        this._return = value;
    }

}
