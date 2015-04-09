
package no.kartverket.grunnbok.wsapi.v1.domain.register.person;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.kartverket.grunnbok.wsapi.v1.domain.register.person package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.kartverket.grunnbok.wsapi.v1.domain.register.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonId }
     * 
     */
    public PersonId createPersonId() {
        return new PersonId();
    }

    /**
     * Create an instance of {@link PersonIdInverseRelation }
     * 
     */
    public PersonIdInverseRelation createPersonIdInverseRelation() {
        return new PersonIdInverseRelation();
    }

    /**
     * Create an instance of {@link PersonIdListInverseRelation }
     * 
     */
    public PersonIdListInverseRelation createPersonIdListInverseRelation() {
        return new PersonIdListInverseRelation();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonIdList }
     * 
     */
    public PersonIdList createPersonIdList() {
        return new PersonIdList();
    }

}
