
package com.arg.dbd.model.reg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmWebsiteOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmWebsiteOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMWO_ORD_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMWO_ORD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmWebsiteOrder", propOrder = {
    "cmwoordcode",
    "cmwoorddesc"
})
public class CmWebsiteOrder {

    @XmlElement(name = "CMWO_ORD_CODE")
    protected String cmwoordcode;
    @XmlElement(name = "CMWO_ORD_DESC")
    protected String cmwoorddesc;

    /**
     * Gets the value of the cmwoordcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWOORDCODE() {
        return cmwoordcode;
    }

    /**
     * Sets the value of the cmwoordcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWOORDCODE(String value) {
        this.cmwoordcode = value;
    }

    /**
     * Gets the value of the cmwoorddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWOORDDESC() {
        return cmwoorddesc;
    }

    /**
     * Sets the value of the cmwoorddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWOORDDESC(String value) {
        this.cmwoorddesc = value;
    }

}
