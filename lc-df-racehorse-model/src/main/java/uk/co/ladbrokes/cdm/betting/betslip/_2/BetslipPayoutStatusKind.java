//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetslipPayoutStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetslipPayoutStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotPaid"/&gt;
 *     &lt;enumeration value="PartPaid"/&gt;
 *     &lt;enumeration value="FullPaid"/&gt;
 *     &lt;enumeration value="NothingToPay"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Parked"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BetslipPayoutStatusKind")
@XmlEnum
public enum BetslipPayoutStatusKind {


    /**
     * The Betslip has NOT been paid out at all.  None of the constituent Bets have been been settled and paid.
     * 
     */
    @XmlEnumValue("NotPaid")
    NOT_PAID("NotPaid"),

    /**
     * The Betslip has been partially paid out to the customer.  Some bets are still to be settled and paid, while others have allready been so.   Refer 'extraInfo' for extra detail.
     * 
     */
    @XmlEnumValue("PartPaid")
    PART_PAID("PartPaid"),

    /**
     * The Betslip has been fully paid out to the customer in terms of the possible winnings (all bets settled and paid)
     * 
     */
    @XmlEnumValue("FullPaid")
    FULL_PAID("FullPaid"),

    /**
     * The Betslip is a looser and there is nothing to pay at all.  All bets settled, no payout obligations required.
     * 
     */
    @XmlEnumValue("NothingToPay")
    NOTHING_TO_PAY("NothingToPay"),

    /**
     * The Betslip has been cancelled and nothing to be paid.  Refer to extraInfo for more detail.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * The Betslip has been parked.  Refer to extraInfo for more detail.
     * 
     */
    @XmlEnumValue("Parked")
    PARKED("Parked"),

    /**
     * The Betlip has been Voided and wont be paid.  Refer to extraInfo for more detail.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BetslipPayoutStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BetslipPayoutStatusKind fromValue(String v) {
        for (BetslipPayoutStatusKind c: BetslipPayoutStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
