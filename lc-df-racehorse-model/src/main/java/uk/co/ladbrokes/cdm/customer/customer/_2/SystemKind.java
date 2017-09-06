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
 * <p>Java class for SystemKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MDM"/&gt;
 *     &lt;enumeration value="OpenBet"/&gt;
 *     &lt;enumeration value="Givex"/&gt;
 *     &lt;enumeration value="MGS"/&gt;
 *     &lt;enumeration value="CRM"/&gt;
 *     &lt;enumeration value="ODIN"/&gt;
 *     &lt;enumeration value="BS2000"/&gt;
 *     &lt;enumeration value="Hybris"/&gt;
 *     &lt;enumeration value="RacingClub"/&gt;
 *     &lt;enumeration value="PokerShop"/&gt;
 *     &lt;enumeration value="Twitter"/&gt;
 *     &lt;enumeration value="Facebook"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemKind")
@XmlEnum
public enum SystemKind {


    /**
     * The master customer system, the MDM hub
     * 
     */
    MDM("MDM"),

    /**
     * The OpenBet system.  This will be a sessionToken
     * 
     */
    @XmlEnumValue("OpenBet")
    OPEN_BET("OpenBet"),

    /**
     * The Givex Loyalty System
     * 
     */
    @XmlEnumValue("Givex")
    GIVEX("Givex"),

    /**
     * The Micro Gaming
     * 
     */
    MGS("MGS"),

    /**
     * The CRM System
     * 
     */
    CRM("CRM"),

    /**
     * The Data Warehouse
     * 
     */
    ODIN("ODIN"),

    /**
     * The Data Warehouse
     * 
     */
    @XmlEnumValue("BS2000")
    BS_2000("BS2000"),

    /**
     * The master customer system, the MDM hub
     * 
     */
    @XmlEnumValue("Hybris")
    HYBRIS("Hybris"),

    /**
     * TBD
     * 
     */
    @XmlEnumValue("RacingClub")
    RACING_CLUB("RacingClub"),

    /**
     * TBD
     * 
     */
    @XmlEnumValue("PokerShop")
    POKER_SHOP("PokerShop"),

    /**
     * TBD
     * 
     */
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),

    /**
     * TBD
     * 
     */
    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),

    /**
     * TBD
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SystemKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemKind fromValue(String v) {
        for (SystemKind c: SystemKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
