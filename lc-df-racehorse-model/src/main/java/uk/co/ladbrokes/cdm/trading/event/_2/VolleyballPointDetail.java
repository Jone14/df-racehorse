//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Maintains details of scoring for each set for volleyball. details which are maintained are server, point won on the serve, time of the server
 * 
 * <p>Java class for VolleyballPointDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolleyballPointDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serveNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="server" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="pointWon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pointStatus" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}PointStateKind" minOccurs="0"/&gt;
 *         &lt;element name="serviceBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="serviceDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolleyballPointDetail", propOrder = {
    "serveNo",
    "server",
    "pointWon",
    "pointStatus",
    "serviceBreak",
    "serviceDatetime"
})
public class VolleyballPointDetail {

    protected BigInteger serveNo;
    protected BigInteger server;
    protected Boolean pointWon;
    @XmlSchemaType(name = "string")
    protected PointStateKind pointStatus;
    protected Boolean serviceBreak;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDatetime;

    /**
     * Gets the value of the serveNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServeNo() {
        return serveNo;
    }

    /**
     * Sets the value of the serveNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServeNo(BigInteger value) {
        this.serveNo = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServer(BigInteger value) {
        this.server = value;
    }

    /**
     * Gets the value of the pointWon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointWon() {
        return pointWon;
    }

    /**
     * Sets the value of the pointWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointWon(Boolean value) {
        this.pointWon = value;
    }

    /**
     * Gets the value of the pointStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PointStateKind }
     *     
     */
    public PointStateKind getPointStatus() {
        return pointStatus;
    }

    /**
     * Sets the value of the pointStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointStateKind }
     *     
     */
    public void setPointStatus(PointStateKind value) {
        this.pointStatus = value;
    }

    /**
     * Gets the value of the serviceBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceBreak() {
        return serviceBreak;
    }

    /**
     * Sets the value of the serviceBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceBreak(Boolean value) {
        this.serviceBreak = value;
    }

    /**
     * Gets the value of the serviceDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDatetime() {
        return serviceDatetime;
    }

    /**
     * Sets the value of the serviceDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDatetime(XMLGregorianCalendar value) {
        this.serviceDatetime = value;
    }

}
