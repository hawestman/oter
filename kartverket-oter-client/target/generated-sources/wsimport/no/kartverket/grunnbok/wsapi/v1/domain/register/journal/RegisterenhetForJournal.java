
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;


/**
 * <p>Java class for RegisterenhetForJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetForJournal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
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
@XmlType(name = "RegisterenhetForJournal")
@XmlSeeAlso({
    MatrikkelenhetForJournal.class,
    BorettslagsandelForJournal.class
})
public class RegisterenhetForJournal
    extends EntityComponentWithHistory
{


}
