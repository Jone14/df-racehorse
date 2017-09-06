//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.partner.affiliate._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcquisitionMethodKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcquisitionMethodKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AffiliateAssetCookie"/&gt;
 *     &lt;enumeration value="SEOCookie"/&gt;
 *     &lt;enumeration value="PromoCode"/&gt;
 *     &lt;enumeration value="ExternalAffiliate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcquisitionMethodKind")
@XmlEnum
public enum AcquisitionMethodKind {


    /**
     * Affiliate asset cookie type
     * 
     */
    @XmlEnumValue("AffiliateAssetCookie")
    AFFILIATE_ASSET_COOKIE("AffiliateAssetCookie"),

    /**
     * SEO Cookie type
     * 
     */
    @XmlEnumValue("SEOCookie")
    SEO_COOKIE("SEOCookie"),

    /**
     * Promo code type
     * 
     */
    @XmlEnumValue("PromoCode")
    PROMO_CODE("PromoCode"),

    /**
     * External Affiliate type. i.e. Income Access
     * 
     */
    @XmlEnumValue("ExternalAffiliate")
    EXTERNAL_AFFILIATE("ExternalAffiliate");
    private final String value;

    AcquisitionMethodKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcquisitionMethodKind fromValue(String v) {
        for (AcquisitionMethodKind c: AcquisitionMethodKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
