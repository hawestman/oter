
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.AvholdtTvangsforretning;


/**
 * <p>Java class for NotertTvangspant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotertTvangspant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}NotertPant">
 *       &lt;sequence>
 *         &lt;element name="avholdtTvangsforretning" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}AvholdtTvangsforretning"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotertTvangspant", propOrder = {
    "avholdtTvangsforretning"
})
public class NotertTvangspant
    extends NotertPant
{

    @XmlElement(required = true)
    protected AvholdtTvangsforretning avholdtTvangsforretning;

    /**
     * Gets the value of the avholdtTvangsforretning property.
     * 
     * @return
     *     possible object is
     *     {@link AvholdtTvangsforretning }
     *     
     */
    public AvholdtTvangsforretning getAvholdtTvangsforretning() {
        return avholdtTvangsforretning;
    }

    /**
     * Sets the value of the avholdtTvangsforretning property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvholdtTvangsforretning }
     *     
     */
    public void setAvholdtTvangsforretning(AvholdtTvangsforretning value) {
        this.avholdtTvangsforretning = value;
    }

}
