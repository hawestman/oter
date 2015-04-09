
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for BrukerTilgangsgruppe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrukerTilgangsgruppe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gjelderFra" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrukerTilgangsgruppe", propOrder = {
    "historisk",
    "gjelderFra"
})
public class BrukerTilgangsgruppe
    extends EntityComponentWithHistory
{

    protected boolean historisk;
    @XmlElement(required = true)
    protected LocalDate gjelderFra;

    /**
     * Gets the value of the historisk property.
     * 
     */
    public boolean isHistorisk() {
        return historisk;
    }

    /**
     * Sets the value of the historisk property.
     * 
     */
    public void setHistorisk(boolean value) {
        this.historisk = value;
    }

    /**
     * Gets the value of the gjelderFra property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getGjelderFra() {
        return gjelderFra;
    }

    /**
     * Sets the value of the gjelderFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setGjelderFra(LocalDate value) {
        this.gjelderFra = value;
    }

}
