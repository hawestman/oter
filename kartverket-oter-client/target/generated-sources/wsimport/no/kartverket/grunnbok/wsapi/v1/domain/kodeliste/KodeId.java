
package no.kartverket.grunnbok.wsapi.v1.domain.kodeliste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakGebyrfritakKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakTilFjerningKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsaksparagrafKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ArkivtypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BoligtypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BrukstypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentavgiftsaarsakKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentkildeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentstatusKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentVersjonKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentnavnKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EmbeteKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FoeringsstatusKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FormaalKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.IdentifikasjonsnummertypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.KonsesjonsgrenseKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.LandkodeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.MaalformKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.OmsetningstypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.PeriodeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RegisterenhetsrettstypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettstypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.SameietypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TeksttypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TilleggsdeltypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ValutakodeKodeId;


/**
 * <p>Java class for KodeId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KodeId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectId">
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
@XmlType(name = "KodeId")
@XmlSeeAlso({
    ValutakodeKodeId.class,
    RettstypeKodeId.class,
    FoeringsstatusKodeId.class,
    DokumentkildeKodeId.class,
    RettsstiftelsestypeKodeId.class,
    KonsesjonsgrenseKodeId.class,
    DokumentstatusKodeId.class,
    EdokDokumentnavnKodeId.class,
    AarsakGebyrfritakKodeId.class,
    OmsetningstypeKodeId.class,
    TilleggsdeltypeKodeId.class,
    EdokDokumentVersjonKodeId.class,
    BrukstypeKodeId.class,
    AarsaksparagrafKodeId.class,
    SameietypeKodeId.class,
    PeriodeKodeId.class,
    MaalformKodeId.class,
    RegisterenhetsrettstypeKodeId.class,
    EmbeteKodeId.class,
    DokumentavgiftsaarsakKodeId.class,
    BoligtypeKodeId.class,
    FormaalKodeId.class,
    ArkivtypeKodeId.class,
    AarsakTilFjerningKodeId.class,
    TeksttypeKodeId.class,
    LandkodeKodeId.class,
    IdentifikasjonsnummertypeKodeId.class
})
public class KodeId
    extends GrunnbokBubbleObjectId
{


}
