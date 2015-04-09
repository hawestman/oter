
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.SameietypeKodeId;


/**
 * <p>Java class for Matrikkelenhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Matrikkelenhet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}Registerenhet">
 *       &lt;sequence>
 *         &lt;element name="kommuneId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}KommuneId"/>
 *         &lt;element name="gaardsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bruksnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="festenummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seksjonsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tinglyst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="manglerDokumenterFraManuellGrunnbok" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sameietypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}SameietypeKodeId"/>
 *         &lt;element name="beregnetErSeksjonert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="beregnetHarAktiveFestegrunner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Matrikkelenhet", propOrder = {
    "kommuneId",
    "gaardsnummer",
    "bruksnummer",
    "festenummer",
    "seksjonsnummer",
    "tinglyst",
    "manglerDokumenterFraManuellGrunnbok",
    "sameietypeId",
    "beregnetErSeksjonert",
    "beregnetHarAktiveFestegrunner"
})
@XmlSeeAlso({
    Seksjon.class,
    Festegrunn.class
})
public class Matrikkelenhet
    extends Registerenhet
{

    @XmlElement(required = true)
    protected KommuneId kommuneId;
    protected int gaardsnummer;
    protected int bruksnummer;
    protected int festenummer;
    protected int seksjonsnummer;
    protected boolean tinglyst;
    protected boolean manglerDokumenterFraManuellGrunnbok;
    @XmlElement(required = true)
    protected SameietypeKodeId sameietypeId;
    protected boolean beregnetErSeksjonert;
    protected boolean beregnetHarAktiveFestegrunner;

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
     * Gets the value of the seksjonsnummer property.
     * 
     */
    public int getSeksjonsnummer() {
        return seksjonsnummer;
    }

    /**
     * Sets the value of the seksjonsnummer property.
     * 
     */
    public void setSeksjonsnummer(int value) {
        this.seksjonsnummer = value;
    }

    /**
     * Gets the value of the tinglyst property.
     * 
     */
    public boolean isTinglyst() {
        return tinglyst;
    }

    /**
     * Sets the value of the tinglyst property.
     * 
     */
    public void setTinglyst(boolean value) {
        this.tinglyst = value;
    }

    /**
     * Gets the value of the manglerDokumenterFraManuellGrunnbok property.
     * 
     */
    public boolean isManglerDokumenterFraManuellGrunnbok() {
        return manglerDokumenterFraManuellGrunnbok;
    }

    /**
     * Sets the value of the manglerDokumenterFraManuellGrunnbok property.
     * 
     */
    public void setManglerDokumenterFraManuellGrunnbok(boolean value) {
        this.manglerDokumenterFraManuellGrunnbok = value;
    }

    /**
     * Gets the value of the sameietypeId property.
     * 
     * @return
     *     possible object is
     *     {@link SameietypeKodeId }
     *     
     */
    public SameietypeKodeId getSameietypeId() {
        return sameietypeId;
    }

    /**
     * Sets the value of the sameietypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameietypeKodeId }
     *     
     */
    public void setSameietypeId(SameietypeKodeId value) {
        this.sameietypeId = value;
    }

    /**
     * Gets the value of the beregnetErSeksjonert property.
     * 
     */
    public boolean isBeregnetErSeksjonert() {
        return beregnetErSeksjonert;
    }

    /**
     * Sets the value of the beregnetErSeksjonert property.
     * 
     */
    public void setBeregnetErSeksjonert(boolean value) {
        this.beregnetErSeksjonert = value;
    }

    /**
     * Gets the value of the beregnetHarAktiveFestegrunner property.
     * 
     */
    public boolean isBeregnetHarAktiveFestegrunner() {
        return beregnetHarAktiveFestegrunner;
    }

    /**
     * Sets the value of the beregnetHarAktiveFestegrunner property.
     * 
     */
    public void setBeregnetHarAktiveFestegrunner(boolean value) {
        this.beregnetHarAktiveFestegrunner = value;
    }

}
