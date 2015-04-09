
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.RettsstiftelseIdList;


/**
 * <p>Java class for findHeftelserIAnnenRett complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findHeftelserIAnnenRett">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rettsstiftelseIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}RettsstiftelseIdList" minOccurs="0"/>
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
@XmlType(name = "findHeftelserIAnnenRett", propOrder = {
    "rettsstiftelseIds",
    "grunnbokContext"
})
public class FindHeftelserIAnnenRett {

    protected RettsstiftelseIdList rettsstiftelseIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the rettsstiftelseIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public RettsstiftelseIdList getRettsstiftelseIds() {
        return rettsstiftelseIds;
    }

    /**
     * Sets the value of the rettsstiftelseIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelseIdList }
     *     
     */
    public void setRettsstiftelseIds(RettsstiftelseIdList value) {
        this.rettsstiftelseIds = value;
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
