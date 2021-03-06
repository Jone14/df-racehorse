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
 * <p>Java class for WalletStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WalletStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WalletStatusKind")
@XmlEnum
public enum WalletStatusKind {


    /**
     * The wallet type is 'Active'
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * The wallet type is suspended (e.g. Fraud, Self Exclusion)
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * The wallet type is closed (e.g Customer closed)
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * The wallet is Locked.  This status could be crucial for supporting synchronsied/transactional updates to the wallet.  Many process could trigger adjustments to a Wallet and integrity needs to be preserved.
     * 
     */
    @XmlEnumValue("Locked")
    LOCKED("Locked");
    private final String value;

    WalletStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WalletStatusKind fromValue(String v) {
        for (WalletStatusKind c: WalletStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
