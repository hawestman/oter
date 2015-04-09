
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.PeriodeKodeId;


/**
 * <p>Java class for BeloepForPeriode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeloepForPeriode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}PeriodeKodeId"/>
 *         &lt;element name="beloep" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeloepForPeriode", propOrder = {
    "periodeId",
    "beloep"
})
public class BeloepForPeriode {

    @XmlElement(required = true)
    protected PeriodeKodeId periodeId;
    @XmlElement(required = true)
    protected Beloep beloep;

    /**
     * Gets the value of the periodeId property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodeKodeId }
     *     
     */
    public PeriodeKodeId getPeriodeId() {
        return periodeId;
    }

    /**
     * Sets the value of the periodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodeKodeId }
     *     
     */
    public void setPeriodeId(PeriodeKodeId value) {
        this.periodeId = value;
    }

    /**
     * Gets the value of the beloep property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getBeloep() {
        return beloep;
    }

    /**
     * Sets the value of the beloep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setBeloep(Beloep value) {
        this.beloep = value;
    }

}
