
package no.kartverket.grunnbok.wsapi.v1.domain.register.adresse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.LandkodeKodeId;


/**
 * <p>Java class for Adresse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adresse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="landkodeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}LandkodeKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresse", propOrder = {
    "landkodeId"
})
@XmlSeeAlso({
    Vegadresse.class,
    UtenlandskAdresse.class,
    KonvertertAdresse.class,
    Matrikkeladresse.class
})
public class Adresse
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true, nillable = true)
    protected LandkodeKodeId landkodeId;

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

}
