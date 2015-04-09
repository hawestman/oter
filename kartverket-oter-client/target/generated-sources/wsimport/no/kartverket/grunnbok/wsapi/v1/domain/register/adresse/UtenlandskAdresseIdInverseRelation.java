
package no.kartverket.grunnbok.wsapi.v1.domain.register.adresse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for UtenlandskAdresseIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtenlandskAdresseIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/adresse}UtenlandskAdresseId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtenlandskAdresseIdInverseRelation", propOrder = {
    "cachedValue"
})
public class UtenlandskAdresseIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected UtenlandskAdresseId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link UtenlandskAdresseId }
     *     
     */
    public UtenlandskAdresseId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtenlandskAdresseId }
     *     
     */
    public void setCachedValue(UtenlandskAdresseId value) {
        this.cachedValue = value;
    }

}
