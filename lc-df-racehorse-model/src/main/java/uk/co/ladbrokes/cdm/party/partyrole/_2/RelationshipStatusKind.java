//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.partyrole._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationshipStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipStatusKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="Future"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationshipStatusKind")
@XmlEnum
public enum RelationshipStatusKind {


    /**
     * The PartyRoleRelationship is Active and should not be considered.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * The PartyRoleRelationship is Inactive and should not be considered.
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * The PartyRoleRelationship is Suspended and should not be considered in some processes.
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * The PartyRoleRelationship is a future relationship and should not be considered just yet.  The validFrom date will be a future date, at which point it becomes active
     * 
     */
    @XmlEnumValue("Future")
    FUTURE("Future");
    private final String value;

    RelationshipStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipStatusKind fromValue(String v) {
        for (RelationshipStatusKind c: RelationshipStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
