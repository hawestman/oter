
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.DokumentavgiftsaarsakKodeId;


/**
 * <p>Java class for DokumentavgiftspliktigOmsetning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentavgiftspliktigOmsetning">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Omsetning">
 *       &lt;sequence>
 *         &lt;element name="dokumentavgiftsgrunnlag" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *         &lt;element name="dokumentavgift" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *         &lt;element name="dokumentavgiftsaarsakId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}DokumentavgiftsaarsakKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentavgiftspliktigOmsetning", propOrder = {
    "dokumentavgiftsgrunnlag",
    "dokumentavgift",
    "dokumentavgiftsaarsakId"
})
public class DokumentavgiftspliktigOmsetning
    extends Omsetning
{

    @XmlElement(required = true, nillable = true)
    protected Beloep dokumentavgiftsgrunnlag;
    @XmlElement(required = true, nillable = true)
    protected Beloep dokumentavgift;
    @XmlElement(required = true)
    protected DokumentavgiftsaarsakKodeId dokumentavgiftsaarsakId;

    /**
     * Gets the value of the dokumentavgiftsgrunnlag property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getDokumentavgiftsgrunnlag() {
        return dokumentavgiftsgrunnlag;
    }

    /**
     * Sets the value of the dokumentavgiftsgrunnlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setDokumentavgiftsgrunnlag(Beloep value) {
        this.dokumentavgiftsgrunnlag = value;
    }

    /**
     * Gets the value of the dokumentavgift property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getDokumentavgift() {
        return dokumentavgift;
    }

    /**
     * Sets the value of the dokumentavgift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setDokumentavgift(Beloep value) {
        this.dokumentavgift = value;
    }

    /**
     * Gets the value of the dokumentavgiftsaarsakId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentavgiftsaarsakKodeId }
     *     
     */
    public DokumentavgiftsaarsakKodeId getDokumentavgiftsaarsakId() {
        return dokumentavgiftsaarsakId;
    }

    /**
     * Sets the value of the dokumentavgiftsaarsakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentavgiftsaarsakKodeId }
     *     
     */
    public void setDokumentavgiftsaarsakId(DokumentavgiftsaarsakKodeId value) {
        this.dokumentavgiftsaarsakId = value;
    }

}
