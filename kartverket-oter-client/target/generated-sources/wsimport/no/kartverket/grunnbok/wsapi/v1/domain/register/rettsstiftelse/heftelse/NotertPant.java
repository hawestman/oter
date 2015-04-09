
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;


/**
 * <p>Java class for NotertPant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotertPant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseMedBeloep">
 *       &lt;sequence>
 *         &lt;element name="notifikasjonsdato" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="prioritet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="besittereAvAndelsbrevIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/person}PersonIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotertPant", propOrder = {
    "notifikasjonsdato",
    "prioritet",
    "besittereAvAndelsbrevIds"
})
@XmlSeeAlso({
    NotertTvangspant.class
})
public class NotertPant
    extends HeftelseMedBeloep
{

    @XmlElement(required = true, nillable = true)
    protected LocalDate notifikasjonsdato;
    @XmlElement(required = true, nillable = true)
    protected String prioritet;
    @XmlElement(required = true)
    protected PersonIdList besittereAvAndelsbrevIds;

    /**
     * Gets the value of the notifikasjonsdato property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getNotifikasjonsdato() {
        return notifikasjonsdato;
    }

    /**
     * Sets the value of the notifikasjonsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setNotifikasjonsdato(LocalDate value) {
        this.notifikasjonsdato = value;
    }

    /**
     * Gets the value of the prioritet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioritet() {
        return prioritet;
    }

    /**
     * Sets the value of the prioritet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioritet(String value) {
        this.prioritet = value;
    }

    /**
     * Gets the value of the besittereAvAndelsbrevIds property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdList }
     *     
     */
    public PersonIdList getBesittereAvAndelsbrevIds() {
        return besittereAvAndelsbrevIds;
    }

    /**
     * Sets the value of the besittereAvAndelsbrevIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdList }
     *     
     */
    public void setBesittereAvAndelsbrevIds(PersonIdList value) {
        this.besittereAvAndelsbrevIds = value;
    }

}
