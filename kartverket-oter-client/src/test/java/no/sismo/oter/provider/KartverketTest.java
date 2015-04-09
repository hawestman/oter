package no.sismo.oter.provider;

import junit.framework.TestCase;

public class KartverketTest extends TestCase {

    public void testGetXMLByNumberId() throws Exception {
        Kartverket k = new Kartverket();
        System.out.println(k.getXMLByNumberId("28017025378"));
        //assertEquals("28017025378", k.getXMLByNumberId("28017025378"));
    }
}