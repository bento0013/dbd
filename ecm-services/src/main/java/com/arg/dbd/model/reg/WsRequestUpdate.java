
package com.arg.dbd.model.reg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlType(name = "wsRequestUpdate", propOrder = {
    "cmmain",
    "objectivelist",
    "websiteDeliverylist",
    "websiteOrderlist",
    "websitePaymentlist",
    "websiteRulelist"
})
public class WsRequestUpdate {

    protected CmMain cmmain;
    @XmlElement(nillable = true)
    protected List<CmObjective> objectivelist;
    @XmlElement(nillable = true)
    protected List<CmWebsiteDelivery> websiteDeliverylist;
    @XmlElement(nillable = true)
    protected List<CmWebsiteOrder> websiteOrderlist;
    @XmlElement(nillable = true)
    protected List<CmWebsitePayment> websitePaymentlist;
    @XmlElement(nillable = true)
    protected List<CmWebsiteRule> websiteRulelist;

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

    /**
     * Gets the value of the objectivelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectivelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectivelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmObjective }
     * 
     * 
     */
    public List<CmObjective> getObjectivelist() {
        if (objectivelist == null) {
            objectivelist = new ArrayList<CmObjective>();
        }
        return this.objectivelist;
    }

    /**
     * Gets the value of the websiteDeliverylist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the websiteDeliverylist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsiteDeliverylist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmWebsiteDelivery }
     * 
     * 
     */
    public List<CmWebsiteDelivery> getWebsiteDeliverylist() {
        if (websiteDeliverylist == null) {
            websiteDeliverylist = new ArrayList<CmWebsiteDelivery>();
        }
        return this.websiteDeliverylist;
    }

    /**
     * Gets the value of the websiteOrderlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the websiteOrderlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsiteOrderlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmWebsiteOrder }
     * 
     * 
     */
    public List<CmWebsiteOrder> getWebsiteOrderlist() {
        if (websiteOrderlist == null) {
            websiteOrderlist = new ArrayList<CmWebsiteOrder>();
        }
        return this.websiteOrderlist;
    }

    /**
     * Gets the value of the websitePaymentlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the websitePaymentlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsitePaymentlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmWebsitePayment }
     * 
     * 
     */
    public List<CmWebsitePayment> getWebsitePaymentlist() {
        if (websitePaymentlist == null) {
            websitePaymentlist = new ArrayList<CmWebsitePayment>();
        }
        return this.websitePaymentlist;
    }

    /**
     * Gets the value of the websiteRulelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the websiteRulelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsiteRulelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmWebsiteRule }
     * 
     * 
     */
    public List<CmWebsiteRule> getWebsiteRulelist() {
        if (websiteRulelist == null) {
            websiteRulelist = new ArrayList<CmWebsiteRule>();
        }
        return this.websiteRulelist;
    }

    public void setObjectivelist(List<CmObjective> objectivelist) {
        this.objectivelist = objectivelist;
    }

    public void setWebsiteDeliverylist(List<CmWebsiteDelivery> websiteDeliverylist) {
        this.websiteDeliverylist = websiteDeliverylist;
    }

    public void setWebsiteOrderlist(List<CmWebsiteOrder> websiteOrderlist) {
        this.websiteOrderlist = websiteOrderlist;
    }

    public void setWebsitePaymentlist(List<CmWebsitePayment> websitePaymentlist) {
        this.websitePaymentlist = websitePaymentlist;
    }

    public void setWebsiteRulelist(List<CmWebsiteRule> websiteRulelist) {
        this.websiteRulelist = websiteRulelist;
    }
    
    

}
