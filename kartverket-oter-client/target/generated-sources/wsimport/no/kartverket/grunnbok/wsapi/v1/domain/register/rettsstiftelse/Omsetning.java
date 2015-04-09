
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.OmsetningstypeKodeId;


/**
 * <p>Java class for Omsetning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Omsetning">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="utlystTilSalgPaaDetFrieMarked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="omsetningstypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}OmsetningstypeKodeId"/>
 *         &lt;element name="vederlag" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}Beloep"/>
 *         &lt;element name="omsatteRegisterenhetsretter" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}OmsattRegisterenhetsrettList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Omsetning", propOrder = {
    "utlystTilSalgPaaDetFrieMarked",
    "omsetningstypeId",
    "vederlag",
    "omsatteRegisterenhetsretter"
})
@XmlSeeAlso({
    DokumentavgiftspliktigOmsetning.class,
    DokumentavgiftsfriOmsetning.class
})
public class Omsetning
    extends EntityComponentWithHistory
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean utlystTilSalgPaaDetFrieMarked;
    @XmlElement(required = true, nillable = true)
    protected OmsetningstypeKodeId omsetningstypeId;
    @XmlElement(required = true, nillable = true)
    protected Beloep vederlag;
    @XmlElement(required = true)
    protected OmsattRegisterenhetsrettList omsatteRegisterenhetsretter;

    /**
     * Gets the value of the utlystTilSalgPaaDetFrieMarked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtlystTilSalgPaaDetFrieMarked() {
        return utlystTilSalgPaaDetFrieMarked;
    }

    /**
     * Sets the value of the utlystTilSalgPaaDetFrieMarked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtlystTilSalgPaaDetFrieMarked(Boolean value) {
        this.utlystTilSalgPaaDetFrieMarked = value;
    }

    /**
     * Gets the value of the omsetningstypeId property.
     * 
     * @return
     *     possible object is
     *     {@link OmsetningstypeKodeId }
     *     
     */
    public OmsetningstypeKodeId getOmsetningstypeId() {
        return omsetningstypeId;
    }

    /**
     * Sets the value of the omsetningstypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmsetningstypeKodeId }
     *     
     */
    public void setOmsetningstypeId(OmsetningstypeKodeId value) {
        this.omsetningstypeId = value;
    }

    /**
     * Gets the value of the vederlag property.
     * 
     * @return
     *     possible object is
     *     {@link Beloep }
     *     
     */
    public Beloep getVederlag() {
        return vederlag;
    }

    /**
     * Sets the value of the vederlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beloep }
     *     
     */
    public void setVederlag(Beloep value) {
        this.vederlag = value;
    }

    /**
     * Gets the value of the omsatteRegisterenhetsretter property.
     * 
     * @return
     *     possible object is
     *     {@link OmsattRegisterenhetsrettList }
     *     
     */
    public OmsattRegisterenhetsrettList getOmsatteRegisterenhetsretter() {
        return omsatteRegisterenhetsretter;
    }

    /**
     * Sets the value of the omsatteRegisterenhetsretter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OmsattRegisterenhetsrettList }
     *     
     */
    public void setOmsatteRegisterenhetsretter(OmsattRegisterenhetsrettList value) {
        this.omsatteRegisterenhetsretter = value;
    }

}
