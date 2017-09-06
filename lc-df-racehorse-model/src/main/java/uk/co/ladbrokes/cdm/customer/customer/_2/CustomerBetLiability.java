//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class represents the customers betting liability, as mastered in OpenBet and can be modified by traders.
 * 
 * <p>Java class for CustomerBetLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBetLiability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="liabilityGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stakeFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBetLiability", propOrder = {
    "liabilityGroup",
    "stakeFactor"
})
public class CustomerBetLiability {

    protected String liabilityGroup;
    protected BigDecimal stakeFactor;

    /**
     * Gets the value of the liabilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiabilityGroup() {
        return liabilityGroup;
    }

    /**
     * Sets the value of the liabilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiabilityGroup(String value) {
        this.liabilityGroup = value;
    }

    /**
     * Gets the value of the stakeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStakeFactor() {
        return stakeFactor;
    }

    /**
     * Sets the value of the stakeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStakeFactor(BigDecimal value) {
        this.stakeFactor = value;
    }

}