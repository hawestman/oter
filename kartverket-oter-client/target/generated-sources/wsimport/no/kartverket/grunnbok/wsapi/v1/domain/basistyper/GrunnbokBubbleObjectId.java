
package no.kartverket.grunnbok.wsapi.v1.domain.basistyper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.endringslogg.EndringId;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.KodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.KodelisteId;


/**
 * <p>Java class for GrunnbokBubbleObjectId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrunnbokBubbleObjectId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrunnbokBubbleObjectId", propOrder = {
    "value"
})
@XmlSeeAlso({
    KodelisteId.class,
    KodeId.class,
    GrunnbokObjectWithVersionId.class,
    EndringId.class
})
public class GrunnbokBubbleObjectId {

    @XmlElement(required = true)
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
