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
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * <p>Java class for LottoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LottoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="selectionKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LottoItem", propOrder = {
    "number",
    "isSpecialNumber",
    "selectionKey"
})
public class LottoItem {

    protected BigInteger number;
    protected Boolean isSpecialNumber;
    protected CrossRefEntityKeys selectionKey;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the isSpecialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialNumber() {
        return isSpecialNumber;
    }

    /**
     * Sets the value of the isSpecialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialNumber(Boolean value) {
        this.isSpecialNumber = value;
    }

    /**
     * Gets the value of the selectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getSelectionKey() {
        return selectionKey;
    }

    /**
     * Sets the value of the selectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setSelectionKey(CrossRefEntityKeys value) {
        this.selectionKey = value;
    }

}
