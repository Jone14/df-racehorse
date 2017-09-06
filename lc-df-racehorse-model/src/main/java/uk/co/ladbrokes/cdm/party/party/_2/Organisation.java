//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.party._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Party which has a recognisable collective identity governed by an explicit or implicit form of constitution. 
 * 
 * Explicit forms of constitution include trust deeds, wills, statutes, Acts of Parliament, royal charter.  Implicit forms of constitution include customary practice and behavioural tradition in common law or by default under statute (e.g. some partnerships and some clubs).
 * 
 * <p>Java class for Organisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/party/Party/2.0}Party"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationTypeKind" type="{http://cdm.ladbrokes.co.uk/party/Party/2.0}OrganisationKind" minOccurs="0"/&gt;
 *         &lt;element name="organisationName" type="{http://cdm.ladbrokes.co.uk/party/Party/2.0}OrganisationName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {
    "organisationTypeKind",
    "organisationName"
})
public class Organisation
    extends Party
{

    @XmlSchemaType(name = "string")
    protected OrganisationKind organisationTypeKind;
    protected OrganisationName organisationName;

    /**
     * Gets the value of the organisationTypeKind property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationKind }
     *     
     */
    public OrganisationKind getOrganisationTypeKind() {
        return organisationTypeKind;
    }

    /**
     * Sets the value of the organisationTypeKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationKind }
     *     
     */
    public void setOrganisationTypeKind(OrganisationKind value) {
        this.organisationTypeKind = value;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setOrganisationName(OrganisationName value) {
        this.organisationName = value;
    }

}