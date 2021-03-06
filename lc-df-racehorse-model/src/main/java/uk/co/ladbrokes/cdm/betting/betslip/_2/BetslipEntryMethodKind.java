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
 * <p>Java class for BetslipEntryMethodKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetslipEntryMethodKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BetslipEntryMethodKind")
@XmlEnum
public enum BetslipEntryMethodKind {


    /**
     * Betslip was manually captured - human interaction was requried
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * Betslip was auto captured - no human interaction was involved
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    BetslipEntryMethodKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BetslipEntryMethodKind fromValue(String v) {
        for (BetslipEntryMethodKind c: BetslipEntryMethodKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
