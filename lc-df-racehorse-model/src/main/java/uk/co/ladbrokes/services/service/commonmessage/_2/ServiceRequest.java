//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.services.service.commonmessage._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This abstract class represents a generic parent from which all enterprise service requests inherit from. This enables each request to have a consistent amount and format of data and enables rapid creation of new requests and insulates children in the model from changes at this level.  A new request simply inherits from this class.  Further specialisations can be created as has been done with trading.
 * 
 * A Service Request MUST have a ServiceHeader element, with the appropriate details filled in.
 * 
 * <p>Java class for ServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://services.ladbrokes.co.uk/service/CommonMessage/2.0}ServiceHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest", propOrder = {
    "header"
})
@XmlSeeAlso({
    FindRequest.class,
    Notify.class,
    PublishRequest.class,
    SubscribeRequest.class,
    SyncRequest.class,
    SetRequest.class,
    ApplyRequest.class,
    ExtractRequest.class,
    LoadRequest.class,
    UpdateRequest.class,
    RequestRequest.class,
    TriggerRequest.class,
    CreateRequest.class,
    DeleteRequest.class,
    ProcessRequest.class,
    SearchRequest.class,
    ActionRequest.class,
    GetRequest.class
})
public abstract class ServiceRequest {

    protected ServiceHeader header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setHeader(ServiceHeader value) {
        this.header = value;
    }

}
