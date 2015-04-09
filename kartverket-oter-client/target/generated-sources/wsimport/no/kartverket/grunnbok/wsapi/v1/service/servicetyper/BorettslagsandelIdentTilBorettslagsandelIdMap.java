
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.BorettslagsandelIdent;


/**
 * <p>Java class for BorettslagsandelIdentTilBorettslagsandelIdMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorettslagsandelIdentTilBorettslagsandelIdMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelIdent"/>
 *                   &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelId"/>
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
@XmlType(name = "BorettslagsandelIdentTilBorettslagsandelIdMap", propOrder = {
    "entry"
})
public class BorettslagsandelIdentTilBorettslagsandelIdMap {

    @XmlElement(nillable = true)
    protected List<BorettslagsandelIdentTilBorettslagsandelIdMap.Entry> entry;

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
     * {@link BorettslagsandelIdentTilBorettslagsandelIdMap.Entry }
     * 
     * 
     */
    public List<BorettslagsandelIdentTilBorettslagsandelIdMap.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<BorettslagsandelIdentTilBorettslagsandelIdMap.Entry>();
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
     *         &lt;element name="key" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelIdent"/>
     *         &lt;element name="value" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/registerenhet}BorettslagsandelId"/>
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
        protected BorettslagsandelIdent key;
        @XmlElement(required = true)
        protected BorettslagsandelId value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link BorettslagsandelIdent }
         *     
         */
        public BorettslagsandelIdent getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorettslagsandelIdent }
         *     
         */
        public void setKey(BorettslagsandelIdent value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BorettslagsandelId }
         *     
         */
        public BorettslagsandelId getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BorettslagsandelId }
         *     
         */
        public void setValue(BorettslagsandelId value) {
            this.value = value;
        }

    }

}
