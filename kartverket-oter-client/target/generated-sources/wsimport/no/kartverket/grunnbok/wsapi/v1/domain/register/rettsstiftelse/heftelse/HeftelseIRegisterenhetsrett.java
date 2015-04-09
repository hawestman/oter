
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdList;


/**
 * <p>Java class for HeftelseIRegisterenhetsrett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeftelseIRegisterenhetsrett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}Heftelse">
 *       &lt;sequence>
 *         &lt;element name="hefterIRegisterenhetsretterIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList"/>
 *         &lt;element name="hefterIRegisterenhetsretterHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList"/>
 *         &lt;element name="hefterIRegisterenhetsrettsandeler" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}BroekInneholdtIRegisterenhetsrettsandelList"/>
 *         &lt;element name="hefterIRegisterenhetsrettsandelerHistorisk" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}BroekInneholdtIRegisterenhetsrettsandelList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeftelseIRegisterenhetsrett", propOrder = {
    "hefterIRegisterenhetsretterIds",
    "hefterIRegisterenhetsretterHistoriskIds",
    "hefterIRegisterenhetsrettsandeler",
    "hefterIRegisterenhetsrettsandelerHistorisk"
})
@XmlSeeAlso({
    Servitutt.class,
    VilkaarIFestekontrakt.class,
    HeftelseMedBeloep.class,
    ServituttPengeheftelse.class,
    AnnenRettighet.class,
    Avtale.class
})
public class HeftelseIRegisterenhetsrett
    extends Heftelse
{

    @XmlElement(required = true)
    protected RegisterenhetsrettIdList hefterIRegisterenhetsretterIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettIdList hefterIRegisterenhetsretterHistoriskIds;
    @XmlElement(required = true)
    protected BroekInneholdtIRegisterenhetsrettsandelList hefterIRegisterenhetsrettsandeler;
    @XmlElement(required = true)
    protected BroekInneholdtIRegisterenhetsrettsandelList hefterIRegisterenhetsrettsandelerHistorisk;

    /**
     * Gets the value of the hefterIRegisterenhetsretterIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getHefterIRegisterenhetsretterIds() {
        return hefterIRegisterenhetsretterIds;
    }

    /**
     * Sets the value of the hefterIRegisterenhetsretterIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setHefterIRegisterenhetsretterIds(RegisterenhetsrettIdList value) {
        this.hefterIRegisterenhetsretterIds = value;
    }

    /**
     * Gets the value of the hefterIRegisterenhetsretterHistoriskIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getHefterIRegisterenhetsretterHistoriskIds() {
        return hefterIRegisterenhetsretterHistoriskIds;
    }

    /**
     * Sets the value of the hefterIRegisterenhetsretterHistoriskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setHefterIRegisterenhetsretterHistoriskIds(RegisterenhetsrettIdList value) {
        this.hefterIRegisterenhetsretterHistoriskIds = value;
    }

    /**
     * Gets the value of the hefterIRegisterenhetsrettsandeler property.
     * 
     * @return
     *     possible object is
     *     {@link BroekInneholdtIRegisterenhetsrettsandelList }
     *     
     */
    public BroekInneholdtIRegisterenhetsrettsandelList getHefterIRegisterenhetsrettsandeler() {
        return hefterIRegisterenhetsrettsandeler;
    }

    /**
     * Sets the value of the hefterIRegisterenhetsrettsandeler property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroekInneholdtIRegisterenhetsrettsandelList }
     *     
     */
    public void setHefterIRegisterenhetsrettsandeler(BroekInneholdtIRegisterenhetsrettsandelList value) {
        this.hefterIRegisterenhetsrettsandeler = value;
    }

    /**
     * Gets the value of the hefterIRegisterenhetsrettsandelerHistorisk property.
     * 
     * @return
     *     possible object is
     *     {@link BroekInneholdtIRegisterenhetsrettsandelList }
     *     
     */
    public BroekInneholdtIRegisterenhetsrettsandelList getHefterIRegisterenhetsrettsandelerHistorisk() {
        return hefterIRegisterenhetsrettsandelerHistorisk;
    }

    /**
     * Sets the value of the hefterIRegisterenhetsrettsandelerHistorisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroekInneholdtIRegisterenhetsrettsandelList }
     *     
     */
    public void setHefterIRegisterenhetsrettsandelerHistorisk(BroekInneholdtIRegisterenhetsrettsandelList value) {
        this.hefterIRegisterenhetsrettsandelerHistorisk = value;
    }

}
