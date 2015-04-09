
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.endringslogg.Endring;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.Kode;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.Kodeliste;


/**
 * <p>Java class for GrunnbokBubbleObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokBubbleObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokBubbleObject", propOrder = {
    "id"
})
@XmlSeeAlso({
    Kodeliste.class,
    Kode.class,
    GrunnbokObjectWithVersion.class,
    Endring.class
})
public class GrunnbokBubbleObject {

    @XmlElement(required = true)
    protected GrunnbokBubbleObjectId id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectId }
     *     
     */
    public GrunnbokBubbleObjectId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectId }
     *     
     */
    public void setId(GrunnbokBubbleObjectId value) {
        this.id = value;
    }

}
