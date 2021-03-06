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
 * <p>Java class for AdjustmentTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjustmentTypeKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FreeBet"/&gt;
 *     &lt;enumeration value="Bonus"/&gt;
 *     &lt;enumeration value="RetailBetslipPayout"/&gt;
 *     &lt;enumeration value="ManualCashMovement"/&gt;
 *     &lt;enumeration value="BetCorrection"/&gt;
 *     &lt;enumeration value="ChargeBack"/&gt;
 *     &lt;enumeration value="ManualAdjustment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdjustmentTypeKind")
@XmlEnum
public enum AdjustmentTypeKind {


    /**
     * Free Bet - Bonus.
     * 
     * 'FBET' in Openbet 
     * 
     */
    @XmlEnumValue("FreeBet")
    FREE_BET("FreeBet"),

    /**
     * TBD - Bonus.
     * 
     * 'BONS' in Openbet 
     * 
     */
    @XmlEnumValue("Bonus")
    BONUS("Bonus"),

    /**
     * TBD (NEW) - Payout of a Retail Betslip into the online wallet
     * 
     */
    @XmlEnumValue("RetailBetslipPayout")
    RETAIL_BETSLIP_PAYOUT("RetailBetslipPayout"),

    /**
     * Manual Cash Movement - TBD
     * 
     * 'MCM' in Openbet 
     * 
     * Manual cash movement (standard generic Manual Adjustment for Customer Services)
     * 
     */
    @XmlEnumValue("ManualCashMovement")
    MANUAL_CASH_MOVEMENT("ManualCashMovement"),

    /**
     * TBD - Bet Correction in OpenBet
     * 
     * 'BCOR' in Openbet 
     * 
     * Manual cash movement (standard generic Manual Adjustment for Customer Services)
     * 
     */
    @XmlEnumValue("BetCorrection")
    BET_CORRECTION("BetCorrection"),

    /**
     * Chargeback (to correct a payment that has been processed but bank have chargedback)
     * 
     * CBAK
     * 
     */
    @XmlEnumValue("ChargeBack")
    CHARGE_BACK("ChargeBack"),

    /**
     * Misc Manual Adjustment (standard value used with Manual Adjustment uploads if no
     * type is supplied)
     * 
     * 'MADJ' in Openbet 
     * 
     * Manual cash movement (standard generic Manual Adjustment for Customer Services)
     * 
     */
    @XmlEnumValue("ManualAdjustment")
    MANUAL_ADJUSTMENT("ManualAdjustment");
    private final String value;

    AdjustmentTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdjustmentTypeKind fromValue(String v) {
        for (AdjustmentTypeKind c: AdjustmentTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
