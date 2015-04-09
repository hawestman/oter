
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakTilFjerningKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentkildeKodeId;


/**
 * <p>Java class for DokumentSaksbehandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentSaksbehandling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="dokumentId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/dokument}DokumentId"/>
 *         &lt;element name="aarsakTilFjerningId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}AarsakTilFjerningKodeId"/>
 *         &lt;element name="dokumentkildeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}DokumentkildeKodeId"/>
 *         &lt;element name="interntNotat" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}InterntNotat"/>
 *         &lt;element name="aarsakTilFjerningTekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="edokReferanse" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="elektroniskFullsignert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dokumentflyt" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}DokumentflytStegList"/>
 *         &lt;element name="organisatoriskEnhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}OrganisatoriskEnhetId"/>
 *         &lt;element name="sistKonferertDato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentSaksbehandling", propOrder = {
    "dokumentId",
    "aarsakTilFjerningId",
    "dokumentkildeId",
    "interntNotat",
    "aarsakTilFjerningTekst",
    "edokReferanse",
    "elektroniskFullsignert",
    "dokumentflyt",
    "organisatoriskEnhetId",
    "sistKonferertDato"
})
public class DokumentSaksbehandling
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected DokumentId dokumentId;
    @XmlElement(required = true, nillable = true)
    protected AarsakTilFjerningKodeId aarsakTilFjerningId;
    @XmlElement(required = true)
    protected DokumentkildeKodeId dokumentkildeId;
    @XmlElement(required = true, nillable = true)
    protected InterntNotat interntNotat;
    @XmlElement(required = true, nillable = true)
    protected String aarsakTilFjerningTekst;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal edokReferanse;
    protected boolean elektroniskFullsignert;
    @XmlElement(required = true)
    protected DokumentflytStegList dokumentflyt;
    @XmlElement(required = true, nillable = true)
    protected OrganisatoriskEnhetId organisatoriskEnhetId;
    @XmlElement(required = true, nillable = true)
    protected LocalDate sistKonferertDato;

    /**
     * Gets the value of the dokumentId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentId }
     *     
     */
    public DokumentId getDokumentId() {
        return dokumentId;
    }

    /**
     * Sets the value of the dokumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentId }
     *     
     */
    public void setDokumentId(DokumentId value) {
        this.dokumentId = value;
    }

    /**
     * Gets the value of the aarsakTilFjerningId property.
     * 
     * @return
     *     possible object is
     *     {@link AarsakTilFjerningKodeId }
     *     
     */
    public AarsakTilFjerningKodeId getAarsakTilFjerningId() {
        return aarsakTilFjerningId;
    }

    /**
     * Sets the value of the aarsakTilFjerningId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AarsakTilFjerningKodeId }
     *     
     */
    public void setAarsakTilFjerningId(AarsakTilFjerningKodeId value) {
        this.aarsakTilFjerningId = value;
    }

    /**
     * Gets the value of the dokumentkildeId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentkildeKodeId }
     *     
     */
    public DokumentkildeKodeId getDokumentkildeId() {
        return dokumentkildeId;
    }

    /**
     * Sets the value of the dokumentkildeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentkildeKodeId }
     *     
     */
    public void setDokumentkildeId(DokumentkildeKodeId value) {
        this.dokumentkildeId = value;
    }

    /**
     * Gets the value of the interntNotat property.
     * 
     * @return
     *     possible object is
     *     {@link InterntNotat }
     *     
     */
    public InterntNotat getInterntNotat() {
        return interntNotat;
    }

    /**
     * Sets the value of the interntNotat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterntNotat }
     *     
     */
    public void setInterntNotat(InterntNotat value) {
        this.interntNotat = value;
    }

    /**
     * Gets the value of the aarsakTilFjerningTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarsakTilFjerningTekst() {
        return aarsakTilFjerningTekst;
    }

    /**
     * Sets the value of the aarsakTilFjerningTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarsakTilFjerningTekst(String value) {
        this.aarsakTilFjerningTekst = value;
    }

    /**
     * Gets the value of the edokReferanse property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEdokReferanse() {
        return edokReferanse;
    }

    /**
     * Sets the value of the edokReferanse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEdokReferanse(BigDecimal value) {
        this.edokReferanse = value;
    }

    /**
     * Gets the value of the elektroniskFullsignert property.
     * 
     */
    public boolean isElektroniskFullsignert() {
        return elektroniskFullsignert;
    }

    /**
     * Sets the value of the elektroniskFullsignert property.
     * 
     */
    public void setElektroniskFullsignert(boolean value) {
        this.elektroniskFullsignert = value;
    }

    /**
     * Gets the value of the dokumentflyt property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentflytStegList }
     *     
     */
    public DokumentflytStegList getDokumentflyt() {
        return dokumentflyt;
    }

    /**
     * Sets the value of the dokumentflyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentflytStegList }
     *     
     */
    public void setDokumentflyt(DokumentflytStegList value) {
        this.dokumentflyt = value;
    }

    /**
     * Gets the value of the organisatoriskEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public OrganisatoriskEnhetId getOrganisatoriskEnhetId() {
        return organisatoriskEnhetId;
    }

    /**
     * Sets the value of the organisatoriskEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisatoriskEnhetId }
     *     
     */
    public void setOrganisatoriskEnhetId(OrganisatoriskEnhetId value) {
        this.organisatoriskEnhetId = value;
    }

    /**
     * Gets the value of the sistKonferertDato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getSistKonferertDato() {
        return sistKonferertDato;
    }

    /**
     * Sets the value of the sistKonferertDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setSistKonferertDato(LocalDate value) {
        this.sistKonferertDato = value;
    }

}
