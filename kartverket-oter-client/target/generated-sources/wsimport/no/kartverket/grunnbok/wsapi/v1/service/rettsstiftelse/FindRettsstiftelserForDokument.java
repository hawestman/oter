
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.dokument.DokumentId;


/**
 * <p>Java class for findRettsstiftelserForDokument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettsstiftelserForDokument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dokumentId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/dokument}DokumentId" minOccurs="0"/>
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
@XmlType(name = "findRettsstiftelserForDokument", propOrder = {
    "dokumentId",
    "grunnbokContext"
})
public class FindRettsstiftelserForDokument {

    protected DokumentId dokumentId;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the dokumentId property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentId }
     *     
     */
    public DokumentId getDokumentId() {
        return dokumentId;
    }

    /**
     * Sets the value of the dokumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentId }
     *     
     */
    public void setDokumentId(DokumentId value) {
        this.dokumentId = value;
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
