//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.24 at 01:06:03 PM IST 
//


package com.syntel.travel.external.iata.ndc.v16_2.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PromoQualifierType">
 *       &lt;attribute name="CC_IssuingCountryInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PromotionQualifiers")
public class PromotionQualifiers
    extends PromoQualifierType
{

    @XmlAttribute(name = "CC_IssuingCountryInd")
    @XmlSchemaType(name = "anySimpleType")
    protected String ccIssuingCountryInd;

    /**
     * Gets the value of the ccIssuingCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCIssuingCountryInd() {
        return ccIssuingCountryInd;
    }

    /**
     * Sets the value of the ccIssuingCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCIssuingCountryInd(String value) {
        this.ccIssuingCountryInd = value;
    }

}
