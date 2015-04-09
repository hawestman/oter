
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.FoeringsdagId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.PostnummeromraadeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.AdresseId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournaloppfoeringId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournalpersonId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.OverfoeringId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.BrukerId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.DokumentSaksbehandlingId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.GebyrsatsId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.OrganisatoriskEnhetId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelseSaksbehandlingId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelsestypeSaksbehandlingId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.TilgangsgruppeId;


/**
 * <p>Java class for GrunnbokObjectWithHistoryId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokObjectWithHistoryId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithVersionId">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokObjectWithHistoryId")
@XmlSeeAlso({
    RegisterenhetId.class,
    SeksjonssameieandelId.class,
    RegisterenhetsrettId.class,
    KommuneId.class,
    PostnummeromraadeId.class,
    RegisterenhetsrettsandelId.class,
    FoeringsdagId.class,
    BorettslagId.class,
    PersonId.class,
    AdresseId.class,
    OverfoeringId.class,
    DokumentId.class,
    JournaloppfoeringId.class,
    JournalpersonId.class,
    RettsstiftelseId.class,
    RettsstiftelsestypeSaksbehandlingId.class,
    DokumentSaksbehandlingId.class,
    TilgangsgruppeId.class,
    BrukerId.class,
    OrganisatoriskEnhetId.class,
    GebyrsatsId.class,
    RettsstiftelseSaksbehandlingId.class
})
public class GrunnbokObjectWithHistoryId
    extends GrunnbokObjectWithVersionId
{


}
