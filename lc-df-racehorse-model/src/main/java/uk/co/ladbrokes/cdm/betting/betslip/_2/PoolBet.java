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
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;
import uk.co.ladbrokes.cdm.product.sportsbook._2.PoolType;


/**
 * <p>Java class for PoolBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolBet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}Bet"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stakePerLinePoolCurrency" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="win" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poolType" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}PoolType" minOccurs="0"/&gt;
 *         &lt;element name="poolItem" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}PoolItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolBet", propOrder = {
    "stakePerLinePoolCurrency",
    "win",
    "place",
    "show",
    "otherInfo",
    "poolType",
    "poolItem"
})
public class PoolBet
    extends Bet
{

    protected Money stakePerLinePoolCurrency;
    protected Boolean win;
    protected Boolean place;
    protected Boolean show;
    protected String otherInfo;
    protected PoolType poolType;
    protected List<PoolItem> poolItem;

    /**
     * Gets the value of the stakePerLinePoolCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getStakePerLinePoolCurrency() {
        return stakePerLinePoolCurrency;
    }

    /**
     * Sets the value of the stakePerLinePoolCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setStakePerLinePoolCurrency(Money value) {
        this.stakePerLinePoolCurrency = value;
    }

    /**
     * Gets the value of the win property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWin() {
        return win;
    }

    /**
     * Sets the value of the win property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWin(Boolean value) {
        this.win = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlace(Boolean value) {
        this.place = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow(Boolean value) {
        this.show = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the poolType property.
     * 
     * @return
     *     possible object is
     *     {@link PoolType }
     *     
     */
    public PoolType getPoolType() {
        return poolType;
    }

    /**
     * Sets the value of the poolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolType }
     *     
     */
    public void setPoolType(PoolType value) {
        this.poolType = value;
    }

    /**
     * Gets the value of the poolItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poolItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoolItem }
     * 
     * 
     */
    public List<PoolItem> getPoolItem() {
        if (poolItem == null) {
            poolItem = new ArrayList<PoolItem>();
        }
        return this.poolItem;
    }

}
