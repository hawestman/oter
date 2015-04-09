
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettIdList;


/**
 * <p>Java class for findTidligereHeftelserIRegisterenhetsretter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findTidligereHeftelserIRegisterenhetsretter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerenhetsrettIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettIdList" minOccurs="0"/>
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
@XmlType(name = "findTidligereHeftelserIRegisterenhetsretter", propOrder = {
    "registerenhetsrettIds",
    "grunnbokContext"
})
public class FindTidligereHeftelserIRegisterenhetsretter {

    protected RegisterenhetsrettIdList registerenhetsrettIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the registerenhetsrettIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public RegisterenhetsrettIdList getRegisterenhetsrettIds() {
        return registerenhetsrettIds;
    }

    /**
     * Sets the value of the registerenhetsrettIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettIdList }
     *     
     */
    public void setRegisterenhetsrettIds(RegisterenhetsrettIdList value) {
        this.registerenhetsrettIds = value;
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
