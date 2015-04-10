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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static java.lang.Thread.*;


/**
 * Created by hwestman on 17.02.2015.
 */



@PluginImplementation
public class Kartverket implements ProviderPlugin {

    private RequestParameterDAO requestParamterDAO;

    HashMap<String, String> hmRes = new HashMap<String,String>();

    public boolean finished;
    private Properties prop;

    public Kartverket() {

        this.finished = false;

        this.prop = new Properties();
        InputStream input = null;

        try {

            //input = new FileInputStream("config.properties");
            //input = this.getClass().getResourceAsStream("config.properties");
            URL url = ClassLoader.getSystemResource("config.properties");
            prop.load(url.openStream());

            // load a properties file
            //prop.load(input);

        } catch (IOException ex) {
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

    public boolean isFinished() {
        return finished;
    }

    @Capabilities
    public String[] capabilities(){
        return new String[] {"provider:Kartverket"};
    }

    @Override
    public HashMap<String,String> getResult() {
        /*
        HashMap<String, String> hm =new HashMap<String,String>();

        hm.put("10049047105", "<xml><person><Eiendom>11111111</eiendom></person></xml>");
        hm.put("10049047106", "<xml><person><Eiendom>22222222</eiendom></person></xml>");
        hm.put("10049047107", "<xml><person><Eiendom>33333333</eiendom></person></xml>");
        hm.put("10049047108", "<xml><person><Eiendom>44444444</eiendom></person></xml>");
        hm.put("10049047109", "<xml><person><Eiendom>55555555</eiendom></person></xml>");
        hm.put("10049047110", "<xml><person><Eiendom>66666666</eiendom></person></xml>");
        hm.put("10049047111", "<xml><person><Eiendom>77777777</eiendom></person></xml>");
        hm.put("10049047112", "<xml><person><Eiendom>88888888</eiendom></person></xml>");
        hm.put("10049047113", "<xml><person><Eiendom>99999999</eiendom></person></xml>");
        hm.put("10049047114", "<xml><person><Eiendom>10101010</eiendom></person></xml>");
        hm.put("10049047115", "<xml><person><Eiendom>10111213</eiendom></person></xml>");
        hm.put("10049047116", "<xml><person><Eiendom>14151617</eiendom></person></xml>");
        hm.put("10049047117", "<xml><person><Eiendom>18192021</eiendom></person></xml>");
        hm.put("10049047118", "<xml><person><Eiendom>22232425</eiendom></person></xml>");
        hm.put("10049047119", "<xml><person><Eiendom>26272829</eiendom></person></xml>");




        for(String numberId :this.requestParamterDAO.getNumberIdList()){
            hmRes.put(numberId, hm.get(numberId));
        }
        */
        return hmRes;
    }
    @Override
    public void setRequestParameter(RequestParameterDAO requestParameter){
        this.requestParamterDAO = requestParameter;
    }
    @Override
    public void run() {

        for(String numberId :this.requestParamterDAO.getNumberIdList()){
            hmRes.put(numberId, getXMLByNumberId(numberId));
        }
        finished = true;
    }

    public String getXMLByNumberId(String numberId){

        String xml = "";

        final String username = prop.getProperty("username");
        final String password = prop.getProperty("password");


        // Siden WSDL-ene er passordbeskyttet m� autentiseringer (forel�pig) gj�res globalt
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });



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
        GrunnbokContext context = new GrunnbokContext();
        context.setApiVersion("0.2");
        context.setClientIdentification("eksempelklient 0.2");
        context.setLocale("nb_NO");
        context.setSnapshotVersion(snapshotVersionCurrent);


        StoreServiceWS storeServiceWS = new StoreServiceWS();
        StoreService storeService = storeServiceWS.getStoreServicePort();

        IdentServiceWS identServiceWS = new IdentServiceWS();
        IdentService identService = identServiceWS.getIdentServicePort();

        RettsstiftelseServiceWS rettssitftelsesServiceWS = new RettsstiftelseServiceWS();
        RettsstiftelseService rettssitftelsesService = rettssitftelsesServiceWS.getRettsstiftelseServicePort();

        RegisterenhetsrettsandelServiceWS regRettAndelServiceWS = new RegisterenhetsrettsandelServiceWS();
        RegisterenhetsrettsandelService regRettAndelService = regRettAndelServiceWS.getRegisterenhetsrettsandelServicePort();



        PersonIdent person = new PersonIdent();

        /*
         * 28017025378
         * 28028047837
         * 28045937323
         */

        person.setIdentifikasjonsnummer(numberId);


        PersonIdentList pidentList = new PersonIdentList();
        pidentList.getItem().add(person);

        PersonIdentTilPersonIdMap map;
        List<Entry> entryList;

        OverdragelseAvRegisterenhetsrettIdList overdragelseAvRegRettList;

        RegisterenhetsrettsandelIdList regRettAndelList;
        PersonIdTilRegisterenhetsrettsandelIdsMap regRettMap;


        PersonMedEiendom personMedEiendom = new PersonMedEiendom();
        personMedEiendom.setFnr(Long.parseLong(person.getIdentifikasjonsnummer()));

        try {
            map = identService.findPersonIdsForIdents(pidentList, context);


            PersonIdentTilPersonIdMap.Entry entry = map.getEntry().iterator().next();


            PersonId pid = entry.getValue();
            Person p = (Person)  storeService.getObject(pid, context);

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
        } catch (no.kartverket.grunnbok.wsapi.v1.service.store.ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (no.kartverket.grunnbok.wsapi.v1.service.registerenhetsrettsandel.ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return xml;
    }
}