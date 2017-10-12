//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:06:03 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItineraryMetadata"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightMetadatasOrItineraryMetadata"
})
@XmlRootElement(name = "Flight")
public class Flight {

    @XmlElements({
        @XmlElement(name = "FlightMetadatas", type = FlightMetadatas.class),
        @XmlElement(name = "ItineraryMetadata", type = ItineraryMetadataType.class)
    })
    protected List<Object> flightMetadatasOrItineraryMetadata;

    /**
     * Gets the value of the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightMetadatasOrItineraryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightMetadatas }
     * {@link ItineraryMetadataType }
     * 
     * 
     */
    public List<Object> getFlightMetadatasOrItineraryMetadata() {
        if (flightMetadatasOrItineraryMetadata == null) {
            flightMetadatasOrItineraryMetadata = new ArrayList<Object>();
        }
        return this.flightMetadatasOrItineraryMetadata;
    }

}
