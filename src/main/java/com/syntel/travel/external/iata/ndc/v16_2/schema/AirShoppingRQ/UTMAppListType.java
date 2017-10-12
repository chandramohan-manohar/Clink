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
 * <p>Java class for UTM_AppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UTM_AppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Campaign"/>
 *     &lt;enumeration value="Source"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UTM_AppListType")
@XmlEnum
public enum UTMAppListType {


    /**
     * Campaign content group.
     * Ex: utm_campaign=20percentpromocode
     * 
     * 
     */
    @XmlEnumValue("Campaign")
    CAMPAIGN("Campaign"),

    /**
     * Referrer website idSource.
     * Example: utm_source=FareCompare
     * 
     * 
     */
    @XmlEnumValue("Source")
    SOURCE("Source"),

    /**
     * Link medium type.
     * Example: utm_medium=socialmedia
     * 
     * 
     */
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UTMAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UTMAppListType fromValue(String v) {
        for (UTMAppListType c: UTMAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
