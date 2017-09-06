//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.payment._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardStatusKind")
@XmlEnum
public enum CardStatusKind {


    /**
     * Can be used for financial transactions
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Cannot be used for financial transactions - the Customer has explicitly deactivated it
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * Cannot be used for financial transactions - Ladbrokes has explicitly deactivated it
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * Cannot be used for financial transactions - the card has expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Cannot be used for financial transactions - the card has expired
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CardStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatusKind fromValue(String v) {
        for (CardStatusKind c: CardStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}