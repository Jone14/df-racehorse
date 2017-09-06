//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.baseprice._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Selection"/&gt;
 *     &lt;enumeration value="PriceCoupling"/&gt;
 *     &lt;enumeration value="Competitor"/&gt;
 *     &lt;enumeration value="Statistical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceTypeKind")
@XmlEnum
public enum PriceTypeKind {

    @XmlEnumValue("Selection")
    SELECTION("Selection"),
    @XmlEnumValue("PriceCoupling")
    PRICE_COUPLING("PriceCoupling"),
    @XmlEnumValue("Competitor")
    COMPETITOR("Competitor"),
    @XmlEnumValue("Statistical")
    STATISTICAL("Statistical");
    private final String value;

    PriceTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceTypeKind fromValue(String v) {
        for (PriceTypeKind c: PriceTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}