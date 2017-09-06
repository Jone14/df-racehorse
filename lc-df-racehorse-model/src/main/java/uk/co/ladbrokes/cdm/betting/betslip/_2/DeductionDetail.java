//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeductionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeductionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isRule4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rule4RuleRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rule4Deductions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isDeadHeatReduced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deadHeatRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deadHeatNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deadHeatDen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeductionDetail", propOrder = {
    "isRule4",
    "rule4RuleRef",
    "rule4Deductions",
    "isDeadHeatReduced",
    "deadHeatRef",
    "deadHeatNum",
    "deadHeatDen"
})
public class DeductionDetail {

    protected Boolean isRule4;
    protected String rule4RuleRef;
    protected BigDecimal rule4Deductions;
    protected Boolean isDeadHeatReduced;
    protected String deadHeatRef;
    protected BigInteger deadHeatNum;
    protected BigInteger deadHeatDen;

    /**
     * Gets the value of the isRule4 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRule4() {
        return isRule4;
    }

    /**
     * Sets the value of the isRule4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRule4(Boolean value) {
        this.isRule4 = value;
    }

    /**
     * Gets the value of the rule4RuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule4RuleRef() {
        return rule4RuleRef;
    }

    /**
     * Sets the value of the rule4RuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule4RuleRef(String value) {
        this.rule4RuleRef = value;
    }

    /**
     * Gets the value of the rule4Deductions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRule4Deductions() {
        return rule4Deductions;
    }

    /**
     * Sets the value of the rule4Deductions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRule4Deductions(BigDecimal value) {
        this.rule4Deductions = value;
    }

    /**
     * Gets the value of the isDeadHeatReduced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeadHeatReduced() {
        return isDeadHeatReduced;
    }

    /**
     * Sets the value of the isDeadHeatReduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeadHeatReduced(Boolean value) {
        this.isDeadHeatReduced = value;
    }

    /**
     * Gets the value of the deadHeatRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadHeatRef() {
        return deadHeatRef;
    }

    /**
     * Sets the value of the deadHeatRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadHeatRef(String value) {
        this.deadHeatRef = value;
    }

    /**
     * Gets the value of the deadHeatNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadHeatNum() {
        return deadHeatNum;
    }

    /**
     * Sets the value of the deadHeatNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadHeatNum(BigInteger value) {
        this.deadHeatNum = value;
    }

    /**
     * Gets the value of the deadHeatDen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadHeatDen() {
        return deadHeatDen;
    }

    /**
     * Sets the value of the deadHeatDen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadHeatDen(BigInteger value) {
        this.deadHeatDen = value;
    }

}
