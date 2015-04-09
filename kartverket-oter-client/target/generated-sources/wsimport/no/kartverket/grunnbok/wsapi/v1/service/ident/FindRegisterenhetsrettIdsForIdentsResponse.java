
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.RegisterenhetsrettIdentTilRegisterenhetsrettId;


/**
 * <p>Java class for findRegisterenhetsrettIdsForIdentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRegisterenhetsrettIdsForIdentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/service/servicetyper}RegisterenhetsrettIdentTilRegisterenhetsrettId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRegisterenhetsrettIdsForIdentsResponse", propOrder = {
    "_return"
})
public class FindRegisterenhetsrettIdsForIdentsResponse {

    @XmlElement(name = "return")
    protected RegisterenhetsrettIdentTilRegisterenhetsrettId _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdentTilRegisterenhetsrettId }
     *     
     */
    public RegisterenhetsrettIdentTilRegisterenhetsrettId getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdentTilRegisterenhetsrettId }
     *     
     */
    public void setReturn(RegisterenhetsrettIdentTilRegisterenhetsrettId value) {
        this._return = value;
    }

}
