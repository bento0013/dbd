
package com.arg.dbd.model.reg;

import com.arg.dbd.model.AbstractPojo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmWebsiteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmWebsiteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMWR_RULE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmWebsiteRule", propOrder = {
    "cmwrrulecode"
})
public class CmWebsiteRule extends AbstractPojo{

    @XmlElement(name = "CMWR_RULE_CODE")
    protected String cmwrrulecode;

    /**
     * Gets the value of the cmwrrulecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWRRULECODE() {
        return cmwrrulecode;
    }

    /**
     * Sets the value of the cmwrrulecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWRRULECODE(String value) {
        this.cmwrrulecode = value;
    }

}
