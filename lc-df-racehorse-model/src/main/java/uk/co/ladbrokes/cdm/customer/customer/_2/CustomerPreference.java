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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.basetype._2.CurrencyCodeKind;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * This class represents a general container for generic customer preferences.
 * 
 * As this inherits from ManagedEntity, any change/audit details can be represented if available/applicable.
 * 
 * <p>Java class for CustomerPreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPreference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredCurrency" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}CurrencyCodeKind" minOccurs="0"/&gt;
 *         &lt;element name="priceFormat" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerPriceFormatKind" minOccurs="0"/&gt;
 *         &lt;element name="customerPrefCharacteristic" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerPreferenceCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerAlias" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerAlias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPreference", propOrder = {
    "customerKey",
    "language",
    "nickname",
    "preferredCurrency",
    "priceFormat",
    "customerPrefCharacteristic",
    "customerAlias"
})
public class CustomerPreference
    extends ManagedEntity
{

    protected CustomerKey customerKey;
    protected String language;
    protected String nickname;
    @XmlSchemaType(name = "string")
    protected CurrencyCodeKind preferredCurrency;
    @XmlSchemaType(name = "string")
    protected CustomerPriceFormatKind priceFormat;
    protected List<CustomerPreferenceCharacteristic> customerPrefCharacteristic;
    protected List<CustomerAlias> customerAlias;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the preferredCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeKind }
     *     
     */
    public CurrencyCodeKind getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * Sets the value of the preferredCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeKind }
     *     
     */
    public void setPreferredCurrency(CurrencyCodeKind value) {
        this.preferredCurrency = value;
    }

    /**
     * Gets the value of the priceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPriceFormatKind }
     *     
     */
    public CustomerPriceFormatKind getPriceFormat() {
        return priceFormat;
    }

    /**
     * Sets the value of the priceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPriceFormatKind }
     *     
     */
    public void setPriceFormat(CustomerPriceFormatKind value) {
        this.priceFormat = value;
    }

    /**
     * Gets the value of the customerPrefCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPrefCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPrefCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPreferenceCharacteristic }
     * 
     * 
     */
    public List<CustomerPreferenceCharacteristic> getCustomerPrefCharacteristic() {
        if (customerPrefCharacteristic == null) {
            customerPrefCharacteristic = new ArrayList<CustomerPreferenceCharacteristic>();
        }
        return this.customerPrefCharacteristic;
    }

    /**
     * Gets the value of the customerAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAlias }
     * 
     * 
     */
    public List<CustomerAlias> getCustomerAlias() {
        if (customerAlias == null) {
            customerAlias = new ArrayList<CustomerAlias>();
        }
        return this.customerAlias;
    }

}
