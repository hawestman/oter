
package no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Festegrunn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Festegrunn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}Matrikkelenhet">
 *       &lt;sequence>
 *         &lt;element name="festetPaaIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}MatrikkelenhetIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Festegrunn", propOrder = {
    "festetPaaIds"
})
public class Festegrunn
    extends Matrikkelenhet
{

    @XmlElement(required = true)
    protected MatrikkelenhetIdList festetPaaIds;

    /**
     * Gets the value of the festetPaaIds property.
     * 
     * @return
     *     possible object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public MatrikkelenhetIdList getFestetPaaIds() {
        return festetPaaIds;
    }

    /**
     * Sets the value of the festetPaaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public void setFestetPaaIds(MatrikkelenhetIdList value) {
        this.festetPaaIds = value;
    }

}
