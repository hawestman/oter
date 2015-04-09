
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdList;


/**
 * <p>Java class for findHeftelserIRegisterenhetsrettsandeler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findHeftelserIRegisterenhetsrettsandeler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerenhetsrettsandelIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList" minOccurs="0"/>
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
@XmlType(name = "findHeftelserIRegisterenhetsrettsandeler", propOrder = {
    "registerenhetsrettsandelIds",
    "grunnbokContext"
})
public class FindHeftelserIRegisterenhetsrettsandeler {

    protected RegisterenhetsrettsandelIdList registerenhetsrettsandelIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the registerenhetsrettsandelIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getRegisterenhetsrettsandelIds() {
        return registerenhetsrettsandelIds;
    }

    /**
     * Sets the value of the registerenhetsrettsandelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setRegisterenhetsrettsandelIds(RegisterenhetsrettsandelIdList value) {
        this.registerenhetsrettsandelIds = value;
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
