//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Instructions: Special Booking Method definition.
 * 
 * Special Need Order booking method.
 * Examples:
 * AE (by SSR-Special Service Request)
 * AF (by OSI-Other Service Information)
 * 
 * Encoding scheme: PADIS Codeset for data element 9750 - Option
 * 
 * <p>Java class for InstrSpecialBookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrSpecialBookingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrSpecialBookingType")
@XmlSeeAlso({
    SpecialBookingInstrType.class
})
public class InstrSpecialBookingType
    extends CodesetType
{


}