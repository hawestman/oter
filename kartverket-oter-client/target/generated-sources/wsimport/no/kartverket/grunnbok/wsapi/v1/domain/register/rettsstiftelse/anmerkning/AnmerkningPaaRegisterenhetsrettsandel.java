
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnmerkningPaaRegisterenhetsrettsandel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnmerkningPaaRegisterenhetsrettsandel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/anmerkning}Anmerkning">
 *       &lt;sequence>
 *         &lt;element name="tingrett" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnmerkningPaaRegisterenhetsrettsandel", propOrder = {
    "tingrett"
})
public class AnmerkningPaaRegisterenhetsrettsandel
    extends Anmerkning
{

    @XmlElement(required = true, nillable = true)
    protected String tingrett;

    /**
     * Gets the value of the tingrett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTingrett() {
        return tingrett;
    }

    /**
     * Sets the value of the tingrett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTingrett(String value) {
        this.tingrett = value;
    }

}
