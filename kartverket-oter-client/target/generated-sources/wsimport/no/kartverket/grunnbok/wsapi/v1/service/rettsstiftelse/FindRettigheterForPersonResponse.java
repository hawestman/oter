
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdList;


/**
 * <p>Java class for findRettigheterForPersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettigheterForPersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseIdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRettigheterForPersonResponse", propOrder = {
    "_return"
})
public class FindRettigheterForPersonResponse {

    @XmlElement(name = "return")
    protected RettsstiftelseIdList _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public RettsstiftelseIdList getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public void setReturn(RettsstiftelseIdList value) {
        this._return = value;
    }

}
