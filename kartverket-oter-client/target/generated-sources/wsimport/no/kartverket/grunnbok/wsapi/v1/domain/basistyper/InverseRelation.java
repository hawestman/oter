
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.FoeringsdagIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.FoeringsdagIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.PostnummeromraadeIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.PostnummeromraadeIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.AdresseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.AdresseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.KonvertertAdresseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.KonvertertAdresseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.MatrikkeladresseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.MatrikkeladresseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.UtenlandskAdresseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.UtenlandskAdresseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.VegadresseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.VegadresseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournaloppfoeringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournaloppfoeringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournalpersonIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.JournalpersonIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.FestegrunnIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.FestegrunnIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.MatrikkelenhetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.MatrikkelenhetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.OverfoeringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.OverfoeringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningPaaPersonIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningPaaPersonIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningPaaRegisterenhetsrettsandelIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.AnnenRettighetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.AnnenRettighetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.AvtaleIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.AvtaleIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.FremleieavtaleIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.FremleieavtaleIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIAnnenRettIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIAnnenRettIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIRegisterenhetsrettIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIRegisterenhetsrettIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIRettighetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIRettighetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseMedBeloepIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseMedBeloepIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.LeieavtaleIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.LeieavtaleIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.NotertPantIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.NotertPantIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.NotertTvangspantIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.NotertTvangspantIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.PantIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.PantIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.ServituttIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.ServituttIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.ServituttPengeheftelseIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.ServituttPengeheftelseIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.TvangsforretningIRettighetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.TvangsforretningIRettighetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.TvangsforretningIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.TvangsforretningIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.VilkaarIFestekontraktIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.VilkaarIFestekontraktIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrettIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrettIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring.PersonkoblingsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring.PersonkoblingsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.BorettslagsandelsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.BorettslagsandelsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.MatrikkelenhetsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.MatrikkelenhetsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.OpphevingAvSeksjoneringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.OpphevingAvSeksjoneringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.RegisterenhetsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.RegisterenhetsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.SeksjoneringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.SeksjoneringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.SeksjonssameieendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.SeksjonssameieendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.AndelseierIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.AndelseierIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DelvisSlettingForIkkeTinglystMatrikkelenhetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DelvisSlettingForIkkeTinglystMatrikkelenhetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DelvisSlettingIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DelvisSlettingIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DiverseRettsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.DiverseRettsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NedkvitteringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NedkvitteringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NyeVilkaarIFestekontraktIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NyeVilkaarIFestekontraktIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NyeVilkaarILeieavtaleIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.NyeVilkaarILeieavtaleIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.PrioritetsbestemmelseForDokumentnummerIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.PrioritetsbestemmelseForDokumentnummerIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.PrioritetsbestemmelseForIkkeTinglystDokumentIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RegistreringAvAnkeIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RegistreringAvAnkeIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringPaaSeksjoneringIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringPaaSeksjoneringIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.SlettingIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.SlettingIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.TinglysingPaaNyIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.TinglysingPaaNyIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.TransportIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.TransportIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.BrukerIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.BrukerIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.DokumentSaksbehandlingIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.DokumentSaksbehandlingIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.GebyrsatsIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.GebyrsatsIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.OrganisatoriskEnhetIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.OrganisatoriskEnhetIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelseSaksbehandlingIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelseSaksbehandlingIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelsestypeSaksbehandlingIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.RettsstiftelsestypeSaksbehandlingIdListInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.TilgangsgruppeIdInverseRelation;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.TilgangsgruppeIdListInverseRelation;


/**
 * <p>Java class for InverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InverseRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materialised" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InverseRelation", propOrder = {
    "materialised"
})
@XmlSeeAlso({
    BorettslagsandelIdListInverseRelation.class,
    FestegrunnIdListInverseRelation.class,
    SeksjonssameieandelIdListInverseRelation.class,
    BorettslagsandelIdInverseRelation.class,
    SeksjonIdListInverseRelation.class,
    MatrikkelenhetIdListInverseRelation.class,
    RegisterenhetIdListInverseRelation.class,
    SeksjonssameieandelIdInverseRelation.class,
    MatrikkelenhetIdInverseRelation.class,
    SeksjonIdInverseRelation.class,
    FestegrunnIdInverseRelation.class,
    RegisterenhetIdInverseRelation.class,
    BorettslagIdInverseRelation.class,
    KommuneIdListInverseRelation.class,
    RegisterenhetsrettIdInverseRelation.class,
    PostnummeromraadeIdInverseRelation.class,
    RegisterenhetsrettsandelIdInverseRelation.class,
    RegisterenhetsrettIdListInverseRelation.class,
    FoeringsdagIdInverseRelation.class,
    BorettslagIdListInverseRelation.class,
    PostnummeromraadeIdListInverseRelation.class,
    KommuneIdInverseRelation.class,
    RegisterenhetsrettsandelIdListInverseRelation.class,
    FoeringsdagIdListInverseRelation.class,
    PersonIdInverseRelation.class,
    PersonIdListInverseRelation.class,
    KonvertertAdresseIdInverseRelation.class,
    MatrikkeladresseIdInverseRelation.class,
    KonvertertAdresseIdListInverseRelation.class,
    VegadresseIdInverseRelation.class,
    VegadresseIdListInverseRelation.class,
    UtenlandskAdresseIdListInverseRelation.class,
    UtenlandskAdresseIdInverseRelation.class,
    MatrikkeladresseIdListInverseRelation.class,
    AdresseIdInverseRelation.class,
    AdresseIdListInverseRelation.class,
    TvangsforretningIRettighetIdInverseRelation.class,
    LeieavtaleIdListInverseRelation.class,
    VilkaarIFestekontraktIdListInverseRelation.class,
    HeftelseMedBeloepIdListInverseRelation.class,
    VilkaarIFestekontraktIdInverseRelation.class,
    ServituttIdInverseRelation.class,
    HeftelseIRettighetIdInverseRelation.class,
    LeieavtaleIdInverseRelation.class,
    AnnenRettighetIdInverseRelation.class,
    HeftelseIAnnenRettIdInverseRelation.class,
    HeftelseIRegisterenhetsrettIdInverseRelation.class,
    ServituttIdListInverseRelation.class,
    NotertPantIdInverseRelation.class,
    HeftelseMedBeloepIdInverseRelation.class,
    HeftelseIdListInverseRelation.class,
    NotertPantIdListInverseRelation.class,
    HeftelseIAnnenRettIdListInverseRelation.class,
    FremleieavtaleIdListInverseRelation.class,
    TvangsforretningIdInverseRelation.class,
    PantIdInverseRelation.class,
    NotertTvangspantIdListInverseRelation.class,
    ServituttPengeheftelseIdListInverseRelation.class,
    TvangsforretningIRettighetIdListInverseRelation.class,
    HeftelseIRegisterenhetsrettIdListInverseRelation.class,
    AvtaleIdListInverseRelation.class,
    PantIdListInverseRelation.class,
    HeftelseIRettighetIdListInverseRelation.class,
    ServituttPengeheftelseIdInverseRelation.class,
    FremleieavtaleIdInverseRelation.class,
    AvtaleIdInverseRelation.class,
    AnnenRettighetIdListInverseRelation.class,
    TvangsforretningIdListInverseRelation.class,
    NotertTvangspantIdInverseRelation.class,
    HeftelseIdInverseRelation.class,
    RettsstiftelseIdListInverseRelation.class,
    RettsstiftelseIdInverseRelation.class,
    OverfoeringIdInverseRelation.class,
    OverfoeringIdListInverseRelation.class,
    DokumentIdListInverseRelation.class,
    DokumentIdInverseRelation.class,
    JournaloppfoeringIdInverseRelation.class,
    JournaloppfoeringIdListInverseRelation.class,
    JournalpersonIdListInverseRelation.class,
    JournalpersonIdInverseRelation.class,
    DelvisSlettingForIkkeTinglystMatrikkelenhetIdInverseRelation.class,
    DelvisSlettingIdListInverseRelation.class,
    DelvisSlettingForIkkeTinglystMatrikkelenhetIdListInverseRelation.class,
    RettsendringIdInverseRelation.class,
    NyeVilkaarIFestekontraktIdListInverseRelation.class,
    AndelseierIdInverseRelation.class,
    TinglysingPaaNyIdListInverseRelation.class,
    NyeVilkaarILeieavtaleIdInverseRelation.class,
    SlettingIdInverseRelation.class,
    TinglysingPaaNyIdInverseRelation.class,
    PrioritetsbestemmelseForDokumentnummerIdListInverseRelation.class,
    DelvisSlettingIdInverseRelation.class,
    AndelseierIdListInverseRelation.class,
    TransportIdInverseRelation.class,
    PrioritetsbestemmelseForDokumentnummerIdInverseRelation.class,
    RettsendringPaaSeksjoneringIdListInverseRelation.class,
    RettsendringPaaSeksjoneringIdInverseRelation.class,
    PrioritetsbestemmelseForIkkeTinglystDokumentIdInverseRelation.class,
    NyeVilkaarIFestekontraktIdInverseRelation.class,
    TransportIdListInverseRelation.class,
    DiverseRettsendringIdListInverseRelation.class,
    DiverseRettsendringIdInverseRelation.class,
    PrioritetsbestemmelseForIkkeTinglystDokumentIdListInverseRelation.class,
    NedkvitteringIdListInverseRelation.class,
    RegistreringAvAnkeIdListInverseRelation.class,
    NedkvitteringIdInverseRelation.class,
    NyeVilkaarILeieavtaleIdListInverseRelation.class,
    SlettingIdListInverseRelation.class,
    RegistreringAvAnkeIdInverseRelation.class,
    RettsendringIdListInverseRelation.class,
    AnmerkningIdListInverseRelation.class,
    AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation.class,
    AnmerkningPaaPersonIdInverseRelation.class,
    AnmerkningPaaRegisterenhetsrettsandelIdListInverseRelation.class,
    AnmerkningPaaPersonIdListInverseRelation.class,
    AnmerkningIdInverseRelation.class,
    OverdragelseAvRegisterenhetsrettIdInverseRelation.class,
    OverdragelseAvRegisterenhetsrettIdListInverseRelation.class,
    RegisterenhetsendringIdInverseRelation.class,
    BorettslagsandelsendringIdInverseRelation.class,
    SeksjoneringIdListInverseRelation.class,
    RegisterenhetsendringIdListInverseRelation.class,
    OpphevingAvSeksjoneringIdListInverseRelation.class,
    MatrikkelenhetsendringIdInverseRelation.class,
    SeksjonssameieendringIdListInverseRelation.class,
    BorettslagsandelsendringIdListInverseRelation.class,
    SeksjonssameieendringIdInverseRelation.class,
    SeksjoneringIdInverseRelation.class,
    MatrikkelenhetsendringIdListInverseRelation.class,
    OpphevingAvSeksjoneringIdInverseRelation.class,
    PersonkoblingsendringIdListInverseRelation.class,
    PersonkoblingsendringIdInverseRelation.class,
    BrukerIdInverseRelation.class,
    BrukerIdListInverseRelation.class,
    TilgangsgruppeIdInverseRelation.class,
    TilgangsgruppeIdListInverseRelation.class,
    RettsstiftelseSaksbehandlingIdInverseRelation.class,
    GebyrsatsIdListInverseRelation.class,
    GebyrsatsIdInverseRelation.class,
    RettsstiftelsestypeSaksbehandlingIdListInverseRelation.class,
    OrganisatoriskEnhetIdInverseRelation.class,
    RettsstiftelseSaksbehandlingIdListInverseRelation.class,
    RettsstiftelsestypeSaksbehandlingIdInverseRelation.class,
    DokumentSaksbehandlingIdInverseRelation.class,
    OrganisatoriskEnhetIdListInverseRelation.class,
    DokumentSaksbehandlingIdListInverseRelation.class
})
public class InverseRelation {

    protected boolean materialised;

    /**
     * Gets the value of the materialised property.
     * 
     */
    public boolean isMaterialised() {
        return materialised;
    }

    /**
     * Sets the value of the materialised property.
     * 
     */
    public void setMaterialised(boolean value) {
        this.materialised = value;
    }

}
