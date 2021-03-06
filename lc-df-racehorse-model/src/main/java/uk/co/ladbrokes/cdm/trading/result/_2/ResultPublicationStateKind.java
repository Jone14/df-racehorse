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
 * <p>Java class for ResultPublicationStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultPublicationStateKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ResultPublished"/&gt;
 *     &lt;enumeration value="ResultNotPublished"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultPublicationStateKind")
@XmlEnum
public enum ResultPublicationStateKind {

    @XmlEnumValue("ResultPublished")
    RESULT_PUBLISHED("ResultPublished"),
    @XmlEnumValue("ResultNotPublished")
    RESULT_NOT_PUBLISHED("ResultNotPublished");
    private final String value;

    ResultPublicationStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultPublicationStateKind fromValue(String v) {
        for (ResultPublicationStateKind c: ResultPublicationStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
