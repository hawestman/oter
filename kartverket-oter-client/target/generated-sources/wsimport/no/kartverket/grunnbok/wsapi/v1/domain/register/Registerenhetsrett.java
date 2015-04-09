
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RegisterenhetsrettstypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetId;


/**
 * <p>Java class for Registerenhetsrett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registerenhetsrett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="registerenhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetId"/>
 *         &lt;element name="registerenhetsrettstypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RegisterenhetsrettstypeKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registerenhetsrett", propOrder = {
    "registerenhetId",
    "registerenhetsrettstypeId"
})
public class Registerenhetsrett
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected RegisterenhetId registerenhetId;
    @XmlElement(required = true)
    protected RegisterenhetsrettstypeKodeId registerenhetsrettstypeId;

    /**
     * Gets the value of the registerenhetId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetId }
     *     
     */
    public RegisterenhetId getRegisterenhetId() {
        return registerenhetId;
    }

    /**
     * Sets the value of the registerenhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetId }
     *     
     */
    public void setRegisterenhetId(RegisterenhetId value) {
        this.registerenhetId = value;
    }

    /**
     * Gets the value of the registerenhetsrettstypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettstypeKodeId }
     *     
     */
    public RegisterenhetsrettstypeKodeId getRegisterenhetsrettstypeId() {
        return registerenhetsrettstypeId;
    }

    /**
     * Sets the value of the registerenhetsrettstypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettstypeKodeId }
     *     
     */
    public void setRegisterenhetsrettstypeId(RegisterenhetsrettstypeKodeId value) {
        this.registerenhetsrettstypeId = value;
    }

}
