//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.catalogue._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.product.catalogue._2 package. 
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

    private final static QName _ProductCatalogue_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", "ProductCatalogue");
    private final static QName _ProductCategory_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", "ProductCategory");
    private final static QName _Product_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", "Product");
    private final static QName _ProductVariant_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", "ProductVariant");
    private final static QName _PriceRow_QNAME = new QName("http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", "PriceRow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.product.catalogue._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductCatalogue }
     * 
     */
    public ProductCatalogue createProductCatalogue() {
        return new ProductCatalogue();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductVariant }
     * 
     */
    public ProductVariant createProductVariant() {
        return new ProductVariant();
    }

    /**
     * Create an instance of {@link PriceRow }
     * 
     */
    public PriceRow createPriceRow() {
        return new PriceRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", name = "ProductCatalogue")
    public JAXBElement<ProductCatalogue> createProductCatalogue(ProductCatalogue value) {
        return new JAXBElement<ProductCatalogue>(_ProductCatalogue_QNAME, ProductCatalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", name = "ProductCategory")
    public JAXBElement<ProductCategory> createProductCategory(ProductCategory value) {
        return new JAXBElement<ProductCategory>(_ProductCategory_QNAME, ProductCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductVariant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", name = "ProductVariant")
    public JAXBElement<ProductVariant> createProductVariant(ProductVariant value) {
        return new JAXBElement<ProductVariant>(_ProductVariant_QNAME, ProductVariant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/product/Catalogue/2.0", name = "PriceRow")
    public JAXBElement<PriceRow> createPriceRow(PriceRow value) {
        return new JAXBElement<PriceRow>(_PriceRow_QNAME, PriceRow.class, null, value);
    }

}
