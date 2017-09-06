//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.account._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountMasteredKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountMasteredKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Internal"/&gt;
 *     &lt;enumeration value="External"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountMasteredKind")
@XmlEnum
public enum AccountMasteredKind {


    /**
     * Internally managed by Ladbrokes (e.g. Sportsbook)
     * 
     */
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),

    /**
     * Externally managed outside of  Ladbrokes (e.g. Poker Account)
     * 
     */
    @XmlEnumValue("External")
    EXTERNAL("External");
    private final String value;

    AccountMasteredKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountMasteredKind fromValue(String v) {
        for (AccountMasteredKind c: AccountMasteredKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
