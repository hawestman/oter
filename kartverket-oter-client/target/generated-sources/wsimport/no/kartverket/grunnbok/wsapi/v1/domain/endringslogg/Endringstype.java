
package no.kartverket.grunnbok.wsapi.v1.domain.endringslogg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Endringstype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Endringstype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nyoppretting"/>
 *     &lt;enumeration value="Typeendring"/>
 *     &lt;enumeration value="Oppdatering"/>
 *     &lt;enumeration value="Sletting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Endringstype")
@XmlEnum
public enum Endringstype {

    @XmlEnumValue("Nyoppretting")
    NYOPPRETTING("Nyoppretting"),
    @XmlEnumValue("Typeendring")
    TYPEENDRING("Typeendring"),
    @XmlEnumValue("Oppdatering")
    OPPDATERING("Oppdatering"),
    @XmlEnumValue("Sletting")
    SLETTING("Sletting");
    private final String value;

    Endringstype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Endringstype fromValue(String v) {
        for (Endringstype c: Endringstype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
