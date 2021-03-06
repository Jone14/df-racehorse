//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.channel._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Country"/&gt;
 *     &lt;enumeration value="Regional"/&gt;
 *     &lt;enumeration value="LineOfBusiness"/&gt;
 *     &lt;enumeration value="DownstreamSystem"/&gt;
 *     &lt;enumeration value="eCommerce"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelTypeKind")
@XmlEnum
public enum ChannelTypeKind {

    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("LineOfBusiness")
    LINE_OF_BUSINESS("LineOfBusiness"),
    @XmlEnumValue("DownstreamSystem")
    DOWNSTREAM_SYSTEM("DownstreamSystem"),
    @XmlEnumValue("eCommerce")
    E_COMMERCE("eCommerce");
    private final String value;

    ChannelTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelTypeKind fromValue(String v) {
        for (ChannelTypeKind c: ChannelTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
