
package no.kartverket.grunnbok.wsapi.v1.domain.register.dokument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournaloppfoeringId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentstatusKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EmbeteKodeId;


/**
 * <p>Java class for Dokument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dokument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="dokumentaar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dokumentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="embeteId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}EmbeteKodeId"/>
 *         &lt;element name="dokumentstatusId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}DokumentstatusKodeId"/>
 *         &lt;element name="registrert" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="journaloppfoeringId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}JournaloppfoeringId"/>
 *         &lt;element name="omdokulertTilId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/dokument}DokumentId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dokument", propOrder = {
    "dokumentaar",
    "dokumentnummer",
    "embeteId",
    "dokumentstatusId",
    "registrert",
    "historisk",
    "journaloppfoeringId",
    "omdokulertTilId"
})
public class Dokument
    extends GrunnbokObjectWithHistory
{

    protected int dokumentaar;
    protected int dokumentnummer;
    @XmlElement(required = true)
    protected EmbeteKodeId embeteId;
    @XmlElement(required = true)
    protected DokumentstatusKodeId dokumentstatusId;
    @XmlElement(required = true, nillable = true)
    protected LocalDate registrert;
    protected boolean historisk;
    @XmlElement(required = true, nillable = true)
    protected JournaloppfoeringId journaloppfoeringId;
    @XmlElement(required = true, nillable = true)
    protected DokumentId omdokulertTilId;

    /**
     * Gets the value of the dokumentaar property.
     * 
     */
    public int getDokumentaar() {
        return dokumentaar;
    }

    /**
     * Sets the value of the dokumentaar property.
     * 
     */
    public void setDokumentaar(int value) {
        this.dokumentaar = value;
    }

    /**
     * Gets the value of the dokumentnummer property.
     * 
     */
    public int getDokumentnummer() {
        return dokumentnummer;
    }

    /**
     * Sets the value of the dokumentnummer property.
     * 
     */
    public void setDokumentnummer(int value) {
        this.dokumentnummer = value;
    }

    /**
     * Gets the value of the embeteId property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeteKodeId }
     *     
     */
    public EmbeteKodeId getEmbeteId() {
        return embeteId;
    }

    /**
     * Sets the value of the embeteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeteKodeId }
     *     
     */
    public void setEmbeteId(EmbeteKodeId value) {
        this.embeteId = value;
    }

    /**
     * Gets the value of the dokumentstatusId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentstatusKodeId }
     *     
     */
    public DokumentstatusKodeId getDokumentstatusId() {
        return dokumentstatusId;
    }

    /**
     * Sets the value of the dokumentstatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentstatusKodeId }
     *     
     */
    public void setDokumentstatusId(DokumentstatusKodeId value) {
        this.dokumentstatusId = value;
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
     * Gets the value of the journaloppfoeringId property.
     * 
     * @return
     *     possible object is
     *     {@link JournaloppfoeringId }
     *     
     */
    public JournaloppfoeringId getJournaloppfoeringId() {
        return journaloppfoeringId;
    }

    /**
     * Sets the value of the journaloppfoeringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournaloppfoeringId }
     *     
     */
    public void setJournaloppfoeringId(JournaloppfoeringId value) {
        this.journaloppfoeringId = value;
    }

    /**
     * Gets the value of the omdokulertTilId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentId }
     *     
     */
    public DokumentId getOmdokulertTilId() {
        return omdokulertTilId;
    }

    /**
     * Sets the value of the omdokulertTilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentId }
     *     
     */
    public void setOmdokulertTilId(DokumentId value) {
        this.omdokulertTilId = value;
    }

}
