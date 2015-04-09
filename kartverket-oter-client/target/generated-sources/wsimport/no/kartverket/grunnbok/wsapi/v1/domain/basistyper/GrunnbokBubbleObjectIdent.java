
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdent;


/**
 * <p>Java class for GrunnbokBubbleObjectIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokBubbleObjectIdent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokBubbleObjectIdent")
@XmlSeeAlso({
    BorettslagIdent.class,
    RegisterenhetsrettIdent.class,
    KommuneIdent.class,
    RegisterenhetIdent.class,
    DokumentIdent.class,
    PersonIdent.class,
    RettsstiftelseIdent.class
})
public class GrunnbokBubbleObjectIdent {


}
