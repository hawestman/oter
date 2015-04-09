
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;


/**
 * <p>Java class for AnmerkningPaaPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnmerkningPaaPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/anmerkning}Anmerkning">
 *       &lt;sequence>
 *         &lt;element name="bostyrer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anmerketPersonId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnmerkningPaaPerson", propOrder = {
    "bostyrer",
    "anmerketPersonId"
})
public class AnmerkningPaaPerson
    extends Anmerkning
{

    @XmlElement(required = true, nillable = true)
    protected String bostyrer;
    @XmlElement(required = true)
    protected PersonId anmerketPersonId;

    /**
     * Gets the value of the bostyrer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBostyrer() {
        return bostyrer;
    }

    /**
     * Sets the value of the bostyrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBostyrer(String value) {
        this.bostyrer = value;
    }

    /**
     * Gets the value of the anmerketPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getAnmerketPersonId() {
        return anmerketPersonId;
    }

    /**
     * Sets the value of the anmerketPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setAnmerketPersonId(PersonId value) {
        this.anmerketPersonId = value;
    }

}
