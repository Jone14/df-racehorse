//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.grade._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of Grades
 * 
 * <p>Java class for ArrayOfGrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGrade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrayOfGrade" type="{http://cdm.ladbrokes.co.uk/trading/Grade/2.0}Grade" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGrade", propOrder = {
    "arrayOfGrade"
})
public class ArrayOfGrade {

    @XmlElement(name = "ArrayOfGrade")
    protected Grade arrayOfGrade;

    /**
     * Gets the value of the arrayOfGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Grade }
     *     
     */
    public Grade getArrayOfGrade() {
        return arrayOfGrade;
    }

    /**
     * Sets the value of the arrayOfGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Grade }
     *     
     */
    public void setArrayOfGrade(Grade value) {
        this.arrayOfGrade = value;
    }

}
