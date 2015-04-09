
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;


/**
 * <p>Java class for Transport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="tilIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="fraIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = {
    "tilIds",
    "fraIds"
})
public class Transport
    extends Rettsendring
{

    @XmlElement(required = true)
    protected PersonIdList tilIds;
    @XmlElement(required = true)
    protected PersonIdList fraIds;

    /**
     * Gets the value of the tilIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getTilIds() {
        return tilIds;
    }

    /**
     * Sets the value of the tilIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setTilIds(PersonIdList value) {
        this.tilIds = value;
    }

    /**
     * Gets the value of the fraIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getFraIds() {
        return fraIds;
    }

    /**
     * Sets the value of the fraIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setFraIds(PersonIdList value) {
        this.fraIds = value;
    }

}
