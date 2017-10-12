//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalRoles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PrimaryContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PaymentContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "additionalRoles"
})
@XmlRootElement(name = "Passenger")
public class Passenger
    extends PassengerDetailType
{

    @XmlElement(name = "AdditionalRoles")
    protected Passenger.AdditionalRoles additionalRoles;

    /**
     * Gets the value of the additionalRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger.AdditionalRoles }
     *     
     */
    public Passenger.AdditionalRoles getAdditionalRoles() {
        return additionalRoles;
    }

    /**
     * Sets the value of the additionalRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger.AdditionalRoles }
     *     
     */
    public void setAdditionalRoles(Passenger.AdditionalRoles value) {
        this.additionalRoles = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="PrimaryContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PaymentContactInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalRoles {

        @XmlAttribute(name = "PrimaryContactInd")
        protected Boolean primaryContactInd;
        @XmlAttribute(name = "PaymentContactInd")
        protected Boolean paymentContactInd;

        /**
         * Gets the value of the primaryContactInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryContactInd() {
            return primaryContactInd;
        }

        /**
         * Sets the value of the primaryContactInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryContactInd(Boolean value) {
            this.primaryContactInd = value;
        }

        /**
         * Gets the value of the paymentContactInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaymentContactInd() {
            return paymentContactInd;
        }

        /**
         * Sets the value of the paymentContactInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaymentContactInd(Boolean value) {
            this.paymentContactInd = value;
        }

    }

}