
package no.kartverket.grunnbok.wsapi.v1.domain.register.adresse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneId;


/**
 * <p>Java class for Vegadresse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vegadresse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/adresse}Adresse">
 *       &lt;sequence>
 *         &lt;element name="kommuneId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}KommuneId"/>
 *         &lt;element name="adressekode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adressenavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="husnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bokstav" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Vegadresse", propOrder = {
    "kommuneId",
    "adressekode",
    "adressenavn",
    "husnummer",
    "bokstav",
    "bolignummer",
    "bruksenhetIdFraMatrikkelen",
    "adresseIdFraMatrikkelen"
})
public class Vegadresse
    extends Adresse
{

    @XmlElement(required = true)
    protected KommuneId kommuneId;
    protected int adressekode;
    @XmlElement(required = true, nillable = true)
    protected String adressenavn;
    protected int husnummer;
    @XmlElement(required = true, nillable = true)
    protected String bokstav;
    @XmlElement(required = true, nillable = true)
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
     * Gets the value of the adressekode property.
     * 
     */
    public int getAdressekode() {
        return adressekode;
    }

    /**
     * Sets the value of the adressekode property.
     * 
     */
    public void setAdressekode(int value) {
        this.adressekode = value;
    }

    /**
     * Gets the value of the adressenavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressenavn() {
        return adressenavn;
    }

    /**
     * Sets the value of the adressenavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressenavn(String value) {
        this.adressenavn = value;
    }

    /**
     * Gets the value of the husnummer property.
     * 
     */
    public int getHusnummer() {
        return husnummer;
    }

    /**
     * Sets the value of the husnummer property.
     * 
     */
    public void setHusnummer(int value) {
        this.husnummer = value;
    }

    /**
     * Gets the value of the bokstav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBokstav() {
        return bokstav;
    }

    /**
     * Sets the value of the bokstav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBokstav(String value) {
        this.bokstav = value;
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
