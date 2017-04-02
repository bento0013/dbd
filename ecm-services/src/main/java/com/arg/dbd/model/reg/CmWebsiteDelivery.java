
package com.arg.dbd.model.reg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmWebsiteDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmWebsiteDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMWD_DELI_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMWD_DELI_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmWebsiteDelivery", propOrder = {
    "cmwddelicode",
    "cmwddelidesc"
})
public class CmWebsiteDelivery {

    @XmlElement(name = "CMWD_DELI_CODE")
    protected String cmwddelicode;
    @XmlElement(name = "CMWD_DELI_DESC")
    protected String cmwddelidesc;

    /**
     * Gets the value of the cmwddelicode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWDDELICODE() {
        return cmwddelicode;
    }

    /**
     * Sets the value of the cmwddelicode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWDDELICODE(String value) {
        this.cmwddelicode = value;
    }

    /**
     * Gets the value of the cmwddelidesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWDDELIDESC() {
        return cmwddelidesc;
    }

    /**
     * Sets the value of the cmwddelidesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWDDELIDESC(String value) {
        this.cmwddelidesc = value;
    }

}
