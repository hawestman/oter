
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.rettsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.MatrikkelenhetIdList;


/**
 * <p>Java class for DelvisSlettingForIkkeTinglystMatrikkelenhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelvisSlettingForIkkeTinglystMatrikkelenhet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/rettsendring}Rettsendring">
 *       &lt;sequence>
 *         &lt;element name="slettetForIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}MatrikkelenhetIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelvisSlettingForIkkeTinglystMatrikkelenhet", propOrder = {
    "slettetForIds"
})
public class DelvisSlettingForIkkeTinglystMatrikkelenhet
    extends Rettsendring
{

    @XmlElement(required = true)
    protected MatrikkelenhetIdList slettetForIds;

    /**
     * Gets the value of the slettetForIds property.
     * 
     * @return
     *     possible object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public MatrikkelenhetIdList getSlettetForIds() {
        return slettetForIds;
    }

    /**
     * Sets the value of the slettetForIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public void setSlettetForIds(MatrikkelenhetIdList value) {
        this.slettetForIds = value;
    }

}
