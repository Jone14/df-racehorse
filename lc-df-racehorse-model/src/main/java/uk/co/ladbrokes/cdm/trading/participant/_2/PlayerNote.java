//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.participant._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlayerNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayerNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noteId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="noteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayerNote", propOrder = {
    "noteId",
    "noteName",
    "noteType",
    "noteDescription"
})
public class PlayerNote {

    protected BigInteger noteId;
    protected String noteName;
    protected String noteType;
    protected String noteDescription;

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoteId(BigInteger value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the noteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteName() {
        return noteName;
    }

    /**
     * Sets the value of the noteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteName(String value) {
        this.noteName = value;
    }

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

    /**
     * Gets the value of the noteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteDescription() {
        return noteDescription;
    }

    /**
     * Sets the value of the noteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteDescription(String value) {
        this.noteDescription = value;
    }

}
