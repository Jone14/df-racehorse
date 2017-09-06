//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.content.racingcontent._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.product.sportsbook._2.RaceCourse;
import uk.co.ladbrokes.cdm.product.sportsbook._2.RaceRunner;


/**
 * <p>Java class for RacingTip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RacingTip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newspaper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isRacingPostTip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="course" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}RaceCourse" minOccurs="0"/&gt;
 *         &lt;element name="selection" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}RaceRunner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacingTip", propOrder = {
    "newspaper",
    "tipster",
    "tipFlag",
    "tipCount",
    "isRacingPostTip",
    "course",
    "selection"
})
public class RacingTip {

    protected String newspaper;
    protected String tipster;
    protected String tipFlag;
    protected BigInteger tipCount;
    protected Boolean isRacingPostTip;
    protected RaceCourse course;
    protected RaceRunner selection;

    /**
     * Gets the value of the newspaper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewspaper() {
        return newspaper;
    }

    /**
     * Sets the value of the newspaper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewspaper(String value) {
        this.newspaper = value;
    }

    /**
     * Gets the value of the tipster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipster() {
        return tipster;
    }

    /**
     * Sets the value of the tipster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipster(String value) {
        this.tipster = value;
    }

    /**
     * Gets the value of the tipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipFlag() {
        return tipFlag;
    }

    /**
     * Sets the value of the tipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipFlag(String value) {
        this.tipFlag = value;
    }

    /**
     * Gets the value of the tipCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipCount() {
        return tipCount;
    }

    /**
     * Sets the value of the tipCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipCount(BigInteger value) {
        this.tipCount = value;
    }

    /**
     * Gets the value of the isRacingPostTip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRacingPostTip() {
        return isRacingPostTip;
    }

    /**
     * Sets the value of the isRacingPostTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRacingPostTip(Boolean value) {
        this.isRacingPostTip = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link RaceCourse }
     *     
     */
    public RaceCourse getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceCourse }
     *     
     */
    public void setCourse(RaceCourse value) {
        this.course = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link RaceRunner }
     *     
     */
    public RaceRunner getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceRunner }
     *     
     */
    public void setSelection(RaceRunner value) {
        this.selection = value;
    }

}
