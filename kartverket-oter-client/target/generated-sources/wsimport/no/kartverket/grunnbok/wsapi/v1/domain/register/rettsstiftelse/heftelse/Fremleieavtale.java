
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fremleieavtale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fremleieavtale">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}Leieavtale">
 *       &lt;sequence>
 *         &lt;element name="fremleieavtaleForId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}AnnenRettighetId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fremleieavtale", propOrder = {
    "fremleieavtaleForId"
})
public class Fremleieavtale
    extends Leieavtale
{

    @XmlElement(required = true)
    protected AnnenRettighetId fremleieavtaleForId;

    /**
     * Gets the value of the fremleieavtaleForId property.
     * 
     * @return
     *     possible object is
     *     {@link AnnenRettighetId }
     *     
     */
    public AnnenRettighetId getFremleieavtaleForId() {
        return fremleieavtaleForId;
    }

    /**
     * Sets the value of the fremleieavtaleForId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnenRettighetId }
     *     
     */
    public void setFremleieavtaleForId(AnnenRettighetId value) {
        this.fremleieavtaleForId = value;
    }

}
