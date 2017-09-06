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
 * <p>Java class for CustomerConsentKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerConsentKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DataProtectionAct"/&gt;
 *     &lt;enumeration value="LadbrokesMarketing"/&gt;
 *     &lt;enumeration value="TermsAndConditions"/&gt;
 *     &lt;enumeration value="IdentityCheck"/&gt;
 *     &lt;enumeration value="ContactBySms"/&gt;
 *     &lt;enumeration value="ContactByEmail"/&gt;
 *     &lt;enumeration value="ContactByMail"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PartnerMarketing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerConsentKind")
@XmlEnum
public enum CustomerConsentKind {

    @XmlEnumValue("DataProtectionAct")
    DATA_PROTECTION_ACT("DataProtectionAct"),
    @XmlEnumValue("LadbrokesMarketing")
    LADBROKES_MARKETING("LadbrokesMarketing"),
    @XmlEnumValue("TermsAndConditions")
    TERMS_AND_CONDITIONS("TermsAndConditions"),
    @XmlEnumValue("IdentityCheck")
    IDENTITY_CHECK("IdentityCheck"),
    @XmlEnumValue("ContactBySms")
    CONTACT_BY_SMS("ContactBySms"),
    @XmlEnumValue("ContactByEmail")
    CONTACT_BY_EMAIL("ContactByEmail"),
    @XmlEnumValue("ContactByMail")
    CONTACT_BY_MAIL("ContactByMail"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PartnerMarketing")
    PARTNER_MARKETING("PartnerMarketing");
    private final String value;

    CustomerConsentKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerConsentKind fromValue(String v) {
        for (CustomerConsentKind c: CustomerConsentKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}