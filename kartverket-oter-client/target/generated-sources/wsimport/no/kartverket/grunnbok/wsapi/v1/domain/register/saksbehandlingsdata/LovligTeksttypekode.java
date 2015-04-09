
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.EntityComponentWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.TeksttypeKodeId;


/**
 * <p>Java class for LovligTeksttypekode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LovligTeksttypekode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}EntityComponentWithHistory">
 *       &lt;sequence>
 *         &lt;element name="teksttypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}TeksttypeKodeId"/>
 *         &lt;element name="rettsstiftelsestypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettsstiftelsestypeKodeId"/>
 *         &lt;element name="raaderettskode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "LovligTeksttypekode", propOrder = {
    "teksttypeId",
    "rettsstiftelsestypeId",
    "raaderettskode",
    "historisk"
})
public class LovligTeksttypekode
    extends EntityComponentWithHistory
{

    @XmlElement(required = true)
    protected TeksttypeKodeId teksttypeId;
    @XmlElement(required = true)
    protected RettsstiftelsestypeKodeId rettsstiftelsestypeId;
    protected boolean raaderettskode;
    protected boolean historisk;

    /**
     * Gets the value of the teksttypeId property.
     * 
     * @return
     *     possible object is
     *     {@link TeksttypeKodeId }
     *     
     */
    public TeksttypeKodeId getTeksttypeId() {
        return teksttypeId;
    }

    /**
     * Sets the value of the teksttypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeksttypeKodeId }
     *     
     */
    public void setTeksttypeId(TeksttypeKodeId value) {
        this.teksttypeId = value;
    }

    /**
     * Gets the value of the rettsstiftelsestypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public RettsstiftelsestypeKodeId getRettsstiftelsestypeId() {
        return rettsstiftelsestypeId;
    }

    /**
     * Sets the value of the rettsstiftelsestypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public void setRettsstiftelsestypeId(RettsstiftelsestypeKodeId value) {
        this.rettsstiftelsestypeId = value;
    }

    /**
     * Gets the value of the raaderettskode property.
     * 
     */
    public boolean isRaaderettskode() {
        return raaderettskode;
    }

    /**
     * Sets the value of the raaderettskode property.
     * 
     */
    public void setRaaderettskode(boolean value) {
        this.raaderettskode = value;
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
