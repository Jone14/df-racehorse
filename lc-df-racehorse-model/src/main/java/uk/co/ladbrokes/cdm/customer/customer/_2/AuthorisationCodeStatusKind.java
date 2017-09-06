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
 * <p>Java class for AuthorisationCodeStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorisationCodeStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Used"/&gt;
 *     &lt;enumeration value="ExpiredNotUsed"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorisationCodeStatusKind")
@XmlEnum
public enum AuthorisationCodeStatusKind {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Used")
    USED("Used"),
    @XmlEnumValue("ExpiredNotUsed")
    EXPIRED_NOT_USED("ExpiredNotUsed"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    AuthorisationCodeStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorisationCodeStatusKind fromValue(String v) {
        for (AuthorisationCodeStatusKind c: AuthorisationCodeStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
