
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Seksjon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seksjon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}Matrikkelenhet">
 *       &lt;sequence>
 *         &lt;element name="seksjonertPaaIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}MatrikkelenhetIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seksjon", propOrder = {
    "seksjonertPaaIds"
})
public class Seksjon
    extends Matrikkelenhet
{

    @XmlElement(required = true)
    protected MatrikkelenhetIdList seksjonertPaaIds;

    /**
     * Gets the value of the seksjonertPaaIds property.
     * 
     * @return
     *     possible object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public MatrikkelenhetIdList getSeksjonertPaaIds() {
        return seksjonertPaaIds;
    }

    /**
     * Sets the value of the seksjonertPaaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public void setSeksjonertPaaIds(MatrikkelenhetIdList value) {
        this.seksjonertPaaIds = value;
    }

}
