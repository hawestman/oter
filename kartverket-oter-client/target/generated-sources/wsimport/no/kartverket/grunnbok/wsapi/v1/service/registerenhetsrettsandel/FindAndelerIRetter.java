
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdList;


/**
 * <p>Java class for findAndelerIRetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndelerIRetter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rettIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList" minOccurs="0"/>
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
@XmlType(name = "findAndelerIRetter", propOrder = {
    "rettIds",
    "grunnbokContext"
})
public class FindAndelerIRetter {

    protected RegisterenhetsrettIdList rettIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the rettIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getRettIds() {
        return rettIds;
    }

    /**
     * Sets the value of the rettIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setRettIds(RegisterenhetsrettIdList value) {
        this.rettIds = value;
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
