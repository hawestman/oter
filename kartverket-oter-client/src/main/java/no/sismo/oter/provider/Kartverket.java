package no.sismo.oter.provider;

import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.GrunnbokContext;
import no.kartverket.grunnbok.wsapi.v1.domain.basistyper.Timestamp;
import no.kartverket.grunnbok.wsapi.v1.domain.kodeliste.GrunnbokKode;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Kommune;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Registerenhetsrett;
import no.kartverket.grunnbok.wsapi.v1.domain.register.Registerenhetsrettsandel;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.RegisterenhetsrettsandelIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.Person;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonId;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdent;
import no.kartverket.grunnbok.wsapi.v1.domain.register.person.PersonIdentList;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.Matrikkelenhet;
import no.kartverket.grunnbok.wsapi.v1.domain.register.registerenhet.Registerenhet;
import no.kartverket.grunnbok.wsapi.v1.domain.register.rettsstiftelse.overdragelse.OverdragelseAvRegisterenhetsrettIdList;
import no.kartverket.grunnbok.wsapi.v1.service.ident.IdentService;
import no.kartverket.grunnbok.wsapi.v1.service.ident.IdentServiceWS;
import no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel.RegisterenhetsrettsandelService;
import no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel.RegisterenhetsrettsandelServiceWS;
import no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse.RettsstiftelseService;
import no.kartverket.grunnbok.wsapi.v1.service.rettsstiftelse.RettsstiftelseServiceWS;
import no.kartverket.grunnbok.wsapi.v1.service.store.ServiceException;
import no.kartverket.grunnbok.wsapi.v1.service.store.StoreService;
import no.kartverket.grunnbok.wsapi.v1.service.store.StoreServiceWS;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.PersonIdTilRegisterenhetsrettsandelIdsMap;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.PersonIdentTilPersonIdMap;
import no.kartverket.grunnbok.wsapi.v1.service.servicetyper.PersonIdentTilPersonIdMap.Entry;
import net.xeoh.plugins.base.annotations.Capabilities;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import no.sismo.oter.eiendom.Eiendom;
import no.sismo.oter.eiendom.PersonMedEiendom;
import no.sismo.oter.utility.ProviderPlugin;
import no.sismo.oter.utility.RequestParameterDAO;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.*;

import static java.lang.Thread.*;


/**
 * Created by hwestman on 17.02.2015.
 */

@PluginImplementation
public class Kartverket implements ProviderPlugin {

    private RequestParameterDAO requestParamterDAO;
    private Properties prop;
    
    
    private GrunnbokContext context;
    
    private StoreService storeService;
    private IdentService identService;
    private RettsstiftelseService rettssitftelsesService;
    private RegisterenhetsrettsandelService regRettAndelService;
    
    
    //Should not be here this
    HashMap<String, String> hmRes = new HashMap<String,String>();


    public Kartverket() {
    	
    	loadProperties();
    	
    	DatatypeFactory datatypeFactory = null;
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        // Dette timestampet står for det til enhver tid gjeldende, ikke den faktiske datoverdien.
        // Dette timstampet svarer til "9999-01-01T00:00:00.00+01:00"
        Timestamp snapshotVersionCurrent = new Timestamp();
        snapshotVersionCurrent.setTimestamp(datatypeFactory.newXMLGregorianCalendar(9999, 1, 1, 0, 0, 0, 0, 1));

        // Alle kall må ha en context
        context = new GrunnbokContext();
        context.setApiVersion("0.2");
        context.setClientIdentification("eksempelklient 0.2");
        context.setLocale("nb_NO");
        context.setSnapshotVersion(snapshotVersionCurrent);
        
        createServices();
    	
    }
    private void loadProperties(){
    	
    	this.prop = new Properties();
        InputStream input = null;
    	try {

            prop.load(Kartverket.class.getClassLoader().getResourceAsStream("config.properties"));
           
        } catch (Exception ex) {
        	System.out.println("Exception when loading properties");
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void createServices(){
    	
    	StoreServiceWS storeServiceWS = new StoreServiceWS();
        storeService = storeServiceWS.getStoreServicePort();
        ((BindingProvider)storeService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,prop.getProperty("username"));
        ((BindingProvider)storeService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,prop.getProperty("password"));
        

        IdentServiceWS identServiceWS = new IdentServiceWS();
        identService = identServiceWS.getIdentServicePort();
        ((BindingProvider)identService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,prop.getProperty("username"));
        ((BindingProvider)identService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,prop.getProperty("password"));
        //((BindingProvider)identService).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 29); 
        //((BindingProvider)identService).getRequestContext().put("javax.xml.ws.client.connectionTimeout", "1");

        RettsstiftelseServiceWS rettssitftelsesServiceWS = new RettsstiftelseServiceWS();
        rettssitftelsesService = rettssitftelsesServiceWS.getRettsstiftelseServicePort();
        ((BindingProvider)rettssitftelsesService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,prop.getProperty("username"));
        ((BindingProvider)rettssitftelsesService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,prop.getProperty("password"));

        RegisterenhetsrettsandelServiceWS regRettAndelServiceWS = new RegisterenhetsrettsandelServiceWS();
        regRettAndelService = regRettAndelServiceWS.getRegisterenhetsrettsandelServicePort();
        ((BindingProvider)regRettAndelService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,prop.getProperty("username"));
        ((BindingProvider)regRettAndelService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,prop.getProperty("password"));
            
    }
    
    private String generateXML(PersonMedEiendom personMedEiendom){
    	String xml = null;
    	try {

            JAXBContext jaxbcontext;
            jaxbcontext = JAXBContext.newInstance(PersonMedEiendom.class);
            Marshaller jaxbMarshaller = jaxbcontext.createMarshaller();


            StringWriter sw = new StringWriter();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //jaxbMarshaller.marshal(personMedEiendom, System.out);
            jaxbMarshaller.marshal(personMedEiendom, sw);

            xml = sw.toString();


        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	
    	return xml;
    	
    }


    @Capabilities
    public String[] capabilities(){
        return new String[] {"provider:Kartverket"};
    }
    
    public HashMap<String, String> getProviderData(RequestParameterDAO requestParameter){
    	
    	HashMap<String, String> result = new HashMap<String,String>();
    	
    	PersonIdentList pidentList = new PersonIdentList();
    	PersonIdent person;
    	
    	for(String numberId :requestParameter.getNumberIdList()){
    		person = new PersonIdent();
    		person.setIdentifikasjonsnummer(numberId);
    		pidentList.getItem().add(person);
    		
        }
    	
		PersonIdentTilPersonIdMap map;
        List<Entry> entryList;

        OverdragelseAvRegisterenhetsrettIdList overdragelseAvRegRettList;
        RegisterenhetsrettsandelIdList regRettAndelList;
        PersonIdTilRegisterenhetsrettsandelIdsMap regRettMap;

        	
        try {
        	
        	map = identService.findPersonIdsForIdents(pidentList, context);
        	
        	Iterator<Entry> persons = map.getEntry().iterator();
        	
        	while(persons.hasNext()){
        		
        		//Getting the persons kartverk-id based on numberid and creating object for later use
	        	PersonIdentTilPersonIdMap.Entry entry = persons.next();
        		PersonMedEiendom personMedEiendom = new PersonMedEiendom();
                personMedEiendom.setFnr(entry.getKey().getIdentifikasjonsnummer());
                
                //Getting the person object
	            PersonId pid = entry.getValue();
	            Person p = (Person) storeService.getObject(pid, context);
	
	            //creating a list of personids to identify if this person has any rights on a shared property
	            PersonIdList pidList = new PersonIdList();
	            pidList.getItem().add(pid);
	
	            personMedEiendom.setNavn(p.getNavn());
	
	            //System.out.println(p.getNavn());
	
	            regRettMap = regRettAndelService.findAndelerForRettighetshaverePerson(pidList,context);
	            PersonIdTilRegisterenhetsrettsandelIdsMap.Entry regRettEntry = regRettMap.getEntry().iterator().next();
	
	            //Registerenhetsrettsandel regEnRettAnd = (Registerenhetsrettsandel) storeService.getObject(regRettEntry.getValue().getItem().iterator().next(), context);
	
	            Registerenhetsrett regEnRett;
	            
	            
	            Registerenhet regEnhet;
	            Registerenhetsrettsandel regEnRettAnd;
	            RegisterenhetsrettsandelIdList regRettEnAndList = regRettEntry.getValue();
	
	            List<Eiendom> eiendomsliste = new ArrayList<Eiendom>();
	            
	            //Getting all properties where this person has any ownership
	
	            for(RegisterenhetsrettsandelId regEnRettAndId : regRettEnAndList.getItem()){
	                regEnRettAnd = (Registerenhetsrettsandel) storeService.getObject(regEnRettAndId, context);
	
	                Eiendom eiendom = new Eiendom();
	                //System.out.println("Eierandel: "+regEnRettAnd.getTeller()+"/"+regEnRettAnd.getNevner());
	                eiendom.setEierAndel(regEnRettAnd.getTeller()+"/"+regEnRettAnd.getNevner());
	
	                regEnRett = (Registerenhetsrett) storeService.getObject(regEnRettAnd.getRegisterenhetsrettId(),context);
	
	                GrunnbokKode k = (GrunnbokKode) storeService.getObject(regEnRett.getRegisterenhetsrettstypeId(), context);
	                //System.out.println("Eiendomsniv�: "+k.getKodeverdi());
	                eiendom.setEiendomsNivaa(k.getKodeverdi());
	
	                Matrikkelenhet matEnhet = (Matrikkelenhet) storeService.getObject(regEnRett.getRegisterenhetId(), context);
	                Kommune kom = (Kommune) storeService.getObject(matEnhet.getKommuneId(), context);
	
	                eiendom.setGaardsNummer(matEnhet.getGaardsnummer());
	                //System.out.println("g�rdsnummer: "+matEnhet.getGaardsnummer());
	
	                eiendom.setBruksNummer(matEnhet.getBruksnummer());
	                //System.out.println("bruksnummer: "+matEnhet.getBruksnummer());
	
	                eiendom.setFesteNummer(matEnhet.getFestenummer());
	                //System.out.println("festenummer: "+matEnhet.getFestenummer());
	
	                eiendom.setSeksjonsNummer(matEnhet.getSeksjonsnummer());
	                //System.out.println("seksjonsnummer: "+matEnhet.getSeksjonsnummer());
	
	                eiendom.setKommuneNummer(Integer.parseInt(kom.getKommunenummer()));
	                //System.out.println("Kommune: "+kom.getKommunenummer());
	
	                eiendom.setTingLyst(matEnhet.isTinglyst());
	                //System.out.println("Tinglyst: "+matEnhet.isTinglyst()+"\n");
	
	                eiendomsliste.add(eiendom);
	            }
	
	
	
	            personMedEiendom.setEiendom(eiendomsliste);
	            
	            result.put(personMedEiendom.getFnr(), this.generateXML(personMedEiendom));
	            
        	}
        	
    		
            




		    /*
		    KommuneIdList kommuneList = new KommuneIdList();

		    overdragelseAvRegRettList = rettssitftelsesService.findOverdragelserAvRegisterenhetsrettForPerson(pid,kommuneList , context);

		    List<OverdragelseAvRegisterenhetsrettId> overDragelsesList = overdragelseAvRegRettList.getItem();

		    OverdragelseAvRegisterenhetsrettId overdragelsesID = overDragelsesList.iterator().next();

		    OverdragelseAvRegisterenhetsrett overdragelseRegEnhetRett = (OverdragelseAvRegisterenhetsrett) storeService.getObject(overdragelsesID, context);
		    */
            //OmsatteRegisterenhetsrettsandeler


        } catch (no.kartverket.grunnbok.wsapi.v1.service.ident.ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  catch (no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel.ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	return result;
    }
    
}