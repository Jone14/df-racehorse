//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.basetype._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.common.basetype._2 package. 
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

    private final static QName _Percentage_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Percentage");
    private final static QName _Interval_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Interval");
    private final static QName _Password_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Password");
    private final static QName _Range_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Range");
    private final static QName _Quantity_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Quantity");
    private final static QName _Number_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Number");
    private final static QName _Money_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Money");
    private final static QName _Text_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Text");
    private final static QName _BaseType_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "BaseType");
    private final static QName _Duration_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "Duration");
    private final static QName _TimePeriod_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/BaseType/2.0", "TimePeriod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.common.basetype._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Percentage }
     * 
     */
    public Percentage createPercentage() {
        return new Percentage();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link Password }
     * 
     */
    public Password createPassword() {
        return new Password();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link Number }
     * 
     */
    public Number createNumber() {
        return new Number();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link BaseType }
     * 
     */
    public BaseType createBaseType() {
        return new BaseType();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Percentage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Percentage")
    public JAXBElement<Percentage> createPercentage(Percentage value) {
        return new JAXBElement<Percentage>(_Percentage_QNAME, Percentage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Interval")
    public JAXBElement<Interval> createInterval(Interval value) {
        return new JAXBElement<Interval>(_Interval_QNAME, Interval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Password }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Password")
    public JAXBElement<Password> createPassword(Password value) {
        return new JAXBElement<Password>(_Password_QNAME, Password.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Range }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Range")
    public JAXBElement<Range> createRange(Range value) {
        return new JAXBElement<Range>(_Range_QNAME, Range.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Quantity")
    public JAXBElement<Quantity> createQuantity(Quantity value) {
        return new JAXBElement<Quantity>(_Quantity_QNAME, Quantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Number }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Number")
    public JAXBElement<Number> createNumber(Number value) {
        return new JAXBElement<Number>(_Number_QNAME, Number.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Text")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "BaseType")
    public JAXBElement<BaseType> createBaseType(BaseType value) {
        return new JAXBElement<BaseType>(_BaseType_QNAME, BaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "Duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/BaseType/2.0", name = "TimePeriod")
    public JAXBElement<TimePeriod> createTimePeriod(TimePeriod value) {
        return new JAXBElement<TimePeriod>(_TimePeriod_QNAME, TimePeriod.class, null, value);
    }

}