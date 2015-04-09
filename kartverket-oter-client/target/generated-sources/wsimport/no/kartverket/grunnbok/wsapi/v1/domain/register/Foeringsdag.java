
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;


/**
 * <p>Java class for Foeringsdag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Foeringsdag">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="foeringsdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="avsluttetForFast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="avsluttetForBorett" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Foeringsdag", propOrder = {
    "foeringsdato",
    "avsluttetForFast",
    "avsluttetForBorett"
})
public class Foeringsdag
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected LocalDate foeringsdato;
    protected boolean avsluttetForFast;
    protected boolean avsluttetForBorett;

    /**
     * Gets the value of the foeringsdato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getFoeringsdato() {
        return foeringsdato;
    }

    /**
     * Sets the value of the foeringsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setFoeringsdato(LocalDate value) {
        this.foeringsdato = value;
    }

    /**
     * Gets the value of the avsluttetForFast property.
     * 
     */
    public boolean isAvsluttetForFast() {
        return avsluttetForFast;
    }

    /**
     * Sets the value of the avsluttetForFast property.
     * 
     */
    public void setAvsluttetForFast(boolean value) {
        this.avsluttetForFast = value;
    }

    /**
     * Gets the value of the avsluttetForBorett property.
     * 
     */
    public boolean isAvsluttetForBorett() {
        return avsluttetForBorett;
    }

    /**
     * Sets the value of the avsluttetForBorett property.
     * 
     */
    public void setAvsluttetForBorett(boolean value) {
        this.avsluttetForBorett = value;
    }

}
