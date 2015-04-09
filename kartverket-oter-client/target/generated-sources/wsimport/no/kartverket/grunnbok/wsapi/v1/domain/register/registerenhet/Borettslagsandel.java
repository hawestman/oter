
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.BorettslagId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.adresse.AdresseId;


/**
 * <p>Java class for Borettslagsandel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Borettslagsandel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}Registerenhet">
 *       &lt;sequence>
 *         &lt;element name="borettslagId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}BorettslagId"/>
 *         &lt;element name="andelsnummer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="adresseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/adresse}AdresseId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Borettslagsandel", propOrder = {
    "borettslagId",
    "andelsnummer",
    "adresseId"
})
public class Borettslagsandel
    extends Registerenhet
{

    @XmlElement(required = true)
    protected BorettslagId borettslagId;
    protected long andelsnummer;
    @XmlElement(required = true)
    protected AdresseId adresseId;

    /**
     * Gets the value of the borettslagId property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagId }
     *     
     */
    public BorettslagId getBorettslagId() {
        return borettslagId;
    }

    /**
     * Sets the value of the borettslagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagId }
     *     
     */
    public void setBorettslagId(BorettslagId value) {
        this.borettslagId = value;
    }

    /**
     * Gets the value of the andelsnummer property.
     * 
     */
    public long getAndelsnummer() {
        return andelsnummer;
    }

    /**
     * Sets the value of the andelsnummer property.
     * 
     */
    public void setAndelsnummer(long value) {
        this.andelsnummer = value;
    }

    /**
     * Gets the value of the adresseId property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseId }
     *     
     */
    public AdresseId getAdresseId() {
        return adresseId;
    }

    /**
     * Sets the value of the adresseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseId }
     *     
     */
    public void setAdresseId(AdresseId value) {
        this.adresseId = value;
    }

}
