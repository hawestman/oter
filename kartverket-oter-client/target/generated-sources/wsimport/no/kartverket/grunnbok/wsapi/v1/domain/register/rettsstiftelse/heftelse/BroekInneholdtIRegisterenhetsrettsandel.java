
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelId;


/**
 * <p>Java class for BroekInneholdtIRegisterenhetsrettsandel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BroekInneholdtIRegisterenhetsrettsandel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="teller" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nevner" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registerenhetsrettsandelId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroekInneholdtIRegisterenhetsrettsandel", propOrder = {
    "teller",
    "nevner",
    "registerenhetsrettsandelId"
})
public class BroekInneholdtIRegisterenhetsrettsandel
    extends EntityComponentWithHistory
{

    protected long teller;
    protected long nevner;
    @XmlElement(required = true)
    protected RegisterenhetsrettsandelId registerenhetsrettsandelId;

    /**
     * Gets the value of the teller property.
     * 
     */
    public long getTeller() {
        return teller;
    }

    /**
     * Sets the value of the teller property.
     * 
     */
    public void setTeller(long value) {
        this.teller = value;
    }

    /**
     * Gets the value of the nevner property.
     * 
     */
    public long getNevner() {
        return nevner;
    }

    /**
     * Sets the value of the nevner property.
     * 
     */
    public void setNevner(long value) {
        this.nevner = value;
    }

    /**
     * Gets the value of the registerenhetsrettsandelId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public RegisterenhetsrettsandelId getRegisterenhetsrettsandelId() {
        return registerenhetsrettsandelId;
    }

    /**
     * Sets the value of the registerenhetsrettsandelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelId }
     *     
     */
    public void setRegisterenhetsrettsandelId(RegisterenhetsrettsandelId value) {
        this.registerenhetsrettsandelId = value;
    }

}
