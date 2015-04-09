
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for Bruker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bruker">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brukernavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gjelderFra" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fastOrganisatoriskEnhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}OrganisatoriskEnhetId"/>
 *         &lt;element name="borettOrganisatoriskEnhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}OrganisatoriskEnhetId"/>
 *         &lt;element name="brukerTilgangsgrupper" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}BrukerTilgangsgruppeList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bruker", propOrder = {
    "navn",
    "brukernavn",
    "gjelderFra",
    "historisk",
    "fastOrganisatoriskEnhetId",
    "borettOrganisatoriskEnhetId",
    "brukerTilgangsgrupper"
})
public class Bruker
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected String navn;
    @XmlElement(required = true)
    protected String brukernavn;
    @XmlElement(required = true)
    protected LocalDate gjelderFra;
    protected boolean historisk;
    @XmlElement(required = true, nillable = true)
    protected OrganisatoriskEnhetId fastOrganisatoriskEnhetId;
    @XmlElement(required = true, nillable = true)
    protected OrganisatoriskEnhetId borettOrganisatoriskEnhetId;
    @XmlElement(required = true)
    protected BrukerTilgangsgruppeList brukerTilgangsgrupper;

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the brukernavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukernavn() {
        return brukernavn;
    }

    /**
     * Sets the value of the brukernavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukernavn(String value) {
        this.brukernavn = value;
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
     * Gets the value of the fastOrganisatoriskEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public OrganisatoriskEnhetId getFastOrganisatoriskEnhetId() {
        return fastOrganisatoriskEnhetId;
    }

    /**
     * Sets the value of the fastOrganisatoriskEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public void setFastOrganisatoriskEnhetId(OrganisatoriskEnhetId value) {
        this.fastOrganisatoriskEnhetId = value;
    }

    /**
     * Gets the value of the borettOrganisatoriskEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public OrganisatoriskEnhetId getBorettOrganisatoriskEnhetId() {
        return borettOrganisatoriskEnhetId;
    }

    /**
     * Sets the value of the borettOrganisatoriskEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public void setBorettOrganisatoriskEnhetId(OrganisatoriskEnhetId value) {
        this.borettOrganisatoriskEnhetId = value;
    }

    /**
     * Gets the value of the brukerTilgangsgrupper property.
     * 
     * @return
     *     possible object is
     *     {@link BrukerTilgangsgruppeList }
     *     
     */
    public BrukerTilgangsgruppeList getBrukerTilgangsgrupper() {
        return brukerTilgangsgrupper;
    }

    /**
     * Sets the value of the brukerTilgangsgrupper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrukerTilgangsgruppeList }
     *     
     */
    public void setBrukerTilgangsgrupper(BrukerTilgangsgruppeList value) {
        this.brukerTilgangsgrupper = value;
    }

}
