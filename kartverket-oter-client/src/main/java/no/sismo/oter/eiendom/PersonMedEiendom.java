package no.sismo.oter.eiendom;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class PersonMedEiendom {
	
	List <Eiendom> eiendom;
	String fnr;
	String navn;
	
	public List<Eiendom> getEiendom() {
		return eiendom;
	}
	@XmlElement
	public void setEiendom(List<Eiendom> eiendomsListe) {
		this.eiendom = eiendomsListe;
	}
	public String getFnr() {
		return fnr;
	}
	@XmlAttribute
	public void setFnr(String fnr) {
		this.fnr = fnr;
	}
	public String getNavn() {
		return navn;
	}
	@XmlAttribute
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	

}
