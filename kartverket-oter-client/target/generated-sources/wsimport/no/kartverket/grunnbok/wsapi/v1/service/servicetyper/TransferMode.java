
package no.kartverket.grunnbok.wsapi.v1.service.servicetyper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Objects"/>
 *     &lt;enumeration value="IdsOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferMode")
@XmlEnum
public enum TransferMode {

    @XmlEnumValue("Objects")
    OBJECTS("Objects"),
    @XmlEnumValue("IdsOnly")
    IDS_ONLY("IdsOnly");
    private final String value;

    TransferMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferMode fromValue(String v) {
        for (TransferMode c: TransferMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
