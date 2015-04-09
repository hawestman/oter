
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.FormaalKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TilleggsdeltypeKodeId;


/**
 * <p>Java class for Seksjonssameieandel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seksjonssameieandel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="teller" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nevner" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loepenummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formaalId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}FormaalKodeId"/>
 *         &lt;element name="tilleggsdeltypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}TilleggsdeltypeKodeId"/>
 *         &lt;element name="seksjonId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seksjonssameieandel", propOrder = {
    "historisk",
    "teller",
    "nevner",
    "loepenummer",
    "formaalId",
    "tilleggsdeltypeId",
    "seksjonId"
})
public class Seksjonssameieandel
    extends GrunnbokObjectWithHistory
{

    protected boolean historisk;
    protected long teller;
    protected long nevner;
    protected int loepenummer;
    @XmlElement(required = true)
    protected FormaalKodeId formaalId;
    @XmlElement(required = true, nillable = true)
    protected TilleggsdeltypeKodeId tilleggsdeltypeId;
    @XmlElement(required = true)
    protected SeksjonId seksjonId;

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
     * Gets the value of the formaalId property.
     * 
     * @return
     *     possible object is
     *     {@link FormaalKodeId }
     *     
     */
    public FormaalKodeId getFormaalId() {
        return formaalId;
    }

    /**
     * Sets the value of the formaalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaalKodeId }
     *     
     */
    public void setFormaalId(FormaalKodeId value) {
        this.formaalId = value;
    }

    /**
     * Gets the value of the tilleggsdeltypeId property.
     * 
     * @return
     *     possible object is
     *     {@link TilleggsdeltypeKodeId }
     *     
     */
    public TilleggsdeltypeKodeId getTilleggsdeltypeId() {
        return tilleggsdeltypeId;
    }

    /**
     * Sets the value of the tilleggsdeltypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilleggsdeltypeKodeId }
     *     
     */
    public void setTilleggsdeltypeId(TilleggsdeltypeKodeId value) {
        this.tilleggsdeltypeId = value;
    }

    /**
     * Gets the value of the seksjonId property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonId }
     *     
     */
    public SeksjonId getSeksjonId() {
        return seksjonId;
    }

    /**
     * Sets the value of the seksjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonId }
     *     
     */
    public void setSeksjonId(SeksjonId value) {
        this.seksjonId = value;
    }

}
