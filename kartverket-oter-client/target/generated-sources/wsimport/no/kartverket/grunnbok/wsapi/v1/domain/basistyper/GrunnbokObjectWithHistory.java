
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Borettslag;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Foeringsdag;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Kommune;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Postnummeromraade;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Registerenhetsrett;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Registerenhetsrettsandel;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.Adresse;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.Dokument;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.Journaloppfoering;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.Journalperson;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.Person;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.Registerenhet;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.Seksjonssameieandel;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Overfoering;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.Bruker;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.DokumentSaksbehandling;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.Gebyrsats;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.OrganisatoriskEnhet;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelseSaksbehandling;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelsestypeSaksbehandling;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.Tilgangsgruppe;


/**
 * <p>Java class for GrunnbokObjectWithHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokObjectWithHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithVersion">
 *       &lt;sequence>
 *         &lt;element name="sluttdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *         &lt;element name="oppdateringsBruker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="incrementalVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="versjon" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokObjectWithHistory", propOrder = {
    "sluttdato",
    "oppdateringsBruker",
    "incrementalVersion",
    "versjon"
})
@XmlSeeAlso({
    Registerenhet.class,
    Seksjonssameieandel.class,
    Borettslag.class,
    Registerenhetsrett.class,
    Foeringsdag.class,
    Postnummeromraade.class,
    Kommune.class,
    Registerenhetsrettsandel.class,
    Person.class,
    Adresse.class,
    Overfoering.class,
    Dokument.class,
    Journaloppfoering.class,
    Journalperson.class,
    Rettsstiftelse.class,
    RettsstiftelseSaksbehandling.class,
    OrganisatoriskEnhet.class,
    Bruker.class,
    DokumentSaksbehandling.class,
    Tilgangsgruppe.class,
    Gebyrsats.class,
    RettsstiftelsestypeSaksbehandling.class
})
public class GrunnbokObjectWithHistory
    extends GrunnbokObjectWithVersion
{

    @XmlElement(required = true, nillable = true)
    protected Timestamp sluttdato;
    @XmlElement(required = true, nillable = true)
    protected String oppdateringsBruker;
    protected long incrementalVersion;
    protected long versjon;

    /**
     * Gets the value of the sluttdato property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getSluttdato() {
        return sluttdato;
    }

    /**
     * Sets the value of the sluttdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setSluttdato(Timestamp value) {
        this.sluttdato = value;
    }

    /**
     * Gets the value of the oppdateringsBruker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdateringsBruker() {
        return oppdateringsBruker;
    }

    /**
     * Sets the value of the oppdateringsBruker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppdateringsBruker(String value) {
        this.oppdateringsBruker = value;
    }

    /**
     * Gets the value of the incrementalVersion property.
     * 
     */
    public long getIncrementalVersion() {
        return incrementalVersion;
    }

    /**
     * Sets the value of the incrementalVersion property.
     * 
     */
    public void setIncrementalVersion(long value) {
        this.incrementalVersion = value;
    }

    /**
     * Gets the value of the versjon property.
     * 
     */
    public long getVersjon() {
        return versjon;
    }

    /**
     * Sets the value of the versjon property.
     * 
     */
    public void setVersjon(long value) {
        this.versjon = value;
    }

}
