//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.selection._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskInfoKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskInfoKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Red"/&gt;
 *     &lt;enumeration value="Orange"/&gt;
 *     &lt;enumeration value="Green"/&gt;
 *     &lt;enumeration value="Blue"/&gt;
 *     &lt;enumeration value="Purple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RiskInfoKind")
@XmlEnum
public enum RiskInfoKind {

    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Orange")
    ORANGE("Orange"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Purple")
    PURPLE("Purple");
    private final String value;

    RiskInfoKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskInfoKind fromValue(String v) {
        for (RiskInfoKind c: RiskInfoKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
