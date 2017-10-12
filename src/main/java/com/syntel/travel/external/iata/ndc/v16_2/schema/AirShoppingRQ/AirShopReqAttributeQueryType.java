//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:05:54 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for AirShopReq Business Object: ATTRIBUTE QUERY definition.
 * 
 * <p>Java class for AirShopReqAttributeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirShopReqAttributeQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestination" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MarketingCarrierAirline" minOccurs="0"/>
 *                   &lt;element name="CalendarDates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OriginDestinationKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirShopReqAttributeQueryType", propOrder = {
    "originDestination"
})
public class AirShopReqAttributeQueryType {

    @XmlElement(name = "OriginDestination", required = true)
    protected List<AirShopReqAttributeQueryType.OriginDestination> originDestination;

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirShopReqAttributeQueryType.OriginDestination }
     * 
     * 
     */
    public List<AirShopReqAttributeQueryType.OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<AirShopReqAttributeQueryType.OriginDestination>();
        }
        return this.originDestination;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseID" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MarketingCarrierAirline" minOccurs="0"/>
     *         &lt;element name="CalendarDates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OriginDestinationKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departure",
        "arrival",
        "segMaxTimePreferences",
        "shoppingResponseID",
        "marketingCarrierAirline",
        "calendarDates"
    })
    public static class OriginDestination
        extends AssociatedObjectBaseType
    {

        @XmlElement(name = "Departure", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "SegMaxTimePreferences")
        protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
        @XmlElement(name = "ShoppingResponseID")
        protected ShoppingResponseIDType shoppingResponseID;
        @XmlElement(name = "MarketingCarrierAirline")
        protected MarketingCarrierType marketingCarrierAirline;
        @XmlElement(name = "CalendarDates")
        protected AirShopReqAttributeQueryType.OriginDestination.CalendarDates calendarDates;
        @XmlAttribute(name = "OriginDestinationKey")
        @XmlSchemaType(name = "anySimpleType")
        protected String originDestinationKey;

        /**
         * FLIGHT DEPARTURE (ORIGIN).
         * 
         * @return
         *     possible object is
         *     {@link Departure }
         *     
         */
        public Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Departure }
         *     
         */
        public void setDeparture(Departure value) {
            this.departure = value;
        }

        /**
         * FLIGHT ARRIVAL (DESTINATION).
         * 
         * @return
         *     possible object is
         *     {@link FlightArrivalType }
         *     
         */
        public FlightArrivalType getArrival() {
            return arrival;
        }

        /**
         * Sets the value of the arrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightArrivalType }
         *     
         */
        public void setArrival(FlightArrivalType value) {
            this.arrival = value;
        }

        /**
         * Gets the value of the segMaxTimePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
            return segMaxTimePreferences;
        }

        /**
         * Sets the value of the segMaxTimePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
            this.segMaxTimePreferences = value;
        }

        /**
         * Flight-related shopping response IDs, including the unique (master) Shopping Session ID, Offer IDs, Offer Item IDs and Service IDs.
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public ShoppingResponseIDType getShoppingResponseID() {
            return shoppingResponseID;
        }

        /**
         * Sets the value of the shoppingResponseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseIDType }
         *     
         */
        public void setShoppingResponseID(ShoppingResponseIDType value) {
            this.shoppingResponseID = value;
        }

        /**
         * Gets the value of the marketingCarrierAirline property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierType }
         *     
         */
        public MarketingCarrierType getMarketingCarrierAirline() {
            return marketingCarrierAirline;
        }

        /**
         * Sets the value of the marketingCarrierAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierType }
         *     
         */
        public void setMarketingCarrierAirline(MarketingCarrierType value) {
            this.marketingCarrierAirline = value;
        }

        /**
         * Gets the value of the calendarDates property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopReqAttributeQueryType.OriginDestination.CalendarDates }
         *     
         */
        public AirShopReqAttributeQueryType.OriginDestination.CalendarDates getCalendarDates() {
            return calendarDates;
        }

        /**
         * Sets the value of the calendarDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopReqAttributeQueryType.OriginDestination.CalendarDates }
         *     
         */
        public void setCalendarDates(AirShopReqAttributeQueryType.OriginDestination.CalendarDates value) {
            this.calendarDates = value;
        }

        /**
         * Gets the value of the originDestinationKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginDestinationKey() {
            return originDestinationKey;
        }

        /**
         * Sets the value of the originDestinationKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginDestinationKey(String value) {
            this.originDestinationKey = value;
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
         *       &lt;attribute name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="DaysAfter" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CalendarDates {

            @XmlAttribute(name = "DaysBefore")
            protected Integer daysBefore;
            @XmlAttribute(name = "DaysAfter")
            protected Integer daysAfter;

            /**
             * Gets the value of the daysBefore property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDaysBefore() {
                return daysBefore;
            }

            /**
             * Sets the value of the daysBefore property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDaysBefore(Integer value) {
                this.daysBefore = value;
            }

            /**
             * Gets the value of the daysAfter property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDaysAfter() {
                return daysAfter;
            }

            /**
             * Sets the value of the daysAfter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDaysAfter(Integer value) {
                this.daysAfter = value;
            }

        }

    }

}
