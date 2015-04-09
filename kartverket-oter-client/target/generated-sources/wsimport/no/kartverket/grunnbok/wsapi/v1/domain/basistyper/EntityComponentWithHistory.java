
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.journal.RegisterenhetForJournal;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.DelAvRett;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.OmsattRegisterenhetsrett;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Omsetning;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.OverfoeringFraTil;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.BroekInneholdtIRegisterenhetsrettsandel;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.BrukerTilgangsgruppe;
import no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata.LovligTeksttypekode;


/**
 * <p>Java class for EntityComponentWithHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityComponentWithHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponent">
 *       &lt;sequence>
 *         &lt;element name="oppdateringsdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *         &lt;element name="sluttdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityComponentWithHistory", propOrder = {
    "oppdateringsdato",
    "sluttdato"
})
@XmlSeeAlso({
    BroekInneholdtIRegisterenhetsrettsandel.class,
    OverfoeringFraTil.class,
    OmsattRegisterenhetsrett.class,
    Omsetning.class,
    DelAvRett.class,
    RegisterenhetForJournal.class,
    LovligTeksttypekode.class,
    BrukerTilgangsgruppe.class
})
public class EntityComponentWithHistory
    extends EntityComponent
{

    @XmlElement(required = true, nillable = true)
    protected Timestamp oppdateringsdato;
    @XmlElement(required = true, nillable = true)
    protected Timestamp sluttdato;

    /**
     * Gets the value of the oppdateringsdato property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getOppdateringsdato() {
        return oppdateringsdato;
    }

    /**
     * Sets the value of the oppdateringsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setOppdateringsdato(Timestamp value) {
        this.oppdateringsdato = value;
    }

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

}
