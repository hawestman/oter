
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;


/**
 * <p>Java class for OrganisatoriskEnhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisatoriskEnhet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="navn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internGruppe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="foeringsdagAvsluttet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "OrganisatoriskEnhet", propOrder = {
    "navn",
    "internGruppe",
    "foeringsdagAvsluttet",
    "historisk"
})
public class OrganisatoriskEnhet
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected String navn;
    protected boolean internGruppe;
    protected boolean foeringsdagAvsluttet;
    protected boolean historisk;

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the internGruppe property.
     * 
     */
    public boolean isInternGruppe() {
        return internGruppe;
    }

    /**
     * Sets the value of the internGruppe property.
     * 
     */
    public void setInternGruppe(boolean value) {
        this.internGruppe = value;
    }

    /**
     * Gets the value of the foeringsdagAvsluttet property.
     * 
     */
    public boolean isFoeringsdagAvsluttet() {
        return foeringsdagAvsluttet;
    }

    /**
     * Sets the value of the foeringsdagAvsluttet property.
     * 
     */
    public void setFoeringsdagAvsluttet(boolean value) {
        this.foeringsdagAvsluttet = value;
    }

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
