//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelfExcludeActionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelfExcludeActionKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="QueueForDelete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SelfExcludeActionKind")
@XmlEnum
public enum SelfExcludeActionKind {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("QueueForDelete")
    QUEUE_FOR_DELETE("QueueForDelete");
    private final String value;

    SelfExcludeActionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelfExcludeActionKind fromValue(String v) {
        for (SelfExcludeActionKind c: SelfExcludeActionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
