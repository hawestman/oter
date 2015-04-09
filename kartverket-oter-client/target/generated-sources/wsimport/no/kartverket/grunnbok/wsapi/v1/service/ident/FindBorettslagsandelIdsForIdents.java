
package no.kartverket.grunnbok.wsapi.v1.service.ident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelIdentList;


/**
 * <p>Java class for findBorettslagsandelIdsForIdents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBorettslagsandelIdsForIdents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idents" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelIdentList" minOccurs="0"/>
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
@XmlType(name = "findBorettslagsandelIdsForIdents", propOrder = {
    "idents",
    "grunnbokContext"
})
public class FindBorettslagsandelIdsForIdents {

    protected BorettslagsandelIdentList idents;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the idents property.
     * 
     * @return
     *     possible object is
     *     {@link BorettslagsandelIdentList }
     *     
     */
    public BorettslagsandelIdentList getIdents() {
        return idents;
    }

    /**
     * Sets the value of the idents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorettslagsandelIdentList }
     *     
     */
    public void setIdents(BorettslagsandelIdentList value) {
        this.idents = value;
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
