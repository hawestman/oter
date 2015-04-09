
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BoligtypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BrukstypeKodeId;


/**
 * <p>Java class for OmsattRegisterenhetsrett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmsattRegisterenhetsrett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="brukstypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}BrukstypeKodeId"/>
 *         &lt;element name="boligtypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}BoligtypeKodeId"/>
 *         &lt;element name="registerenhetsrettId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmsattRegisterenhetsrett", propOrder = {
    "brukstypeId",
    "boligtypeId",
    "registerenhetsrettId"
})
@XmlSeeAlso({
    OmsatteRegisterenhetsrettsandeler.class
})
public class OmsattRegisterenhetsrett
    extends EntityComponentWithHistory
{

    @XmlElement(required = true, nillable = true)
    protected BrukstypeKodeId brukstypeId;
    @XmlElement(required = true, nillable = true)
    protected BoligtypeKodeId boligtypeId;
    @XmlElement(required = true)
    protected RegisterenhetsrettId registerenhetsrettId;

    /**
     * Gets the value of the brukstypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BrukstypeKodeId }
     *     
     */
    public BrukstypeKodeId getBrukstypeId() {
        return brukstypeId;
    }

    /**
     * Sets the value of the brukstypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrukstypeKodeId }
     *     
     */
    public void setBrukstypeId(BrukstypeKodeId value) {
        this.brukstypeId = value;
    }

    /**
     * Gets the value of the boligtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BoligtypeKodeId }
     *     
     */
    public BoligtypeKodeId getBoligtypeId() {
        return boligtypeId;
    }

    /**
     * Sets the value of the boligtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoligtypeKodeId }
     *     
     */
    public void setBoligtypeId(BoligtypeKodeId value) {
        this.boligtypeId = value;
    }

    /**
     * Gets the value of the registerenhetsrettId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public RegisterenhetsrettId getRegisterenhetsrettId() {
        return registerenhetsrettId;
    }

    /**
     * Sets the value of the registerenhetsrettId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public void setRegisterenhetsrettId(RegisterenhetsrettId value) {
        this.registerenhetsrettId = value;
    }

}
