//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.country._2.CountryCodeKind;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * <p>Java class for SportsbookPlayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SportsbookPlayer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}PlayerGenderKind" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://cdm.ladbrokes.co.uk/common/Country/2.0}CountryCodeKind" minOccurs="0"/&gt;
 *         &lt;element name="playerStatus" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}PlayerStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="playerRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="teamExternalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportsbookPlayer", propOrder = {
    "playerKey",
    "teamKey",
    "firstName",
    "lastName",
    "displayName",
    "sex",
    "dateOfBirth",
    "countryCode",
    "playerStatus",
    "playerRating",
    "externalKeys",
    "teamExternalKeys"
})
public class SportsbookPlayer {

    protected String playerKey;
    protected String teamKey;
    protected String firstName;
    protected String lastName;
    protected String displayName;
    @XmlSchemaType(name = "string")
    protected PlayerGenderKind sex;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "string")
    protected CountryCodeKind countryCode;
    @XmlSchemaType(name = "string")
    protected PlayerStatusKind playerStatus;
    protected String playerRating;
    protected CrossRefEntityKeys externalKeys;
    protected CrossRefEntityKeys teamExternalKeys;

    /**
     * Gets the value of the playerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerKey() {
        return playerKey;
    }

    /**
     * Sets the value of the playerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerKey(String value) {
        this.playerKey = value;
    }

    /**
     * Gets the value of the teamKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamKey() {
        return teamKey;
    }

    /**
     * Sets the value of the teamKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamKey(String value) {
        this.teamKey = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerGenderKind }
     *     
     */
    public PlayerGenderKind getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerGenderKind }
     *     
     */
    public void setSex(PlayerGenderKind value) {
        this.sex = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeKind }
     *     
     */
    public CountryCodeKind getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeKind }
     *     
     */
    public void setCountryCode(CountryCodeKind value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the playerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PlayerStatusKind }
     *     
     */
    public PlayerStatusKind getPlayerStatus() {
        return playerStatus;
    }

    /**
     * Sets the value of the playerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayerStatusKind }
     *     
     */
    public void setPlayerStatus(PlayerStatusKind value) {
        this.playerStatus = value;
    }

    /**
     * Gets the value of the playerRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerRating() {
        return playerRating;
    }

    /**
     * Sets the value of the playerRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerRating(String value) {
        this.playerRating = value;
    }

    /**
     * Gets the value of the externalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getExternalKeys() {
        return externalKeys;
    }

    /**
     * Sets the value of the externalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setExternalKeys(CrossRefEntityKeys value) {
        this.externalKeys = value;
    }

    /**
     * Gets the value of the teamExternalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getTeamExternalKeys() {
        return teamExternalKeys;
    }

    /**
     * Sets the value of the teamExternalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setTeamExternalKeys(CrossRefEntityKeys value) {
        this.teamExternalKeys = value;
    }

}