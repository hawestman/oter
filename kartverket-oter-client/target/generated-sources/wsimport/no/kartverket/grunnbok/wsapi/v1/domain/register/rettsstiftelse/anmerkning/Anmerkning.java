
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.DelAvRettList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.Rettsstiftelse;


/**
 * <p>Java class for Anmerkning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Anmerkning">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Rettsstiftelse">
 *       &lt;sequence>
 *         &lt;element name="gjelder" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}DelAvRettList"/>
 *         &lt;element name="saksnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anmerkning", propOrder = {
    "gjelder",
    "saksnummer"
})
@XmlSeeAlso({
    AnmerkningPaaPerson.class,
    AnmerkningPaaRegisterenhetsrettsandel.class
})
public class Anmerkning
    extends Rettsstiftelse
{

    @XmlElement(required = true)
    protected DelAvRettList gjelder;
    @XmlElement(required = true, nillable = true)
    protected String saksnummer;

    /**
     * Gets the value of the gjelder property.
     * 
     * @return
     *     possible object is
     *     {@link DelAvRettList }
     *     
     */
    public DelAvRettList getGjelder() {
        return gjelder;
    }

    /**
     * Sets the value of the gjelder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelAvRettList }
     *     
     */
    public void setGjelder(DelAvRettList value) {
        this.gjelder = value;
    }

    /**
     * Gets the value of the saksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksnummer() {
        return saksnummer;
    }

    /**
     * Sets the value of the saksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksnummer(String value) {
        this.saksnummer = value;
    }

}
