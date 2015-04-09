
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for TilgangsgruppeIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilgangsgruppeIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}TilgangsgruppeIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilgangsgruppeIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class TilgangsgruppeIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected TilgangsgruppeIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link TilgangsgruppeIdList }
     *     
     */
    public TilgangsgruppeIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilgangsgruppeIdList }
     *     
     */
    public void setCachedValue(TilgangsgruppeIdList value) {
        this.cachedValue = value;
    }

}
