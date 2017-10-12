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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT MAP WING POSITION definition.
 * 
 * <p>Java class for WingPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WingPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rows" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="First" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
 *                   &lt;element name="Last" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *                 &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WingPositionType", propOrder = {
    "rows",
    "segmentReference"
})
public class WingPositionType {

    @XmlElement(name = "Rows", required = true)
    protected List<WingPositionType.Rows> rows;
    @XmlElement(name = "SegmentReference")
    protected SegmentReference segmentReference;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the rows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WingPositionType.Rows }
     * 
     * 
     */
    public List<WingPositionType.Rows> getRows() {
        if (rows == null) {
            rows = new ArrayList<WingPositionType.Rows>();
        }
        return this.rows;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReference }
     *     
     */
    public SegmentReference getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReference }
     *     
     */
    public void setSegmentReference(SegmentReference value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
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
     *       &lt;sequence>
     *         &lt;element name="First" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
     *         &lt;element name="Last" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *       &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "first",
        "last",
        "segmentReference"
    })
    public static class Rows {

        @XmlElement(name = "First", required = true)
        protected String first;
        @XmlElement(name = "Last", required = true)
        protected String last;
        @XmlElement(name = "SegmentReference")
        protected SegmentReference segmentReference;
        @XmlAttribute(name = "UpperDeckInd")
        protected Boolean upperDeckInd;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the first property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirst() {
            return first;
        }

        /**
         * Sets the value of the first property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirst(String value) {
            this.first = value;
        }

        /**
         * Gets the value of the last property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLast() {
            return last;
        }

        /**
         * Sets the value of the last property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLast(String value) {
            this.last = value;
        }

        /**
         * Gets the value of the segmentReference property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentReference }
         *     
         */
        public SegmentReference getSegmentReference() {
            return segmentReference;
        }

        /**
         * Sets the value of the segmentReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentReference }
         *     
         */
        public void setSegmentReference(SegmentReference value) {
            this.segmentReference = value;
        }

        /**
         * Gets the value of the upperDeckInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUpperDeckInd() {
            return upperDeckInd;
        }

        /**
         * Sets the value of the upperDeckInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUpperDeckInd(Boolean value) {
            this.upperDeckInd = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

    }

}
