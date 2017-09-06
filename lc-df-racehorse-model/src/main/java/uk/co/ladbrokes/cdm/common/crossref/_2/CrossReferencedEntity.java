//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.crossref._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * <p>Java class for CrossReferencedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossReferencedEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crossRefEntityKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="crossRefDetail" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossReferencedEntity", propOrder = {
    "crossRefEntityKeys",
    "crossRefDetail"
})
public class CrossReferencedEntity
    extends ManagedEntity
{

    protected CrossRefEntityKeys crossRefEntityKeys;
    protected List<CrossRefDetail> crossRefDetail;

    /**
     * Gets the value of the crossRefEntityKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getCrossRefEntityKeys() {
        return crossRefEntityKeys;
    }

    /**
     * Sets the value of the crossRefEntityKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setCrossRefEntityKeys(CrossRefEntityKeys value) {
        this.crossRefEntityKeys = value;
    }

    /**
     * Gets the value of the crossRefDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossRefDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossRefDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossRefDetail }
     * 
     * 
     */
    public List<CrossRefDetail> getCrossRefDetail() {
        if (crossRefDetail == null) {
            crossRefDetail = new ArrayList<CrossRefDetail>();
        }
        return this.crossRefDetail;
    }

}