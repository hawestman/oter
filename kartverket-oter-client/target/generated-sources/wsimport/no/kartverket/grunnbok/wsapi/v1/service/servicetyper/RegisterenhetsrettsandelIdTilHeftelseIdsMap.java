
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.heftelse.HeftelseIdList;


/**
 * <p>Java class for RegisterenhetsrettsandelIdTilHeftelseIdsMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterenhetsrettsandelIdTilHeftelseIdsMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelId"/>
 *                   &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIdList"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterenhetsrettsandelIdTilHeftelseIdsMap", propOrder = {
    "entry"
})
public class RegisterenhetsrettsandelIdTilHeftelseIdsMap {

    @XmlElement(nillable = true)
    protected List<RegisterenhetsrettsandelIdTilHeftelseIdsMap.Entry> entry;

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterenhetsrettsandelIdTilHeftelseIdsMap.Entry }
     * 
     * 
     */
    public List<RegisterenhetsrettsandelIdTilHeftelseIdsMap.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<RegisterenhetsrettsandelIdTilHeftelseIdsMap.Entry>();
        }
        return this.entry;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register}RegisterenhetsrettsandelId"/>
     *         &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/heftelse}HeftelseIdList"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class Entry {

        @XmlElement(required = true, nillable = true)
        protected RegisterenhetsrettsandelId key;
        @XmlElement(required = true)
        protected HeftelseIdList value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterenhetsrettsandelId }
         *     
         */
        public RegisterenhetsrettsandelId getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterenhetsrettsandelId }
         *     
         */
        public void setKey(RegisterenhetsrettsandelId value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link HeftelseIdList }
         *     
         */
        public HeftelseIdList getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeftelseIdList }
         *     
         */
        public void setValue(HeftelseIdList value) {
            this.value = value;
        }

    }

}
