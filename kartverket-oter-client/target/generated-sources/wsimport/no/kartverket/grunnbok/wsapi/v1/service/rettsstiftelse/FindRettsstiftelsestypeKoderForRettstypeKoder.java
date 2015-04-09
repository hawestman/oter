
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettstypeKodeIdList;


/**
 * <p>Java class for findRettsstiftelsestypeKoderForRettstypeKoder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettsstiftelsestypeKoderForRettstypeKoder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rettstypeIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettstypeKodeIdList" minOccurs="0"/>
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
@XmlType(name = "findRettsstiftelsestypeKoderForRettstypeKoder", propOrder = {
    "rettstypeIds",
    "grunnbokContext"
})
public class FindRettsstiftelsestypeKoderForRettstypeKoder {

    protected RettstypeKodeIdList rettstypeIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the rettstypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link RettstypeKodeIdList }
     *     
     */
    public RettstypeKodeIdList getRettstypeIds() {
        return rettstypeIds;
    }

    /**
     * Sets the value of the rettstypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettstypeKodeIdList }
     *     
     */
    public void setRettstypeIds(RettstypeKodeIdList value) {
        this.rettstypeIds = value;
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
