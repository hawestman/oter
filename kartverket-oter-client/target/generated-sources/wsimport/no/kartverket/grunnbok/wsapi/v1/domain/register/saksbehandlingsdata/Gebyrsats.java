
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.LocalDate;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettstypeKodeId;


/**
 * <p>Java class for Gebyrsats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gebyrsats">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="rettstypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettstypeKodeId"/>
 *         &lt;element name="rettsstiftelsestypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettsstiftelsestypeKodeId"/>
 *         &lt;element name="gebyrnavn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gjelderFra" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="gjelderTil" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}LocalDate"/>
 *         &lt;element name="minimumsbeloep" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="prosentAvRettsgebyr" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tellerIBroekAvRettsgebyr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nevnerIBroekAvRettsgebyr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="gebyrbeloep" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gebyrsats", propOrder = {
    "rettstypeId",
    "rettsstiftelsestypeId",
    "gebyrnavn",
    "gjelderFra",
    "gjelderTil",
    "minimumsbeloep",
    "prosentAvRettsgebyr",
    "tellerIBroekAvRettsgebyr",
    "nevnerIBroekAvRettsgebyr",
    "gebyrbeloep"
})
public class Gebyrsats
    extends GrunnbokObjectWithHistory
{

    @XmlElement(required = true)
    protected RettstypeKodeId rettstypeId;
    @XmlElement(required = true)
    protected RettsstiftelsestypeKodeId rettsstiftelsestypeId;
    @XmlElement(required = true)
    protected String gebyrnavn;
    @XmlElement(required = true)
    protected LocalDate gjelderFra;
    @XmlElement(required = true)
    protected LocalDate gjelderTil;
    @XmlElement(required = true)
    protected BigDecimal minimumsbeloep;
    @XmlElement(required = true)
    protected BigDecimal prosentAvRettsgebyr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long tellerIBroekAvRettsgebyr;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long nevnerIBroekAvRettsgebyr;
    @XmlElement(required = true)
    protected BigDecimal gebyrbeloep;

    /**
     * Gets the value of the rettstypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RettstypeKodeId }
     *     
     */
    public RettstypeKodeId getRettstypeId() {
        return rettstypeId;
    }

    /**
     * Sets the value of the rettstypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettstypeKodeId }
     *     
     */
    public void setRettstypeId(RettstypeKodeId value) {
        this.rettstypeId = value;
    }

    /**
     * Gets the value of the rettsstiftelsestypeId property.
     * 
     * @return
     *     possible object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public RettsstiftelsestypeKodeId getRettsstiftelsestypeId() {
        return rettsstiftelsestypeId;
    }

    /**
     * Sets the value of the rettsstiftelsestypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RettsstiftelsestypeKodeId }
     *     
     */
    public void setRettsstiftelsestypeId(RettsstiftelsestypeKodeId value) {
        this.rettsstiftelsestypeId = value;
    }

    /**
     * Gets the value of the gebyrnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebyrnavn() {
        return gebyrnavn;
    }

    /**
     * Sets the value of the gebyrnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebyrnavn(String value) {
        this.gebyrnavn = value;
    }

    /**
     * Gets the value of the gjelderFra property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getGjelderFra() {
        return gjelderFra;
    }

    /**
     * Sets the value of the gjelderFra property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setGjelderFra(LocalDate value) {
        this.gjelderFra = value;
    }

    /**
     * Gets the value of the gjelderTil property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getGjelderTil() {
        return gjelderTil;
    }

    /**
     * Sets the value of the gjelderTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setGjelderTil(LocalDate value) {
        this.gjelderTil = value;
    }

    /**
     * Gets the value of the minimumsbeloep property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumsbeloep() {
        return minimumsbeloep;
    }

    /**
     * Sets the value of the minimumsbeloep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumsbeloep(BigDecimal value) {
        this.minimumsbeloep = value;
    }

    /**
     * Gets the value of the prosentAvRettsgebyr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProsentAvRettsgebyr() {
        return prosentAvRettsgebyr;
    }

    /**
     * Sets the value of the prosentAvRettsgebyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProsentAvRettsgebyr(BigDecimal value) {
        this.prosentAvRettsgebyr = value;
    }

    /**
     * Gets the value of the tellerIBroekAvRettsgebyr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTellerIBroekAvRettsgebyr() {
        return tellerIBroekAvRettsgebyr;
    }

    /**
     * Sets the value of the tellerIBroekAvRettsgebyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTellerIBroekAvRettsgebyr(Long value) {
        this.tellerIBroekAvRettsgebyr = value;
    }

    /**
     * Gets the value of the nevnerIBroekAvRettsgebyr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNevnerIBroekAvRettsgebyr() {
        return nevnerIBroekAvRettsgebyr;
    }

    /**
     * Sets the value of the nevnerIBroekAvRettsgebyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNevnerIBroekAvRettsgebyr(Long value) {
        this.nevnerIBroekAvRettsgebyr = value;
    }

    /**
     * Gets the value of the gebyrbeloep property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGebyrbeloep() {
        return gebyrbeloep;
    }

    /**
     * Sets the value of the gebyrbeloep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGebyrbeloep(BigDecimal value) {
        this.gebyrbeloep = value;
    }

}
