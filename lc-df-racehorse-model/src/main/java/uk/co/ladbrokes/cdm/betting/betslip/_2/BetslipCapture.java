//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.retail.retailshop._2.RetailShop;


/**
 * <p>Java class for BetslipCapture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetslipCapture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="capturedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="captureMethod" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetslipEntryMethodKind" minOccurs="0"/&gt;
 *         &lt;element name="isRecapture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shopTillKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retailShop" type="{http://cdm.ladbrokes.co.uk/retail/RetailShop/2.0}RetailShop" minOccurs="0"/&gt;
 *         &lt;element name="bet" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}Bet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetslipCapture", propOrder = {
    "validFrom",
    "validTo",
    "isActive",
    "capturedBy",
    "captureMethod",
    "isRecapture",
    "callId",
    "shopTillKey",
    "retailShop",
    "bet"
})
public class BetslipCapture {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    protected Boolean isActive;
    protected String capturedBy;
    @XmlSchemaType(name = "string")
    protected BetslipEntryMethodKind captureMethod;
    protected Boolean isRecapture;
    protected String callId;
    protected String shopTillKey;
    protected RetailShop retailShop;
    protected List<Bet> bet;

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
     * Gets the value of the capturedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapturedBy() {
        return capturedBy;
    }

    /**
     * Sets the value of the capturedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapturedBy(String value) {
        this.capturedBy = value;
    }

    /**
     * Gets the value of the captureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BetslipEntryMethodKind }
     *     
     */
    public BetslipEntryMethodKind getCaptureMethod() {
        return captureMethod;
    }

    /**
     * Sets the value of the captureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetslipEntryMethodKind }
     *     
     */
    public void setCaptureMethod(BetslipEntryMethodKind value) {
        this.captureMethod = value;
    }

    /**
     * Gets the value of the isRecapture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecapture() {
        return isRecapture;
    }

    /**
     * Sets the value of the isRecapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecapture(Boolean value) {
        this.isRecapture = value;
    }

    /**
     * Gets the value of the callId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets the value of the callId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Gets the value of the shopTillKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopTillKey() {
        return shopTillKey;
    }

    /**
     * Sets the value of the shopTillKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopTillKey(String value) {
        this.shopTillKey = value;
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
     * Gets the value of the bet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bet }
     * 
     * 
     */
    public List<Bet> getBet() {
        if (bet == null) {
            bet = new ArrayList<Bet>();
        }
        return this.bet;
    }

}
