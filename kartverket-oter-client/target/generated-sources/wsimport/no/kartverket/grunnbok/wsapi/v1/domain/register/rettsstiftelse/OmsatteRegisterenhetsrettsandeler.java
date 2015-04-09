
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdList;


/**
 * <p>Java class for OmsatteRegisterenhetsrettsandeler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OmsatteRegisterenhetsrettsandeler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse}OmsattRegisterenhetsrett">
 *       &lt;sequence>
 *         &lt;element name="nyeIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList"/>
 *         &lt;element name="utgaatteIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OmsatteRegisterenhetsrettsandeler", propOrder = {
    "nyeIds",
    "utgaatteIds"
})
public class OmsatteRegisterenhetsrettsandeler
    extends OmsattRegisterenhetsrett
{

    @XmlElement(required = true)
    protected RegisterenhetsrettsandelIdList nyeIds;
    @XmlElement(required = true)
    protected RegisterenhetsrettsandelIdList utgaatteIds;

    /**
     * Gets the value of the nyeIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getNyeIds() {
        return nyeIds;
    }

    /**
     * Sets the value of the nyeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setNyeIds(RegisterenhetsrettsandelIdList value) {
        this.nyeIds = value;
    }

    /**
     * Gets the value of the utgaatteIds property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public RegisterenhetsrettsandelIdList getUtgaatteIds() {
        return utgaatteIds;
    }

    /**
     * Sets the value of the utgaatteIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterenhetsrettsandelIdList }
     *     
     */
    public void setUtgaatteIds(RegisterenhetsrettsandelIdList value) {
        this.utgaatteIds = value;
    }

}
