
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for OverdragelseAvRegisterenhetsrettIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdragelseAvRegisterenhetsrettIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/overdragelse}OverdragelseAvRegisterenhetsrettIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdragelseAvRegisterenhetsrettIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class OverdragelseAvRegisterenhetsrettIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected OverdragelseAvRegisterenhetsrettIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link OverdragelseAvRegisterenhetsrettIdList }
     *     
     */
    public OverdragelseAvRegisterenhetsrettIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdragelseAvRegisterenhetsrettIdList }
     *     
     */
    public void setCachedValue(OverdragelseAvRegisterenhetsrettIdList value) {
        this.cachedValue = value;
    }

}
