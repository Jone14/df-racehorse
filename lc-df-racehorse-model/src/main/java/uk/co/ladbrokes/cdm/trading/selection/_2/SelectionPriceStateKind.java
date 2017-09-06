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
 * <p>Java class for SelectionPriceStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionPriceStateKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Historical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SelectionPriceStateKind")
@XmlEnum
public enum SelectionPriceStateKind {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical");
    private final String value;

    SelectionPriceStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionPriceStateKind fromValue(String v) {
        for (SelectionPriceStateKind c: SelectionPriceStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
