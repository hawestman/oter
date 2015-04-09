
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Beloep;


/**
 * <p>Java class for NyeVilkaarIFestekontrakt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NyeVilkaarIFestekontrakt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="aarligFesteavgift" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *         &lt;element name="festetidIAntallAar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NyeVilkaarIFestekontrakt", propOrder = {
    "aarligFesteavgift",
    "festetidIAntallAar"
})
public class NyeVilkaarIFestekontrakt
    extends Rettsendring
{

    @XmlElement(required = true, nillable = true)
    protected Beloep aarligFesteavgift;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer festetidIAntallAar;

    /**
     * Gets the value of the aarligFesteavgift property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getAarligFesteavgift() {
        return aarligFesteavgift;
    }

    /**
     * Sets the value of the aarligFesteavgift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setAarligFesteavgift(Beloep value) {
        this.aarligFesteavgift = value;
    }

    /**
     * Gets the value of the festetidIAntallAar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFestetidIAntallAar() {
        return festetidIAntallAar;
    }

    /**
     * Sets the value of the festetidIAntallAar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFestetidIAntallAar(Integer value) {
        this.festetidIAntallAar = value;
    }

}
