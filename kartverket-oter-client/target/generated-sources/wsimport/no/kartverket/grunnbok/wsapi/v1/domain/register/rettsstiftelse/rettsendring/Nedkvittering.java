
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.BeloepList;


/**
 * <p>Java class for Nedkvittering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nedkvittering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="beloepNedkvittertTil" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}BeloepList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nedkvittering", propOrder = {
    "beloepNedkvittertTil"
})
public class Nedkvittering
    extends Rettsendring
{

    @XmlElement(required = true)
    protected BeloepList beloepNedkvittertTil;

    /**
     * Gets the value of the beloepNedkvittertTil property.
     * 
     * @return
     *     possible object is
     *     {@link BeloepList }
     *     
     */
    public BeloepList getBeloepNedkvittertTil() {
        return beloepNedkvittertTil;
    }

    /**
     * Sets the value of the beloepNedkvittertTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeloepList }
     *     
     */
    public void setBeloepNedkvittertTil(BeloepList value) {
        this.beloepNedkvittertTil = value;
    }

}
