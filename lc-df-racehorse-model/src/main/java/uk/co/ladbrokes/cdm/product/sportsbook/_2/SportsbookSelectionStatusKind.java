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
 * <p>Java class for SportsbookSelectionStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SportsbookSelectionStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="InActive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SportsbookSelectionStatusKind")
@XmlEnum
public enum SportsbookSelectionStatusKind {


    /**
     * Active ('A' in OpenBet) - Bets can be taken on this selection, all functions OK.
     * 
     * If the PARENT is suspended though, even if this is 'Active', the selection will be implicitly suspended.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Suspended  ('S' in OpenBet) - Bets CANNOT be taken on this selection
     * 
     * Even if the PARENT is Active, the selection is explicitly suspended.
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * Placeholder for a status when a Selection is 'retired' / 'finished' (not to be confused with 'Suspended', which only relates to taking bets)
     * 
     */
    @XmlEnumValue("InActive")
    IN_ACTIVE("InActive");
    private final String value;

    SportsbookSelectionStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SportsbookSelectionStatusKind fromValue(String v) {
        for (SportsbookSelectionStatusKind c: SportsbookSelectionStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
