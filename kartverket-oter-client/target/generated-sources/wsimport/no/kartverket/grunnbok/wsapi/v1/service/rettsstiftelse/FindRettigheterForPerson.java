
package no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.register.KommuneIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;


/**
 * <p>Java class for findRettigheterForPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findRettigheterForPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonId" minOccurs="0"/>
 *         &lt;element name="kommuneIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}KommuneIdList" minOccurs="0"/>
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
@XmlType(name = "findRettigheterForPerson", propOrder = {
    "personId",
    "kommuneIds",
    "grunnbokContext"
})
public class FindRettigheterForPerson {

    protected PersonId personId;
    protected KommuneIdList kommuneIds;
    protected GrunnbokContext grunnbokContext;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setPersonId(PersonId value) {
        this.personId = value;
    }

    /**
     * Gets the value of the kommuneIds property.
     * 
     * @return
     *     possible object is
     *     {@link KommuneIdList }
     *     
     */
    public KommuneIdList getKommuneIds() {
        return kommuneIds;
    }

    /**
     * Sets the value of the kommuneIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link KommuneIdList }
     *     
     */
    public void setKommuneIds(KommuneIdList value) {
        this.kommuneIds = value;
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
