
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDateTime;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FoeringsstatusKodeId;


/**
 * <p>Java class for DokumentflytSteg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentflytSteg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foeringstidspunkt" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDateTime"/>
 *         &lt;element name="foeringsstatusId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}FoeringsstatusKodeId"/>
 *         &lt;element name="brukerId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}BrukerId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentflytSteg", propOrder = {
    "foeringstidspunkt",
    "foeringsstatusId",
    "brukerId"
})
public class DokumentflytSteg {

    @XmlElement(required = true)
    protected LocalDateTime foeringstidspunkt;
    @XmlElement(required = true)
    protected FoeringsstatusKodeId foeringsstatusId;
    @XmlElement(required = true)
    protected BrukerId brukerId;

    /**
     * Gets the value of the foeringstidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getFoeringstidspunkt() {
        return foeringstidspunkt;
    }

    /**
     * Sets the value of the foeringstidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setFoeringstidspunkt(LocalDateTime value) {
        this.foeringstidspunkt = value;
    }

    /**
     * Gets the value of the foeringsstatusId property.
     * 
     * @return
     *     possible object is
     *     {@link FoeringsstatusKodeId }
     *     
     */
    public FoeringsstatusKodeId getFoeringsstatusId() {
        return foeringsstatusId;
    }

    /**
     * Sets the value of the foeringsstatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoeringsstatusKodeId }
     *     
     */
    public void setFoeringsstatusId(FoeringsstatusKodeId value) {
        this.foeringsstatusId = value;
    }

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link BrukerId }
     *     
     */
    public BrukerId getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrukerId }
     *     
     */
    public void setBrukerId(BrukerId value) {
        this.brukerId = value;
    }

}
