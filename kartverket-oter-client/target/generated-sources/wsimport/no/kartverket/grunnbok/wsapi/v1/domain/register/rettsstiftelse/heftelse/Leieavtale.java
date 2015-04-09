
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.BeloepForPeriode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Tidsperiode;


/**
 * <p>Java class for Leieavtale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leieavtale">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}AnnenRettighet">
 *       &lt;sequence>
 *         &lt;element name="leieFraDato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="leietid" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Tidsperiode"/>
 *         &lt;element name="leiebeloep" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}BeloepForPeriode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leieavtale", propOrder = {
    "leieFraDato",
    "leietid",
    "leiebeloep"
})
@XmlSeeAlso({
    Fremleieavtale.class
})
public class Leieavtale
    extends AnnenRettighet
{

    @XmlElement(required = true, nillable = true)
    protected LocalDate leieFraDato;
    @XmlElement(required = true, nillable = true)
    protected Tidsperiode leietid;
    @XmlElement(required = true, nillable = true)
    protected BeloepForPeriode leiebeloep;

    /**
     * Gets the value of the leieFraDato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getLeieFraDato() {
        return leieFraDato;
    }

    /**
     * Sets the value of the leieFraDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setLeieFraDato(LocalDate value) {
        this.leieFraDato = value;
    }

    /**
     * Gets the value of the leietid property.
     * 
     * @return
     *     possible object is
     *     {@link Tidsperiode }
     *     
     */
    public Tidsperiode getLeietid() {
        return leietid;
    }

    /**
     * Sets the value of the leietid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tidsperiode }
     *     
     */
    public void setLeietid(Tidsperiode value) {
        this.leietid = value;
    }

    /**
     * Gets the value of the leiebeloep property.
     * 
     * @return
     *     possible object is
     *     {@link BeloepForPeriode }
     *     
     */
    public BeloepForPeriode getLeiebeloep() {
        return leiebeloep;
    }

    /**
     * Sets the value of the leiebeloep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeloepForPeriode }
     *     
     */
    public void setLeiebeloep(BeloepForPeriode value) {
        this.leiebeloep = value;
    }

}
