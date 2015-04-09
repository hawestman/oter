
package no.kartverket.grunnbok.wsapi.v1.domain.register.koder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.GrunnbokKode;


/**
 * <p>Java class for RettstypeKode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettstypeKode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/kodeliste}GrunnbokKode">
 *       &lt;sequence>
 *         &lt;element name="historisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettstypeKode", propOrder = {
    "historisk"
})
public class RettstypeKode
    extends GrunnbokKode
{

    protected boolean historisk;

    /**
     * Gets the value of the historisk property.
     * 
     */
    public boolean isHistorisk() {
        return historisk;
    }

    /**
     * Sets the value of the historisk property.
     * 
     */
    public void setHistorisk(boolean value) {
        this.historisk = value;
    }

}
