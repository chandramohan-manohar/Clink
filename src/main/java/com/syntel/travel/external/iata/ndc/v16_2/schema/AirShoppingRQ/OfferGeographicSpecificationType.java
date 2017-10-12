//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Geographic Specification information
 * 
 * <p>Java class for OfferGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="DirectionalIndicator" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="From LOC1 to LOC2"/>
 *                 &lt;enumeration value="To LOC1 from LOC2"/>
 *                 &lt;enumeration value="Both"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *           &lt;element name="OfferDestinationPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="TravelWithin" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGeographicSpecificationType", propOrder = {
    "directionalIndicator",
    "offerOriginPoint",
    "offerDestinationPoint",
    "travelWithin"
})
public class OfferGeographicSpecificationType {

    @XmlElement(name = "DirectionalIndicator")
    protected String directionalIndicator;
    @XmlElement(name = "OfferOriginPoint")
    protected GeographicSpecificationType offerOriginPoint;
    @XmlElement(name = "OfferDestinationPoint")
    protected GeographicSpecificationType offerDestinationPoint;
    @XmlElement(name = "TravelWithin")
    protected GeographicSpecificationType travelWithin;

    /**
     * Gets the value of the directionalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionalIndicator() {
        return directionalIndicator;
    }

    /**
     * Sets the value of the directionalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionalIndicator(String value) {
        this.directionalIndicator = value;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferOriginPoint() {
        return offerOriginPoint;
    }

    /**
     * Sets the value of the offerOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferOriginPoint(GeographicSpecificationType value) {
        this.offerOriginPoint = value;
    }

    /**
     * Gets the value of the offerDestinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferDestinationPoint() {
        return offerDestinationPoint;
    }

    /**
     * Sets the value of the offerDestinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferDestinationPoint(GeographicSpecificationType value) {
        this.offerDestinationPoint = value;
    }

    /**
     * Gets the value of the travelWithin property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getTravelWithin() {
        return travelWithin;
    }

    /**
     * Sets the value of the travelWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setTravelWithin(GeographicSpecificationType value) {
        this.travelWithin = value;
    }

}
