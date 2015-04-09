
package no.kartverket.grunnbok.wsapi.v1.domain.kodeliste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObject;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalizedString;


/**
 * <p>Java class for Kodeliste complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kodeliste">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObject">
 *       &lt;sequence>
 *         &lt;element name="kodeIdClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="navn" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalizedString"/>
 *         &lt;element name="beskrivelse" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalizedString"/>
 *         &lt;element name="koderIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/kodeliste}KodeIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kodeliste", propOrder = {
    "kodeIdClass",
    "navn",
    "beskrivelse",
    "koderIds"
})
public class Kodeliste
    extends GrunnbokBubbleObject
{

    @XmlElement(required = true)
    protected String kodeIdClass;
    @XmlElement(required = true)
    protected LocalizedString navn;
    @XmlElement(required = true)
    protected LocalizedString beskrivelse;
    @XmlElement(required = true)
    protected KodeIdList koderIds;

    /**
     * Gets the value of the kodeIdClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeIdClass() {
        return kodeIdClass;
    }

    /**
     * Sets the value of the kodeIdClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeIdClass(String value) {
        this.kodeIdClass = value;
    }

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedString }
     *     
     */
    public LocalizedString getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedString }
     *     
     */
    public void setNavn(LocalizedString value) {
        this.navn = value;
    }

    /**
     * Gets the value of the beskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedString }
     *     
     */
    public LocalizedString getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets the value of the beskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedString }
     *     
     */
    public void setBeskrivelse(LocalizedString value) {
        this.beskrivelse = value;
    }

    /**
     * Gets the value of the koderIds property.
     * 
     * @return
     *     possible object is
     *     {@link KodeIdList }
     *     
     */
    public KodeIdList getKoderIds() {
        return koderIds;
    }

    /**
     * Sets the value of the koderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodeIdList }
     *     
     */
    public void setKoderIds(KodeIdList value) {
        this.koderIds = value;
    }

}
