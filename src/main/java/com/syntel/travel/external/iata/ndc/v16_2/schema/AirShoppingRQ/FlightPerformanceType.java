//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FLIGHT ON-TIME PERFORMANCE definition.
 * 
 * <p>Java class for FlightPerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Low" type="{http://www.iata.org/IATA/EDIST}WholePercentageSimpleType" minOccurs="0"/>
 *         &lt;element name="High" type="{http://www.iata.org/IATA/EDIST}WholePercentageSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NewFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NotRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPerformanceType", propOrder = {
    "low",
    "high"
})
public class FlightPerformanceType {

    @XmlElement(name = "Low")
    protected BigDecimal low;
    @XmlElement(name = "High")
    protected BigDecimal high;
    @XmlAttribute(name = "NewFlightInd")
    protected Boolean newFlightInd;
    @XmlAttribute(name = "NoDataInd")
    protected Boolean noDataInd;
    @XmlAttribute(name = "NotRequiredInd")
    protected Boolean notRequiredInd;

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLow(BigDecimal value) {
        this.low = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHigh(BigDecimal value) {
        this.high = value;
    }

    /**
     * Gets the value of the newFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewFlightInd() {
        return newFlightInd;
    }

    /**
     * Sets the value of the newFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewFlightInd(Boolean value) {
        this.newFlightInd = value;
    }

    /**
     * Gets the value of the noDataInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoDataInd() {
        return noDataInd;
    }

    /**
     * Sets the value of the noDataInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoDataInd(Boolean value) {
        this.noDataInd = value;
    }

    /**
     * Gets the value of the notRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotRequiredInd() {
        return notRequiredInd;
    }

    /**
     * Sets the value of the notRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotRequiredInd(Boolean value) {
        this.notRequiredInd = value;
    }

}
