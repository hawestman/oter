
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;


/**
 * <p>Java class for Heftelse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Heftelse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Rettsstiftelse">
 *       &lt;sequence>
 *         &lt;element name="rettighetshaverePersonIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="rettighetshaverePersonHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="rettighetshavereRegisterenhetsrettIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Heftelse", propOrder = {
    "rettighetshaverePersonIds",
    "rettighetshaverePersonHistoriskIds",
    "rettighetshavereRegisterenhetsrettIds"
})
@XmlSeeAlso({
    HeftelseIAnnenRett.class,
    HeftelseIRegisterenhetsrett.class
})
public class Heftelse
    extends Rettsstiftelse
{

    @XmlElement(required = true)
    protected PersonIdList rettighetshaverePersonIds;
    @XmlElement(required = true)
    protected PersonIdList rettighetshaverePersonHistoriskIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettIdList rettighetshavereRegisterenhetsrettIds;

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

    /**
     * Gets the value of the rettighetshavereRegisterenhetsrettIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getRettighetshavereRegisterenhetsrettIds() {
        return rettighetshavereRegisterenhetsrettIds;
    }

    /**
     * Sets the value of the rettighetshavereRegisterenhetsrettIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setRettighetshavereRegisterenhetsrettIds(RegisterenhetsrettIdList value) {
        this.rettighetshavereRegisterenhetsrettIds = value;
    }

}
