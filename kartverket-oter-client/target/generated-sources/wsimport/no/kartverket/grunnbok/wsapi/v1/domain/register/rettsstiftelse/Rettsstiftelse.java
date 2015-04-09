
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakGebyrfritakKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.Anmerkning;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.Heftelse;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIAnnenRettIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrett;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring.Personkoblingsendring;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.Registerenhetsendring;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.Rettsendring;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringIdListInverseRelation;


/**
 * <p>Java class for Rettsstiftelse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rettsstiftelse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="dokumentId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/dokument}DokumentId"/>
 *         &lt;element name="rettsstiftelsesnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rettsstiftelsestypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettsstiftelsestypeKodeId"/>
 *         &lt;element name="aarsakGebyrfritakId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}AarsakGebyrfritakKodeId"/>
 *         &lt;element name="gebyr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tekster" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}TekstList"/>
 *         &lt;element name="endretAvIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}RettsendringIdListInverseRelation"/>
 *         &lt;element name="anmerketAvIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/anmerkning}AnmerkningIdListInverseRelation"/>
 *         &lt;element name="heftelseIAnnenRettIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIAnnenRettIdListInverseRelation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rettsstiftelse", propOrder = {
    "dokumentId",
    "rettsstiftelsesnummer",
    "rettsstiftelsestypeId",
    "aarsakGebyrfritakId",
    "gebyr",
    "historisk",
    "tekster",
    "endretAvIds",
    "anmerketAvIds",
    "heftelseIAnnenRettIds"
})
@XmlSeeAlso({
    Heftelse.class,
    Rettsendring.class,
    Anmerkning.class,
    OverdragelseAvRegisterenhetsrett.class,
    Registerenhetsendring.class,
    Personkoblingsendring.class
})
public class Rettsstiftelse
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected DokumentId dokumentId;
    protected int rettsstiftelsesnummer;
    @XmlElement(required = true)
    protected RettsstiftelsestypeKodeId rettsstiftelsestypeId;
    @XmlElement(required = true)
    protected AarsakGebyrfritakKodeId aarsakGebyrfritakId;
    protected boolean gebyr;
    protected boolean historisk;
    @XmlElement(required = true)
    protected TekstList tekster;
    @XmlElement(required = true)
    protected RettsendringIdListInverseRelation endretAvIds;
    @XmlElement(required = true)
    protected AnmerkningIdListInverseRelation anmerketAvIds;
    @XmlElement(required = true)
    protected HeftelseIAnnenRettIdListInverseRelation heftelseIAnnenRettIds;

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
     * Gets the value of the rettsstiftelsesnummer property.
     * 
     */
    public int getRettsstiftelsesnummer() {
        return rettsstiftelsesnummer;
    }

    /**
     * Sets the value of the rettsstiftelsesnummer property.
     * 
     */
    public void setRettsstiftelsesnummer(int value) {
        this.rettsstiftelsesnummer = value;
    }

    /**
     * Gets the value of the rettsstiftelsestypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public RettsstiftelsestypeKodeId getRettsstiftelsestypeId() {
        return rettsstiftelsestypeId;
    }

    /**
     * Sets the value of the rettsstiftelsestypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public void setRettsstiftelsestypeId(RettsstiftelsestypeKodeId value) {
        this.rettsstiftelsestypeId = value;
    }

    /**
     * Gets the value of the aarsakGebyrfritakId property.
     * 
     * @return
     *     possible object is
     *     {@link AarsakGebyrfritakKodeId }
     *     
     */
    public AarsakGebyrfritakKodeId getAarsakGebyrfritakId() {
        return aarsakGebyrfritakId;
    }

    /**
     * Sets the value of the aarsakGebyrfritakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AarsakGebyrfritakKodeId }
     *     
     */
    public void setAarsakGebyrfritakId(AarsakGebyrfritakKodeId value) {
        this.aarsakGebyrfritakId = value;
    }

    /**
     * Gets the value of the gebyr property.
     * 
     */
    public boolean isGebyr() {
        return gebyr;
    }

    /**
     * Sets the value of the gebyr property.
     * 
     */
    public void setGebyr(boolean value) {
        this.gebyr = value;
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
     * Gets the value of the tekster property.
     * 
     * @return
     *     possible object is
     *     {@link TekstList }
     *     
     */
    public TekstList getTekster() {
        return tekster;
    }

    /**
     * Sets the value of the tekster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TekstList }
     *     
     */
    public void setTekster(TekstList value) {
        this.tekster = value;
    }

    /**
     * Gets the value of the endretAvIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettsendringIdListInverseRelation }
     *     
     */
    public RettsendringIdListInverseRelation getEndretAvIds() {
        return endretAvIds;
    }

    /**
     * Sets the value of the endretAvIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsendringIdListInverseRelation }
     *     
     */
    public void setEndretAvIds(RettsendringIdListInverseRelation value) {
        this.endretAvIds = value;
    }

    /**
     * Gets the value of the anmerketAvIds property.
     * 
     * @return
     *     possible object is
     *     {@link AnmerkningIdListInverseRelation }
     *     
     */
    public AnmerkningIdListInverseRelation getAnmerketAvIds() {
        return anmerketAvIds;
    }

    /**
     * Sets the value of the anmerketAvIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnmerkningIdListInverseRelation }
     *     
     */
    public void setAnmerketAvIds(AnmerkningIdListInverseRelation value) {
        this.anmerketAvIds = value;
    }

    /**
     * Gets the value of the heftelseIAnnenRettIds property.
     * 
     * @return
     *     possible object is
     *     {@link HeftelseIAnnenRettIdListInverseRelation }
     *     
     */
    public HeftelseIAnnenRettIdListInverseRelation getHeftelseIAnnenRettIds() {
        return heftelseIAnnenRettIds;
    }

    /**
     * Sets the value of the heftelseIAnnenRettIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeftelseIAnnenRettIdListInverseRelation }
     *     
     */
    public void setHeftelseIAnnenRettIds(HeftelseIAnnenRettIdListInverseRelation value) {
        this.heftelseIAnnenRettIds = value;
    }

}
