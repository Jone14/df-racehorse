//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * This class  represents a scorecast pair of scorer and another outcome, and the price
 * 
 * <p>Java class for ScorecastSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecastSelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scorerSelectionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selectionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scorerSelectionKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="selectionKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="numFractionalPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="denFractionalPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="decimalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="americanPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="scorecastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecastSelection", propOrder = {
    "scorerSelectionKey",
    "selectionKey",
    "scorerSelectionKeys",
    "selectionKeys",
    "numFractionalPrice",
    "denFractionalPrice",
    "decimalPrice",
    "americanPrice",
    "scorecastName"
})
public class ScorecastSelection {

    protected String scorerSelectionKey;
    protected String selectionKey;
    protected CrossRefEntityKeys scorerSelectionKeys;
    protected CrossRefEntityKeys selectionKeys;
    protected BigInteger numFractionalPrice;
    protected BigInteger denFractionalPrice;
    protected BigDecimal decimalPrice;
    protected BigInteger americanPrice;
    protected String scorecastName;

    /**
     * Gets the value of the scorerSelectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorerSelectionKey() {
        return scorerSelectionKey;
    }

    /**
     * Sets the value of the scorerSelectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorerSelectionKey(String value) {
        this.scorerSelectionKey = value;
    }

    /**
     * Gets the value of the selectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionKey() {
        return selectionKey;
    }

    /**
     * Sets the value of the selectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionKey(String value) {
        this.selectionKey = value;
    }

    /**
     * Gets the value of the scorerSelectionKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getScorerSelectionKeys() {
        return scorerSelectionKeys;
    }

    /**
     * Sets the value of the scorerSelectionKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setScorerSelectionKeys(CrossRefEntityKeys value) {
        this.scorerSelectionKeys = value;
    }

    /**
     * Gets the value of the selectionKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getSelectionKeys() {
        return selectionKeys;
    }

    /**
     * Sets the value of the selectionKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setSelectionKeys(CrossRefEntityKeys value) {
        this.selectionKeys = value;
    }

    /**
     * Gets the value of the numFractionalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumFractionalPrice() {
        return numFractionalPrice;
    }

    /**
     * Sets the value of the numFractionalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumFractionalPrice(BigInteger value) {
        this.numFractionalPrice = value;
    }

    /**
     * Gets the value of the denFractionalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenFractionalPrice() {
        return denFractionalPrice;
    }

    /**
     * Sets the value of the denFractionalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenFractionalPrice(BigInteger value) {
        this.denFractionalPrice = value;
    }

    /**
     * Gets the value of the decimalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalPrice() {
        return decimalPrice;
    }

    /**
     * Sets the value of the decimalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalPrice(BigDecimal value) {
        this.decimalPrice = value;
    }

    /**
     * Gets the value of the americanPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmericanPrice() {
        return americanPrice;
    }

    /**
     * Sets the value of the americanPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmericanPrice(BigInteger value) {
        this.americanPrice = value;
    }

    /**
     * Gets the value of the scorecastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecastName() {
        return scorecastName;
    }

    /**
     * Sets the value of the scorecastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecastName(String value) {
        this.scorecastName = value;
    }

}