
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseId;


/**
 * <p>Java class for RettsendringId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsendringId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseId">
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
@XmlType(name = "RettsendringId")
@XmlSeeAlso({
    NyeVilkaarILeieavtaleId.class,
    NyeVilkaarIFestekontraktId.class,
    DelvisSlettingForIkkeTinglystMatrikkelenhetId.class,
    TinglysingPaaNyId.class,
    SlettingId.class,
    AndelseierId.class,
    NedkvitteringId.class,
    TransportId.class,
    RegistreringAvAnkeId.class,
    DelvisSlettingId.class,
    PrioritetsbestemmelseForDokumentnummerId.class,
    RettsendringPaaSeksjoneringId.class,
    PrioritetsbestemmelseForIkkeTinglystDokumentId.class,
    DiverseRettsendringId.class
})
public class RettsendringId
    extends RettsstiftelseId
{


}
