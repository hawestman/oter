
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsaksparagrafKodeId;


/**
 * <p>Java class for DelvisSletting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelvisSletting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="aarsaksparagrafId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}AarsaksparagrafKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelvisSletting", propOrder = {
    "aarsaksparagrafId"
})
public class DelvisSletting
    extends Rettsendring
{

    @XmlElement(required = true)
    protected AarsaksparagrafKodeId aarsaksparagrafId;

    /**
     * Gets the value of the aarsaksparagrafId property.
     * 
     * @return
     *     possible object is
     *     {@link AarsaksparagrafKodeId }
     *     
     */
    public AarsaksparagrafKodeId getAarsaksparagrafId() {
        return aarsaksparagrafId;
    }

    /**
     * Sets the value of the aarsaksparagrafId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AarsaksparagrafKodeId }
     *     
     */
    public void setAarsaksparagrafId(AarsaksparagrafKodeId value) {
        this.aarsaksparagrafId = value;
    }

}
