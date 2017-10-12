//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyCatListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyCatListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OnlineTravelAgency"/>
 *     &lt;enumeration value="TravelAgency"/>
 *     &lt;enumeration value="TravelManagementCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyCatListType")
@XmlEnum
public enum AgencyCatListType {

    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),

    /**
     * Travel agency.
     * 
     */
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    AgencyCatListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgencyCatListType fromValue(String v) {
        for (AgencyCatListType c: AgencyCatListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
