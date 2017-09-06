//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.result._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultLifecycleStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultLifecycleStateKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="NotConfirmed"/&gt;
 *     &lt;enumeration value="NotEntered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultLifecycleStateKind")
@XmlEnum
public enum ResultLifecycleStateKind {

    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("NotConfirmed")
    NOT_CONFIRMED("NotConfirmed"),
    @XmlEnumValue("NotEntered")
    NOT_ENTERED("NotEntered");
    private final String value;

    ResultLifecycleStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultLifecycleStateKind fromValue(String v) {
        for (ResultLifecycleStateKind c: ResultLifecycleStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
