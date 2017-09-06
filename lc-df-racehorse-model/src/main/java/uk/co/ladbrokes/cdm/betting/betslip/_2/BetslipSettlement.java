//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.internationalmoney._2.InternationalMoney;


/**
 * This class represents the settlement information if a total Betslip has been settled (i.e. the event is over, the result known, and ALL the customer bets on the slip are settled).  Will be a function of all the constituent Bet settlement states.
 * 
 * <p>Java class for BetslipSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetslipSettlement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="settlementStatus" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}SettlementStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isResettlement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="winnings" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="refund" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="bonus" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="tax" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settledHow" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}SettlementMethodKind" minOccurs="0"/&gt;
 *         &lt;element name="settleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetslipSettlement", propOrder = {
    "validFrom",
    "validTo",
    "settlementStatus",
    "isActive",
    "isResettlement",
    "winnings",
    "refund",
    "bonus",
    "tax",
    "taxRate",
    "taxType",
    "settledHow",
    "settleInfo"
})
public class BetslipSettlement {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlSchemaType(name = "string")
    protected SettlementStatusKind settlementStatus;
    protected Boolean isActive;
    protected Boolean isResettlement;
    protected InternationalMoney winnings;
    protected InternationalMoney refund;
    protected InternationalMoney bonus;
    protected InternationalMoney tax;
    protected BigDecimal taxRate;
    protected String taxType;
    @XmlSchemaType(name = "string")
    protected SettlementMethodKind settledHow;
    protected String settleInfo;

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the settlementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatusKind }
     *     
     */
    public SettlementStatusKind getSettlementStatus() {
        return settlementStatus;
    }

    /**
     * Sets the value of the settlementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatusKind }
     *     
     */
    public void setSettlementStatus(SettlementStatusKind value) {
        this.settlementStatus = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isResettlement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResettlement() {
        return isResettlement;
    }

    /**
     * Sets the value of the isResettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResettlement(Boolean value) {
        this.isResettlement = value;
    }

    /**
     * Gets the value of the winnings property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getWinnings() {
        return winnings;
    }

    /**
     * Sets the value of the winnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setWinnings(InternationalMoney value) {
        this.winnings = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setRefund(InternationalMoney value) {
        this.refund = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setBonus(InternationalMoney value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setTax(InternationalMoney value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the settledHow property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMethodKind }
     *     
     */
    public SettlementMethodKind getSettledHow() {
        return settledHow;
    }

    /**
     * Sets the value of the settledHow property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMethodKind }
     *     
     */
    public void setSettledHow(SettlementMethodKind value) {
        this.settledHow = value;
    }

    /**
     * Gets the value of the settleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleInfo() {
        return settleInfo;
    }

    /**
     * Sets the value of the settleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleInfo(String value) {
        this.settleInfo = value;
    }

}