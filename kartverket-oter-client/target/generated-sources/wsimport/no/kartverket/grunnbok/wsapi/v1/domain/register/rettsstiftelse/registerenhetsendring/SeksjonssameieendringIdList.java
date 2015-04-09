
package no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeksjonssameieendringIdList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeksjonssameieendringIdList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}SeksjonssameieendringId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeksjonssameieendringIdList", propOrder = {
    "item"
})
public class SeksjonssameieendringIdList {

    @XmlElement(nillable = true)
    protected List<SeksjonssameieendringId> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeksjonssameieendringId }
     * 
     * 
     */
    public List<SeksjonssameieendringId> getItem() {
        if (item == null) {
            item = new ArrayList<SeksjonssameieendringId>();
        }
        return this.item;
    }

}
