
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Omsetning;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;


/**
 * <p>Java class for OverdragelseAvRegisterenhetsrett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdragelseAvRegisterenhetsrett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Rettsstiftelse">
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
@XmlType(name = "OverdragelseAvRegisterenhetsrett", propOrder = {
    "omsetning"
})
public class OverdragelseAvRegisterenhetsrett
    extends Rettsstiftelse
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
