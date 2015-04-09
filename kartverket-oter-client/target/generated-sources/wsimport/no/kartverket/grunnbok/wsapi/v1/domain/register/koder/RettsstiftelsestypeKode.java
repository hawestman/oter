
package no.kartverket.grunnbok.wsapi.v1.domain.register.koder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.GrunnbokKode;


/**
 * <p>Java class for RettsstiftelsestypeKode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelsestypeKode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/kodeliste}GrunnbokKode">
 *       &lt;sequence>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rettstypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettstypeKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsstiftelsestypeKode", propOrder = {
    "historisk",
    "rettstypeId"
})
public class RettsstiftelsestypeKode
    extends GrunnbokKode
{

    protected boolean historisk;
    @XmlElement(required = true)
    protected RettstypeKodeId rettstypeId;

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
     * Gets the value of the rettstypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RettstypeKodeId }
     *     
     */
    public RettstypeKodeId getRettstypeId() {
        return rettstypeId;
    }

    /**
     * Sets the value of the rettstypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettstypeKodeId }
     *     
     */
    public void setRettstypeId(RettstypeKodeId value) {
        this.rettstypeId = value;
    }

}
