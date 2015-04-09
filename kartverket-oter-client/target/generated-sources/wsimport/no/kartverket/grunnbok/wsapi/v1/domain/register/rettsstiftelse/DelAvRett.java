
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdList;


/**
 * <p>Java class for DelAvRett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelAvRett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="rettsstiftelseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseId"/>
 *         &lt;element name="begrensetTilRegisterenhetsrettsandelerIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList"/>
 *         &lt;element name="begrensetTilRegisterenhetsrettsandelerHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList"/>
 *         &lt;element name="begrensetTilRegisterenhetsretterIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList"/>
 *         &lt;element name="begrensetTilRegisterenhetsretterHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelAvRett", propOrder = {
    "rettsstiftelseId",
    "begrensetTilRegisterenhetsrettsandelerIds",
    "begrensetTilRegisterenhetsrettsandelerHistoriskIds",
    "begrensetTilRegisterenhetsretterIds",
    "begrensetTilRegisterenhetsretterHistoriskIds"
})
public class DelAvRett
    extends EntityComponentWithHistory
{

    @XmlElement(required = true)
    protected RettsstiftelseId rettsstiftelseId;
    @XmlElement(required = true)
    protected RegisterenhetsrettsandelIdList begrensetTilRegisterenhetsrettsandelerIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettsandelIdList begrensetTilRegisterenhetsrettsandelerHistoriskIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettIdList begrensetTilRegisterenhetsretterIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettIdList begrensetTilRegisterenhetsretterHistoriskIds;

    /**
     * Gets the value of the rettsstiftelseId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseId }
     *     
     */
    public RettsstiftelseId getRettsstiftelseId() {
        return rettsstiftelseId;
    }

    /**
     * Sets the value of the rettsstiftelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseId }
     *     
     */
    public void setRettsstiftelseId(RettsstiftelseId value) {
        this.rettsstiftelseId = value;
    }

    /**
     * Gets the value of the begrensetTilRegisterenhetsrettsandelerIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getBegrensetTilRegisterenhetsrettsandelerIds() {
        return begrensetTilRegisterenhetsrettsandelerIds;
    }

    /**
     * Sets the value of the begrensetTilRegisterenhetsrettsandelerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setBegrensetTilRegisterenhetsrettsandelerIds(RegisterenhetsrettsandelIdList value) {
        this.begrensetTilRegisterenhetsrettsandelerIds = value;
    }

    /**
     * Gets the value of the begrensetTilRegisterenhetsrettsandelerHistoriskIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getBegrensetTilRegisterenhetsrettsandelerHistoriskIds() {
        return begrensetTilRegisterenhetsrettsandelerHistoriskIds;
    }

    /**
     * Sets the value of the begrensetTilRegisterenhetsrettsandelerHistoriskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setBegrensetTilRegisterenhetsrettsandelerHistoriskIds(RegisterenhetsrettsandelIdList value) {
        this.begrensetTilRegisterenhetsrettsandelerHistoriskIds = value;
    }

    /**
     * Gets the value of the begrensetTilRegisterenhetsretterIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getBegrensetTilRegisterenhetsretterIds() {
        return begrensetTilRegisterenhetsretterIds;
    }

    /**
     * Sets the value of the begrensetTilRegisterenhetsretterIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setBegrensetTilRegisterenhetsretterIds(RegisterenhetsrettIdList value) {
        this.begrensetTilRegisterenhetsretterIds = value;
    }

    /**
     * Gets the value of the begrensetTilRegisterenhetsretterHistoriskIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getBegrensetTilRegisterenhetsretterHistoriskIds() {
        return begrensetTilRegisterenhetsretterHistoriskIds;
    }

    /**
     * Sets the value of the begrensetTilRegisterenhetsretterHistoriskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setBegrensetTilRegisterenhetsretterHistoriskIds(RegisterenhetsrettIdList value) {
        this.begrensetTilRegisterenhetsretterHistoriskIds = value;
    }

}
