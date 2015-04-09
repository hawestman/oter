
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.anmerkning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/anmerkning}AnmerkningPaaRegisterenhetsrettsandelId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation", propOrder = {
    "cachedValue"
})
public class AnmerkningPaaRegisterenhetsrettsandelIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected AnmerkningPaaRegisterenhetsrettsandelId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link AnmerkningPaaRegisterenhetsrettsandelId }
     *     
     */
    public AnmerkningPaaRegisterenhetsrettsandelId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnmerkningPaaRegisterenhetsrettsandelId }
     *     
     */
    public void setCachedValue(AnmerkningPaaRegisterenhetsrettsandelId value) {
        this.cachedValue = value;
    }

}
