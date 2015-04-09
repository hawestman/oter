
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for HeftelseIRettighetIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeftelseIRettighetIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIRettighetId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeftelseIRettighetIdInverseRelation", propOrder = {
    "cachedValue"
})
public class HeftelseIRettighetIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected HeftelseIRettighetId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link HeftelseIRettighetId }
     *     
     */
    public HeftelseIRettighetId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeftelseIRettighetId }
     *     
     */
    public void setCachedValue(HeftelseIRettighetId value) {
        this.cachedValue = value;
    }

}
