
package com.arg.dbd.model.reg;


import com.arg.dbd.model.AbstractPojo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmObjective complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmObjective">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMOIOBJ_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMOIOBJ_DESCTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMOIOBJ_SUB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMOORD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmObjective", propOrder = {
    "cmoiobjcode",
    "cmoiobjdescth",
    "cmoiobjsubcode",
    "cmoord"
})
public class CmObjective extends AbstractPojo{

    @XmlElement(name = "CMOIOBJ_CODE")
    protected String cmoiobjcode;
    @XmlElement(name = "CMOIOBJ_DESCTH")
    protected String cmoiobjdescth;
    @XmlElement(name = "CMOIOBJ_SUB_CODE")
    protected String cmoiobjsubcode;
    @XmlElement(name = "CMOORD")
    protected Integer cmoord;

    /**
     * Gets the value of the cmoiobjcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMOIOBJCODE() {
        return cmoiobjcode;
    }

    /**
     * Sets the value of the cmoiobjcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMOIOBJCODE(String value) {
        this.cmoiobjcode = value;
    }

    /**
     * Gets the value of the cmoiobjdescth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMOIOBJDESCTH() {
        return cmoiobjdescth;
    }

    /**
     * Sets the value of the cmoiobjdescth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMOIOBJDESCTH(String value) {
        this.cmoiobjdescth = value;
    }

    /**
     * Gets the value of the cmoiobjsubcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMOIOBJSUBCODE() {
        return cmoiobjsubcode;
    }

    /**
     * Sets the value of the cmoiobjsubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMOIOBJSUBCODE(String value) {
        this.cmoiobjsubcode = value;
    }

    /**
     * Gets the value of the cmoord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCMOORD() {
        return cmoord;
    }

    /**
     * Sets the value of the cmoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCMOORD(Integer value) {
        this.cmoord = value;
    }

}
