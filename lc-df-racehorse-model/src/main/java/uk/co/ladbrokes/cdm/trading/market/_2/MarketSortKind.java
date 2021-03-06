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
 * <p>Java class for MarketSortKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketSortKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WinDrawWin"/&gt;
 *     &lt;enumeration value="HeatToHead"/&gt;
 *     &lt;enumeration value="ToWin"/&gt;
 *     &lt;enumeration value="NextScorer"/&gt;
 *     &lt;enumeration value="ThreeOptionWesternHandicap"/&gt;
 *     &lt;enumeration value="TwoOptionWesternHandicap"/&gt;
 *     &lt;enumeration value="OverUnder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketSortKind")
@XmlEnum
public enum MarketSortKind {

    @XmlEnumValue("WinDrawWin")
    WIN_DRAW_WIN("WinDrawWin"),
    @XmlEnumValue("HeatToHead")
    HEAT_TO_HEAD("HeatToHead"),
    @XmlEnumValue("ToWin")
    TO_WIN("ToWin"),
    @XmlEnumValue("NextScorer")
    NEXT_SCORER("NextScorer"),
    @XmlEnumValue("ThreeOptionWesternHandicap")
    THREE_OPTION_WESTERN_HANDICAP("ThreeOptionWesternHandicap"),
    @XmlEnumValue("TwoOptionWesternHandicap")
    TWO_OPTION_WESTERN_HANDICAP("TwoOptionWesternHandicap"),
    @XmlEnumValue("OverUnder")
    OVER_UNDER("OverUnder");
    private final String value;

    MarketSortKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketSortKind fromValue(String v) {
        for (MarketSortKind c: MarketSortKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
