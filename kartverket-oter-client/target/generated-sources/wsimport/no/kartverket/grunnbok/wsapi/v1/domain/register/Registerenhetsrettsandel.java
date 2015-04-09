
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetId;


/**
 * <p>Java class for Registerenhetsrettsandel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registerenhetsrettsandel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="teller" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nevner" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="loepenummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rettighetshaverPersonId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId"/>
 *         &lt;element name="rettighetshaverRegisterenhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetId"/>
 *         &lt;element name="registerenhetsrettId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registerenhetsrettsandel", propOrder = {
    "teller",
    "nevner",
    "historisk",
    "loepenummer",
    "rettighetshaverPersonId",
    "rettighetshaverRegisterenhetId",
    "registerenhetsrettId"
})
public class Registerenhetsrettsandel
    extends GrunnbokObjectWithHistory
{

    protected long teller;
    protected long nevner;
    protected boolean historisk;
    protected int loepenummer;
    @XmlElement(required = true, nillable = true)
    protected PersonId rettighetshaverPersonId;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetId rettighetshaverRegisterenhetId;
    @XmlElement(required = true)
    protected RegisterenhetsrettId registerenhetsrettId;

    /**
     * Gets the value of the teller property.
     * 
     */
    public long getTeller() {
        return teller;
    }

    /**
     * Sets the value of the teller property.
     * 
     */
    public void setTeller(long value) {
        this.teller = value;
    }

    /**
     * Gets the value of the nevner property.
     * 
     */
    public long getNevner() {
        return nevner;
    }

    /**
     * Sets the value of the nevner property.
     * 
     */
    public void setNevner(long value) {
        this.nevner = value;
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

    /**
     * Gets the value of the loepenummer property.
     * 
     */
    public int getLoepenummer() {
        return loepenummer;
    }

    /**
     * Sets the value of the loepenummer property.
     * 
     */
    public void setLoepenummer(int value) {
        this.loepenummer = value;
    }

    /**
     * Gets the value of the rettighetshaverPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getRettighetshaverPersonId() {
        return rettighetshaverPersonId;
    }

    /**
     * Sets the value of the rettighetshaverPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setRettighetshaverPersonId(PersonId value) {
        this.rettighetshaverPersonId = value;
    }

    /**
     * Gets the value of the rettighetshaverRegisterenhetId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetId }
     *     
     */
    public RegisterenhetId getRettighetshaverRegisterenhetId() {
        return rettighetshaverRegisterenhetId;
    }

    /**
     * Sets the value of the rettighetshaverRegisterenhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetId }
     *     
     */
    public void setRettighetshaverRegisterenhetId(RegisterenhetId value) {
        this.rettighetshaverRegisterenhetId = value;
    }

    /**
     * Gets the value of the registerenhetsrettId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public RegisterenhetsrettId getRegisterenhetsrettId() {
        return registerenhetsrettId;
    }

    /**
     * Sets the value of the registerenhetsrettId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettId }
     *     
     */
    public void setRegisterenhetsrettId(RegisterenhetsrettId value) {
        this.registerenhetsrettId = value;
    }

}
