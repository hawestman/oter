
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for Journaloppfoering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journaloppfoering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="journalnummer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registrert" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="journalreferanse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="antallDokumenter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rekvirentId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}JournalpersonId"/>
 *         &lt;element name="fakturamottakerId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}JournalpersonId"/>
 *         &lt;element name="mottakerId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}JournalpersonId"/>
 *         &lt;element name="registerenhet" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}RegisterenhetForJournal"/>
 *         &lt;element name="tekster" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}TekstForJournalList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journaloppfoering", propOrder = {
    "journalnummer",
    "registrert",
    "journalreferanse",
    "antallDokumenter",
    "rekvirentId",
    "fakturamottakerId",
    "mottakerId",
    "registerenhet",
    "tekster"
})
public class Journaloppfoering
    extends GrunnbokObjectWithHistory
{

    protected long journalnummer;
    @XmlElement(required = true, nillable = true)
    protected LocalDate registrert;
    @XmlElement(required = true, nillable = true)
    protected String journalreferanse;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer antallDokumenter;
    @XmlElement(required = true)
    protected JournalpersonId rekvirentId;
    @XmlElement(required = true)
    protected JournalpersonId fakturamottakerId;
    @XmlElement(required = true)
    protected JournalpersonId mottakerId;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetForJournal registerenhet;
    @XmlElement(required = true)
    protected TekstForJournalList tekster;

    /**
     * Gets the value of the journalnummer property.
     * 
     */
    public long getJournalnummer() {
        return journalnummer;
    }

    /**
     * Sets the value of the journalnummer property.
     * 
     */
    public void setJournalnummer(long value) {
        this.journalnummer = value;
    }

    /**
     * Gets the value of the registrert property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getRegistrert() {
        return registrert;
    }

    /**
     * Sets the value of the registrert property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setRegistrert(LocalDate value) {
        this.registrert = value;
    }

    /**
     * Gets the value of the journalreferanse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalreferanse() {
        return journalreferanse;
    }

    /**
     * Sets the value of the journalreferanse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalreferanse(String value) {
        this.journalreferanse = value;
    }

    /**
     * Gets the value of the antallDokumenter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntallDokumenter() {
        return antallDokumenter;
    }

    /**
     * Sets the value of the antallDokumenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntallDokumenter(Integer value) {
        this.antallDokumenter = value;
    }

    /**
     * Gets the value of the rekvirentId property.
     * 
     * @return
     *     possible object is
     *     {@link JournalpersonId }
     *     
     */
    public JournalpersonId getRekvirentId() {
        return rekvirentId;
    }

    /**
     * Sets the value of the rekvirentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalpersonId }
     *     
     */
    public void setRekvirentId(JournalpersonId value) {
        this.rekvirentId = value;
    }

    /**
     * Gets the value of the fakturamottakerId property.
     * 
     * @return
     *     possible object is
     *     {@link JournalpersonId }
     *     
     */
    public JournalpersonId getFakturamottakerId() {
        return fakturamottakerId;
    }

    /**
     * Sets the value of the fakturamottakerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalpersonId }
     *     
     */
    public void setFakturamottakerId(JournalpersonId value) {
        this.fakturamottakerId = value;
    }

    /**
     * Gets the value of the mottakerId property.
     * 
     * @return
     *     possible object is
     *     {@link JournalpersonId }
     *     
     */
    public JournalpersonId getMottakerId() {
        return mottakerId;
    }

    /**
     * Sets the value of the mottakerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalpersonId }
     *     
     */
    public void setMottakerId(JournalpersonId value) {
        this.mottakerId = value;
    }

    /**
     * Gets the value of the registerenhet property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetForJournal }
     *     
     */
    public RegisterenhetForJournal getRegisterenhet() {
        return registerenhet;
    }

    /**
     * Sets the value of the registerenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetForJournal }
     *     
     */
    public void setRegisterenhet(RegisterenhetForJournal value) {
        this.registerenhet = value;
    }

    /**
     * Gets the value of the tekster property.
     * 
     * @return
     *     possible object is
     *     {@link TekstForJournalList }
     *     
     */
    public TekstForJournalList getTekster() {
        return tekster;
    }

    /**
     * Sets the value of the tekster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstForJournalList }
     *     
     */
    public void setTekster(TekstForJournalList value) {
        this.tekster = value;
    }

}
