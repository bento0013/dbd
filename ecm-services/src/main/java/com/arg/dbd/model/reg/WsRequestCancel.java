
package com.arg.dbd.model.reg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsRequestB01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsRequestB01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmmain" type="{http://ws.regcom.dbd.scc.com/}cmMain" minOccurs="0"/>
 *         &lt;element name="objectivelist" type="{http://ws.regcom.dbd.scc.com/}cmObjective" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="websiteDeliverylist" type="{http://ws.regcom.dbd.scc.com/}cmWebsiteDelivery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="websiteOrderlist" type="{http://ws.regcom.dbd.scc.com/}cmWebsiteOrder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="websitePaymentlist" type="{http://ws.regcom.dbd.scc.com/}cmWebsitePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="websiteRulelist" type="{http://ws.regcom.dbd.scc.com/}cmWebsiteRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRequestCancel", propOrder = {
    "cmmain"
})
public class WsRequestCancel {

    protected CmMain cmmain;
    
    /**
     * Gets the value of the cmmain property.
     * 
     * @return
     *     possible object is
     *     {@link CmMain }
     *     
     */
    public CmMain getCmmain() {
        return cmmain;
    }

    /**
     * Sets the value of the cmmain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmMain }
     *     
     */
    public void setCmmain(CmMain value) {
        this.cmmain = value;
    }
}
