
package no.kartverket.grunnbok.wsapi.v1.domain.register.journal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.InverseRelation;


/**
 * <p>Java class for JournaloppfoeringIdInverseRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournaloppfoeringIdInverseRelation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}InverseRelation">
 *       &lt;sequence>
 *         &lt;element name="cachedValue" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/journal}JournaloppfoeringId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournaloppfoeringIdInverseRelation", propOrder = {
    "cachedValue"
})
public class JournaloppfoeringIdInverseRelation
    extends InverseRelation
{

    @XmlElement(required = true, nillable = true)
    protected JournaloppfoeringId cachedValue;

    /**
     * Gets the value of the cachedValue property.
     * 
     * @return
     *     possible object is
     *     {@link JournaloppfoeringId }
     *     
     */
    public JournaloppfoeringId getCachedValue() {
        return cachedValue;
    }

    /**
     * Sets the value of the cachedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournaloppfoeringId }
     *     
     */
    public void setCachedValue(JournaloppfoeringId value) {
        this.cachedValue = value;
    }

}
