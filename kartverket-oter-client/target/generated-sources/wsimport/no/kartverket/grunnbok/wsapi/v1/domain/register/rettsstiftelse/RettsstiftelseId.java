
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistoryId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning.AnmerkningId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrettId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.personkoblingsendring.PersonkoblingsendringId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.RegisterenhetsendringId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring.RettsendringId;


/**
 * <p>Java class for RettsstiftelseId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelseId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistoryId">
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
@XmlType(name = "RettsstiftelseId")
@XmlSeeAlso({
    HeftelseId.class,
    RettsendringId.class,
    AnmerkningId.class,
    OverdragelseAvRegisterenhetsrettId.class,
    RegisterenhetsendringId.class,
    PersonkoblingsendringId.class
})
public class RettsstiftelseId
    extends GrunnbokObjectWithHistoryId
{


}
