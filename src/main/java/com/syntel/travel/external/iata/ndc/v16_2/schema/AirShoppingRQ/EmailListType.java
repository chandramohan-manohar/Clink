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
 * <p>Java class for EmailListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailListType")
@XmlEnum
public enum EmailListType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    SMS("SMS"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EmailListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailListType fromValue(String v) {
        for (EmailListType c: EmailListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
