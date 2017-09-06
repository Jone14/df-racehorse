//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.product.catalogue._2.CategoryTypeKind;


/**
 * This class represents a customers 'Sportsbook' profile.
 * 
 * Details of bet history, patterns, segmentation, liability, limits, freebets etc are contained within this CustomerSportsbookProfile class.  
 * 
 * A lot of this information can be gathered direct from OpenBet, some in future may come from some BI / Analytics input.
 * 
 * <p>Java class for CustomerSportsbookProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSportsbookProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageBetsPerDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="averageStakeAmountPerDay" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="betCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="betLoseCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="betWinCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="favouriteEventClassKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasRedeemedPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastBetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastPromotionRedemptionDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productCategory" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}CategoryTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="profileValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondEventClassKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondLastBetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="totalManualAdjustments" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalNumOpenTokens" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalNumRedeemedTokens" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalOpenTokens" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalProfitLoss" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalRedeemedTokens" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalRefunds" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalStaked" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalStakedSettled" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalWinnings" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="sportsbookProfileCharacteristic" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}ProductProfileCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerBetLiability" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerBetLiability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSportsbookProfile", propOrder = {
    "averageBetsPerDay",
    "averageStakeAmountPerDay",
    "betCount",
    "betLoseCount",
    "betWinCount",
    "customerKey",
    "favouriteEventClassKey",
    "hasRedeemedPromotions",
    "lastBetDateTime",
    "lastPromotionRedemptionDateTime",
    "productCategory",
    "profileValue",
    "secondEventClassKey",
    "secondLastBetDateTime",
    "totalManualAdjustments",
    "totalNumOpenTokens",
    "totalNumRedeemedTokens",
    "totalOpenTokens",
    "totalProfitLoss",
    "totalRedeemedTokens",
    "totalRefunds",
    "totalStaked",
    "totalStakedSettled",
    "totalWinnings",
    "sportsbookProfileCharacteristic",
    "customerBetLiability"
})
public class CustomerSportsbookProfile
    extends ManagedEntity
{

    protected BigInteger averageBetsPerDay;
    protected Money averageStakeAmountPerDay;
    protected BigInteger betCount;
    protected BigInteger betLoseCount;
    protected BigInteger betWinCount;
    protected CustomerKey customerKey;
    protected String favouriteEventClassKey;
    protected Boolean hasRedeemedPromotions;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBetDateTime;
    protected Boolean lastPromotionRedemptionDateTime;
    @XmlSchemaType(name = "string")
    protected CategoryTypeKind productCategory;
    protected String profileValue;
    protected String secondEventClassKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar secondLastBetDateTime;
    protected Money totalManualAdjustments;
    protected BigInteger totalNumOpenTokens;
    protected BigInteger totalNumRedeemedTokens;
    protected Money totalOpenTokens;
    protected Money totalProfitLoss;
    protected Money totalRedeemedTokens;
    protected Money totalRefunds;
    protected Money totalStaked;
    protected Money totalStakedSettled;
    protected Money totalWinnings;
    protected List<ProductProfileCharacteristic> sportsbookProfileCharacteristic;
    protected CustomerBetLiability customerBetLiability;

    /**
     * Gets the value of the averageBetsPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageBetsPerDay() {
        return averageBetsPerDay;
    }

    /**
     * Sets the value of the averageBetsPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageBetsPerDay(BigInteger value) {
        this.averageBetsPerDay = value;
    }

    /**
     * Gets the value of the averageStakeAmountPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageStakeAmountPerDay() {
        return averageStakeAmountPerDay;
    }

    /**
     * Sets the value of the averageStakeAmountPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageStakeAmountPerDay(Money value) {
        this.averageStakeAmountPerDay = value;
    }

    /**
     * Gets the value of the betCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBetCount() {
        return betCount;
    }

    /**
     * Sets the value of the betCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBetCount(BigInteger value) {
        this.betCount = value;
    }

    /**
     * Gets the value of the betLoseCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBetLoseCount() {
        return betLoseCount;
    }

    /**
     * Sets the value of the betLoseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBetLoseCount(BigInteger value) {
        this.betLoseCount = value;
    }

    /**
     * Gets the value of the betWinCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBetWinCount() {
        return betWinCount;
    }

    /**
     * Sets the value of the betWinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBetWinCount(BigInteger value) {
        this.betWinCount = value;
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
     * Gets the value of the favouriteEventClassKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavouriteEventClassKey() {
        return favouriteEventClassKey;
    }

    /**
     * Sets the value of the favouriteEventClassKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavouriteEventClassKey(String value) {
        this.favouriteEventClassKey = value;
    }

    /**
     * Gets the value of the hasRedeemedPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRedeemedPromotions() {
        return hasRedeemedPromotions;
    }

    /**
     * Sets the value of the hasRedeemedPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRedeemedPromotions(Boolean value) {
        this.hasRedeemedPromotions = value;
    }

    /**
     * Gets the value of the lastBetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBetDateTime() {
        return lastBetDateTime;
    }

    /**
     * Sets the value of the lastBetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBetDateTime(XMLGregorianCalendar value) {
        this.lastBetDateTime = value;
    }

    /**
     * Gets the value of the lastPromotionRedemptionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastPromotionRedemptionDateTime() {
        return lastPromotionRedemptionDateTime;
    }

    /**
     * Sets the value of the lastPromotionRedemptionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastPromotionRedemptionDateTime(Boolean value) {
        this.lastPromotionRedemptionDateTime = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTypeKind }
     *     
     */
    public CategoryTypeKind getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTypeKind }
     *     
     */
    public void setProductCategory(CategoryTypeKind value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the profileValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileValue() {
        return profileValue;
    }

    /**
     * Sets the value of the profileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileValue(String value) {
        this.profileValue = value;
    }

    /**
     * Gets the value of the secondEventClassKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondEventClassKey() {
        return secondEventClassKey;
    }

    /**
     * Sets the value of the secondEventClassKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondEventClassKey(String value) {
        this.secondEventClassKey = value;
    }

    /**
     * Gets the value of the secondLastBetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSecondLastBetDateTime() {
        return secondLastBetDateTime;
    }

    /**
     * Sets the value of the secondLastBetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSecondLastBetDateTime(XMLGregorianCalendar value) {
        this.secondLastBetDateTime = value;
    }

    /**
     * Gets the value of the totalManualAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalManualAdjustments() {
        return totalManualAdjustments;
    }

    /**
     * Sets the value of the totalManualAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalManualAdjustments(Money value) {
        this.totalManualAdjustments = value;
    }

    /**
     * Gets the value of the totalNumOpenTokens property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumOpenTokens() {
        return totalNumOpenTokens;
    }

    /**
     * Sets the value of the totalNumOpenTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumOpenTokens(BigInteger value) {
        this.totalNumOpenTokens = value;
    }

    /**
     * Gets the value of the totalNumRedeemedTokens property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumRedeemedTokens() {
        return totalNumRedeemedTokens;
    }

    /**
     * Sets the value of the totalNumRedeemedTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumRedeemedTokens(BigInteger value) {
        this.totalNumRedeemedTokens = value;
    }

    /**
     * Gets the value of the totalOpenTokens property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalOpenTokens() {
        return totalOpenTokens;
    }

    /**
     * Sets the value of the totalOpenTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalOpenTokens(Money value) {
        this.totalOpenTokens = value;
    }

    /**
     * Gets the value of the totalProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalProfitLoss() {
        return totalProfitLoss;
    }

    /**
     * Sets the value of the totalProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalProfitLoss(Money value) {
        this.totalProfitLoss = value;
    }

    /**
     * Gets the value of the totalRedeemedTokens property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalRedeemedTokens() {
        return totalRedeemedTokens;
    }

    /**
     * Sets the value of the totalRedeemedTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalRedeemedTokens(Money value) {
        this.totalRedeemedTokens = value;
    }

    /**
     * Gets the value of the totalRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalRefunds() {
        return totalRefunds;
    }

    /**
     * Sets the value of the totalRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalRefunds(Money value) {
        this.totalRefunds = value;
    }

    /**
     * Gets the value of the totalStaked property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalStaked() {
        return totalStaked;
    }

    /**
     * Sets the value of the totalStaked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalStaked(Money value) {
        this.totalStaked = value;
    }

    /**
     * Gets the value of the totalStakedSettled property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalStakedSettled() {
        return totalStakedSettled;
    }

    /**
     * Sets the value of the totalStakedSettled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalStakedSettled(Money value) {
        this.totalStakedSettled = value;
    }

    /**
     * Gets the value of the totalWinnings property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalWinnings() {
        return totalWinnings;
    }

    /**
     * Sets the value of the totalWinnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalWinnings(Money value) {
        this.totalWinnings = value;
    }

    /**
     * Gets the value of the sportsbookProfileCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sportsbookProfileCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSportsbookProfileCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductProfileCharacteristic }
     * 
     * 
     */
    public List<ProductProfileCharacteristic> getSportsbookProfileCharacteristic() {
        if (sportsbookProfileCharacteristic == null) {
            sportsbookProfileCharacteristic = new ArrayList<ProductProfileCharacteristic>();
        }
        return this.sportsbookProfileCharacteristic;
    }

    /**
     * Gets the value of the customerBetLiability property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBetLiability }
     *     
     */
    public CustomerBetLiability getCustomerBetLiability() {
        return customerBetLiability;
    }

    /**
     * Sets the value of the customerBetLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBetLiability }
     *     
     */
    public void setCustomerBetLiability(CustomerBetLiability value) {
        this.customerBetLiability = value;
    }

}
