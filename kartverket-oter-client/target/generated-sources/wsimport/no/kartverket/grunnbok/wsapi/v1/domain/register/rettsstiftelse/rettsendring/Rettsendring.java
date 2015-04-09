
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.DelAvRettList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;


/**
 * <p>Java class for Rettsendring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rettsendring">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Rettsstiftelse">
 *       &lt;sequence>
 *         &lt;element name="endrer" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}DelAvRettList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rettsendring", propOrder = {
    "endrer"
})
@XmlSeeAlso({
    Sletting.class,
    DiverseRettsendring.class,
    NyeVilkaarIFestekontrakt.class,
    TinglysingPaaNy.class,
    PrioritetsbestemmelseForDokumentnummer.class,
    NyeVilkaarILeieavtale.class,
    Transport.class,
    RegistreringAvAnke.class,
    DelvisSletting.class,
    DelvisSlettingForIkkeTinglystMatrikkelenhet.class,
    PrioritetsbestemmelseForIkkeTinglystDokument.class,
    Nedkvittering.class,
    RettsendringPaaSeksjonering.class,
    Andelseier.class
})
public class Rettsendring
    extends Rettsstiftelse
{

    @XmlElement(required = true)
    protected DelAvRettList endrer;

    /**
     * Gets the value of the endrer property.
     * 
     * @return
     *     possible object is
     *     {@link DelAvRettList }
     *     
     */
    public DelAvRettList getEndrer() {
        return endrer;
    }

    /**
     * Sets the value of the endrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelAvRettList }
     *     
     */
    public void setEndrer(DelAvRettList value) {
        this.endrer = value;
    }

}
