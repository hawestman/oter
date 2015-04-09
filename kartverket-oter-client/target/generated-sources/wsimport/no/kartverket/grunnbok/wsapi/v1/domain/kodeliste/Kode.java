
package no.kartverket.grunnbok.wsapi.v1.domain.kodeliste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObject;


/**
 * <p>Java class for Kode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObject">
 *       &lt;sequence>
 *         &lt;element name="kodelisteId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/kodeliste}KodelisteId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kode", propOrder = {
    "kodelisteId"
})
@XmlSeeAlso({
    GrunnbokKode.class
})
public class Kode
    extends GrunnbokBubbleObject
{

    @XmlElement(required = true)
    protected KodelisteId kodelisteId;

    /**
     * Gets the value of the kodelisteId property.
     * 
     * @return
     *     possible object is
     *     {@link KodelisteId }
     *     
     */
    public KodelisteId getKodelisteId() {
        return kodelisteId;
    }

    /**
     * Sets the value of the kodelisteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodelisteId }
     *     
     */
    public void setKodelisteId(KodelisteId value) {
        this.kodelisteId = value;
    }

}
