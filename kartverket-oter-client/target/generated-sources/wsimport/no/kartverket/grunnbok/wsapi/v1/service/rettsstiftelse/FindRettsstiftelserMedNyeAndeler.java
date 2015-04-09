
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdList;


/**
 * <p>Java class for findRettsstiftelserMedNyeAndeler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettsstiftelserMedNyeAndeler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="andeler" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList" minOccurs="0"/>
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
@XmlType(name = "findRettsstiftelserMedNyeAndeler", propOrder = {
    "andeler",
    "grunnbokContext"
})
public class FindRettsstiftelserMedNyeAndeler {

    protected RegisterenhetsrettsandelIdList andeler;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the andeler property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getAndeler() {
        return andeler;
    }

    /**
     * Sets the value of the andeler property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setAndeler(RegisterenhetsrettsandelIdList value) {
        this.andeler = value;
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
