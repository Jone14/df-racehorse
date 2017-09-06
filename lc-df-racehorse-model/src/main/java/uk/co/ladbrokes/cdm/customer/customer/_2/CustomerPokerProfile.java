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
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.product.catalogue._2.CategoryTypeKind;


/**
 * This class represents a customers 'Poker' profile.
 * 
 * <p>Java class for CustomerPokerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPokerProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productCategory" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}CategoryTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="pokerProfileCharacteristic" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}ProductProfileCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPokerProfile", propOrder = {
    "productCategory",
    "pokerProfileCharacteristic"
})
public class CustomerPokerProfile
    extends ManagedEntity
{

    @XmlSchemaType(name = "string")
    protected CategoryTypeKind productCategory;
    protected List<ProductProfileCharacteristic> pokerProfileCharacteristic;

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTypeKind }
     *     
     */
    public CategoryTypeKind getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTypeKind }
     *     
     */
    public void setProductCategory(CategoryTypeKind value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the pokerProfileCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pokerProfileCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPokerProfileCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductProfileCharacteristic }
     * 
     * 
     */
    public List<ProductProfileCharacteristic> getPokerProfileCharacteristic() {
        if (pokerProfileCharacteristic == null) {
            pokerProfileCharacteristic = new ArrayList<ProductProfileCharacteristic>();
        }
        return this.pokerProfileCharacteristic;
    }

}
