package no.sismo.oter.eiendom;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class PersonMedEiendom {
	
	List <Eiendom> eiendom;
	Long fnr;
	String navn;
	
	public List<Eiendom> getEiendom() {
		return eiendom;
	}
	@XmlElement
	public void setEiendom(List<Eiendom> eiendomsListe) {
		this.eiendom = eiendomsListe;
	}
	public Long getFnr() {
		return fnr;
	}
	@XmlAttribute
	public void setFnr(Long fnr) {
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
