//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * This class represents a container for various customer credentials used to authenticate and authorise the customer.  e.g. userName, password, challenge response, token.
 * 
 * As this inherits from ManagedEntity, any change/audit details can be represented if available/applicable.
 * 
 * <p>Java class for CustomerCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCredentials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="securityDetail" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}SecurityDetail" minOccurs="0"/&gt;
 *         &lt;element name="challengeResponse" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}ChallengeResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCredentials", propOrder = {
    "currentIPAddress",
    "customerKey",
    "securityDetail",
    "challengeResponse",
    "mobileNumber"
})
public class CustomerCredentials
    extends ManagedEntity
{

    protected String currentIPAddress;
    protected CustomerKey customerKey;
    protected SecurityDetail securityDetail;
    protected List<ChallengeResponse> challengeResponse;
    protected String mobileNumber;

    /**
     * Gets the value of the currentIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPAddress() {
        return currentIPAddress;
    }

    /**
     * Sets the value of the currentIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPAddress(String value) {
        this.currentIPAddress = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKey }
     *     
     */
    public CustomerKey getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKey }
     *     
     */
    public void setCustomerKey(CustomerKey value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the securityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDetail }
     *     
     */
    public SecurityDetail getSecurityDetail() {
        return securityDetail;
    }

    /**
     * Sets the value of the securityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDetail }
     *     
     */
    public void setSecurityDetail(SecurityDetail value) {
        this.securityDetail = value;
    }

    /**
     * Gets the value of the challengeResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the challengeResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChallengeResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChallengeResponse }
     * 
     * 
     */
    public List<ChallengeResponse> getChallengeResponse() {
        if (challengeResponse == null) {
            challengeResponse = new ArrayList<ChallengeResponse>();
        }
        return this.challengeResponse;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

}
