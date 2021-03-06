//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Part contains the selection level detail for the bet.
 * 
 * OpenBet uses the concept of “Parts” to model bet lines featuring multiple selections that compose a single leg. The most common use of this is to handle Forecast and Tricast bet lines. 
 * 
 * For example a Forecast bet will have a single leg, but two parts. Another example of a multi-part bet line would be a Scorecast (combination Correct Score and First Scorer market).
 * 
 * <p>Java class for Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="mustPlace" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="alternateSettleRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partSelection" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}PartSelection" minOccurs="0"/&gt;
 *         &lt;element name="winPlaceType" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}WinPlaceType" minOccurs="0"/&gt;
 *         &lt;element name="handicapDetail" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}HandicapDetail" minOccurs="0"/&gt;
 *         &lt;element name="deductionDetail" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}DeductionDetail" minOccurs="0"/&gt;
 *         &lt;element name="resultDetail" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}ResultDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Part", propOrder = {
    "partNo",
    "mustPlace",
    "alternateSettleRuleId",
    "partSelection",
    "winPlaceType",
    "handicapDetail",
    "deductionDetail",
    "resultDetail"
})
public class Part {

    protected BigInteger partNo;
    protected BigInteger mustPlace;
    protected String alternateSettleRuleId;
    protected PartSelection partSelection;
    protected WinPlaceType winPlaceType;
    protected HandicapDetail handicapDetail;
    protected DeductionDetail deductionDetail;
    protected ResultDetail resultDetail;

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartNo(BigInteger value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the mustPlace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMustPlace() {
        return mustPlace;
    }

    /**
     * Sets the value of the mustPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMustPlace(BigInteger value) {
        this.mustPlace = value;
    }

    /**
     * Gets the value of the alternateSettleRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateSettleRuleId() {
        return alternateSettleRuleId;
    }

    /**
     * Sets the value of the alternateSettleRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateSettleRuleId(String value) {
        this.alternateSettleRuleId = value;
    }

    /**
     * Gets the value of the partSelection property.
     * 
     * @return
     *     possible object is
     *     {@link PartSelection }
     *     
     */
    public PartSelection getPartSelection() {
        return partSelection;
    }

    /**
     * Sets the value of the partSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartSelection }
     *     
     */
    public void setPartSelection(PartSelection value) {
        this.partSelection = value;
    }

    /**
     * Gets the value of the winPlaceType property.
     * 
     * @return
     *     possible object is
     *     {@link WinPlaceType }
     *     
     */
    public WinPlaceType getWinPlaceType() {
        return winPlaceType;
    }

    /**
     * Sets the value of the winPlaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinPlaceType }
     *     
     */
    public void setWinPlaceType(WinPlaceType value) {
        this.winPlaceType = value;
    }

    /**
     * Gets the value of the handicapDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HandicapDetail }
     *     
     */
    public HandicapDetail getHandicapDetail() {
        return handicapDetail;
    }

    /**
     * Sets the value of the handicapDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandicapDetail }
     *     
     */
    public void setHandicapDetail(HandicapDetail value) {
        this.handicapDetail = value;
    }

    /**
     * Gets the value of the deductionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeductionDetail }
     *     
     */
    public DeductionDetail getDeductionDetail() {
        return deductionDetail;
    }

    /**
     * Sets the value of the deductionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductionDetail }
     *     
     */
    public void setDeductionDetail(DeductionDetail value) {
        this.deductionDetail = value;
    }

    /**
     * Gets the value of the resultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail }
     *     
     */
    public ResultDetail getResultDetail() {
        return resultDetail;
    }

    /**
     * Sets the value of the resultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail }
     *     
     */
    public void setResultDetail(ResultDetail value) {
        this.resultDetail = value;
    }

}
