//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.market._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketSettlementStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketSettlementStateKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HoldSettle"/&gt;
 *     &lt;enumeration value="AllowSettle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketSettlementStateKind")
@XmlEnum
public enum MarketSettlementStateKind {

    @XmlEnumValue("HoldSettle")
    HOLD_SETTLE("HoldSettle"),
    @XmlEnumValue("AllowSettle")
    ALLOW_SETTLE("AllowSettle");
    private final String value;

    MarketSettlementStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketSettlementStateKind fromValue(String v) {
        for (MarketSettlementStateKind c: MarketSettlementStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
