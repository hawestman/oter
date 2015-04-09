
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.BeloepList;


/**
 * <p>Java class for PrioritetsbestemmelseForIkkeTinglystDokument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrioritetsbestemmelseForIkkeTinglystDokument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="veketFor" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}BeloepList"/>
 *         &lt;element name="sidestiltMed" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}BeloepList"/>
 *         &lt;element name="rettighetshaverePersonIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrioritetsbestemmelseForIkkeTinglystDokument", propOrder = {
    "veketFor",
    "sidestiltMed",
    "rettighetshaverePersonIds"
})
public class PrioritetsbestemmelseForIkkeTinglystDokument
    extends Rettsendring
{

    @XmlElement(required = true)
    protected BeloepList veketFor;
    @XmlElement(required = true)
    protected BeloepList sidestiltMed;
    @XmlElement(required = true)
    protected PersonIdList rettighetshaverePersonIds;

    /**
     * Gets the value of the veketFor property.
     * 
     * @return
     *     possible object is
     *     {@link BeloepList }
     *     
     */
    public BeloepList getVeketFor() {
        return veketFor;
    }

    /**
     * Sets the value of the veketFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeloepList }
     *     
     */
    public void setVeketFor(BeloepList value) {
        this.veketFor = value;
    }

    /**
     * Gets the value of the sidestiltMed property.
     * 
     * @return
     *     possible object is
     *     {@link BeloepList }
     *     
     */
    public BeloepList getSidestiltMed() {
        return sidestiltMed;
    }

    /**
     * Sets the value of the sidestiltMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeloepList }
     *     
     */
    public void setSidestiltMed(BeloepList value) {
        this.sidestiltMed = value;
    }

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

}
