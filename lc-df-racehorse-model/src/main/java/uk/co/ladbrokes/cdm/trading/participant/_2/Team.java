//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.participant._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.country._2.Country;
import uk.co.ladbrokes.cdm.common.country._2.CountryCodeKind;


/**
 * Maintains team details, team could even be country in tournaments like world cup or in match between two countries or a bilateral series.
 * 
 * <p>Java class for Team complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Team"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamType" type="{http://cdm.ladbrokes.co.uk/trading/Participant/2.0}TeamTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="teamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://cdm.ladbrokes.co.uk/common/Country/2.0}CountryCodeKind" minOccurs="0"/&gt;
 *         &lt;element name="internationalTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="teamCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalLinkKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamPlayer" type="{http://cdm.ladbrokes.co.uk/trading/Participant/2.0}Player" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="representsCountry" type="{http://cdm.ladbrokes.co.uk/common/Country/2.0}Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Team", propOrder = {
    "teamId",
    "teamType",
    "teamName",
    "teamShortName",
    "countryCode",
    "internationalTeam",
    "teamCategory",
    "externalLinkKey",
    "status",
    "teamPlayer",
    "representsCountry"
})
public class Team {

    protected String teamId;
    @XmlSchemaType(name = "string")
    protected TeamTypeKind teamType;
    protected String teamName;
    protected String teamShortName;
    @XmlSchemaType(name = "string")
    protected CountryCodeKind countryCode;
    protected Boolean internationalTeam;
    protected String teamCategory;
    protected String externalLinkKey;
    protected String status;
    protected List<Player> teamPlayer;
    protected Country representsCountry;

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the teamType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamTypeKind }
     *     
     */
    public TeamTypeKind getTeamType() {
        return teamType;
    }

    /**
     * Sets the value of the teamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamTypeKind }
     *     
     */
    public void setTeamType(TeamTypeKind value) {
        this.teamType = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the teamShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamShortName() {
        return teamShortName;
    }

    /**
     * Sets the value of the teamShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamShortName(String value) {
        this.teamShortName = value;
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
     * Gets the value of the internationalTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalTeam() {
        return internationalTeam;
    }

    /**
     * Sets the value of the internationalTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalTeam(Boolean value) {
        this.internationalTeam = value;
    }

    /**
     * Gets the value of the teamCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamCategory() {
        return teamCategory;
    }

    /**
     * Sets the value of the teamCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamCategory(String value) {
        this.teamCategory = value;
    }

    /**
     * Gets the value of the externalLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLinkKey() {
        return externalLinkKey;
    }

    /**
     * Sets the value of the externalLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLinkKey(String value) {
        this.externalLinkKey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the teamPlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamPlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamPlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Player }
     * 
     * 
     */
    public List<Player> getTeamPlayer() {
        if (teamPlayer == null) {
            teamPlayer = new ArrayList<Player>();
        }
        return this.teamPlayer;
    }

    /**
     * Gets the value of the representsCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getRepresentsCountry() {
        return representsCountry;
    }

    /**
     * Sets the value of the representsCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setRepresentsCountry(Country value) {
        this.representsCountry = value;
    }

}
