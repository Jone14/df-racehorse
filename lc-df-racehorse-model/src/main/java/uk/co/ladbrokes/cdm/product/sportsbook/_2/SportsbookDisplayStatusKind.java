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
 * <p>Java class for SportsbookDisplayStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SportsbookDisplayStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Displayed"/&gt;
 *     &lt;enumeration value="NotDisplayed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SportsbookDisplayStatusKind")
@XmlEnum
public enum SportsbookDisplayStatusKind {


    /**
     * Display the Entity on the web.  ('isDisplayed='Y') in OpenBet
     * 
     */
    @XmlEnumValue("Displayed")
    DISPLAYED("Displayed"),

    /**
     * Do NOT Display the Entity, or any of its Children, on the web 
     * 
     * (Bets can still be taken via other channels - purely a display concern) ('isDisplayed='N') in OpenBet
     * 
     */
    @XmlEnumValue("NotDisplayed")
    NOT_DISPLAYED("NotDisplayed");
    private final String value;

    SportsbookDisplayStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SportsbookDisplayStatusKind fromValue(String v) {
        for (SportsbookDisplayStatusKind c: SportsbookDisplayStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
