//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.marketing.promotions._2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.currency._2.Currency;


/**
 * This class represents a generic 'Bonus' promotion that can be used, primarily mastered by Givex Retail. 
 * 
 * Examples include free loyalty points or a percentage bonus and bonus money.
 * 
 * These often have no restrictions, so are treated separately to say Free Money
 * 
 * Free Money is separate from this as it often needs a 'number of cycles' in terms of how it can be used and is managed by the wallet.
 * 
 * <p>Java class for LoyaltyBonus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyBonus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/marketing/Promotions/2.0}Promotion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loyaltyBonusKind" type="{http://cdm.ladbrokes.co.uk/marketing/Promotions/2.0}LoyaltyBonusKind" minOccurs="0"/&gt;
 *         &lt;element name="bonusMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="bonusPoints" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="bonusStakePerc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://cdm.ladbrokes.co.uk/common/Currency/2.0}Currency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyBonus", propOrder = {
    "loyaltyBonusKind",
    "bonusMoney",
    "bonusPoints",
    "bonusStakePerc",
    "currency"
})
public class LoyaltyBonus
    extends Promotion
{

    @XmlSchemaType(name = "string")
    protected LoyaltyBonusKind loyaltyBonusKind;
    protected BigDecimal bonusMoney;
    protected BigInteger bonusPoints;
    protected BigDecimal bonusStakePerc;
    protected Currency currency;

    /**
     * Gets the value of the loyaltyBonusKind property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyBonusKind }
     *     
     */
    public LoyaltyBonusKind getLoyaltyBonusKind() {
        return loyaltyBonusKind;
    }

    /**
     * Sets the value of the loyaltyBonusKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyBonusKind }
     *     
     */
    public void setLoyaltyBonusKind(LoyaltyBonusKind value) {
        this.loyaltyBonusKind = value;
    }

    /**
     * Gets the value of the bonusMoney property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusMoney() {
        return bonusMoney;
    }

    /**
     * Sets the value of the bonusMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusMoney(BigDecimal value) {
        this.bonusMoney = value;
    }

    /**
     * Gets the value of the bonusPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBonusPoints() {
        return bonusPoints;
    }

    /**
     * Sets the value of the bonusPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBonusPoints(BigInteger value) {
        this.bonusPoints = value;
    }

    /**
     * Gets the value of the bonusStakePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusStakePerc() {
        return bonusStakePerc;
    }

    /**
     * Sets the value of the bonusStakePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusStakePerc(BigDecimal value) {
        this.bonusStakePerc = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

}