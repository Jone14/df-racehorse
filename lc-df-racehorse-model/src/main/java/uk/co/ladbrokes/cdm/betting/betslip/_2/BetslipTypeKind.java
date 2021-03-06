//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetslipTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetslipTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sports"/&gt;
 *     &lt;enumeration value="Pools"/&gt;
 *     &lt;enumeration value="Lotto"/&gt;
 *     &lt;enumeration value="Numbers"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="FixedOdds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BetslipTypeKind")
@XmlEnum
public enum BetslipTypeKind {

    @XmlEnumValue("Sports")
    SPORTS("Sports"),
    @XmlEnumValue("Pools")
    POOLS("Pools"),
    @XmlEnumValue("Lotto")
    LOTTO("Lotto"),
    @XmlEnumValue("Numbers")
    NUMBERS("Numbers"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("FixedOdds")
    FIXED_ODDS("FixedOdds");
    private final String value;

    BetslipTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BetslipTypeKind fromValue(String v) {
        for (BetslipTypeKind c: BetslipTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
