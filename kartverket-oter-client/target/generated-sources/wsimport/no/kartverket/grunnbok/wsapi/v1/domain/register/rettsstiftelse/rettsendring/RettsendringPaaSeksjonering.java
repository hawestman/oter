
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Omsetning;


/**
 * <p>Java class for RettsendringPaaSeksjonering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsendringPaaSeksjonering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="omsetning" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Omsetning"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsendringPaaSeksjonering", propOrder = {
    "omsetning"
})
public class RettsendringPaaSeksjonering
    extends Rettsendring
{

    @XmlElement(required = true)
    protected Omsetning omsetning;

    /**
     * Gets the value of the omsetning property.
     * 
     * @return
     *     possible object is
     *     {@link Omsetning }
     *     
     */
    public Omsetning getOmsetning() {
        return omsetning;
    }

    /**
     * Sets the value of the omsetning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Omsetning }
     *     
     */
    public void setOmsetning(Omsetning value) {
        this.omsetning = value;
    }

}
