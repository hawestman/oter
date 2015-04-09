
package no.kartverket.grunnbok.wsapi.v1.service.store;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap;


/**
 * <p>Java class for getVersionsForListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVersionsForListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVersionsForListResponse", propOrder = {
    "_return"
})
public class GetVersionsForListResponse {

    @XmlElement(name = "return")
    protected GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap }
     *     
     */
    public GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap }
     *     
     */
    public void setReturn(GrunnbokBubbleObjectIdToSnapshotBubbleIdsMap value) {
        this._return = value;
    }

}
