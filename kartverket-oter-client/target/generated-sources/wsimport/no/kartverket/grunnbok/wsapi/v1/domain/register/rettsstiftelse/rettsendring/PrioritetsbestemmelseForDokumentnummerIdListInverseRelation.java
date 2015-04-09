
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for PrioritetsbestemmelseForDokumentnummerIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrioritetsbestemmelseForDokumentnummerIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}PrioritetsbestemmelseForDokumentnummerIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrioritetsbestemmelseForDokumentnummerIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class PrioritetsbestemmelseForDokumentnummerIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected PrioritetsbestemmelseForDokumentnummerIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link PrioritetsbestemmelseForDokumentnummerIdList }
     *     
     */
    public PrioritetsbestemmelseForDokumentnummerIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrioritetsbestemmelseForDokumentnummerIdList }
     *     
     */
    public void setCachedValue(PrioritetsbestemmelseForDokumentnummerIdList value) {
        this.cachedValue = value;
    }

}
