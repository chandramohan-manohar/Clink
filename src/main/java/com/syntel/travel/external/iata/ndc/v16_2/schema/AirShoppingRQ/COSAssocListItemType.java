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
 * <p>Java class for COS_AssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="COS_AssocListItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equipment"/>
 *     &lt;enumeration value="FlightGroup"/>
 *     &lt;enumeration value="FlightOriginDestination"/>
 *     &lt;enumeration value="FlightSegment"/>
 *     &lt;enumeration value="MediaGroup"/>
 *     &lt;enumeration value="MediaItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COS_AssocListItemType")
@XmlEnum
public enum COSAssocListItemType {

    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("FlightGroup")
    FLIGHT_GROUP("FlightGroup"),
    @XmlEnumValue("FlightOriginDestination")
    FLIGHT_ORIGIN_DESTINATION("FlightOriginDestination"),
    @XmlEnumValue("FlightSegment")
    FLIGHT_SEGMENT("FlightSegment"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem");
    private final String value;

    COSAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COSAssocListItemType fromValue(String v) {
        for (COSAssocListItemType c: COSAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
