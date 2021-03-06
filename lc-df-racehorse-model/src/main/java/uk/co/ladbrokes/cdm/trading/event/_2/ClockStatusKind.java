//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClockStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StartGame"/&gt;
 *     &lt;enumeration value="StopGame"/&gt;
 *     &lt;enumeration value="ResumeGame"/&gt;
 *     &lt;enumeration value="AdjClockPause"/&gt;
 *     &lt;enumeration value="AdjClockPlay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClockStatusKind")
@XmlEnum
public enum ClockStatusKind {

    @XmlEnumValue("StartGame")
    START_GAME("StartGame"),
    @XmlEnumValue("StopGame")
    STOP_GAME("StopGame"),
    @XmlEnumValue("ResumeGame")
    RESUME_GAME("ResumeGame"),
    @XmlEnumValue("AdjClockPause")
    ADJ_CLOCK_PAUSE("AdjClockPause"),
    @XmlEnumValue("AdjClockPlay")
    ADJ_CLOCK_PLAY("AdjClockPlay");
    private final String value;

    ClockStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockStatusKind fromValue(String v) {
        for (ClockStatusKind c: ClockStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
