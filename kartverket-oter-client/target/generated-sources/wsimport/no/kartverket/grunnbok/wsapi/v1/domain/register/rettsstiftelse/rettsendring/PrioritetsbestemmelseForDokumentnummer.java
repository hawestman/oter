
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdList;


/**
 * <p>Java class for PrioritetsbestemmelseForDokumentnummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrioritetsbestemmelseForDokumentnummer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="veketForIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseIdList"/>
 *         &lt;element name="sidestiltMedIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrioritetsbestemmelseForDokumentnummer", propOrder = {
    "veketForIds",
    "sidestiltMedIds"
})
public class PrioritetsbestemmelseForDokumentnummer
    extends Rettsendring
{

    @XmlElement(required = true)
    protected RettsstiftelseIdList veketForIds;
    @XmlElement(required = true)
    protected RettsstiftelseIdList sidestiltMedIds;

    /**
     * Gets the value of the veketForIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public RettsstiftelseIdList getVeketForIds() {
        return veketForIds;
    }

    /**
     * Sets the value of the veketForIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public void setVeketForIds(RettsstiftelseIdList value) {
        this.veketForIds = value;
    }

    /**
     * Gets the value of the sidestiltMedIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public RettsstiftelseIdList getSidestiltMedIds() {
        return sidestiltMedIds;
    }

    /**
     * Sets the value of the sidestiltMedIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public void setSidestiltMedIds(RettsstiftelseIdList value) {
        this.sidestiltMedIds = value;
    }

}
