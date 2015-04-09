
package no.kartverket.grunnbok.wsapi.v1.service.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.Timestamp;


/**
 * <p>Java class for getVersionsForList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVersionsForList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ids" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdList" minOccurs="0"/>
 *         &lt;element name="start" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp" minOccurs="0"/>
 *         &lt;element name="end" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp" minOccurs="0"/>
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
@XmlType(name = "getVersionsForList", propOrder = {
    "ids",
    "start",
    "end",
    "grunnbokContext"
})
public class GetVersionsForList {

    protected GrunnbokBubbleObjectIdList ids;
    protected Timestamp start;
    protected Timestamp end;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectIdList }
     *     
     */
    public GrunnbokBubbleObjectIdList getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectIdList }
     *     
     */
    public void setIds(GrunnbokBubbleObjectIdList value) {
        this.ids = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setStart(Timestamp value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setEnd(Timestamp value) {
        this.end = value;
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
