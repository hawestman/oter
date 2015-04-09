
package no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetIdList;


/**
 * <p>Java class for findAndelerForRettighetshavereRegisterenhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAndelerForRettighetshavereRegisterenhet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerenhetIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetIdList" minOccurs="0"/>
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
@XmlType(name = "findAndelerForRettighetshavereRegisterenhet", propOrder = {
    "registerenhetIds",
    "grunnbokContext"
})
public class FindAndelerForRettighetshavereRegisterenhet {

    protected RegisterenhetIdList registerenhetIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the registerenhetIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetIdList }
     *     
     */
    public RegisterenhetIdList getRegisterenhetIds() {
        return registerenhetIds;
    }

    /**
     * Sets the value of the registerenhetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetIdList }
     *     
     */
    public void setRegisterenhetIds(RegisterenhetIdList value) {
        this.registerenhetIds = value;
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
