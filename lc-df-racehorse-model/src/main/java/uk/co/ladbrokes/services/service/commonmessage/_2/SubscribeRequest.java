//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.services.service.commonmessage._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Subscribe &ndash; The subscribe operation provides a means from which an interested party, i.e. one that needs to consume master data records, can register that interest. The distribution of data will occur at some later time based on either an internally generated trigger, as would be the case for real-time delta synchronisation or as a result of an external trigger. This endpoint must have the following configuration:
 * 
 * Pattern: Request-Reply
 * Input Message: Subscribe<Noun>Request
 * Output Message: Subscribe<Noun>Response
 * 
 * <p>Java class for SubscribeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.ladbrokes.co.uk/service/CommonMessage/2.0}ServiceRequest"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeRequest")
public abstract class SubscribeRequest
    extends ServiceRequest
{


}
