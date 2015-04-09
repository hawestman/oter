
package no.kartverket.grunnbok.wsapi.v1.domain.register.adresse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneId;


/**
 * <p>Java class for Matrikkeladresse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Matrikkeladresse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/adresse}Adresse">
 *       &lt;sequence>
 *         &lt;element name="kommuneId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}KommuneId"/>
 *         &lt;element name="gaardsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bruksnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="festenummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="undernummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bolignummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bruksenhetIdFraMatrikkelen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="adresseIdFraMatrikkelen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Matrikkeladresse", propOrder = {
    "kommuneId",
    "gaardsnummer",
    "bruksnummer",
    "festenummer",
    "undernummer",
    "bolignummer",
    "bruksenhetIdFraMatrikkelen",
    "adresseIdFraMatrikkelen"
})
public class Matrikkeladresse
    extends Adresse
{

    @XmlElement(required = true)
    protected KommuneId kommuneId;
    protected int gaardsnummer;
    protected int bruksnummer;
    protected int festenummer;
    protected int undernummer;
    @XmlElement(required = true)
    protected String bolignummer;
    protected long bruksenhetIdFraMatrikkelen;
    protected long adresseIdFraMatrikkelen;

    /**
     * Gets the value of the kommuneId property.
     * 
     * @return
     *     possible object is
     *     {@link KommuneId }
     *     
     */
    public KommuneId getKommuneId() {
        return kommuneId;
    }

    /**
     * Sets the value of the kommuneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KommuneId }
     *     
     */
    public void setKommuneId(KommuneId value) {
        this.kommuneId = value;
    }

    /**
     * Gets the value of the gaardsnummer property.
     * 
     */
    public int getGaardsnummer() {
        return gaardsnummer;
    }

    /**
     * Sets the value of the gaardsnummer property.
     * 
     */
    public void setGaardsnummer(int value) {
        this.gaardsnummer = value;
    }

    /**
     * Gets the value of the bruksnummer property.
     * 
     */
    public int getBruksnummer() {
        return bruksnummer;
    }

    /**
     * Sets the value of the bruksnummer property.
     * 
     */
    public void setBruksnummer(int value) {
        this.bruksnummer = value;
    }

    /**
     * Gets the value of the festenummer property.
     * 
     */
    public int getFestenummer() {
        return festenummer;
    }

    /**
     * Sets the value of the festenummer property.
     * 
     */
    public void setFestenummer(int value) {
        this.festenummer = value;
    }

    /**
     * Gets the value of the undernummer property.
     * 
     */
    public int getUndernummer() {
        return undernummer;
    }

    /**
     * Sets the value of the undernummer property.
     * 
     */
    public void setUndernummer(int value) {
        this.undernummer = value;
    }

    /**
     * Gets the value of the bolignummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolignummer() {
        return bolignummer;
    }

    /**
     * Sets the value of the bolignummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolignummer(String value) {
        this.bolignummer = value;
    }

    /**
     * Gets the value of the bruksenhetIdFraMatrikkelen property.
     * 
     */
    public long getBruksenhetIdFraMatrikkelen() {
        return bruksenhetIdFraMatrikkelen;
    }

    /**
     * Sets the value of the bruksenhetIdFraMatrikkelen property.
     * 
     */
    public void setBruksenhetIdFraMatrikkelen(long value) {
        this.bruksenhetIdFraMatrikkelen = value;
    }

    /**
     * Gets the value of the adresseIdFraMatrikkelen property.
     * 
     */
    public long getAdresseIdFraMatrikkelen() {
        return adresseIdFraMatrikkelen;
    }

    /**
     * Sets the value of the adresseIdFraMatrikkelen property.
     * 
     */
    public void setAdresseIdFraMatrikkelen(long value) {
        this.adresseIdFraMatrikkelen = value;
    }

}
