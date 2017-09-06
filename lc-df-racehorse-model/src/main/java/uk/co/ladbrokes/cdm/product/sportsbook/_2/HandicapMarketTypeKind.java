//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandicapMarketTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandicapMarketTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AsianHandicap"/&gt;
 *     &lt;enumeration value="TwoOptionWesternHandicap"/&gt;
 *     &lt;enumeration value="ThreeOptionWesternHandicap"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HandicapMarketTypeKind")
@XmlEnum
public enum HandicapMarketTypeKind {


    /**
     * Asian handicap market.
     * 
     * marketSort='A'
     * marketMeaningMajorCode='A'
     * 
     */
    @XmlEnumValue("AsianHandicap")
    ASIAN_HANDICAP("AsianHandicap"),

    /**
     * Two option western handicap market.
     * 
     * marketSort='H'
     * marketMeaningMajorCode='H'
     * 
     */
    @XmlEnumValue("TwoOptionWesternHandicap")
    TWO_OPTION_WESTERN_HANDICAP("TwoOptionWesternHandicap"),

    /**
     * Three option western handicap market.
     * 
     * marketSort='M'
     * marketMeaningMajorCode='M'
     * 
     */
    @XmlEnumValue("ThreeOptionWesternHandicap")
    THREE_OPTION_WESTERN_HANDICAP("ThreeOptionWesternHandicap");
    private final String value;

    HandicapMarketTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandicapMarketTypeKind fromValue(String v) {
        for (HandicapMarketTypeKind c: HandicapMarketTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}