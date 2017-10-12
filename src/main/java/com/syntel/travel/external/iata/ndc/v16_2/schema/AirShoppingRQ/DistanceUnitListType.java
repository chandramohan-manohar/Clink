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
 * <p>Java class for DistanceUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnitListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Kilometers"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnitListType")
@XmlEnum
public enum DistanceUnitListType {

    @XmlEnumValue("Feet")
    FEET("Feet"),

    /**
     * K = KILOMETERS
     * 
     */
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Meters")
    METERS("Meters"),

    /**
     * M = MILES
     * 
     */
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DistanceUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnitListType fromValue(String v) {
        for (DistanceUnitListType c: DistanceUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
