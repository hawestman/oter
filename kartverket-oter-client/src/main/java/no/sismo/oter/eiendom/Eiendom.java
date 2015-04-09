package no.sismo.oter.eiendom;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Eiendom {
	
	String eierAndel;
	String eiendomsNivaa;
	Integer gaardsNummer;
	Integer bruksNummer;
	Integer festeNummer;
	Integer seksjonsNummer;
	Integer kommuneNummer;
	Boolean tingLyst;
	
	public String getEierAndel() {
		return eierAndel;
	}
	@XmlElement
	public void setEierAndel(String eierAndel) {
		this.eierAndel = eierAndel;
	}
	public String getEiendomsNivaa() {
		return eiendomsNivaa;
	}
	@XmlElement
	public void setEiendomsNivaa(String eiendomsNivaa) {
		this.eiendomsNivaa = eiendomsNivaa;
	}
	public Integer getGaardsNummer() {
		return gaardsNummer;
	}
	@XmlElement
	public void setGaardsNummer(Integer gaardsNummer) {
		this.gaardsNummer = gaardsNummer;
	}
	public Integer getBruksNummer() {
		return bruksNummer;
	}
	@XmlElement
	public void setBruksNummer(Integer bruksNummer) {
		this.bruksNummer = bruksNummer;
	}
	public Integer getFesteNummer() {
		return festeNummer;
	}
	@XmlElement
	public void setFesteNummer(Integer festeNummer) {
		this.festeNummer = festeNummer;
	}
	public Integer getSeksjonsNummer() {
		return seksjonsNummer;
	}
	@XmlElement
	public void setSeksjonsNummer(Integer seksjonsNummer) {
		this.seksjonsNummer = seksjonsNummer;
	}
	public Integer getKommuneNummer() {
		return kommuneNummer;
	}
	@XmlElement
	public void setKommuneNummer(Integer kommuneNummer) {
		this.kommuneNummer = kommuneNummer;
	}
	public Boolean getTingLyst() {
		return tingLyst;
	}
	@XmlElement
	public void setTingLyst(Boolean tingLyst) {
		this.tingLyst = tingLyst;
	}
	

}
