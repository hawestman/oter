
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}PrioritetsbestemmelseForIkkeTinglystDokumentIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected PrioritetsbestemmelseForIkkeTinglystDokumentIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link PrioritetsbestemmelseForIkkeTinglystDokumentIdList }
     *     
     */
    public PrioritetsbestemmelseForIkkeTinglystDokumentIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrioritetsbestemmelseForIkkeTinglystDokumentIdList }
     *     
     */
    public void setCachedValue(PrioritetsbestemmelseForIkkeTinglystDokumentIdList value) {
        this.cachedValue = value;
    }

}
