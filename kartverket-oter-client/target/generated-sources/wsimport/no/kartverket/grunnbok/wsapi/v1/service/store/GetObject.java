
package no.kartverket.grunnbok.wsapi.v1.service.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectId;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;


/**
 * <p>Java class for getObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectId" minOccurs="0"/>
 *         &lt;element name="grunnbokContext" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObject", propOrder = {
    "id",
    "grunnbokContext"
})
public class GetObject {

    protected GrunnbokBubbleObjectId id;
    protected GrunnbokContext grunnbokContext;

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

    /**
     * Gets the value of the grunnbokContext property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokContext }
     *     
     */
    public GrunnbokContext getGrunnbokContext() {
        return grunnbokContext;
    }

    /**
     * Sets the value of the grunnbokContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokContext }
     *     
     */
    public void setGrunnbokContext(GrunnbokContext value) {
        this.grunnbokContext = value;
    }

}
