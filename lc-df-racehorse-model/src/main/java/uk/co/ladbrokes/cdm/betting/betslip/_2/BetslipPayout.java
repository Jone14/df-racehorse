//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.banking.wallet._2.BetReturns;
import uk.co.ladbrokes.cdm.common.internationalmoney._2.InternationalMoney;
import uk.co.ladbrokes.cdm.retail.retailshop._2.RetailShop;
import uk.co.ladbrokes.cdm.retail.retailshop._2.TerminalTypeKind;


/**
 * This class represents the payout details for a Betslip.  This can contain details like 'potentialPayout' and when paid out, the payout details.  This would be the total payout of the constituent Bets
 * 
 * <p>Java class for BetslipPayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetslipPayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="potentialPayout" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="payoutStatus" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetslipPayoutStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="payoutDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="actualPayout" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="cumulativePayout" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="payoutBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payoutMethod" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}PayoutMethodKind" minOccurs="0"/&gt;
 *         &lt;element name="payoutTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalType" type="{http://cdm.ladbrokes.co.uk/retail/RetailShop/2.0}TerminalTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="extraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPaidDirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPaidRemoteShop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPaidToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="retailShop" type="{http://cdm.ladbrokes.co.uk/retail/RetailShop/2.0}RetailShop" minOccurs="0"/&gt;
 *         &lt;element name="betReturnsTransaction" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}BetReturns" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetslipPayout", propOrder = {
    "potentialPayout",
    "payoutStatus",
    "payoutDateTime",
    "actualPayout",
    "cumulativePayout",
    "payoutBy",
    "payoutMethod",
    "payoutTerminal",
    "terminalType",
    "extraInfo",
    "isPaidDirect",
    "isPaidRemoteShop",
    "isPaidToAccount",
    "retailShop",
    "betReturnsTransaction"
})
public class BetslipPayout {

    protected InternationalMoney potentialPayout;
    @XmlSchemaType(name = "string")
    protected BetslipPayoutStatusKind payoutStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payoutDateTime;
    protected InternationalMoney actualPayout;
    protected InternationalMoney cumulativePayout;
    protected String payoutBy;
    @XmlSchemaType(name = "string")
    protected PayoutMethodKind payoutMethod;
    protected String payoutTerminal;
    @XmlSchemaType(name = "string")
    protected TerminalTypeKind terminalType;
    protected String extraInfo;
    protected Boolean isPaidDirect;
    protected Boolean isPaidRemoteShop;
    protected Boolean isPaidToAccount;
    protected RetailShop retailShop;
    protected BetReturns betReturnsTransaction;

    /**
     * Gets the value of the potentialPayout property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getPotentialPayout() {
        return potentialPayout;
    }

    /**
     * Sets the value of the potentialPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setPotentialPayout(InternationalMoney value) {
        this.potentialPayout = value;
    }

    /**
     * Gets the value of the payoutStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BetslipPayoutStatusKind }
     *     
     */
    public BetslipPayoutStatusKind getPayoutStatus() {
        return payoutStatus;
    }

    /**
     * Sets the value of the payoutStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetslipPayoutStatusKind }
     *     
     */
    public void setPayoutStatus(BetslipPayoutStatusKind value) {
        this.payoutStatus = value;
    }

    /**
     * Gets the value of the payoutDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayoutDateTime() {
        return payoutDateTime;
    }

    /**
     * Sets the value of the payoutDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayoutDateTime(XMLGregorianCalendar value) {
        this.payoutDateTime = value;
    }

    /**
     * Gets the value of the actualPayout property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getActualPayout() {
        return actualPayout;
    }

    /**
     * Sets the value of the actualPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setActualPayout(InternationalMoney value) {
        this.actualPayout = value;
    }

    /**
     * Gets the value of the cumulativePayout property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getCumulativePayout() {
        return cumulativePayout;
    }

    /**
     * Sets the value of the cumulativePayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setCumulativePayout(InternationalMoney value) {
        this.cumulativePayout = value;
    }

    /**
     * Gets the value of the payoutBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutBy() {
        return payoutBy;
    }

    /**
     * Sets the value of the payoutBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutBy(String value) {
        this.payoutBy = value;
    }

    /**
     * Gets the value of the payoutMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutMethodKind }
     *     
     */
    public PayoutMethodKind getPayoutMethod() {
        return payoutMethod;
    }

    /**
     * Sets the value of the payoutMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutMethodKind }
     *     
     */
    public void setPayoutMethod(PayoutMethodKind value) {
        this.payoutMethod = value;
    }

    /**
     * Gets the value of the payoutTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutTerminal() {
        return payoutTerminal;
    }

    /**
     * Sets the value of the payoutTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutTerminal(String value) {
        this.payoutTerminal = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalTypeKind }
     *     
     */
    public TerminalTypeKind getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalTypeKind }
     *     
     */
    public void setTerminalType(TerminalTypeKind value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the isPaidDirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaidDirect() {
        return isPaidDirect;
    }

    /**
     * Sets the value of the isPaidDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaidDirect(Boolean value) {
        this.isPaidDirect = value;
    }

    /**
     * Gets the value of the isPaidRemoteShop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaidRemoteShop() {
        return isPaidRemoteShop;
    }

    /**
     * Sets the value of the isPaidRemoteShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaidRemoteShop(Boolean value) {
        this.isPaidRemoteShop = value;
    }

    /**
     * Gets the value of the isPaidToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaidToAccount() {
        return isPaidToAccount;
    }

    /**
     * Sets the value of the isPaidToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaidToAccount(Boolean value) {
        this.isPaidToAccount = value;
    }

    /**
     * Gets the value of the retailShop property.
     * 
     * @return
     *     possible object is
     *     {@link RetailShop }
     *     
     */
    public RetailShop getRetailShop() {
        return retailShop;
    }

    /**
     * Sets the value of the retailShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailShop }
     *     
     */
    public void setRetailShop(RetailShop value) {
        this.retailShop = value;
    }

    /**
     * Gets the value of the betReturnsTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link BetReturns }
     *     
     */
    public BetReturns getBetReturnsTransaction() {
        return betReturnsTransaction;
    }

    /**
     * Sets the value of the betReturnsTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetReturns }
     *     
     */
    public void setBetReturnsTransaction(BetReturns value) {
        this.betReturnsTransaction = value;
    }

}
