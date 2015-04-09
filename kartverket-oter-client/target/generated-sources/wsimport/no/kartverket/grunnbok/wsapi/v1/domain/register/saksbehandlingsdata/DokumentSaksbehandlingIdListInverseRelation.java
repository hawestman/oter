
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for DokumentSaksbehandlingIdListInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentSaksbehandlingIdListInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/saksbehandlingsdata}DokumentSaksbehandlingIdList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentSaksbehandlingIdListInverseRelation", propOrder = {
    "cachedValue"
})
public class DokumentSaksbehandlingIdListInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected DokumentSaksbehandlingIdList cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentSaksbehandlingIdList }
     *     
     */
    public DokumentSaksbehandlingIdList getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentSaksbehandlingIdList }
     *     
     */
    public void setCachedValue(DokumentSaksbehandlingIdList value) {
        this.cachedValue = value;
    }

}
