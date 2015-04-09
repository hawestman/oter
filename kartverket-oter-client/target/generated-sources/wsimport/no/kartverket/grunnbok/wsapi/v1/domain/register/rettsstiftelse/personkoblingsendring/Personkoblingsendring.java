
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;


/**
 * <p>Java class for Personkoblingsendring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Personkoblingsendring">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Rettsstiftelse">
 *       &lt;sequence>
 *         &lt;element name="tilId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId"/>
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
@XmlType(name = "Personkoblingsendring", propOrder = {
    "tilId",
    "fraIds"
})
public class Personkoblingsendring
    extends Rettsstiftelse
{

    @XmlElement(required = true)
    protected PersonId tilId;
    @XmlElement(required = true)
    protected PersonIdList fraIds;

    /**
     * Gets the value of the tilId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getTilId() {
        return tilId;
    }

    /**
     * Sets the value of the tilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setTilId(PersonId value) {
        this.tilId = value;
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
