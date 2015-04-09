
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelIdList;


/**
 * <p>Java class for Seksjonssameieendring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seksjonssameieendring">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}Registerenhetsendring">
 *       &lt;sequence>
 *         &lt;element name="utgaatteIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelIdList"/>
 *         &lt;element name="nyeIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelIdList"/>
 *         &lt;element name="utgaatteForTilpassingAvBroekIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelIdList"/>
 *         &lt;element name="nyeForTilpassingAvBroekIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seksjonssameieendring", propOrder = {
    "utgaatteIds",
    "nyeIds",
    "utgaatteForTilpassingAvBroekIds",
    "nyeForTilpassingAvBroekIds"
})
public class Seksjonssameieendring
    extends Registerenhetsendring
{

    @XmlElement(required = true)
    protected SeksjonssameieandelIdList utgaatteIds;
    @XmlElement(required = true)
    protected SeksjonssameieandelIdList nyeIds;
    @XmlElement(required = true)
    protected SeksjonssameieandelIdList utgaatteForTilpassingAvBroekIds;
    @XmlElement(required = true)
    protected SeksjonssameieandelIdList nyeForTilpassingAvBroekIds;

    /**
     * Gets the value of the utgaatteIds property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public SeksjonssameieandelIdList getUtgaatteIds() {
        return utgaatteIds;
    }

    /**
     * Sets the value of the utgaatteIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public void setUtgaatteIds(SeksjonssameieandelIdList value) {
        this.utgaatteIds = value;
    }

    /**
     * Gets the value of the nyeIds property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public SeksjonssameieandelIdList getNyeIds() {
        return nyeIds;
    }

    /**
     * Sets the value of the nyeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public void setNyeIds(SeksjonssameieandelIdList value) {
        this.nyeIds = value;
    }

    /**
     * Gets the value of the utgaatteForTilpassingAvBroekIds property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public SeksjonssameieandelIdList getUtgaatteForTilpassingAvBroekIds() {
        return utgaatteForTilpassingAvBroekIds;
    }

    /**
     * Sets the value of the utgaatteForTilpassingAvBroekIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public void setUtgaatteForTilpassingAvBroekIds(SeksjonssameieandelIdList value) {
        this.utgaatteForTilpassingAvBroekIds = value;
    }

    /**
     * Gets the value of the nyeForTilpassingAvBroekIds property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public SeksjonssameieandelIdList getNyeForTilpassingAvBroekIds() {
        return nyeForTilpassingAvBroekIds;
    }

    /**
     * Sets the value of the nyeForTilpassingAvBroekIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public void setNyeForTilpassingAvBroekIds(SeksjonssameieandelIdList value) {
        this.nyeForTilpassingAvBroekIds = value;
    }

}
