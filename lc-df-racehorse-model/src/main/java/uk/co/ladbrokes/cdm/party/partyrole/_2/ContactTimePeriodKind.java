//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.partyrole._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactTimePeriodKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTimePeriodKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AnyTime"/&gt;
 *     &lt;enumeration value="DayTime"/&gt;
 *     &lt;enumeration value="EveningTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactTimePeriodKind")
@XmlEnum
public enum ContactTimePeriodKind {

    @XmlEnumValue("AnyTime")
    ANY_TIME("AnyTime"),
    @XmlEnumValue("DayTime")
    DAY_TIME("DayTime"),
    @XmlEnumValue("EveningTime")
    EVENING_TIME("EveningTime");
    private final String value;

    ContactTimePeriodKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTimePeriodKind fromValue(String v) {
        for (ContactTimePeriodKind c: ContactTimePeriodKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
