//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Dog;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Horse;
import uk.co.ladbrokes.cdm.content.racingcontent._1.Jockey;
import uk.co.ladbrokes.cdm.content.racingcontent._1.RunnerRating;
import uk.co.ladbrokes.cdm.content.racingcontent._1.RunnerStatistic;


/**
 * It extends SportsbookParticipant. It Represents Runner in the Horse racing meet and provides additional horse racing runner details. 
 * 
 * <p>Java class for RaceRunner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RaceRunner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookParticipant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="runnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lane" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="raceWinner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distanceBehindWinner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finalPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightLbs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="headgearShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="headgearDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daysSinceLastRun" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="beatenFavourite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saddleClothNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="penaltyWeightLbs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="horseAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="silkImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isReservedRunner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="trapNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isFavourite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overweightLbs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="headgearFirsttimeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="favouritePosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="racingPostSpeedFigure" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="commentInRun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shorthandForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topSpeed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="distanceToHorseInFront" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isPastCourseWinner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPastDistanceWinner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="silksUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonRunnerPulledOutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="racingPostPrediction" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="toWinSelectionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toWinNumPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="toWinDecPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="unadjustedMasterRating" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="adjusted_master_rating" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="forecastSP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="aWWinner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastRFNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pastPostPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formFigs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPastCourseAndDistanceWinner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dog" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}Dog" minOccurs="0"/&gt;
 *         &lt;element name="horse" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}Horse" minOccurs="0"/&gt;
 *         &lt;element name="jockey" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}Jockey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rating" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}RunnerRating" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runnerStat" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}RunnerStatistic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceRunner", propOrder = {
    "runnerKey",
    "runnerName",
    "drawNumber",
    "status",
    "lane",
    "raceWinner",
    "distanceBehindWinner",
    "finalPosition",
    "weightLbs",
    "headgearShortCode",
    "headgearDescription",
    "daysSinceLastRun",
    "beatenFavourite",
    "saddleClothNumber",
    "penaltyWeightLbs",
    "horseAge",
    "silkImageName",
    "isReservedRunner",
    "trapNumber",
    "isFavourite",
    "overweightLbs",
    "headgearFirsttimeIndicator",
    "favouritePosition",
    "racingPostSpeedFigure",
    "commentInRun",
    "shorthandForm",
    "topSpeed",
    "distanceToHorseInFront",
    "isPastCourseWinner",
    "isPastDistanceWinner",
    "silksUrl",
    "nonRunnerPulledOutTime",
    "racingPostPrediction",
    "toWinSelectionKey",
    "toWinNumPrice",
    "toWinDecPrice",
    "unadjustedMasterRating",
    "adjustedMasterRating",
    "forecastSP",
    "awWinner",
    "lastRFNumber",
    "pastPostPosition",
    "weight",
    "formFigs",
    "isPastCourseAndDistanceWinner",
    "dog",
    "horse",
    "jockey",
    "rating",
    "runnerStat"
})
public class RaceRunner
    extends SportsbookParticipant
{

    protected String runnerKey;
    protected String runnerName;
    protected BigInteger drawNumber;
    protected String status;
    protected String lane;
    protected String raceWinner;
    protected String distanceBehindWinner;
    protected String finalPosition;
    protected BigInteger weightLbs;
    protected String headgearShortCode;
    protected String headgearDescription;
    protected BigInteger daysSinceLastRun;
    protected String beatenFavourite;
    protected BigInteger saddleClothNumber;
    protected BigInteger penaltyWeightLbs;
    protected BigInteger horseAge;
    protected String silkImageName;
    protected Boolean isReservedRunner;
    protected BigInteger trapNumber;
    protected Boolean isFavourite;
    protected BigInteger overweightLbs;
    protected Boolean headgearFirsttimeIndicator;
    protected String favouritePosition;
    protected BigInteger racingPostSpeedFigure;
    protected String commentInRun;
    protected String shorthandForm;
    protected BigInteger topSpeed;
    protected BigInteger distanceToHorseInFront;
    protected Boolean isPastCourseWinner;
    protected Boolean isPastDistanceWinner;
    protected String silksUrl;
    protected String nonRunnerPulledOutTime;
    protected BigDecimal racingPostPrediction;
    protected String toWinSelectionKey;
    protected BigInteger toWinNumPrice;
    protected BigInteger toWinDecPrice;
    protected BigInteger unadjustedMasterRating;
    @XmlElement(name = "adjusted_master_rating")
    protected BigInteger adjustedMasterRating;
    protected BigDecimal forecastSP;
    @XmlElement(name = "aWWinner")
    protected String awWinner;
    protected String lastRFNumber;
    protected String pastPostPosition;
    protected String weight;
    protected String formFigs;
    protected Boolean isPastCourseAndDistanceWinner;
    protected Dog dog;
    protected Horse horse;
    protected List<Jockey> jockey;
    protected List<RunnerRating> rating;
    protected List<RunnerStatistic> runnerStat;

    /**
     * Gets the value of the runnerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunnerKey() {
        return runnerKey;
    }

    /**
     * Sets the value of the runnerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunnerKey(String value) {
        this.runnerKey = value;
    }

    /**
     * Gets the value of the runnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunnerName() {
        return runnerName;
    }

    /**
     * Sets the value of the runnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunnerName(String value) {
        this.runnerName = value;
    }

    /**
     * Gets the value of the drawNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrawNumber() {
        return drawNumber;
    }

    /**
     * Sets the value of the drawNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrawNumber(BigInteger value) {
        this.drawNumber = value;
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
     * Gets the value of the lane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLane() {
        return lane;
    }

    /**
     * Sets the value of the lane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLane(String value) {
        this.lane = value;
    }

    /**
     * Gets the value of the raceWinner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceWinner() {
        return raceWinner;
    }

    /**
     * Sets the value of the raceWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceWinner(String value) {
        this.raceWinner = value;
    }

    /**
     * Gets the value of the distanceBehindWinner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceBehindWinner() {
        return distanceBehindWinner;
    }

    /**
     * Sets the value of the distanceBehindWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceBehindWinner(String value) {
        this.distanceBehindWinner = value;
    }

    /**
     * Gets the value of the finalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalPosition() {
        return finalPosition;
    }

    /**
     * Sets the value of the finalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalPosition(String value) {
        this.finalPosition = value;
    }

    /**
     * Gets the value of the weightLbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeightLbs() {
        return weightLbs;
    }

    /**
     * Sets the value of the weightLbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeightLbs(BigInteger value) {
        this.weightLbs = value;
    }

    /**
     * Gets the value of the headgearShortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadgearShortCode() {
        return headgearShortCode;
    }

    /**
     * Sets the value of the headgearShortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadgearShortCode(String value) {
        this.headgearShortCode = value;
    }

    /**
     * Gets the value of the headgearDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadgearDescription() {
        return headgearDescription;
    }

    /**
     * Sets the value of the headgearDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadgearDescription(String value) {
        this.headgearDescription = value;
    }

    /**
     * Gets the value of the daysSinceLastRun property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysSinceLastRun() {
        return daysSinceLastRun;
    }

    /**
     * Sets the value of the daysSinceLastRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysSinceLastRun(BigInteger value) {
        this.daysSinceLastRun = value;
    }

    /**
     * Gets the value of the beatenFavourite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeatenFavourite() {
        return beatenFavourite;
    }

    /**
     * Sets the value of the beatenFavourite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeatenFavourite(String value) {
        this.beatenFavourite = value;
    }

    /**
     * Gets the value of the saddleClothNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSaddleClothNumber() {
        return saddleClothNumber;
    }

    /**
     * Sets the value of the saddleClothNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSaddleClothNumber(BigInteger value) {
        this.saddleClothNumber = value;
    }

    /**
     * Gets the value of the penaltyWeightLbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPenaltyWeightLbs() {
        return penaltyWeightLbs;
    }

    /**
     * Sets the value of the penaltyWeightLbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPenaltyWeightLbs(BigInteger value) {
        this.penaltyWeightLbs = value;
    }

    /**
     * Gets the value of the horseAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHorseAge() {
        return horseAge;
    }

    /**
     * Sets the value of the horseAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHorseAge(BigInteger value) {
        this.horseAge = value;
    }

    /**
     * Gets the value of the silkImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilkImageName() {
        return silkImageName;
    }

    /**
     * Sets the value of the silkImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilkImageName(String value) {
        this.silkImageName = value;
    }

    /**
     * Gets the value of the isReservedRunner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReservedRunner() {
        return isReservedRunner;
    }

    /**
     * Sets the value of the isReservedRunner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReservedRunner(Boolean value) {
        this.isReservedRunner = value;
    }

    /**
     * Gets the value of the trapNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrapNumber() {
        return trapNumber;
    }

    /**
     * Sets the value of the trapNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrapNumber(BigInteger value) {
        this.trapNumber = value;
    }

    /**
     * Gets the value of the isFavourite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFavourite() {
        return isFavourite;
    }

    /**
     * Sets the value of the isFavourite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFavourite(Boolean value) {
        this.isFavourite = value;
    }

    /**
     * Gets the value of the overweightLbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverweightLbs() {
        return overweightLbs;
    }

    /**
     * Sets the value of the overweightLbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverweightLbs(BigInteger value) {
        this.overweightLbs = value;
    }

    /**
     * Gets the value of the headgearFirsttimeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadgearFirsttimeIndicator() {
        return headgearFirsttimeIndicator;
    }

    /**
     * Sets the value of the headgearFirsttimeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadgearFirsttimeIndicator(Boolean value) {
        this.headgearFirsttimeIndicator = value;
    }

    /**
     * Gets the value of the favouritePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavouritePosition() {
        return favouritePosition;
    }

    /**
     * Sets the value of the favouritePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavouritePosition(String value) {
        this.favouritePosition = value;
    }

    /**
     * Gets the value of the racingPostSpeedFigure property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRacingPostSpeedFigure() {
        return racingPostSpeedFigure;
    }

    /**
     * Sets the value of the racingPostSpeedFigure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRacingPostSpeedFigure(BigInteger value) {
        this.racingPostSpeedFigure = value;
    }

    /**
     * Gets the value of the commentInRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentInRun() {
        return commentInRun;
    }

    /**
     * Sets the value of the commentInRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentInRun(String value) {
        this.commentInRun = value;
    }

    /**
     * Gets the value of the shorthandForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShorthandForm() {
        return shorthandForm;
    }

    /**
     * Sets the value of the shorthandForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShorthandForm(String value) {
        this.shorthandForm = value;
    }

    /**
     * Gets the value of the topSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the value of the topSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTopSpeed(BigInteger value) {
        this.topSpeed = value;
    }

    /**
     * Gets the value of the distanceToHorseInFront property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceToHorseInFront() {
        return distanceToHorseInFront;
    }

    /**
     * Sets the value of the distanceToHorseInFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceToHorseInFront(BigInteger value) {
        this.distanceToHorseInFront = value;
    }

    /**
     * Gets the value of the isPastCourseWinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPastCourseWinner() {
        return isPastCourseWinner;
    }

    /**
     * Sets the value of the isPastCourseWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPastCourseWinner(Boolean value) {
        this.isPastCourseWinner = value;
    }

    /**
     * Gets the value of the isPastDistanceWinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPastDistanceWinner() {
        return isPastDistanceWinner;
    }

    /**
     * Sets the value of the isPastDistanceWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPastDistanceWinner(Boolean value) {
        this.isPastDistanceWinner = value;
    }

    /**
     * Gets the value of the silksUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilksUrl() {
        return silksUrl;
    }

    /**
     * Sets the value of the silksUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilksUrl(String value) {
        this.silksUrl = value;
    }

    /**
     * Gets the value of the nonRunnerPulledOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRunnerPulledOutTime() {
        return nonRunnerPulledOutTime;
    }

    /**
     * Sets the value of the nonRunnerPulledOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRunnerPulledOutTime(String value) {
        this.nonRunnerPulledOutTime = value;
    }

    /**
     * Gets the value of the racingPostPrediction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRacingPostPrediction() {
        return racingPostPrediction;
    }

    /**
     * Sets the value of the racingPostPrediction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRacingPostPrediction(BigDecimal value) {
        this.racingPostPrediction = value;
    }

    /**
     * Gets the value of the toWinSelectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToWinSelectionKey() {
        return toWinSelectionKey;
    }

    /**
     * Sets the value of the toWinSelectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToWinSelectionKey(String value) {
        this.toWinSelectionKey = value;
    }

    /**
     * Gets the value of the toWinNumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToWinNumPrice() {
        return toWinNumPrice;
    }

    /**
     * Sets the value of the toWinNumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToWinNumPrice(BigInteger value) {
        this.toWinNumPrice = value;
    }

    /**
     * Gets the value of the toWinDecPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToWinDecPrice() {
        return toWinDecPrice;
    }

    /**
     * Sets the value of the toWinDecPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToWinDecPrice(BigInteger value) {
        this.toWinDecPrice = value;
    }

    /**
     * Gets the value of the unadjustedMasterRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnadjustedMasterRating() {
        return unadjustedMasterRating;
    }

    /**
     * Sets the value of the unadjustedMasterRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnadjustedMasterRating(BigInteger value) {
        this.unadjustedMasterRating = value;
    }

    /**
     * Gets the value of the adjustedMasterRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdjustedMasterRating() {
        return adjustedMasterRating;
    }

    /**
     * Sets the value of the adjustedMasterRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdjustedMasterRating(BigInteger value) {
        this.adjustedMasterRating = value;
    }

    /**
     * Gets the value of the forecastSP property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForecastSP() {
        return forecastSP;
    }

    /**
     * Sets the value of the forecastSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForecastSP(BigDecimal value) {
        this.forecastSP = value;
    }

    /**
     * Gets the value of the awWinner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWWinner() {
        return awWinner;
    }

    /**
     * Sets the value of the awWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWWinner(String value) {
        this.awWinner = value;
    }

    /**
     * Gets the value of the lastRFNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRFNumber() {
        return lastRFNumber;
    }

    /**
     * Sets the value of the lastRFNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRFNumber(String value) {
        this.lastRFNumber = value;
    }

    /**
     * Gets the value of the pastPostPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPastPostPosition() {
        return pastPostPosition;
    }

    /**
     * Sets the value of the pastPostPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPastPostPosition(String value) {
        this.pastPostPosition = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the formFigs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormFigs() {
        return formFigs;
    }

    /**
     * Sets the value of the formFigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormFigs(String value) {
        this.formFigs = value;
    }

    /**
     * Gets the value of the isPastCourseAndDistanceWinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPastCourseAndDistanceWinner() {
        return isPastCourseAndDistanceWinner;
    }

    /**
     * Sets the value of the isPastCourseAndDistanceWinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPastCourseAndDistanceWinner(Boolean value) {
        this.isPastCourseAndDistanceWinner = value;
    }

    /**
     * Gets the value of the dog property.
     * 
     * @return
     *     possible object is
     *     {@link Dog }
     *     
     */
    public Dog getDog() {
        return dog;
    }

    /**
     * Sets the value of the dog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dog }
     *     
     */
    public void setDog(Dog value) {
        this.dog = value;
    }

    /**
     * Gets the value of the horse property.
     * 
     * @return
     *     possible object is
     *     {@link Horse }
     *     
     */
    public Horse getHorse() {
        return horse;
    }

    /**
     * Sets the value of the horse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Horse }
     *     
     */
    public void setHorse(Horse value) {
        this.horse = value;
    }

    /**
     * Gets the value of the jockey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jockey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJockey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jockey }
     * 
     * 
     */
    public List<Jockey> getJockey() {
        if (jockey == null) {
            jockey = new ArrayList<Jockey>();
        }
        return this.jockey;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunnerRating }
     * 
     * 
     */
    public List<RunnerRating> getRating() {
        if (rating == null) {
            rating = new ArrayList<RunnerRating>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the runnerStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runnerStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunnerStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunnerStatistic }
     * 
     * 
     */
    public List<RunnerStatistic> getRunnerStat() {
        if (runnerStat == null) {
            runnerStat = new ArrayList<RunnerStatistic>();
        }
        return this.runnerStat;
    }

}