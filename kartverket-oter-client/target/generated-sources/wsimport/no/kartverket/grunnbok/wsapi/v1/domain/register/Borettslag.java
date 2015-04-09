
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;


/**
 * <p>Java class for Borettslag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Borettslag">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="organisasjonId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId"/>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Borettslag", propOrder = {
    "organisasjonId",
    "historisk"
})
public class Borettslag
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected PersonId organisasjonId;
    protected boolean historisk;

    /**
     * Gets the value of the organisasjonId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getOrganisasjonId() {
        return organisasjonId;
    }

    /**
     * Sets the value of the organisasjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setOrganisasjonId(PersonId value) {
        this.organisasjonId = value;
    }

    /**
     * Gets the value of the historisk property.
     * 
     */
    public boolean isHistorisk() {
        return historisk;
    }

    /**
     * Sets the value of the historisk property.
     * 
     */
    public void setHistorisk(boolean value) {
        this.historisk = value;
    }

}
