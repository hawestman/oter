
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelId;


/**
 * <p>Java class for OverfoeringFraTil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverfoeringFraTil">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="fraRegisterenhetsrettId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettId"/>
 *         &lt;element name="tilRegisterenhetsrettId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettId"/>
 *         &lt;element name="fraRegisterenhetsrettsandelId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelId"/>
 *         &lt;element name="tilRegisterenhetsrettsandelId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverfoeringFraTil", propOrder = {
    "fraRegisterenhetsrettId",
    "tilRegisterenhetsrettId",
    "fraRegisterenhetsrettsandelId",
    "tilRegisterenhetsrettsandelId"
})
public class OverfoeringFraTil
    extends EntityComponentWithHistory
{

    @XmlElement(required = true, nillable = true)
    protected RegisterenhetsrettId fraRegisterenhetsrettId;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetsrettId tilRegisterenhetsrettId;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetsrettsandelId fraRegisterenhetsrettsandelId;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetsrettsandelId tilRegisterenhetsrettsandelId;

    /**
     * Gets the value of the fraRegisterenhetsrettId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public RegisterenhetsrettId getFraRegisterenhetsrettId() {
        return fraRegisterenhetsrettId;
    }

    /**
     * Sets the value of the fraRegisterenhetsrettId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public void setFraRegisterenhetsrettId(RegisterenhetsrettId value) {
        this.fraRegisterenhetsrettId = value;
    }

    /**
     * Gets the value of the tilRegisterenhetsrettId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public RegisterenhetsrettId getTilRegisterenhetsrettId() {
        return tilRegisterenhetsrettId;
    }

    /**
     * Sets the value of the tilRegisterenhetsrettId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public void setTilRegisterenhetsrettId(RegisterenhetsrettId value) {
        this.tilRegisterenhetsrettId = value;
    }

    /**
     * Gets the value of the fraRegisterenhetsrettsandelId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public RegisterenhetsrettsandelId getFraRegisterenhetsrettsandelId() {
        return fraRegisterenhetsrettsandelId;
    }

    /**
     * Sets the value of the fraRegisterenhetsrettsandelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public void setFraRegisterenhetsrettsandelId(RegisterenhetsrettsandelId value) {
        this.fraRegisterenhetsrettsandelId = value;
    }

    /**
     * Gets the value of the tilRegisterenhetsrettsandelId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public RegisterenhetsrettsandelId getTilRegisterenhetsrettsandelId() {
        return tilRegisterenhetsrettsandelId;
    }

    /**
     * Sets the value of the tilRegisterenhetsrettsandelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public void setTilRegisterenhetsrettsandelId(RegisterenhetsrettsandelId value) {
        this.tilRegisterenhetsrettsandelId = value;
    }

}
