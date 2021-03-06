//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.partner.affiliate._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcquisitionMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcquisitionMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisitionMethodType" type="{http://cdm.ladbrokes.co.uk/partner/Affiliate/2.0}AcquisitionMethodKind" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionParam" type="{http://cdm.ladbrokes.co.uk/partner/Affiliate/2.0}AcquisitionMethodParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquisitionMethod", propOrder = {
    "acquisitionMethodType",
    "acquisitionParam"
})
@XmlSeeAlso({
    ExternalAffiliate.class,
    AffiliateAssetCookie.class,
    SEOCookie.class,
    PromoCode.class
})
public abstract class AcquisitionMethod {

    @XmlSchemaType(name = "string")
    protected AcquisitionMethodKind acquisitionMethodType;
    protected List<AcquisitionMethodParam> acquisitionParam;

    /**
     * Gets the value of the acquisitionMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link AcquisitionMethodKind }
     *     
     */
    public AcquisitionMethodKind getAcquisitionMethodType() {
        return acquisitionMethodType;
    }

    /**
     * Sets the value of the acquisitionMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquisitionMethodKind }
     *     
     */
    public void setAcquisitionMethodType(AcquisitionMethodKind value) {
        this.acquisitionMethodType = value;
    }

    /**
     * Gets the value of the acquisitionParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisitionParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquisitionParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquisitionMethodParam }
     * 
     * 
     */
    public List<AcquisitionMethodParam> getAcquisitionParam() {
        if (acquisitionParam == null) {
            acquisitionParam = new ArrayList<AcquisitionMethodParam>();
        }
        return this.acquisitionParam;
    }

}
