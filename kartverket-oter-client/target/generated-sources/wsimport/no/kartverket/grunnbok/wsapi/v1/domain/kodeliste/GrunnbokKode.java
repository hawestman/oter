
package no.kartverket.grunnbok.wsapi.v1.domain.kodeliste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalizedString;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakGebyrfritakKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsakTilFjerningKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.AarsaksparagrafKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ArkivtypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BoligtypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.BrukstypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentavgiftsaarsakKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentkildeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentstatusKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentVersjonKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentnavnKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EmbeteKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FoeringsstatusKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FormaalKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.IdentifikasjonsnummertypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.KonsesjonsgrenseKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.LandkodeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.MaalformKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.OmsetningstypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.PeriodeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RegisterenhetsrettstypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettstypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.SameietypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TeksttypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TilleggsdeltypeKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ValutakodeKode;


/**
 * <p>Java class for GrunnbokKode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokKode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/kodeliste}Kode">
 *       &lt;sequence>
 *         &lt;element name="kodeverdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="navn" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokKode", propOrder = {
    "kodeverdi",
    "navn"
})
@XmlSeeAlso({
    EdokDokumentnavnKode.class,
    ValutakodeKode.class,
    PeriodeKode.class,
    FoeringsstatusKode.class,
    IdentifikasjonsnummertypeKode.class,
    FormaalKode.class,
    AarsaksparagrafKode.class,
    KonsesjonsgrenseKode.class,
    DokumentkildeKode.class,
    AarsakTilFjerningKode.class,
    DokumentavgiftsaarsakKode.class,
    AarsakGebyrfritakKode.class,
    EdokDokumentVersjonKode.class,
    RegisterenhetsrettstypeKode.class,
    BrukstypeKode.class,
    RettsstiftelsestypeKode.class,
    RettstypeKode.class,
    TeksttypeKode.class,
    DokumentstatusKode.class,
    SameietypeKode.class,
    MaalformKode.class,
    TilleggsdeltypeKode.class,
    BoligtypeKode.class,
    ArkivtypeKode.class,
    OmsetningstypeKode.class,
    EmbeteKode.class,
    LandkodeKode.class
})
public class GrunnbokKode
    extends Kode
{

    @XmlElement(required = true)
    protected String kodeverdi;
    protected LocalizedString navn;

    /**
     * Gets the value of the kodeverdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeverdi() {
        return kodeverdi;
    }

    /**
     * Sets the value of the kodeverdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeverdi(String value) {
        this.kodeverdi = value;
    }

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedString }
     *     
     */
    public LocalizedString getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedString }
     *     
     */
    public void setNavn(LocalizedString value) {
        this.navn = value;
    }

}
