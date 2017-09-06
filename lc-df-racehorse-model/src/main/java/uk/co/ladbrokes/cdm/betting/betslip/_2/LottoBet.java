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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LottoBet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LottoBet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}Bet"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pickCombination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lottoItem" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}LottoItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lottoType" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}LottoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LottoBet", propOrder = {
    "pickCombination",
    "howMany",
    "lottoItem",
    "lottoType"
})
public class LottoBet
    extends Bet
{

    protected String pickCombination;
    protected BigInteger howMany;
    protected List<LottoItem> lottoItem;
    protected LottoType lottoType;

    /**
     * Gets the value of the pickCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickCombination() {
        return pickCombination;
    }

    /**
     * Sets the value of the pickCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickCombination(String value) {
        this.pickCombination = value;
    }

    /**
     * Gets the value of the howMany property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHowMany() {
        return howMany;
    }

    /**
     * Sets the value of the howMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHowMany(BigInteger value) {
        this.howMany = value;
    }

    /**
     * Gets the value of the lottoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lottoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLottoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LottoItem }
     * 
     * 
     */
    public List<LottoItem> getLottoItem() {
        if (lottoItem == null) {
            lottoItem = new ArrayList<LottoItem>();
        }
        return this.lottoItem;
    }

    /**
     * Gets the value of the lottoType property.
     * 
     * @return
     *     possible object is
     *     {@link LottoType }
     *     
     */
    public LottoType getLottoType() {
        return lottoType;
    }

    /**
     * Sets the value of the lottoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LottoType }
     *     
     */
    public void setLottoType(LottoType value) {
        this.lottoType = value;
    }

}
