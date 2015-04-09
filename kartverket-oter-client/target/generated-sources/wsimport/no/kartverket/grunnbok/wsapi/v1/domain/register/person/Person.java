
package no.kartverket.grunnbok.wsapi.v1.domain.register.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.IdentifikasjonsnummertypeKodeId;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="identifikasjonsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identifikasjonsnummertypeKodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}IdentifikasjonsnummertypeKodeId"/>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Person", propOrder = {
    "identifikasjonsnummer",
    "identifikasjonsnummertypeKodeId",
    "navn",
    "historisk"
})
public class Person
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected String identifikasjonsnummer;
    @XmlElement(required = true)
    protected IdentifikasjonsnummertypeKodeId identifikasjonsnummertypeKodeId;
    @XmlElement(required = true)
    protected String navn;
    protected boolean historisk;

    /**
     * Gets the value of the identifikasjonsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifikasjonsnummer() {
        return identifikasjonsnummer;
    }

    /**
     * Sets the value of the identifikasjonsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifikasjonsnummer(String value) {
        this.identifikasjonsnummer = value;
    }

    /**
     * Gets the value of the identifikasjonsnummertypeKodeId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikasjonsnummertypeKodeId }
     *     
     */
    public IdentifikasjonsnummertypeKodeId getIdentifikasjonsnummertypeKodeId() {
        return identifikasjonsnummertypeKodeId;
    }

    /**
     * Sets the value of the identifikasjonsnummertypeKodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikasjonsnummertypeKodeId }
     *     
     */
    public void setIdentifikasjonsnummertypeKodeId(IdentifikasjonsnummertypeKodeId value) {
        this.identifikasjonsnummertypeKodeId = value;
    }

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
