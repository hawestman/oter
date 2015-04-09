
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.BeloepList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.DelAvRettList;


/**
 * <p>Java class for HeftelseIAnnenRett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeftelseIAnnenRett">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}Heftelse">
 *       &lt;sequence>
 *         &lt;element name="hefterI" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}DelAvRettList"/>
 *         &lt;element name="beloep" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}BeloepList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeftelseIAnnenRett", propOrder = {
    "hefterI",
    "beloep"
})
@XmlSeeAlso({
    TvangsforretningIRettighet.class,
    HeftelseIRettighet.class
})
public class HeftelseIAnnenRett
    extends Heftelse
{

    @XmlElement(required = true)
    protected DelAvRettList hefterI;
    @XmlElement(required = true)
    protected BeloepList beloep;

    /**
     * Gets the value of the hefterI property.
     * 
     * @return
     *     possible object is
     *     {@link DelAvRettList }
     *     
     */
    public DelAvRettList getHefterI() {
        return hefterI;
    }

    /**
     * Sets the value of the hefterI property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelAvRettList }
     *     
     */
    public void setHefterI(DelAvRettList value) {
        this.hefterI = value;
    }

    /**
     * Gets the value of the beloep property.
     * 
     * @return
     *     possible object is
     *     {@link BeloepList }
     *     
     */
    public BeloepList getBeloep() {
        return beloep;
    }

    /**
     * Sets the value of the beloep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeloepList }
     *     
     */
    public void setBeloep(BeloepList value) {
        this.beloep = value;
    }

}
