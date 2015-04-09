
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentVersjonKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.EdokDokumentnavnKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseId;


/**
 * <p>Java class for RettsstiftelseSaksbehandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelseSaksbehandling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="rettsstiftelseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseId"/>
 *         &lt;element name="edokDokumentVersjonId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}EdokDokumentVersjonKodeId"/>
 *         &lt;element name="edokDokumentnavnId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}EdokDokumentnavnKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsstiftelseSaksbehandling", propOrder = {
    "rettsstiftelseId",
    "edokDokumentVersjonId",
    "edokDokumentnavnId"
})
public class RettsstiftelseSaksbehandling
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected RettsstiftelseId rettsstiftelseId;
    @XmlElement(required = true)
    protected EdokDokumentVersjonKodeId edokDokumentVersjonId;
    @XmlElement(required = true)
    protected EdokDokumentnavnKodeId edokDokumentnavnId;

    /**
     * Gets the value of the rettsstiftelseId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseId }
     *     
     */
    public RettsstiftelseId getRettsstiftelseId() {
        return rettsstiftelseId;
    }

    /**
     * Sets the value of the rettsstiftelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseId }
     *     
     */
    public void setRettsstiftelseId(RettsstiftelseId value) {
        this.rettsstiftelseId = value;
    }

    /**
     * Gets the value of the edokDokumentVersjonId property.
     * 
     * @return
     *     possible object is
     *     {@link EdokDokumentVersjonKodeId }
     *     
     */
    public EdokDokumentVersjonKodeId getEdokDokumentVersjonId() {
        return edokDokumentVersjonId;
    }

    /**
     * Sets the value of the edokDokumentVersjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdokDokumentVersjonKodeId }
     *     
     */
    public void setEdokDokumentVersjonId(EdokDokumentVersjonKodeId value) {
        this.edokDokumentVersjonId = value;
    }

    /**
     * Gets the value of the edokDokumentnavnId property.
     * 
     * @return
     *     possible object is
     *     {@link EdokDokumentnavnKodeId }
     *     
     */
    public EdokDokumentnavnKodeId getEdokDokumentnavnId() {
        return edokDokumentnavnId;
    }

    /**
     * Sets the value of the edokDokumentnavnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdokDokumentnavnKodeId }
     *     
     */
    public void setEdokDokumentnavnId(EdokDokumentnavnKodeId value) {
        this.edokDokumentnavnId = value;
    }

}
