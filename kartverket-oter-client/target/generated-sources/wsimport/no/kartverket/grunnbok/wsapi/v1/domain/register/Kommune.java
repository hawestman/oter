
package no.kartverket.grunnbok.wsapi.v1.domain.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EmbeteKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.KonsesjonsgrenseKodeId;


/**
 * <p>Java class for Kommune complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kommune">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="kommunenummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="embeteId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}EmbeteKodeId"/>
 *         &lt;element name="konsesjonsgrenseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}KonsesjonsgrenseKodeId"/>
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
@XmlType(name = "Kommune", propOrder = {
    "kommunenummer",
    "navn",
    "embeteId",
    "konsesjonsgrenseId",
    "historisk"
})
public class Kommune
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected String kommunenummer;
    @XmlElement(required = true)
    protected String navn;
    @XmlElement(required = true)
    protected EmbeteKodeId embeteId;
    @XmlElement(required = true)
    protected KonsesjonsgrenseKodeId konsesjonsgrenseId;
    protected boolean historisk;

    /**
     * Gets the value of the kommunenummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunenummer() {
        return kommunenummer;
    }

    /**
     * Sets the value of the kommunenummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunenummer(String value) {
        this.kommunenummer = value;
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
     * Gets the value of the embeteId property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeteKodeId }
     *     
     */
    public EmbeteKodeId getEmbeteId() {
        return embeteId;
    }

    /**
     * Sets the value of the embeteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeteKodeId }
     *     
     */
    public void setEmbeteId(EmbeteKodeId value) {
        this.embeteId = value;
    }

    /**
     * Gets the value of the konsesjonsgrenseId property.
     * 
     * @return
     *     possible object is
     *     {@link KonsesjonsgrenseKodeId }
     *     
     */
    public KonsesjonsgrenseKodeId getKonsesjonsgrenseId() {
        return konsesjonsgrenseId;
    }

    /**
     * Sets the value of the konsesjonsgrenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonsesjonsgrenseKodeId }
     *     
     */
    public void setKonsesjonsgrenseId(KonsesjonsgrenseKodeId value) {
        this.konsesjonsgrenseId = value;
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
