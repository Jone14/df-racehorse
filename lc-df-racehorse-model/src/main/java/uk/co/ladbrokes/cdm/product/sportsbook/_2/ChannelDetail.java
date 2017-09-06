//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.channel._2.Channel;


/**
 * TBD - This class represents channel details related top the entity.  This determines what catalogue the entity should appear in.
 * 
 * <p>Java class for ChannelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channel" type="{http://cdm.ladbrokes.co.uk/common/Channel/2.0}Channel" minOccurs="0"/&gt;
 *         &lt;element name="currentState" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}ChannelStateKind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelDetail", propOrder = {
    "channel",
    "currentState"
})
public class ChannelDetail {

    protected Channel channel;
    @XmlSchemaType(name = "string")
    protected ChannelStateKind currentState;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelStateKind }
     *     
     */
    public ChannelStateKind getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelStateKind }
     *     
     */
    public void setCurrentState(ChannelStateKind value) {
        this.currentState = value;
    }

}
