//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.games._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.product.games._2 package. 
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

    private final static QName _GamesProduct_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Games/2.0", "GamesProduct");
    private final static QName _GamesCategory_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Games/2.0", "GamesCategory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.product.games._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GamesProduct }
     * 
     */
    public GamesProduct createGamesProduct() {
        return new GamesProduct();
    }

    /**
     * Create an instance of {@link GamesCategory }
     * 
     */
    public GamesCategory createGamesCategory() {
        return new GamesCategory();
    }

    /**
     * Create an instance of {@link ArrayOfGamesProduct }
     * 
     */
    public ArrayOfGamesProduct createArrayOfGamesProduct() {
        return new ArrayOfGamesProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GamesProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Games/2.0", name = "GamesProduct")
    public JAXBElement<GamesProduct> createGamesProduct(GamesProduct value) {
        return new JAXBElement<GamesProduct>(_GamesProduct_QNAME, GamesProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GamesCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Games/2.0", name = "GamesCategory")
    public JAXBElement<GamesCategory> createGamesCategory(GamesCategory value) {
        return new JAXBElement<GamesCategory>(_GamesCategory_QNAME, GamesCategory.class, null, value);
    }

}