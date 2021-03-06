//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.wallet._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.basetype._2.CurrencyCodeKind;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;
import uk.co.ladbrokes.cdm.customer.customer._2.CustomerKey;


/**
 * This class represents the 'Real Money' financial balance of a customers wallet.
 * 
 * FreeBets and FreeMoney are modelled against the wallet itself, rather then as part of the 'WalletBalance'
 * 
 * <p>Java class for WalletBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="walletKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="availableFunds" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="withdrawableFunds" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="heldFunds" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="bonusBarPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="convertedBalanceCurrency" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}CurrencyCodeKind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletBalance", propOrder = {
    "walletKey",
    "customerKey",
    "balance",
    "availableFunds",
    "withdrawableFunds",
    "heldFunds",
    "bonusBarPercentage",
    "convertedBalanceCurrency"
})
public class WalletBalance {

    protected String walletKey;
    protected CustomerKey customerKey;
    protected Money balance;
    protected Money availableFunds;
    protected Money withdrawableFunds;
    protected Money heldFunds;
    protected BigDecimal bonusBarPercentage;
    @XmlSchemaType(name = "string")
    protected CurrencyCodeKind convertedBalanceCurrency;

    /**
     * Gets the value of the walletKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletKey() {
        return walletKey;
    }

    /**
     * Sets the value of the walletKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletKey(String value) {
        this.walletKey = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKey }
     *     
     */
    public CustomerKey getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKey }
     *     
     */
    public void setCustomerKey(CustomerKey value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBalance(Money value) {
        this.balance = value;
    }

    /**
     * Gets the value of the availableFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAvailableFunds() {
        return availableFunds;
    }

    /**
     * Sets the value of the availableFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAvailableFunds(Money value) {
        this.availableFunds = value;
    }

    /**
     * Gets the value of the withdrawableFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getWithdrawableFunds() {
        return withdrawableFunds;
    }

    /**
     * Sets the value of the withdrawableFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setWithdrawableFunds(Money value) {
        this.withdrawableFunds = value;
    }

    /**
     * Gets the value of the heldFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getHeldFunds() {
        return heldFunds;
    }

    /**
     * Sets the value of the heldFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setHeldFunds(Money value) {
        this.heldFunds = value;
    }

    /**
     * Gets the value of the bonusBarPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusBarPercentage() {
        return bonusBarPercentage;
    }

    /**
     * Sets the value of the bonusBarPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusBarPercentage(BigDecimal value) {
        this.bonusBarPercentage = value;
    }

    /**
     * Gets the value of the convertedBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeKind }
     *     
     */
    public CurrencyCodeKind getConvertedBalanceCurrency() {
        return convertedBalanceCurrency;
    }

    /**
     * Sets the value of the convertedBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeKind }
     *     
     */
    public void setConvertedBalanceCurrency(CurrencyCodeKind value) {
        this.convertedBalanceCurrency = value;
    }

}
