//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.content.racingcontent._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.product.sportsbook._2.SportsbookParticipant;


/**
 * <p>Java class for Trainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookParticipant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isCurrentTrainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trainer", propOrder = {
    "isCurrentTrainer",
    "initials",
    "trainerName",
    "trainerKey"
})
public class Trainer
    extends SportsbookParticipant
{

    protected Boolean isCurrentTrainer;
    protected String initials;
    protected String trainerName;
    protected String trainerKey;

    /**
     * Gets the value of the isCurrentTrainer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrentTrainer() {
        return isCurrentTrainer;
    }

    /**
     * Sets the value of the isCurrentTrainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrentTrainer(Boolean value) {
        this.isCurrentTrainer = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the trainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainerName() {
        return trainerName;
    }

    /**
     * Sets the value of the trainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainerName(String value) {
        this.trainerName = value;
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

}