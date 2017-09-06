//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 03:31:24 PM IST 
//


package https.nosql_ladbrokes_com.v1.content.couchbaseracingcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="course" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="todaysRides" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runs14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wins14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="places14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daysSinceWinFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runsSinceWinFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daysSinceWinJump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runsSinceWinJump" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{https://nosql.ladbrokes.com/v1/content/CouchbaseRacingContent.xsd}reportType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trainer", propOrder = {
    "name",
    "trainerKey",
    "course",
    "todaysRides",
    "runs14",
    "wins14",
    "places14",
    "daysSinceWinFlat",
    "runsSinceWinFlat",
    "daysSinceWinJump",
    "runsSinceWinJump",
    "report"
})
public class Trainer {

    protected String name;
    protected String trainerKey;
    protected String course;
    protected String todaysRides;
    protected String runs14;
    protected String wins14;
    protected String places14;
    protected String daysSinceWinFlat;
    protected String runsSinceWinFlat;
    protected String daysSinceWinJump;
    protected String runsSinceWinJump;
    protected ReportType report;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the trainerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerKey() {
        return trainerKey;
    }

    /**
     * Sets the value of the trainerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerKey(String value) {
        this.trainerKey = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourse(String value) {
        this.course = value;
    }

    /**
     * Gets the value of the todaysRides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTodaysRides() {
        return todaysRides;
    }

    /**
     * Sets the value of the todaysRides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTodaysRides(String value) {
        this.todaysRides = value;
    }

    /**
     * Gets the value of the runs14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuns14() {
        return runs14;
    }

    /**
     * Sets the value of the runs14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuns14(String value) {
        this.runs14 = value;
    }

    /**
     * Gets the value of the wins14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWins14() {
        return wins14;
    }

    /**
     * Sets the value of the wins14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWins14(String value) {
        this.wins14 = value;
    }

    /**
     * Gets the value of the places14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaces14() {
        return places14;
    }

    /**
     * Sets the value of the places14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaces14(String value) {
        this.places14 = value;
    }

    /**
     * Gets the value of the daysSinceWinFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysSinceWinFlat() {
        return daysSinceWinFlat;
    }

    /**
     * Sets the value of the daysSinceWinFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysSinceWinFlat(String value) {
        this.daysSinceWinFlat = value;
    }

    /**
     * Gets the value of the runsSinceWinFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunsSinceWinFlat() {
        return runsSinceWinFlat;
    }

    /**
     * Sets the value of the runsSinceWinFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunsSinceWinFlat(String value) {
        this.runsSinceWinFlat = value;
    }

    /**
     * Gets the value of the daysSinceWinJump property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysSinceWinJump() {
        return daysSinceWinJump;
    }

    /**
     * Sets the value of the daysSinceWinJump property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysSinceWinJump(String value) {
        this.daysSinceWinJump = value;
    }

    /**
     * Gets the value of the runsSinceWinJump property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunsSinceWinJump() {
        return runsSinceWinJump;
    }

    /**
     * Sets the value of the runsSinceWinJump property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunsSinceWinJump(String value) {
        this.runsSinceWinJump = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReport(ReportType value) {
        this.report = value;
    }

}
