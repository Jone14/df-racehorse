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
 * <p>Java class for Breeder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Breeder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookParticipant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="breederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="breederKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Breeder", propOrder = {
    "breederName",
    "breederKey"
})
public class Breeder
    extends SportsbookParticipant
{

    protected String breederName;
    protected String breederKey;

    /**
     * Gets the value of the breederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreederName() {
        return breederName;
    }

    /**
     * Sets the value of the breederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreederName(String value) {
        this.breederName = value;
    }

    /**
     * Gets the value of the breederKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreederKey() {
        return breederKey;
    }

    /**
     * Sets the value of the breederKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreederKey(String value) {
        this.breederKey = value;
    }

}