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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PolicyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DefaultPolicy"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PolicyAugmentation"/>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "policy"
})
@XmlRootElement(name = "Policies")
public class Policies {

    @XmlElement(name = "Policy", required = true)
    protected List<Policies.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policies.Policy }
     * 
     * 
     */
    public List<Policies.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Policies.Policy>();
        }
        return this.policy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PolicyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DefaultPolicy"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PolicyAugmentation"/>
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
        "defaultPolicy",
        "policyAugmentation"
    })
    public static class Policy
        extends PolicyType
    {

        @XmlElement(name = "DefaultPolicy", required = true)
        protected PolicyDefaultType defaultPolicy;
        @XmlElement(name = "PolicyAugmentation", required = true)
        protected PolicyAugmentationType policyAugmentation;

        /**
         * Gets the value of the defaultPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyDefaultType }
         *     
         */
        public PolicyDefaultType getDefaultPolicy() {
            return defaultPolicy;
        }

        /**
         * Sets the value of the defaultPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyDefaultType }
         *     
         */
        public void setDefaultPolicy(PolicyDefaultType value) {
            this.defaultPolicy = value;
        }

        /**
         * Gets the value of the policyAugmentation property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public PolicyAugmentationType getPolicyAugmentation() {
            return policyAugmentation;
        }

        /**
         * Sets the value of the policyAugmentation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public void setPolicyAugmentation(PolicyAugmentationType value) {
            this.policyAugmentation = value;
        }

    }

}
