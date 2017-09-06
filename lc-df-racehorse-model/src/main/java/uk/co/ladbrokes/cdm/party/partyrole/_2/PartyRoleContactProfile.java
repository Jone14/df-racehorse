//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.partyrole._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * This class represents a PartyRole's ContactProfile - a container for details of contact methods and contact reasons for Ladbrokes and Partners
 * 
 * <p>Java class for PartyRoleContactProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleContactProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isContactable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isPartnerContactable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contactMethod" type="{http://cdm.ladbrokes.co.uk/party/PartyRole/2.0}ContactMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleContactProfile", propOrder = {
    "isContactable",
    "isPartnerContactable",
    "contactMethod"
})
public class PartyRoleContactProfile
    extends ManagedEntity
{

    protected Boolean isContactable;
    protected Boolean isPartnerContactable;
    protected List<ContactMethod> contactMethod;

    /**
     * Gets the value of the isContactable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsContactable() {
        return isContactable;
    }

    /**
     * Sets the value of the isContactable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsContactable(Boolean value) {
        this.isContactable = value;
    }

    /**
     * Gets the value of the isPartnerContactable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartnerContactable() {
        return isPartnerContactable;
    }

    /**
     * Sets the value of the isPartnerContactable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartnerContactable(Boolean value) {
        this.isPartnerContactable = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMethod }
     * 
     * 
     */
    public List<ContactMethod> getContactMethod() {
        if (contactMethod == null) {
            contactMethod = new ArrayList<ContactMethod>();
        }
        return this.contactMethod;
    }

}
