//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.party._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyCharacteristicStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyCharacteristicStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyCharacteristicStatusKind")
@XmlEnum
public enum PartyCharacteristicStatusKind {


    /**
     * The partyCharacteristic is Active
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * The PartyCharacteristic is Inactive and should not be considered.
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    PartyCharacteristicStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartyCharacteristicStatusKind fromValue(String v) {
        for (PartyCharacteristicStatusKind c: PartyCharacteristicStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
