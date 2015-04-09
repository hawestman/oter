
package no.kartverket.grunnbok.wsapi.v1.domain.register.saksbehandlingsdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokObjectWithHistory;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.ArkivtypeKodeId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.koder.RettsstiftelsestypeKodeId;


/**
 * <p>Java class for RettsstiftelsestypeSaksbehandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RettsstiftelsestypeSaksbehandling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://kartverket.no/grunnbok/wsapi/v1/domain/basistyper}GrunnbokObjectWithHistory">
 *       &lt;sequence>
 *         &lt;element name="edokAutomatiskKonferering" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="edokHelelektronisk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forfallAntallAar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gebyr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="genererAutomatiskPanteattest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kanEdokRegistreres" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kanEdokSlettes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kanHaForretningsnummer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="arkivtypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}ArkivtypeKodeId"/>
 *         &lt;element name="rettsstiftelsestypeId" type="{http://kartverket.no/grunnbok/wsapi/v1/domain/register/koder}RettsstiftelsestypeKodeId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RettsstiftelsestypeSaksbehandling", propOrder = {
    "edokAutomatiskKonferering",
    "edokHelelektronisk",
    "forfallAntallAar",
    "gebyr",
    "genererAutomatiskPanteattest",
    "kanEdokRegistreres",
    "kanEdokSlettes",
    "kanHaForretningsnummer",
    "arkivtypeId",
    "rettsstiftelsestypeId"
})
public class RettsstiftelsestypeSaksbehandling
    extends GrunnbokObjectWithHistory
{

    protected boolean edokAutomatiskKonferering;
    protected boolean edokHelelektronisk;
    protected int forfallAntallAar;
    protected boolean gebyr;
    protected boolean genererAutomatiskPanteattest;
    protected boolean kanEdokRegistreres;
    protected boolean kanEdokSlettes;
    protected boolean kanHaForretningsnummer;
    @XmlElement(required = true)
    protected ArkivtypeKodeId arkivtypeId;
    @XmlElement(required = true)
    protected RettsstiftelsestypeKodeId rettsstiftelsestypeId;

    /**
     * Gets the value of the edokAutomatiskKonferering property.
     * 
     */
    public boolean isEdokAutomatiskKonferering() {
        return edokAutomatiskKonferering;
    }

    /**
     * Sets the value of the edokAutomatiskKonferering property.
     * 
     */
    public void setEdokAutomatiskKonferering(boolean value) {
        this.edokAutomatiskKonferering = value;
    }

    /**
     * Gets the value of the edokHelelektronisk property.
     * 
     */
    public boolean isEdokHelelektronisk() {
        return edokHelelektronisk;
    }

    /**
     * Sets the value of the edokHelelektronisk property.
     * 
     */
    public void setEdokHelelektronisk(boolean value) {
        this.edokHelelektronisk = value;
    }

    /**
     * Gets the value of the forfallAntallAar property.
     * 
     */
    public int getForfallAntallAar() {
        return forfallAntallAar;
    }

    /**
     * Sets the value of the forfallAntallAar property.
     * 
     */
    public void setForfallAntallAar(int value) {
        this.forfallAntallAar = value;
    }

    /**
     * Gets the value of the gebyr property.
     * 
     */
    public boolean isGebyr() {
        return gebyr;
    }

    /**
     * Sets the value of the gebyr property.
     * 
     */
    public void setGebyr(boolean value) {
        this.gebyr = value;
    }

    /**
     * Gets the value of the genererAutomatiskPanteattest property.
     * 
     */
    public boolean isGenererAutomatiskPanteattest() {
        return genererAutomatiskPanteattest;
    }

    /**
     * Sets the value of the genererAutomatiskPanteattest property.
     * 
     */
    public void setGenererAutomatiskPanteattest(boolean value) {
        this.genererAutomatiskPanteattest = value;
    }

    /**
     * Gets the value of the kanEdokRegistreres property.
     * 
     */
    public boolean isKanEdokRegistreres() {
        return kanEdokRegistreres;
    }

    /**
     * Sets the value of the kanEdokRegistreres property.
     * 
     */
    public void setKanEdokRegistreres(boolean value) {
        this.kanEdokRegistreres = value;
    }

    /**
     * Gets the value of the kanEdokSlettes property.
     * 
     */
    public boolean isKanEdokSlettes() {
        return kanEdokSlettes;
    }

    /**
     * Sets the value of the kanEdokSlettes property.
     * 
     */
    public void setKanEdokSlettes(boolean value) {
        this.kanEdokSlettes = value;
    }

    /**
     * Gets the value of the kanHaForretningsnummer property.
     * 
     */
    public boolean isKanHaForretningsnummer() {
        return kanHaForretningsnummer;
    }

    /**
     * Sets the value of the kanHaForretningsnummer property.
     * 
     */
    public void setKanHaForretningsnummer(boolean value) {
        this.kanHaForretningsnummer = value;
    }

    /**
     * Gets the value of the arkivtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ArkivtypeKodeId }
     *     
     */
    public ArkivtypeKodeId getArkivtypeId() {
        return arkivtypeId;
    }

    /**
     * Sets the value of the arkivtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArkivtypeKodeId }
     *     
     */
    public void setArkivtypeId(ArkivtypeKodeId value) {
        this.arkivtypeId = value;
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

}
