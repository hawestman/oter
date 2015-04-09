
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Beloep;


/**
 * <p>Java class for VilkaarIFestekontrakt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VilkaarIFestekontrakt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIRegisterenhetsrett">
 *       &lt;sequence>
 *         &lt;element name="festeFraDato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="festetidIAntallAar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aarligFesteavgift" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *         &lt;element name="tomteverdi" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VilkaarIFestekontrakt", propOrder = {
    "festeFraDato",
    "festetidIAntallAar",
    "aarligFesteavgift",
    "tomteverdi"
})
public class VilkaarIFestekontrakt
    extends HeftelseIRegisterenhetsrett
{

    @XmlElement(required = true, nillable = true)
    protected LocalDate festeFraDato;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer festetidIAntallAar;
    @XmlElement(required = true, nillable = true)
    protected Beloep aarligFesteavgift;
    @XmlElement(required = true, nillable = true)
    protected Beloep tomteverdi;

    /**
     * Gets the value of the festeFraDato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFesteFraDato() {
        return festeFraDato;
    }

    /**
     * Sets the value of the festeFraDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFesteFraDato(LocalDate value) {
        this.festeFraDato = value;
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
     * Gets the value of the tomteverdi property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getTomteverdi() {
        return tomteverdi;
    }

    /**
     * Sets the value of the tomteverdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setTomteverdi(Beloep value) {
        this.tomteverdi = value;
    }

}
