
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.SeksjonssameieandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.registerenhetsendring.RegisterenhetsendringIdList;


/**
 * <p>Java class for SeksjonssameieandelIdTilRegisterenhetsendringIdsMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeksjonssameieandelIdTilRegisterenhetsendringIdsMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelId"/>
 *                   &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}RegisterenhetsendringIdList"/>
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
@XmlType(name = "SeksjonssameieandelIdTilRegisterenhetsendringIdsMap", propOrder = {
    "entry"
})
public class SeksjonssameieandelIdTilRegisterenhetsendringIdsMap {

    @XmlElement(nillable = true)
    protected List<SeksjonssameieandelIdTilRegisterenhetsendringIdsMap.Entry> entry;

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
     * {@link SeksjonssameieandelIdTilRegisterenhetsendringIdsMap.Entry }
     * 
     * 
     */
    public List<SeksjonssameieandelIdTilRegisterenhetsendringIdsMap.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<SeksjonssameieandelIdTilRegisterenhetsendringIdsMap.Entry>();
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
     *         &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}SeksjonssameieandelId"/>
     *         &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/rettsstiftelse/registerenhetsendring}RegisterenhetsendringIdList"/>
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
        protected SeksjonssameieandelId key;
        @XmlElement(required = true)
        protected RegisterenhetsendringIdList value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link SeksjonssameieandelId }
         *     
         */
        public SeksjonssameieandelId getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeksjonssameieandelId }
         *     
         */
        public void setKey(SeksjonssameieandelId value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RegisterenhetsendringIdList }
         *     
         */
        public RegisterenhetsendringIdList getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegisterenhetsendringIdList }
         *     
         */
        public void setValue(RegisterenhetsendringIdList value) {
            this.value = value;
        }

    }

}
