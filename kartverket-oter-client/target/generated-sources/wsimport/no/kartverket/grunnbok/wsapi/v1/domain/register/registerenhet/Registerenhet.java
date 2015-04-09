
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;


/**
 * <p>Java class for Registerenhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Registerenhet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="utgaatt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="omnummerertTilId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registerenhet", propOrder = {
    "utgaatt",
    "omnummerertTilId"
})
@XmlSeeAlso({
    Borettslagsandel.class,
    Matrikkelenhet.class
})
public class Registerenhet
    extends GrunnbokObjectWithHistory
{

    protected boolean utgaatt;
    @XmlElement(required = true, nillable = true)
    protected RegisterenhetId omnummerertTilId;

    /**
     * Gets the value of the utgaatt property.
     * 
     */
    public boolean isUtgaatt() {
        return utgaatt;
    }

    /**
     * Sets the value of the utgaatt property.
     * 
     */
    public void setUtgaatt(boolean value) {
        this.utgaatt = value;
    }

    /**
     * Gets the value of the omnummerertTilId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetId }
     *     
     */
    public RegisterenhetId getOmnummerertTilId() {
        return omnummerertTilId;
    }

    /**
     * Sets the value of the omnummerertTilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetId }
     *     
     */
    public void setOmnummerertTilId(RegisterenhetId value) {
        this.omnummerertTilId = value;
    }

}
