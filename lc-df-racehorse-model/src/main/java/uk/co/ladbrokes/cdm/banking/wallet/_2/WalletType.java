//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.wallet._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.product.catalogue._2.ProductCategory;


/**
 * This class represents a Wallet Type.  
 * e.g. SportsWallet, PokerWallet, CasinoWallet, SystemWallet
 * 
 * <p>Java class for WalletType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="walletTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletTypeStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="isHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="walletHosted" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletHostKind" minOccurs="0"/&gt;
 *         &lt;element name="productCategory" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}ProductCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletType", propOrder = {
    "walletTypeKey",
    "name",
    "code",
    "status",
    "isHidden",
    "walletHosted",
    "productCategory"
})
public class WalletType {

    protected String walletTypeKey;
    protected String name;
    @XmlSchemaType(name = "string")
    protected WalletTypeKind code;
    @XmlSchemaType(name = "string")
    protected WalletTypeStatusKind status;
    protected Boolean isHidden;
    @XmlSchemaType(name = "string")
    protected WalletHostKind walletHosted;
    protected List<ProductCategory> productCategory;

    /**
     * Gets the value of the walletTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletTypeKey() {
        return walletTypeKey;
    }

    /**
     * Sets the value of the walletTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletTypeKey(String value) {
        this.walletTypeKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link WalletTypeKind }
     *     
     */
    public WalletTypeKind getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletTypeKind }
     *     
     */
    public void setCode(WalletTypeKind value) {
        this.code = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WalletTypeStatusKind }
     *     
     */
    public WalletTypeStatusKind getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletTypeStatusKind }
     *     
     */
    public void setStatus(WalletTypeStatusKind value) {
        this.status = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the walletHosted property.
     * 
     * @return
     *     possible object is
     *     {@link WalletHostKind }
     *     
     */
    public WalletHostKind getWalletHosted() {
        return walletHosted;
    }

    /**
     * Sets the value of the walletHosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletHostKind }
     *     
     */
    public void setWalletHosted(WalletHostKind value) {
        this.walletHosted = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategory }
     * 
     * 
     */
    public List<ProductCategory> getProductCategory() {
        if (productCategory == null) {
            productCategory = new ArrayList<ProductCategory>();
        }
        return this.productCategory;
    }

}
