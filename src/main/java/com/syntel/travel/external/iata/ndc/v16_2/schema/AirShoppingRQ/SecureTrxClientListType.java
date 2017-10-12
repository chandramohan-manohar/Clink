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
 * <p>Java class for SecureTrxClientListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureTrxClientListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InteractiveVoiceResponse"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="MailOrTelephoneOrder"/>
 *     &lt;enumeration value="Recurring"/>
 *     &lt;enumeration value="Unattended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecureTrxClientListType")
@XmlEnum
public enum SecureTrxClientListType {


    /**
     * IVR
     * 
     */
    @XmlEnumValue("InteractiveVoiceResponse")
    INTERACTIVE_VOICE_RESPONSE("InteractiveVoiceResponse"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),

    /**
     * MOTO
     * 
     */
    @XmlEnumValue("MailOrTelephoneOrder")
    MAIL_OR_TELEPHONE_ORDER("MailOrTelephoneOrder"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("Unattended")
    UNATTENDED("Unattended");
    private final String value;

    SecureTrxClientListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureTrxClientListType fromValue(String v) {
        for (SecureTrxClientListType c: SecureTrxClientListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}