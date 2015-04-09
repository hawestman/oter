
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.PostnummeromraadeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.IdentifikasjonsnummertypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.LandkodeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.MaalformKodeId;


/**
 * <p>Java class for Journalperson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Journalperson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="identifikasjonsnummertypeKodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}IdentifikasjonsnummertypeKodeId"/>
 *         &lt;element name="identifikasjonsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresselinje1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresselinje2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresselinje3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="epostadresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poststedId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}PostnummeromraadeId"/>
 *         &lt;element name="landkodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}LandkodeKodeId"/>
 *         &lt;element name="maalformId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}MaalformKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journalperson", propOrder = {
    "identifikasjonsnummertypeKodeId",
    "identifikasjonsnummer",
    "navn",
    "adresselinje1",
    "adresselinje2",
    "adresselinje3",
    "epostadresse",
    "poststedId",
    "landkodeId",
    "maalformId"
})
public class Journalperson
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected IdentifikasjonsnummertypeKodeId identifikasjonsnummertypeKodeId;
    @XmlElement(required = true)
    protected String identifikasjonsnummer;
    @XmlElement(required = true, nillable = true)
    protected String navn;
    @XmlElement(required = true, nillable = true)
    protected String adresselinje1;
    @XmlElement(required = true, nillable = true)
    protected String adresselinje2;
    @XmlElement(required = true, nillable = true)
    protected String adresselinje3;
    @XmlElement(required = true, nillable = true)
    protected String epostadresse;
    @XmlElement(required = true, nillable = true)
    protected PostnummeromraadeId poststedId;
    @XmlElement(required = true)
    protected LandkodeKodeId landkodeId;
    @XmlElement(required = true)
    protected MaalformKodeId maalformId;

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
     * Gets the value of the adresselinje1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresselinje1() {
        return adresselinje1;
    }

    /**
     * Sets the value of the adresselinje1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresselinje1(String value) {
        this.adresselinje1 = value;
    }

    /**
     * Gets the value of the adresselinje2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresselinje2() {
        return adresselinje2;
    }

    /**
     * Sets the value of the adresselinje2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresselinje2(String value) {
        this.adresselinje2 = value;
    }

    /**
     * Gets the value of the adresselinje3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresselinje3() {
        return adresselinje3;
    }

    /**
     * Sets the value of the adresselinje3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresselinje3(String value) {
        this.adresselinje3 = value;
    }

    /**
     * Gets the value of the epostadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpostadresse() {
        return epostadresse;
    }

    /**
     * Sets the value of the epostadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpostadresse(String value) {
        this.epostadresse = value;
    }

    /**
     * Gets the value of the poststedId property.
     * 
     * @return
     *     possible object is
     *     {@link PostnummeromraadeId }
     *     
     */
    public PostnummeromraadeId getPoststedId() {
        return poststedId;
    }

    /**
     * Sets the value of the poststedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostnummeromraadeId }
     *     
     */
    public void setPoststedId(PostnummeromraadeId value) {
        this.poststedId = value;
    }

    /**
     * Gets the value of the landkodeId property.
     * 
     * @return
     *     possible object is
     *     {@link LandkodeKodeId }
     *     
     */
    public LandkodeKodeId getLandkodeId() {
        return landkodeId;
    }

    /**
     * Sets the value of the landkodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandkodeKodeId }
     *     
     */
    public void setLandkodeId(LandkodeKodeId value) {
        this.landkodeId = value;
    }

    /**
     * Gets the value of the maalformId property.
     * 
     * @return
     *     possible object is
     *     {@link MaalformKodeId }
     *     
     */
    public MaalformKodeId getMaalformId() {
        return maalformId;
    }

    /**
     * Sets the value of the maalformId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaalformKodeId }
     *     
     */
    public void setMaalformId(MaalformKodeId value) {
        this.maalformId = value;
    }

}
