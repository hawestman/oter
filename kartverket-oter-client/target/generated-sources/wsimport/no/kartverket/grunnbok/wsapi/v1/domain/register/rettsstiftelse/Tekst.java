
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TeksttypeKodeId;


/**
 * <p>Java class for Tekst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tekst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fritekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teksttypeKodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}TeksttypeKodeId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tekst", propOrder = {
    "fritekst",
    "teksttypeKodeId"
})
public class Tekst {

    @XmlElement(required = true, nillable = true)
    protected String fritekst;
    @XmlElement(required = true)
    protected TeksttypeKodeId teksttypeKodeId;

    /**
     * Gets the value of the fritekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFritekst() {
        return fritekst;
    }

    /**
     * Sets the value of the fritekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFritekst(String value) {
        this.fritekst = value;
    }

    /**
     * Gets the value of the teksttypeKodeId property.
     * 
     * @return
     *     possible object is
     *     {@link TeksttypeKodeId }
     *     
     */
    public TeksttypeKodeId getTeksttypeKodeId() {
        return teksttypeKodeId;
    }

    /**
     * Sets the value of the teksttypeKodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeksttypeKodeId }
     *     
     */
    public void setTeksttypeKodeId(TeksttypeKodeId value) {
        this.teksttypeKodeId = value;
    }

}
