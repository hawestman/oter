
package no.kartverket.grunnbok.wsapi.v1.service.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;


/**
 * <p>Java class for findPersoner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findPersoner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fysiskPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="juridiskPerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="foedselsaar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grunnbokContext" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPersoner", propOrder = {
    "navn",
    "fysiskPerson",
    "juridiskPerson",
    "foedselsaar",
    "grunnbokContext"
})
public class FindPersoner {

    protected String navn;
    protected boolean fysiskPerson;
    protected boolean juridiskPerson;
    protected int foedselsaar;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the fysiskPerson property.
     * 
     */
    public boolean isFysiskPerson() {
        return fysiskPerson;
    }

    /**
     * Sets the value of the fysiskPerson property.
     * 
     */
    public void setFysiskPerson(boolean value) {
        this.fysiskPerson = value;
    }

    /**
     * Gets the value of the juridiskPerson property.
     * 
     */
    public boolean isJuridiskPerson() {
        return juridiskPerson;
    }

    /**
     * Sets the value of the juridiskPerson property.
     * 
     */
    public void setJuridiskPerson(boolean value) {
        this.juridiskPerson = value;
    }

    /**
     * Gets the value of the foedselsaar property.
     * 
     */
    public int getFoedselsaar() {
        return foedselsaar;
    }

    /**
     * Sets the value of the foedselsaar property.
     * 
     */
    public void setFoedselsaar(int value) {
        this.foedselsaar = value;
    }

    /**
     * Gets the value of the grunnbokContext property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokContext }
     *     
     */
    public GrunnbokContext getGrunnbokContext() {
        return grunnbokContext;
    }

    /**
     * Sets the value of the grunnbokContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokContext }
     *     
     */
    public void setGrunnbokContext(GrunnbokContext value) {
        this.grunnbokContext = value;
    }

}
