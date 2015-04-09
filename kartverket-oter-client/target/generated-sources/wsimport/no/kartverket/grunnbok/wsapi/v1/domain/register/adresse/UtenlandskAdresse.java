
package no.kartverket.grunnbok.wsapi.v1.domain.register.adresse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtenlandskAdresse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtenlandskAdresse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/adresse}Adresse">
 *       &lt;sequence>
 *         &lt;element name="adressetekst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtenlandskAdresse", propOrder = {
    "adressetekst"
})
public class UtenlandskAdresse
    extends Adresse
{

    @XmlElement(required = true)
    protected String adressetekst;

    /**
     * Gets the value of the adressetekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressetekst() {
        return adressetekst;
    }

    /**
     * Sets the value of the adressetekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressetekst(String value) {
        this.adressetekst = value;
    }

}
