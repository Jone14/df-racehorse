//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.marketing.promotions._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionRestrictionTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionRestrictionTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BetLevel"/&gt;
 *     &lt;enumeration value="BetType"/&gt;
 *     &lt;enumeration value="BetIdentifier"/&gt;
 *     &lt;enumeration value="Channel"/&gt;
 *     &lt;enumeration value="WinOnly"/&gt;
 *     &lt;enumeration value="SingleOnly"/&gt;
 *     &lt;enumeration value="Product"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PromotionRestrictionTypeKind")
@XmlEnum
public enum PromotionRestrictionTypeKind {


    /**
     * The promotion is restricted to being used a bet level
     * 
     */
    @XmlEnumValue("BetLevel")
    BET_LEVEL("BetLevel"),

    /**
     * The promotion is restricted to bet type
     * 
     */
    @XmlEnumValue("BetType")
    BET_TYPE("BetType"),

    /**
     * The promotion is restricted to being used by a particular bet identifier
     * 
     */
    @XmlEnumValue("BetIdentifier")
    BET_IDENTIFIER("BetIdentifier"),

    /**
     * The promotion is restricted to being used in a particular channel
     * 
     */
    @XmlEnumValue("Channel")
    CHANNEL("Channel"),

    /**
     * The promotion is restricted to being used by win only sports bets (Might fall under BetRestriction)
     * 
     */
    @XmlEnumValue("WinOnly")
    WIN_ONLY("WinOnly"),

    /**
     * The promotion is restricted to being used by win only sports bets (Might fall under BetRestriction)
     * 
     */
    @XmlEnumValue("SingleOnly")
    SINGLE_ONLY("SingleOnly"),

    /**
     * The promotion is restricted to being used with a particular product
     * 
     */
    @XmlEnumValue("Product")
    PRODUCT("Product");
    private final String value;

    PromotionRestrictionTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionRestrictionTypeKind fromValue(String v) {
        for (PromotionRestrictionTypeKind c: PromotionRestrictionTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
