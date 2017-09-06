//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.selection._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.trading.selection._2 package. 
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

    private final static QName _Selection_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "Selection");
    private final static QName _SeletionSort_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SeletionSort");
    private final static QName _SelectionResult_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionResult");
    private final static QName _SelectionType_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionType");
    private final static QName _SelectionTypeStakeLimits_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionTypeStakeLimits");
    private final static QName _SelectionChannels_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionChannels");
    private final static QName _SelectionStakeLimits_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionStakeLimits");
    private final static QName _SelectionPrice_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionPrice");
    private final static QName _SelectionPriceType_QNAME = new QName("http://cdm.ladbrokes.co.uk/trading/Selection/2.0", "SelectionPriceType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.trading.selection._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Selection }
     * 
     */
    public Selection createSelection() {
        return new Selection();
    }

    /**
     * Create an instance of {@link SeletionSort }
     * 
     */
    public SeletionSort createSeletionSort() {
        return new SeletionSort();
    }

    /**
     * Create an instance of {@link SelectionResult }
     * 
     */
    public SelectionResult createSelectionResult() {
        return new SelectionResult();
    }

    /**
     * Create an instance of {@link SelectionType }
     * 
     */
    public SelectionType createSelectionType() {
        return new SelectionType();
    }

    /**
     * Create an instance of {@link SelectionTypeStakeLimits }
     * 
     */
    public SelectionTypeStakeLimits createSelectionTypeStakeLimits() {
        return new SelectionTypeStakeLimits();
    }

    /**
     * Create an instance of {@link SelectionChannels }
     * 
     */
    public SelectionChannels createSelectionChannels() {
        return new SelectionChannels();
    }

    /**
     * Create an instance of {@link SelectionStakeLimits }
     * 
     */
    public SelectionStakeLimits createSelectionStakeLimits() {
        return new SelectionStakeLimits();
    }

    /**
     * Create an instance of {@link SelectionPrice }
     * 
     */
    public SelectionPrice createSelectionPrice() {
        return new SelectionPrice();
    }

    /**
     * Create an instance of {@link SelectionPriceType }
     * 
     */
    public SelectionPriceType createSelectionPriceType() {
        return new SelectionPriceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Selection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "Selection")
    public JAXBElement<Selection> createSelection(Selection value) {
        return new JAXBElement<Selection>(_Selection_QNAME, Selection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeletionSort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SeletionSort")
    public JAXBElement<SeletionSort> createSeletionSort(SeletionSort value) {
        return new JAXBElement<SeletionSort>(_SeletionSort_QNAME, SeletionSort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionResult")
    public JAXBElement<SelectionResult> createSelectionResult(SelectionResult value) {
        return new JAXBElement<SelectionResult>(_SelectionResult_QNAME, SelectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionType")
    public JAXBElement<SelectionType> createSelectionType(SelectionType value) {
        return new JAXBElement<SelectionType>(_SelectionType_QNAME, SelectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionTypeStakeLimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionTypeStakeLimits")
    public JAXBElement<SelectionTypeStakeLimits> createSelectionTypeStakeLimits(SelectionTypeStakeLimits value) {
        return new JAXBElement<SelectionTypeStakeLimits>(_SelectionTypeStakeLimits_QNAME, SelectionTypeStakeLimits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionChannels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionChannels")
    public JAXBElement<SelectionChannels> createSelectionChannels(SelectionChannels value) {
        return new JAXBElement<SelectionChannels>(_SelectionChannels_QNAME, SelectionChannels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionStakeLimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionStakeLimits")
    public JAXBElement<SelectionStakeLimits> createSelectionStakeLimits(SelectionStakeLimits value) {
        return new JAXBElement<SelectionStakeLimits>(_SelectionStakeLimits_QNAME, SelectionStakeLimits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionPrice")
    public JAXBElement<SelectionPrice> createSelectionPrice(SelectionPrice value) {
        return new JAXBElement<SelectionPrice>(_SelectionPrice_QNAME, SelectionPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/trading/Selection/2.0", name = "SelectionPriceType")
    public JAXBElement<SelectionPriceType> createSelectionPriceType(SelectionPriceType value) {
        return new JAXBElement<SelectionPriceType>(_SelectionPriceType_QNAME, SelectionPriceType.class, null, value);
    }

}