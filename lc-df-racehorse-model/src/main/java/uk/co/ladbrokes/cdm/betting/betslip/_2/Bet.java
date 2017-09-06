//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.customer.customer._2.SessionToken;
import uk.co.ladbrokes.cdm.marketing.promotions._2.Promotion;


/**
 * The Bet entity captures the details of a single Bet that is associated to a Betslip. This is the unit of Bet 'transaction'.
 * 
 * A Bet is of a particular 'Bet Type and has a 'Let Type' which describes if it is Win, Place or Each Way
 * 
 * <p>Java class for Bet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="betKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="betKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="sessionToken" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}SessionToken" minOccurs="0"/&gt;
 *         &lt;element name="betNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="birToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inPendingState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="betReciept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="betSource" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetSource" minOccurs="0"/&gt;
 *         &lt;element name="betType" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetType" minOccurs="0"/&gt;
 *         &lt;element name="betStatus" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betStake" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetStake" minOccurs="0"/&gt;
 *         &lt;element name="isConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFunded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isParked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSettled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPaid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBetValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="birDelay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="betTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsOnSettle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resultConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outcomesChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="betOffer" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetOffer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betPromotion" type="{http://cdm.ladbrokes.co.uk/marketing/Promotions/2.0}Promotion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betLineSummary" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetLineSummary" minOccurs="0"/&gt;
 *         &lt;element name="betOverride" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetOverride" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legGroup" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}LegGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="leg" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}Leg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="selectionGroup" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}SelectionGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eligibleBetType" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}EligibleBetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betSettlement" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetSettlement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betPayout" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetPayout" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betCharacteristics" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bet", propOrder = {
    "betKey",
    "betKeys",
    "sessionToken",
    "betNo",
    "birToken",
    "inPendingState",
    "betReciept",
    "betSource",
    "betType",
    "betStatus",
    "betStake",
    "isConfirmed",
    "isReferred",
    "isFunded",
    "isParked",
    "isCancelled",
    "isSettled",
    "isPaid",
    "isBetValid",
    "birDelay",
    "betTag",
    "smsOnSettle",
    "resultConfirmed",
    "outcomesChecked",
    "betOffer",
    "betPromotion",
    "betLineSummary",
    "betOverride",
    "legGroup",
    "leg",
    "selectionGroup",
    "eligibleBetType",
    "betSettlement",
    "betPayout",
    "betCharacteristics",
    "barcode"
})
@XmlSeeAlso({
    PoolBet.class,
    LottoBet.class
})
public class Bet
    extends ManagedEntity
{

    protected String betKey;
    protected CrossRefEntityKeys betKeys;
    protected SessionToken sessionToken;
    protected BigInteger betNo;
    protected String birToken;
    protected Boolean inPendingState;
    protected String betReciept;
    protected BetSource betSource;
    protected BetType betType;
    protected List<BetStatus> betStatus;
    protected BetStake betStake;
    protected Boolean isConfirmed;
    protected Boolean isReferred;
    protected Boolean isFunded;
    protected Boolean isParked;
    protected Boolean isCancelled;
    protected Boolean isSettled;
    protected Boolean isPaid;
    protected Boolean isBetValid;
    protected BigInteger birDelay;
    protected String betTag;
    protected Boolean smsOnSettle;
    protected Boolean resultConfirmed;
    protected Boolean outcomesChecked;
    protected List<BetOffer> betOffer;
    protected List<Promotion> betPromotion;
    protected BetLineSummary betLineSummary;
    protected List<BetOverride> betOverride;
    protected List<LegGroup> legGroup;
    protected List<Leg> leg;
    protected List<SelectionGroup> selectionGroup;
    protected List<EligibleBetType> eligibleBetType;
    protected List<BetSettlement> betSettlement;
    protected List<BetPayout> betPayout;
    protected BetCharacteristics betCharacteristics;
    protected String barcode;

    /**
     * Gets the value of the betKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetKey() {
        return betKey;
    }

    /**
     * Sets the value of the betKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetKey(String value) {
        this.betKey = value;
    }

    /**
     * Gets the value of the betKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getBetKeys() {
        return betKeys;
    }

    /**
     * Sets the value of the betKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setBetKeys(CrossRefEntityKeys value) {
        this.betKeys = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link SessionToken }
     *     
     */
    public SessionToken getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionToken }
     *     
     */
    public void setSessionToken(SessionToken value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the betNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBetNo() {
        return betNo;
    }

    /**
     * Sets the value of the betNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBetNo(BigInteger value) {
        this.betNo = value;
    }

    /**
     * Gets the value of the birToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirToken() {
        return birToken;
    }

    /**
     * Sets the value of the birToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirToken(String value) {
        this.birToken = value;
    }

    /**
     * Gets the value of the inPendingState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPendingState() {
        return inPendingState;
    }

    /**
     * Sets the value of the inPendingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPendingState(Boolean value) {
        this.inPendingState = value;
    }

    /**
     * Gets the value of the betReciept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetReciept() {
        return betReciept;
    }

    /**
     * Sets the value of the betReciept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetReciept(String value) {
        this.betReciept = value;
    }

    /**
     * Gets the value of the betSource property.
     * 
     * @return
     *     possible object is
     *     {@link BetSource }
     *     
     */
    public BetSource getBetSource() {
        return betSource;
    }

    /**
     * Sets the value of the betSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetSource }
     *     
     */
    public void setBetSource(BetSource value) {
        this.betSource = value;
    }

    /**
     * Gets the value of the betType property.
     * 
     * @return
     *     possible object is
     *     {@link BetType }
     *     
     */
    public BetType getBetType() {
        return betType;
    }

    /**
     * Sets the value of the betType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetType }
     *     
     */
    public void setBetType(BetType value) {
        this.betType = value;
    }

    /**
     * Gets the value of the betStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BetStatus }
     * 
     * 
     */
    public List<BetStatus> getBetStatus() {
        if (betStatus == null) {
            betStatus = new ArrayList<BetStatus>();
        }
        return this.betStatus;
    }

    /**
     * Gets the value of the betStake property.
     * 
     * @return
     *     possible object is
     *     {@link BetStake }
     *     
     */
    public BetStake getBetStake() {
        return betStake;
    }

    /**
     * Sets the value of the betStake property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetStake }
     *     
     */
    public void setBetStake(BetStake value) {
        this.betStake = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmed(Boolean value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the isReferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReferred() {
        return isReferred;
    }

    /**
     * Sets the value of the isReferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReferred(Boolean value) {
        this.isReferred = value;
    }

    /**
     * Gets the value of the isFunded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFunded() {
        return isFunded;
    }

    /**
     * Sets the value of the isFunded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFunded(Boolean value) {
        this.isFunded = value;
    }

    /**
     * Gets the value of the isParked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParked() {
        return isParked;
    }

    /**
     * Sets the value of the isParked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParked(Boolean value) {
        this.isParked = value;
    }

    /**
     * Gets the value of the isCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelled(Boolean value) {
        this.isCancelled = value;
    }

    /**
     * Gets the value of the isSettled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSettled() {
        return isSettled;
    }

    /**
     * Sets the value of the isSettled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSettled(Boolean value) {
        this.isSettled = value;
    }

    /**
     * Gets the value of the isPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaid(Boolean value) {
        this.isPaid = value;
    }

    /**
     * Gets the value of the isBetValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBetValid() {
        return isBetValid;
    }

    /**
     * Sets the value of the isBetValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBetValid(Boolean value) {
        this.isBetValid = value;
    }

    /**
     * Gets the value of the birDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBirDelay() {
        return birDelay;
    }

    /**
     * Sets the value of the birDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBirDelay(BigInteger value) {
        this.birDelay = value;
    }

    /**
     * Gets the value of the betTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetTag() {
        return betTag;
    }

    /**
     * Sets the value of the betTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetTag(String value) {
        this.betTag = value;
    }

    /**
     * Gets the value of the smsOnSettle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmsOnSettle() {
        return smsOnSettle;
    }

    /**
     * Sets the value of the smsOnSettle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmsOnSettle(Boolean value) {
        this.smsOnSettle = value;
    }

    /**
     * Gets the value of the resultConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResultConfirmed() {
        return resultConfirmed;
    }

    /**
     * Sets the value of the resultConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResultConfirmed(Boolean value) {
        this.resultConfirmed = value;
    }

    /**
     * Gets the value of the outcomesChecked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutcomesChecked() {
        return outcomesChecked;
    }

    /**
     * Sets the value of the outcomesChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutcomesChecked(Boolean value) {
        this.outcomesChecked = value;
    }

    /**
     * Gets the value of the betOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BetOffer }
     * 
     * 
     */
    public List<BetOffer> getBetOffer() {
        if (betOffer == null) {
            betOffer = new ArrayList<BetOffer>();
        }
        return this.betOffer;
    }

    /**
     * Gets the value of the betPromotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betPromotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Promotion }
     * 
     * 
     */
    public List<Promotion> getBetPromotion() {
        if (betPromotion == null) {
            betPromotion = new ArrayList<Promotion>();
        }
        return this.betPromotion;
    }

    /**
     * Gets the value of the betLineSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BetLineSummary }
     *     
     */
    public BetLineSummary getBetLineSummary() {
        return betLineSummary;
    }

    /**
     * Sets the value of the betLineSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetLineSummary }
     *     
     */
    public void setBetLineSummary(BetLineSummary value) {
        this.betLineSummary = value;
    }

    /**
     * Gets the value of the betOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BetOverride }
     * 
     * 
     */
    public List<BetOverride> getBetOverride() {
        if (betOverride == null) {
            betOverride = new ArrayList<BetOverride>();
        }
        return this.betOverride;
    }

    /**
     * Gets the value of the legGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegGroup }
     * 
     * 
     */
    public List<LegGroup> getLegGroup() {
        if (legGroup == null) {
            legGroup = new ArrayList<LegGroup>();
        }
        return this.legGroup;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * 
     * 
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<Leg>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the selectionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionGroup }
     * 
     * 
     */
    public List<SelectionGroup> getSelectionGroup() {
        if (selectionGroup == null) {
            selectionGroup = new ArrayList<SelectionGroup>();
        }
        return this.selectionGroup;
    }

    /**
     * Gets the value of the eligibleBetType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibleBetType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibleBetType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibleBetType }
     * 
     * 
     */
    public List<EligibleBetType> getEligibleBetType() {
        if (eligibleBetType == null) {
            eligibleBetType = new ArrayList<EligibleBetType>();
        }
        return this.eligibleBetType;
    }

    /**
     * Gets the value of the betSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BetSettlement }
     * 
     * 
     */
    public List<BetSettlement> getBetSettlement() {
        if (betSettlement == null) {
            betSettlement = new ArrayList<BetSettlement>();
        }
        return this.betSettlement;
    }

    /**
     * Gets the value of the betPayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betPayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetPayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BetPayout }
     * 
     * 
     */
    public List<BetPayout> getBetPayout() {
        if (betPayout == null) {
            betPayout = new ArrayList<BetPayout>();
        }
        return this.betPayout;
    }

    /**
     * Gets the value of the betCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link BetCharacteristics }
     *     
     */
    public BetCharacteristics getBetCharacteristics() {
        return betCharacteristics;
    }

    /**
     * Sets the value of the betCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetCharacteristics }
     *     
     */
    public void setBetCharacteristics(BetCharacteristics value) {
        this.betCharacteristics = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

}