//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.currency._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.common.currency._2 package. 
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

    private final static QName _ExchangeRates_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Currency/2.0", "ExchangeRates");
    private final static QName _Currency_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Currency/2.0", "Currency");
    private final static QName _ExchangeRate_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Currency/2.0", "ExchangeRate");
    private final static QName _CurrencyExchangeRateProfile_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Currency/2.0", "CurrencyExchangeRateProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.common.currency._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExchangeRates }
     * 
     */
    public ExchangeRates createExchangeRates() {
        return new ExchangeRates();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     * 
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link CurrencyExchangeRateProfile }
     * 
     */
    public CurrencyExchangeRateProfile createCurrencyExchangeRateProfile() {
        return new CurrencyExchangeRateProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Currency/2.0", name = "ExchangeRates")
    public JAXBElement<ExchangeRates> createExchangeRates(ExchangeRates value) {
        return new JAXBElement<ExchangeRates>(_ExchangeRates_QNAME, ExchangeRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Currency/2.0", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Currency/2.0", name = "ExchangeRate")
    public JAXBElement<ExchangeRate> createExchangeRate(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_ExchangeRate_QNAME, ExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyExchangeRateProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Currency/2.0", name = "CurrencyExchangeRateProfile")
    public JAXBElement<CurrencyExchangeRateProfile> createCurrencyExchangeRateProfile(CurrencyExchangeRateProfile value) {
        return new JAXBElement<CurrencyExchangeRateProfile>(_CurrencyExchangeRateProfile_QNAME, CurrencyExchangeRateProfile.class, null, value);
    }

}