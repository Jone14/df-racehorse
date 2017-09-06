//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class represents a container of extensibility characteristics for a Market
 * 
 * <p>Java class for SportsbookMarketCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SportsbookMarketCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasCharacteristics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="marketCharacteristic" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportsbookMarketCharacteristics", propOrder = {
    "hasCharacteristics",
    "marketCharacteristic"
})
public class SportsbookMarketCharacteristics {

    protected Boolean hasCharacteristics;
    protected List<SportsbookCharacteristic> marketCharacteristic;

    /**
     * Gets the value of the hasCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCharacteristics() {
        return hasCharacteristics;
    }

    /**
     * Sets the value of the hasCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCharacteristics(Boolean value) {
        this.hasCharacteristics = value;
    }

    /**
     * Gets the value of the marketCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SportsbookCharacteristic }
     * 
     * 
     */
    public List<SportsbookCharacteristic> getMarketCharacteristic() {
        if (marketCharacteristic == null) {
            marketCharacteristic = new ArrayList<SportsbookCharacteristic>();
        }
        return this.marketCharacteristic;
    }

}