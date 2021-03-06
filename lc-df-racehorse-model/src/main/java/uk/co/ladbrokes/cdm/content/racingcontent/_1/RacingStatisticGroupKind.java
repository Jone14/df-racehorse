//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.content.racingcontent._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RacingStatisticGroupKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RacingStatisticGroupKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Last14Days"/&gt;
 *     &lt;enumeration value="CourseOverall"/&gt;
 *     &lt;enumeration value="Hurdle"/&gt;
 *     &lt;enumeration value="Chase"/&gt;
 *     &lt;enumeration value="NationalHuntFlat"/&gt;
 *     &lt;enumeration value="TwoYearOld"/&gt;
 *     &lt;enumeration value="ThreeYearOld"/&gt;
 *     &lt;enumeration value="FourYearOld"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RacingStatisticGroupKind")
@XmlEnum
public enum RacingStatisticGroupKind {

    @XmlEnumValue("Last14Days")
    LAST_14_DAYS("Last14Days"),
    @XmlEnumValue("CourseOverall")
    COURSE_OVERALL("CourseOverall"),
    @XmlEnumValue("Hurdle")
    HURDLE("Hurdle"),
    @XmlEnumValue("Chase")
    CHASE("Chase"),

    /**
     * NHF
     * 
     */
    @XmlEnumValue("NationalHuntFlat")
    NATIONAL_HUNT_FLAT("NationalHuntFlat"),
    @XmlEnumValue("TwoYearOld")
    TWO_YEAR_OLD("TwoYearOld"),
    @XmlEnumValue("ThreeYearOld")
    THREE_YEAR_OLD("ThreeYearOld"),
    @XmlEnumValue("FourYearOld")
    FOUR_YEAR_OLD("FourYearOld");
    private final String value;

    RacingStatisticGroupKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RacingStatisticGroupKind fromValue(String v) {
        for (RacingStatisticGroupKind c: RacingStatisticGroupKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
