
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.RegisterenhetId;


/**
 * <p>Java class for findOverdragelserMedAktiveAndelerIRegisterenhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findOverdragelserMedAktiveAndelerIRegisterenhet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerenhetId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}RegisterenhetId" minOccurs="0"/>
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
@XmlType(name = "findOverdragelserMedAktiveAndelerIRegisterenhet", propOrder = {
    "registerenhetId",
    "grunnbokContext"
})
public class FindOverdragelserMedAktiveAndelerIRegisterenhet {

    protected RegisterenhetId registerenhetId;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the registerenhetId property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetId }
     *     
     */
    public RegisterenhetId getRegisterenhetId() {
        return registerenhetId;
    }

    /**
     * Sets the value of the registerenhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetId }
     *     
     */
    public void setRegisterenhetId(RegisterenhetId value) {
        this.registerenhetId = value;
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
