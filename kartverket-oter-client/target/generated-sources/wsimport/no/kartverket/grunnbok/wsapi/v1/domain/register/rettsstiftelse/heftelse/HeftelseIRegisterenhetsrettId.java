
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeftelseIRegisterenhetsrettId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeftelseIRegisterenhetsrettId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseId">
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
@XmlType(name = "HeftelseIRegisterenhetsrettId")
@XmlSeeAlso({
    VilkaarIFestekontraktId.class,
    AnnenRettighetId.class,
    ServituttId.class,
    ServituttPengeheftelseId.class,
    AvtaleId.class,
    HeftelseMedBeloepId.class
})
public class HeftelseIRegisterenhetsrettId
    extends HeftelseId
{


}
