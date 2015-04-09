
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelIdList;


/**
 * <p>Java class for Borettslagsandelsendring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Borettslagsandelsendring">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}Registerenhetsendring">
 *       &lt;sequence>
 *         &lt;element name="borettslagId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}BorettslagId"/>
 *         &lt;element name="fraIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelIdList"/>
 *         &lt;element name="tilIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Borettslagsandelsendring", propOrder = {
    "borettslagId",
    "fraIds",
    "tilIds"
})
public class Borettslagsandelsendring
    extends Registerenhetsendring
{

    @XmlElement(required = true, nillable = true)
    protected BorettslagId borettslagId;
    @XmlElement(required = true)
    protected BorettslagsandelIdList fraIds;
    @XmlElement(required = true)
    protected BorettslagsandelIdList tilIds;

    /**
     * Gets the value of the borettslagId property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagId }
     *     
     */
    public BorettslagId getBorettslagId() {
        return borettslagId;
    }

    /**
     * Sets the value of the borettslagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagId }
     *     
     */
    public void setBorettslagId(BorettslagId value) {
        this.borettslagId = value;
    }

    /**
     * Gets the value of the fraIds property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagsandelIdList }
     *     
     */
    public BorettslagsandelIdList getFraIds() {
        return fraIds;
    }

    /**
     * Sets the value of the fraIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagsandelIdList }
     *     
     */
    public void setFraIds(BorettslagsandelIdList value) {
        this.fraIds = value;
    }

    /**
     * Gets the value of the tilIds property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagsandelIdList }
     *     
     */
    public BorettslagsandelIdList getTilIds() {
        return tilIds;
    }

    /**
     * Sets the value of the tilIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagsandelIdList }
     *     
     */
    public void setTilIds(BorettslagsandelIdList value) {
        this.tilIds = value;
    }

}
