//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.location._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddressLineKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostalAddressLineKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BuildingName"/&gt;
 *     &lt;enumeration value="BuildingNumber"/&gt;
 *     &lt;enumeration value="PropertyName"/&gt;
 *     &lt;enumeration value="PropertyNumber"/&gt;
 *     &lt;enumeration value="PoBox"/&gt;
 *     &lt;enumeration value="Street"/&gt;
 *     &lt;enumeration value="Suburb"/&gt;
 *     &lt;enumeration value="Locality"/&gt;
 *     &lt;enumeration value="Town"/&gt;
 *     &lt;enumeration value="City"/&gt;
 *     &lt;enumeration value="County"/&gt;
 *     &lt;enumeration value="State"/&gt;
 *     &lt;enumeration value="Region"/&gt;
 *     &lt;enumeration value="Provence"/&gt;
 *     &lt;enumeration value="Country"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostalAddressLineKind")
@XmlEnum
public enum PostalAddressLineKind {

    @XmlEnumValue("BuildingName")
    BUILDING_NAME("BuildingName"),
    @XmlEnumValue("BuildingNumber")
    BUILDING_NUMBER("BuildingNumber"),
    @XmlEnumValue("PropertyName")
    PROPERTY_NAME("PropertyName"),
    @XmlEnumValue("PropertyNumber")
    PROPERTY_NUMBER("PropertyNumber"),
    @XmlEnumValue("PoBox")
    PO_BOX("PoBox"),
    @XmlEnumValue("Street")
    STREET("Street"),
    @XmlEnumValue("Suburb")
    SUBURB("Suburb"),
    @XmlEnumValue("Locality")
    LOCALITY("Locality"),
    @XmlEnumValue("Town")
    TOWN("Town"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("Provence")
    PROVENCE("Provence"),
    @XmlEnumValue("Country")
    COUNTRY("Country");
    private final String value;

    PostalAddressLineKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostalAddressLineKind fromValue(String v) {
        for (PostalAddressLineKind c: PostalAddressLineKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
