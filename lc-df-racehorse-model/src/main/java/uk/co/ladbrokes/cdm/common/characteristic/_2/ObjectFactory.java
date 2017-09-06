//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.characteristic._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.ladbrokes.cdm.common.characteristic._2 package. 
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

    private final static QName _Characteristic_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", "Characteristic");
    private final static QName _CharacteristicGroup_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", "CharacteristicGroup");
    private final static QName _CharacteristicType_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", "CharacteristicType");
    private final static QName _CharacteristicValue_QNAME = new QName("http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", "CharacteristicValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.ladbrokes.cdm.common.characteristic._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CharacteristicGroup }
     * 
     */
    public CharacteristicGroup createCharacteristicGroup() {
        return new CharacteristicGroup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Characteristic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", name = "Characteristic")
    public JAXBElement<Characteristic> createCharacteristic(Characteristic value) {
        return new JAXBElement<Characteristic>(_Characteristic_QNAME, Characteristic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacteristicGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", name = "CharacteristicGroup")
    public JAXBElement<CharacteristicGroup> createCharacteristicGroup(CharacteristicGroup value) {
        return new JAXBElement<CharacteristicGroup>(_CharacteristicGroup_QNAME, CharacteristicGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacteristicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", name = "CharacteristicType")
    public JAXBElement<CharacteristicType> createCharacteristicType(CharacteristicType value) {
        return new JAXBElement<CharacteristicType>(_CharacteristicType_QNAME, CharacteristicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacteristicValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cdm.ladbrokes.co.uk/common/Characteristic/2.0", name = "CharacteristicValue")
    public JAXBElement<CharacteristicValue> createCharacteristicValue(CharacteristicValue value) {
        return new JAXBElement<CharacteristicValue>(_CharacteristicValue_QNAME, CharacteristicValue.class, null, value);
    }

}
