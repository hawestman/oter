
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.PeriodeKodeId;


/**
 * <p>Java class for Tidsperiode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tidsperiode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}PeriodeKodeId"/>
 *         &lt;element name="lengde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tidsperiode", propOrder = {
    "periodeId",
    "lengde"
})
public class Tidsperiode {

    @XmlElement(required = true)
    protected PeriodeKodeId periodeId;
    protected int lengde;

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
     * Gets the value of the lengde property.
     * 
     */
    public int getLengde() {
        return lengde;
    }

    /**
     * Sets the value of the lengde property.
     * 
     */
    public void setLengde(int value) {
        this.lengde = value;
    }

}
