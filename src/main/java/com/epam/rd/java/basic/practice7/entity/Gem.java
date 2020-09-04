//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.01 at 02:21:39 PM EEST 
//


package com.epam.rd.java.basic.practice7.entity;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for gem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="gem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameGem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preciousness" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visualParameters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gem", propOrder = {
        "nameGem",
        "origin",
        "visualParameters",
})
@XmlRootElement(name = "gem")
public class Gem {

    @XmlElement(required = true)
    protected String nameGem;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected VisualParameters visualParameters;


    public Gem(String nameGem, String origin, VisualParameters visualParameters) {
        this.nameGem = nameGem;
        this.origin = origin;
        this.visualParameters = visualParameters;
    }

    public Gem() {
    }

    /*
     * Gets the value of the nameGem property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */


    public String getNameGem() {
        return nameGem;
    }

    /**
     * Sets the value of the nameGem property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameGem(String value) {
        this.nameGem = value;
    }


    /**
     * Gets the value of the origin property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     *
     * @param value allowed object is
     *              {@link String }
     */

    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParameters property.
     *
     * @return possible object is
     * {@link String }
     */
    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    /**
     * Sets the value of the visualParameters property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisualParameters(VisualParameters value) {
        this.visualParameters = value;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "nameGem='" + nameGem + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParameters=" + visualParameters +
                '}' + '\n';
    }
}
