
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;


/**
 * <p>Java class for Andelseier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Andelseier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="rettighetshaverePersonIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="rettighetshaverePersonHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Andelseier", propOrder = {
    "rettighetshaverePersonIds",
    "rettighetshaverePersonHistoriskIds"
})
public class Andelseier
    extends Rettsendring
{

    @XmlElement(required = true)
    protected PersonIdList rettighetshaverePersonIds;
    @XmlElement(required = true)
    protected PersonIdList rettighetshaverePersonHistoriskIds;

    /**
     * Gets the value of the rettighetshaverePersonIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getRettighetshaverePersonIds() {
        return rettighetshaverePersonIds;
    }

    /**
     * Sets the value of the rettighetshaverePersonIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setRettighetshaverePersonIds(PersonIdList value) {
        this.rettighetshaverePersonIds = value;
    }

    /**
     * Gets the value of the rettighetshaverePersonHistoriskIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getRettighetshaverePersonHistoriskIds() {
        return rettighetshaverePersonHistoriskIds;
    }

    /**
     * Sets the value of the rettighetshaverePersonHistoriskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setRettighetshaverePersonHistoriskIds(PersonIdList value) {
        this.rettighetshaverePersonHistoriskIds = value;
    }

}
