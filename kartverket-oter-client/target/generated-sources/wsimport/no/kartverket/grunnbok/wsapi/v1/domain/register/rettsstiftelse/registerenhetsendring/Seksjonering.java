
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.MatrikkelenhetIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelIdList;


/**
 * <p>Java class for Seksjonering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seksjonering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}Registerenhetsendring">
 *       &lt;sequence>
 *         &lt;element name="nyeIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelIdList"/>
 *         &lt;element name="fraIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}MatrikkelenhetIdList"/>
 *         &lt;element name="tilIds" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}MatrikkelenhetIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seksjonering", propOrder = {
    "nyeIds",
    "fraIds",
    "tilIds"
})
public class Seksjonering
    extends Registerenhetsendring
{

    @XmlElement(required = true)
    protected SeksjonssameieandelIdList nyeIds;
    @XmlElement(required = true)
    protected MatrikkelenhetIdList fraIds;
    @XmlElement(required = true)
    protected MatrikkelenhetIdList tilIds;

    /**
     * Gets the value of the nyeIds property.
     * 
     * @return
     *     possible object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public SeksjonssameieandelIdList getNyeIds() {
        return nyeIds;
    }

    /**
     * Sets the value of the nyeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeksjonssameieandelIdList }
     *     
     */
    public void setNyeIds(SeksjonssameieandelIdList value) {
        this.nyeIds = value;
    }

    /**
     * Gets the value of the fraIds property.
     * 
     * @return
     *     possible object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public MatrikkelenhetIdList getFraIds() {
        return fraIds;
    }

    /**
     * Sets the value of the fraIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public void setFraIds(MatrikkelenhetIdList value) {
        this.fraIds = value;
    }

    /**
     * Gets the value of the tilIds property.
     * 
     * @return
     *     possible object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public MatrikkelenhetIdList getTilIds() {
        return tilIds;
    }

    /**
     * Sets the value of the tilIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrikkelenhetIdList }
     *     
     */
    public void setTilIds(MatrikkelenhetIdList value) {
        this.tilIds = value;
    }

}
