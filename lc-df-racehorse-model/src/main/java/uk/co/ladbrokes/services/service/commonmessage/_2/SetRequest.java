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
 * Set &ndash; The set operation like the get deals with multiple resources at a time and encapsulates the capability of both an update and create. It accepts a representation of the resources as input, generally the representation of each must be the same within the set to  gain some ease of use. If the individual resource does not exist then it is created, if however, the resource exists then it must be modified with the new version1
 * 
 * Pattern: Request-Reply
 * Input Message: Set<Nouns>Request
 * Output Message: Set<Nouns>Response
 * -------------------------
 *  1 This places certain requirements on the definition of the resource in that it must have an &lsquo;KEY&rsquo;, this must be a business identifier rather than an artificial surrogate key as exposing surrogates other than at the document level is not considered best practice.
 * 
 * <p>Java class for SetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetRequest"&gt;
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
@XmlType(name = "SetRequest")
public abstract class SetRequest
    extends ServiceRequest
{


}
