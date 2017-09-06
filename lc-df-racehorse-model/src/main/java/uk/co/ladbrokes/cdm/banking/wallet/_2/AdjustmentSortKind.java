//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.wallet._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentSortKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjustmentSortKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdjustmentSortKind")
@XmlEnum
public enum AdjustmentSortKind {


    /**
     * This will decrease the balance value e.g. 35 to 30 
     * 
     */
    @XmlEnumValue("Debit")
    DEBIT("Debit"),

    /**
     * This will increase the balance value e.g. 35 to 40 
     * 
     */
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    AdjustmentSortKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdjustmentSortKind fromValue(String v) {
        for (AdjustmentSortKind c: AdjustmentSortKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
