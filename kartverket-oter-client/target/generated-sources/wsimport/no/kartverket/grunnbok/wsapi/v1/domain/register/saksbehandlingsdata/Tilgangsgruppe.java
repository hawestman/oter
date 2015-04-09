
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for Tilgangsgruppe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tilgangsgruppe">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gjelderFra" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="tilgangsgruppenavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tilgangsgruppe", propOrder = {
    "historisk",
    "gjelderFra",
    "tilgangsgruppenavn"
})
public class Tilgangsgruppe
    extends GrunnbokObjectWithHistory
{

    protected boolean historisk;
    @XmlElement(required = true)
    protected LocalDate gjelderFra;
    @XmlElement(required = true)
    protected String tilgangsgruppenavn;

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

    /**
     * Gets the value of the tilgangsgruppenavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilgangsgruppenavn() {
        return tilgangsgruppenavn;
    }

    /**
     * Sets the value of the tilgangsgruppenavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilgangsgruppenavn(String value) {
        this.tilgangsgruppenavn = value;
    }

}
