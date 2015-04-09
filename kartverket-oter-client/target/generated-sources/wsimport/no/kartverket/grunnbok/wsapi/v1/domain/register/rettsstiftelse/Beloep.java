
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ValutakodeKodeId;


/**
 * <p>Java class for Beloep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beloep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valutakodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}ValutakodeKodeId"/>
 *         &lt;element name="beloepsverdi" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="beloepstekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beloep", propOrder = {
    "valutakodeId",
    "beloepsverdi",
    "beloepstekst"
})
public class Beloep {

    @XmlElement(required = true)
    protected ValutakodeKodeId valutakodeId;
    @XmlElement(required = true)
    protected BigDecimal beloepsverdi;
    @XmlElement(required = true, nillable = true)
    protected String beloepstekst;

    /**
     * Gets the value of the valutakodeId property.
     * 
     * @return
     *     possible object is
     *     {@link ValutakodeKodeId }
     *     
     */
    public ValutakodeKodeId getValutakodeId() {
        return valutakodeId;
    }

    /**
     * Sets the value of the valutakodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValutakodeKodeId }
     *     
     */
    public void setValutakodeId(ValutakodeKodeId value) {
        this.valutakodeId = value;
    }

    /**
     * Gets the value of the beloepsverdi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeloepsverdi() {
        return beloepsverdi;
    }

    /**
     * Sets the value of the beloepsverdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeloepsverdi(BigDecimal value) {
        this.beloepsverdi = value;
    }

    /**
     * Gets the value of the beloepstekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeloepstekst() {
        return beloepstekst;
    }

    /**
     * Sets the value of the beloepstekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeloepstekst(String value) {
        this.beloepstekst = value;
    }

}
