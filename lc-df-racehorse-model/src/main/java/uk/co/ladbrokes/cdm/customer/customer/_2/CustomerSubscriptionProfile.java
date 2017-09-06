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
 * This class represents a Customer's subscription profile.
 * 
 * TBD - Overlap with 'Customer Product Profile?
 * 
 * As this inherits from ManagedEntity, any change/audit details can be represented if available/applicable.
 * 
 * <p>Java class for CustomerSubscriptionProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSubscriptionProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerSubscription" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerSubscription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSubscriptionProfile", propOrder = {
    "customerSubscription"
})
public class CustomerSubscriptionProfile
    extends ManagedEntity
{

    protected List<CustomerSubscription> customerSubscription;

    /**
     * Gets the value of the customerSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSubscription }
     * 
     * 
     */
    public List<CustomerSubscription> getCustomerSubscription() {
        if (customerSubscription == null) {
            customerSubscription = new ArrayList<CustomerSubscription>();
        }
        return this.customerSubscription;
    }

}
