
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for PersonkoblingsendringIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonkoblingsendringIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/personkoblingsendring}PersonkoblingsendringId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonkoblingsendringIdInverseRelation", propOrder = {
    "cachedValue"
})
public class PersonkoblingsendringIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected PersonkoblingsendringId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonkoblingsendringId }
     *     
     */
    public PersonkoblingsendringId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonkoblingsendringId }
     *     
     */
    public void setCachedValue(PersonkoblingsendringId value) {
        this.cachedValue = value;
    }

}
