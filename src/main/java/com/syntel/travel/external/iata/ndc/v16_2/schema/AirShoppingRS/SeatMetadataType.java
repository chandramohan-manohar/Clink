//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:06:03 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT Metadata definition.
 * 
 * <p>Java class for SeatMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="SeatStatus" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMetadataType", propOrder = {
    "seatStatus"
})
public class SeatMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "SeatStatus")
    protected CodesetType seatStatus;

    /**
     * Gets the value of the seatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getSeatStatus() {
        return seatStatus;
    }

    /**
     * Sets the value of the seatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setSeatStatus(CodesetType value) {
        this.seatStatus = value;
    }

}
