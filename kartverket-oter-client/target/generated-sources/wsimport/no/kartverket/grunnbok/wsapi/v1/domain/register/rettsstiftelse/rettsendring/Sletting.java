
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsaksparagrafKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;


/**
 * <p>Java class for Sletting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sletting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="aarsaksparagrafId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}AarsaksparagrafKodeId"/>
 *         &lt;element name="prokuraUtstederId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sletting", propOrder = {
    "aarsaksparagrafId",
    "prokuraUtstederId"
})
public class Sletting
    extends Rettsendring
{

    @XmlElement(required = true, nillable = true)
    protected AarsaksparagrafKodeId aarsaksparagrafId;
    @XmlElement(required = true, nillable = true)
    protected PersonId prokuraUtstederId;

    /**
     * Gets the value of the aarsaksparagrafId property.
     * 
     * @return
     *     possible object is
     *     {@link AarsaksparagrafKodeId }
     *     
     */
    public AarsaksparagrafKodeId getAarsaksparagrafId() {
        return aarsaksparagrafId;
    }

    /**
     * Sets the value of the aarsaksparagrafId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AarsaksparagrafKodeId }
     *     
     */
    public void setAarsaksparagrafId(AarsaksparagrafKodeId value) {
        this.aarsaksparagrafId = value;
    }

    /**
     * Gets the value of the prokuraUtstederId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getProkuraUtstederId() {
        return prokuraUtstederId;
    }

    /**
     * Sets the value of the prokuraUtstederId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setProkuraUtstederId(PersonId value) {
        this.prokuraUtstederId = value;
    }

}
