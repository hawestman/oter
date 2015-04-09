
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalTime;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;


/**
 * <p>Java class for AvholdtTvangsforretning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvholdtTvangsforretning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avholdtDato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="avholdtKlokkeslett" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalTime"/>
 *         &lt;element name="saksoekereIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="saksoekteIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="prosessfullmektigerIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *         &lt;element name="prosessfullmektigerHistoriskIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvholdtTvangsforretning", propOrder = {
    "avholdtDato",
    "avholdtKlokkeslett",
    "saksoekereIds",
    "saksoekteIds",
    "prosessfullmektigerIds",
    "prosessfullmektigerHistoriskIds"
})
public class AvholdtTvangsforretning {

    @XmlElement(required = true, nillable = true)
    protected LocalDate avholdtDato;
    @XmlElement(required = true, nillable = true)
    protected LocalTime avholdtKlokkeslett;
    @XmlElement(required = true)
    protected PersonIdList saksoekereIds;
    @XmlElement(required = true)
    protected PersonIdList saksoekteIds;
    @XmlElement(required = true)
    protected PersonIdList prosessfullmektigerIds;
    @XmlElement(required = true)
    protected PersonIdList prosessfullmektigerHistoriskIds;

    /**
     * Gets the value of the avholdtDato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getAvholdtDato() {
        return avholdtDato;
    }

    /**
     * Sets the value of the avholdtDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setAvholdtDato(LocalDate value) {
        this.avholdtDato = value;
    }

    /**
     * Gets the value of the avholdtKlokkeslett property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTime }
     *     
     */
    public LocalTime getAvholdtKlokkeslett() {
        return avholdtKlokkeslett;
    }

    /**
     * Sets the value of the avholdtKlokkeslett property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTime }
     *     
     */
    public void setAvholdtKlokkeslett(LocalTime value) {
        this.avholdtKlokkeslett = value;
    }

    /**
     * Gets the value of the saksoekereIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getSaksoekereIds() {
        return saksoekereIds;
    }

    /**
     * Sets the value of the saksoekereIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setSaksoekereIds(PersonIdList value) {
        this.saksoekereIds = value;
    }

    /**
     * Gets the value of the saksoekteIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getSaksoekteIds() {
        return saksoekteIds;
    }

    /**
     * Sets the value of the saksoekteIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setSaksoekteIds(PersonIdList value) {
        this.saksoekteIds = value;
    }

    /**
     * Gets the value of the prosessfullmektigerIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getProsessfullmektigerIds() {
        return prosessfullmektigerIds;
    }

    /**
     * Sets the value of the prosessfullmektigerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setProsessfullmektigerIds(PersonIdList value) {
        this.prosessfullmektigerIds = value;
    }

    /**
     * Gets the value of the prosessfullmektigerHistoriskIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getProsessfullmektigerHistoriskIds() {
        return prosessfullmektigerHistoriskIds;
    }

    /**
     * Sets the value of the prosessfullmektigerHistoriskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setProsessfullmektigerHistoriskIds(PersonIdList value) {
        this.prosessfullmektigerHistoriskIds = value;
    }

}
