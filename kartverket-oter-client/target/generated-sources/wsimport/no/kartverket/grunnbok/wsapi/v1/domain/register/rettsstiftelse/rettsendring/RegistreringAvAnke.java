
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for RegistreringAvAnke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringAvAnke">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="nektet" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="oversendtLagmannsretten" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringAvAnke", propOrder = {
    "nektet",
    "oversendtLagmannsretten"
})
public class RegistreringAvAnke
    extends Rettsendring
{

    @XmlElement(required = true, nillable = true)
    protected LocalDate nektet;
    @XmlElement(required = true, nillable = true)
    protected LocalDate oversendtLagmannsretten;

    /**
     * Gets the value of the nektet property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getNektet() {
        return nektet;
    }

    /**
     * Sets the value of the nektet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setNektet(LocalDate value) {
        this.nektet = value;
    }

    /**
     * Gets the value of the oversendtLagmannsretten property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getOversendtLagmannsretten() {
        return oversendtLagmannsretten;
    }

    /**
     * Sets the value of the oversendtLagmannsretten property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setOversendtLagmannsretten(LocalDate value) {
        this.oversendtLagmannsretten = value;
    }

}
