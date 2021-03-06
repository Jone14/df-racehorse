//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.country._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.common.country._2 package. 
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

    private final static QName _Country_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Country/2.0", "Country");
    private final static QName _CurrencyCountry_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Country/2.0", "CurrencyCountry");
    private final static QName _City_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Country/2.0", "City");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.common.country._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link CurrencyCountry }
     * 
     */
    public CurrencyCountry createCurrencyCountry() {
        return new CurrencyCountry();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Country/2.0", name = "Country")
    public JAXBElement<Country> createCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Country/2.0", name = "CurrencyCountry")
    public JAXBElement<CurrencyCountry> createCurrencyCountry(CurrencyCountry value) {
        return new JAXBElement<CurrencyCountry>(_CurrencyCountry_QNAME, CurrencyCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link City }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Country/2.0", name = "City")
    public JAXBElement<City> createCity(City value) {
        return new JAXBElement<City>(_City_QNAME, City.class, null, value);
    }

}
