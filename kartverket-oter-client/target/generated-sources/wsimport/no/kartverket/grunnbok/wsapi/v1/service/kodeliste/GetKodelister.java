
package no.kartverket.grunnbok.wsapi.v1.service.kodeliste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.Timestamp;


/**
 * <p>Java class for getKodelister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getKodelister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snapshotVersion" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}Timestamp" minOccurs="0"/>
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
@XmlType(name = "getKodelister", propOrder = {
    "snapshotVersion",
    "grunnbokContext"
})
public class GetKodelister {

    protected Timestamp snapshotVersion;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the snapshotVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getSnapshotVersion() {
        return snapshotVersion;
    }

    /**
     * Sets the value of the snapshotVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setSnapshotVersion(Timestamp value) {
        this.snapshotVersion = value;
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
