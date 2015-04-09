
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetIdent;


/**
 * <p>Java class for RegisterenhetsrettIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsrettIdent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdent">
 *       &lt;sequence>
 *         &lt;element name="registerenhetsrett" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerenhetIdent" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetIdent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsrettIdent", propOrder = {
    "registerenhetsrett",
    "registerenhetIdent"
})
public class RegisterenhetsrettIdent
    extends GrunnbokBubbleObjectIdent
{

    @XmlElement(required = true)
    protected String registerenhetsrett;
    @XmlElement(required = true)
    protected RegisterenhetIdent registerenhetIdent;

    /**
     * Gets the value of the registerenhetsrett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterenhetsrett() {
        return registerenhetsrett;
    }

    /**
     * Sets the value of the registerenhetsrett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterenhetsrett(String value) {
        this.registerenhetsrett = value;
    }

    /**
     * Gets the value of the registerenhetIdent property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetIdent }
     *     
     */
    public RegisterenhetIdent getRegisterenhetIdent() {
        return registerenhetIdent;
    }

    /**
     * Sets the value of the registerenhetIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetIdent }
     *     
     */
    public void setRegisterenhetIdent(RegisterenhetIdent value) {
        this.registerenhetIdent = value;
    }

}
