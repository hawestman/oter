
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for TinglysingPaaNyIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TinglysingPaaNyIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}TinglysingPaaNyId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TinglysingPaaNyIdInverseRelation", propOrder = {
    "cachedValue"
})
public class TinglysingPaaNyIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected TinglysingPaaNyId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link TinglysingPaaNyId }
     *     
     */
    public TinglysingPaaNyId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TinglysingPaaNyId }
     *     
     */
    public void setCachedValue(TinglysingPaaNyId value) {
        this.cachedValue = value;
    }

}
