//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * BAGGAGE QUERY Metadata definition.
 * 
 * <p>Java class for BaggageQueryMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageQueryMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="TicketIssuePlace" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType" minOccurs="0"/>
 *         &lt;element name="TicketIssueCountry" type="{http://www.iata.org/IATA/EDIST}CountrySimpleType" minOccurs="0"/>
 *         &lt;element name="TravelerCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageQueryMetadataType", propOrder = {
    "ticketIssuePlace",
    "ticketIssueCountry",
    "travelerCount",
    "totalPrice"
})
public class BaggageQueryMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "TicketIssuePlace")
    protected String ticketIssuePlace;
    @XmlElement(name = "TicketIssueCountry")
    protected String ticketIssueCountry;
    @XmlElement(name = "TravelerCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger travelerCount;
    @XmlElement(name = "TotalPrice")
    protected CurrencyAmountOptType totalPrice;

    /**
     * Gets the value of the ticketIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuePlace() {
        return ticketIssuePlace;
    }

    /**
     * Sets the value of the ticketIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuePlace(String value) {
        this.ticketIssuePlace = value;
    }

    /**
     * Gets the value of the ticketIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssueCountry() {
        return ticketIssueCountry;
    }

    /**
     * Sets the value of the ticketIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssueCountry(String value) {
        this.ticketIssueCountry = value;
    }

    /**
     * Gets the value of the travelerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelerCount() {
        return travelerCount;
    }

    /**
     * Sets the value of the travelerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelerCount(BigInteger value) {
        this.travelerCount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setTotalPrice(CurrencyAmountOptType value) {
        this.totalPrice = value;
    }

}
