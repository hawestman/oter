
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for RettsstiftelseSaksbehandlingIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelseSaksbehandlingIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}RettsstiftelseSaksbehandlingIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsstiftelseSaksbehandlingIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class RettsstiftelseSaksbehandlingIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected RettsstiftelseSaksbehandlingIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseSaksbehandlingIdList }
     *     
     */
    public RettsstiftelseSaksbehandlingIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseSaksbehandlingIdList }
     *     
     */
    public void setCachedValue(RettsstiftelseSaksbehandlingIdList value) {
        this.cachedValue = value;
    }

}
