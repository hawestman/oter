
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;


/**
 * <p>Java class for Overfoering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Overfoering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="overfoerendeRettsstiftelseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseId"/>
 *         &lt;element name="overfoertRettsstiftelseId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseId"/>
 *         &lt;element name="omfatter" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}OverfoeringFraTilList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Overfoering", propOrder = {
    "overfoerendeRettsstiftelseId",
    "overfoertRettsstiftelseId",
    "omfatter"
})
public class Overfoering
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true, nillable = true)
    protected RettsstiftelseId overfoerendeRettsstiftelseId;
    @XmlElement(required = true, nillable = true)
    protected RettsstiftelseId overfoertRettsstiftelseId;
    @XmlElement(required = true)
    protected OverfoeringFraTilList omfatter;

    /**
     * Gets the value of the overfoerendeRettsstiftelseId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseId }
     *     
     */
    public RettsstiftelseId getOverfoerendeRettsstiftelseId() {
        return overfoerendeRettsstiftelseId;
    }

    /**
     * Sets the value of the overfoerendeRettsstiftelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseId }
     *     
     */
    public void setOverfoerendeRettsstiftelseId(RettsstiftelseId value) {
        this.overfoerendeRettsstiftelseId = value;
    }

    /**
     * Gets the value of the overfoertRettsstiftelseId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseId }
     *     
     */
    public RettsstiftelseId getOverfoertRettsstiftelseId() {
        return overfoertRettsstiftelseId;
    }

    /**
     * Sets the value of the overfoertRettsstiftelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseId }
     *     
     */
    public void setOverfoertRettsstiftelseId(RettsstiftelseId value) {
        this.overfoertRettsstiftelseId = value;
    }

    /**
     * Gets the value of the omfatter property.
     * 
     * @return
     *     possible object is
     *     {@link OverfoeringFraTilList }
     *     
     */
    public OverfoeringFraTilList getOmfatter() {
        return omfatter;
    }

    /**
     * Sets the value of the omfatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverfoeringFraTilList }
     *     
     */
    public void setOmfatter(OverfoeringFraTilList value) {
        this.omfatter = value;
    }

}
