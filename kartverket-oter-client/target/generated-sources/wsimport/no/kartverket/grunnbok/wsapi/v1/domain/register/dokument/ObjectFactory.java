
package no.kartverket.grunnbok.wsapi.v1.domain.register.dokument;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.domain.register.dokument package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.domain.register.dokument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DokumentIdListInverseRelation }
     * 
     */
    public DokumentIdListInverseRelation createDokumentIdListInverseRelation() {
        return new DokumentIdListInverseRelation();
    }

    /**
     * Create an instance of {@link DokumentId }
     * 
     */
    public DokumentId createDokumentId() {
        return new DokumentId();
    }

    /**
     * Create an instance of {@link DokumentIdList }
     * 
     */
    public DokumentIdList createDokumentIdList() {
        return new DokumentIdList();
    }

    /**
     * Create an instance of {@link DokumentIdInverseRelation }
     * 
     */
    public DokumentIdInverseRelation createDokumentIdInverseRelation() {
        return new DokumentIdInverseRelation();
    }

    /**
     * Create an instance of {@link Dokument }
     * 
     */
    public Dokument createDokument() {
        return new Dokument();
    }

}
