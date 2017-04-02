
package com.arg.dbd.model.reg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmWebsitePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmWebsitePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMWP_PAY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMWP_PAY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmWebsitePayment", propOrder = {
    "cmwppaycode",
    "cmwppaydesc"
})
public class CmWebsitePayment {

    @XmlElement(name = "CMWP_PAY_CODE")
    protected String cmwppaycode;
    @XmlElement(name = "CMWP_PAY_DESC")
    protected String cmwppaydesc;

    /**
     * Gets the value of the cmwppaycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWPPAYCODE() {
        return cmwppaycode;
    }

    /**
     * Sets the value of the cmwppaycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWPPAYCODE(String value) {
        this.cmwppaycode = value;
    }

    /**
     * Gets the value of the cmwppaydesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWPPAYDESC() {
        return cmwppaydesc;
    }

    /**
     * Sets the value of the cmwppaydesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWPPAYDESC(String value) {
        this.cmwppaydesc = value;
    }

}
