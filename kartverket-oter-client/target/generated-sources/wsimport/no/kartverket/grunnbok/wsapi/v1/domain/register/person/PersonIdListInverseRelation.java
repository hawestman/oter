
package no.kartverket.grunnbok.wsapi.v1.domain.register.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for PersonIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class PersonIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected PersonIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setCachedValue(PersonIdList value) {
        this.cachedValue = value;
    }

}
