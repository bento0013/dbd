
package com.arg.dbd.model.reg;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.beanutils.PropertyUtils;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmMain", propOrder = {
    "cmaadracode",
    "cmaadrbld",
    "cmaadrbldfl",
    "cmaadrbldno",
    "cmaadrcocode",
    "cmaadrdisp",
    "cmaadrdispen",
    "cmaadrextra",
    "cmaadrfax",
    "cmaadrhid",
    "cmaadrhno",
    "cmaadrjcode",
    "cmaadrmoo",
    "cmaadrpost",
    "cmaadrroad",
    "cmaadrsoi",
    "cmaadrtcode",
    "cmaadrtel",
    "cmaadrtrok",
    "cmaadrvillage",
    "cmmcap",
    "cmmendate",
    "cmmgenid",
    "cmmmgrid",
    "cmmmgrfirstname",
    "cmmmgrlastname",
    "cmmmgrfirstnameen",
    "cmmmgrlastnameen",
    "cmmmgrtitle",
    "cmmnameen",
    "cmmnameth",
    "cmmno",
    "cmmownid",
    "cmmownfirstname",
    "cmmownlastname",
    "cmmownfirstnameen",
    "cmmownlastnameen",
    "cmmowntaxid",
    "cmmowntitlenm",
    "cmmowntitleen",
    "cmmowncode",
    "cmmreqest",
    "cmmstat",
    "cmmstdate",
    "cmmwebsite",
    "cmmwebsiteen",
    "cmwwebemail",
    "cmwwebobj",
    "cmwwebobj_code",
    "cmwbucode",
    "cmwbudesc",
    "reqchgdesc",
    "reqno",
    "reqrdate",
    "reqsdate",
    "reqtpcode",
    "reqcmmoffcode",
    "webserverrequestdate",
    "webserverrequesttime",
    "webserverrequestuser",
    "birthdate",
    "nationality"
})
public class CmMain {

    private static final ThreadLocal callStack = new ThreadLocal()
    {
        protected Object initialValue()
        {
            return new ArrayList();
        }
    };
    
    
    @XmlElement(name = "CMAADRACODE")
    protected String cmaadracode;
    @XmlElement(name = "CMAADRBLD")
    protected String cmaadrbld;
    @XmlElement(name = "CMAADRBLDFL")
    protected String cmaadrbldfl;
    @XmlElement(name = "CMAADRBLDNO")
    protected String cmaadrbldno;
    @XmlElement(name = "CMAADRCOCODE")
    protected String cmaadrcocode;
    @XmlElement(name = "CMAADRDISP")
    protected String cmaadrdisp;
    @XmlElement(name = "CMAADRDISPEN")
    protected String cmaadrdispen;
    @XmlElement(name = "CMAADREXTRA")
    protected String cmaadrextra;
    @XmlElement(name = "CMAADRFAX")
    protected String cmaadrfax;
    @XmlElement(name = "CMAADRHID")
    protected String cmaadrhid;
    @XmlElement(name = "CMAADRHNO")
    protected String cmaadrhno;
    @XmlElement(name = "CMAADRJCODE")
    protected String cmaadrjcode;
    @XmlElement(name = "CMAADRMOO")
    protected String cmaadrmoo;
    @XmlElement(name = "CMAADRPOST")
    protected String cmaadrpost;
    @XmlElement(name = "CMAADRROAD")
    protected String cmaadrroad;
    @XmlElement(name = "CMAADRSOI")
    protected String cmaadrsoi;
    @XmlElement(name = "CMAADRTCODE")
    protected String cmaadrtcode;
    @XmlElement(name = "CMAADRTEL")
    protected String cmaadrtel;
    @XmlElement(name = "CMAADRTROK")
    protected String cmaadrtrok;
    @XmlElement(name = "CMAADRVILLAGE")
    protected String cmaadrvillage;
    @XmlElement(name = "CMMCAP")
    protected BigDecimal cmmcap;
    @XmlElement(name = "CMMENDATE")
    protected String cmmendate;
    @XmlElement(name = "CMMGENID")
    protected Integer cmmgenid;
    @XmlElement(name = "CMMMGRID")
    protected String cmmmgrid;
    @XmlElement(name = "CMMMGRFIRSTNAME")
    protected String cmmmgrfirstname;
    @XmlElement(name = "CMMMGRLASTNAME")
    protected String cmmmgrlastname;
    @XmlElement(name = "CMMMGRFIRSTNAMEEN")
    protected String cmmmgrfirstnameen;
    @XmlElement(name = "CMMMGRLASTNAMEEN")
    protected String cmmmgrlastnameen;
    @XmlElement(name = "CMMMGRTITLE")
    protected String cmmmgrtitle;
    @XmlElement(name = "CMMNAMEEN")
    protected String cmmnameen;
    @XmlElement(name = "CMMNAMETH")
    protected String cmmnameth;
    @XmlElement(name = "CMMNO")
    protected String cmmno;
    @XmlElement(name = "CMMOWNID")
    protected String cmmownid;
    @XmlElement(name = "CMMOWNFIRSTNAME")
    protected String cmmownfirstname;
    @XmlElement(name = "CMMOWNLASTNAME")
    protected String cmmownlastname;
    @XmlElement(name = "CMMOWNFIRSTNAMEEN")
    protected String cmmownfirstnameen;
    @XmlElement(name = "CMMOWNLASTNAMEEN")
    protected String cmmownlastnameen;
    @XmlElement(name = "CMMOWNTAXID")
    protected String cmmowntaxid;
    @XmlElement(name = "CMMOWNTITLE_NM")
    protected String cmmowntitlenm;
    @XmlElement(name = "CMMOWNTITLE_EN")
    protected String cmmowntitleen;
    @XmlElement(name = "CMMOWN_CODE")
    protected String cmmowncode;
    @XmlElement(name = "CMMREQEST")
    protected String cmmreqest;
    @XmlElement(name = "CMMSTAT")
    protected String cmmstat;
    @XmlElement(name = "CMMSTDATE")
    protected String cmmstdate;
    @XmlElement(name = "CMMWEBSITE")
    protected String cmmwebsite;
    @XmlElement(name = "CMMWEBSITEEN")
    protected String cmmwebsiteen;
    @XmlElement(name = "CMWWEBEMAIL")
    protected String cmwwebemail;
    @XmlElement(name = "CMWWEBOBJ")
    protected String cmwwebobj;
    @XmlElement(name = "CMWWEBOBJ_CODE")
    protected String cmwwebobj_code;
    @XmlElement(name = "CMW_BU_CODE")
    protected String cmwbucode;
    @XmlElement(name = "CMW_BU_DESC")
    protected String cmwbudesc;
    @XmlElement(name = "REQCHG_DESC")
    protected String reqchgdesc;
    @XmlElement(name = "REQNO")
    protected String reqno;
    @XmlElement(name = "REQRDATE")
    protected String reqrdate;
    @XmlElement(name = "REQSDATE")
    protected String reqsdate;
    @XmlElement(name = "REQTP_CODE")
    protected String reqtpcode;
    @XmlElement(name = "REQ_CMMOFF_CODE")
    protected String reqcmmoffcode;
    @XmlElement(name = "WEBSERVER_REQUEST_DATE")
    protected String webserverrequestdate;
    @XmlElement(name = "WEBSERVER_REQUEST_TIME")
    protected String webserverrequesttime;
    @XmlElement(name = "WEBSERVER_REQUEST_USER")
    protected String webserverrequestuser;
    @XmlElement(name = "BIRTHDATE")
    protected String birthdate;
    @XmlElement(name = "NATIONALITY")
    protected String nationality;

    /**
     * Gets the value of the cmaadracode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRACODE() {
        return cmaadracode;
    }

    /**
     * Sets the value of the cmaadracode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRACODE(String value) {
        this.cmaadracode = value;
    }

    /**
     * Gets the value of the cmaadrbld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRBLD() {
        return cmaadrbld;
    }

    /**
     * Sets the value of the cmaadrbld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRBLD(String value) {
        this.cmaadrbld = value;
    }

    /**
     * Gets the value of the cmaadrbldfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRBLDFL() {
        return cmaadrbldfl;
    }

    /**
     * Sets the value of the cmaadrbldfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRBLDFL(String value) {
        this.cmaadrbldfl = value;
    }

    /**
     * Gets the value of the cmaadrbldno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRBLDNO() {
        return cmaadrbldno;
    }

    /**
     * Sets the value of the cmaadrbldno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRBLDNO(String value) {
        this.cmaadrbldno = value;
    }

    /**
     * Gets the value of the cmaadrcocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRCOCODE() {
        return cmaadrcocode;
    }

    /**
     * Sets the value of the cmaadrcocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRCOCODE(String value) {
        this.cmaadrcocode = value;
    }

    /**
     * Gets the value of the cmaadrdisp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRDISP() {
        return cmaadrdisp;
    }

    /**
     * Sets the value of the cmaadrdisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRDISP(String value) {
        this.cmaadrdisp = value;
    }

    /**
     * Gets the value of the cmaadrdispen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRDISPEN() {
        return cmaadrdispen;
    }

    /**
     * Sets the value of the cmaadrdispen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRDISPEN(String value) {
        this.cmaadrdispen = value;
    }

    /**
     * Gets the value of the cmaadrextra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADREXTRA() {
        return cmaadrextra;
    }

    /**
     * Sets the value of the cmaadrextra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADREXTRA(String value) {
        this.cmaadrextra = value;
    }

    /**
     * Gets the value of the cmaadrfax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRFAX() {
        return cmaadrfax;
    }

    /**
     * Sets the value of the cmaadrfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRFAX(String value) {
        this.cmaadrfax = value;
    }

    /**
     * Gets the value of the cmaadrhid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRHID() {
        return cmaadrhid;
    }

    /**
     * Sets the value of the cmaadrhid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRHID(String value) {
        this.cmaadrhid = value;
    }

    /**
     * Gets the value of the cmaadrhno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRHNO() {
        return cmaadrhno;
    }

    /**
     * Sets the value of the cmaadrhno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRHNO(String value) {
        this.cmaadrhno = value;
    }

    /**
     * Gets the value of the cmaadrjcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRJCODE() {
        return cmaadrjcode;
    }

    /**
     * Sets the value of the cmaadrjcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRJCODE(String value) {
        this.cmaadrjcode = value;
    }

    /**
     * Gets the value of the cmaadrmoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRMOO() {
        return cmaadrmoo;
    }

    /**
     * Sets the value of the cmaadrmoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRMOO(String value) {
        this.cmaadrmoo = value;
    }

    /**
     * Gets the value of the cmaadrpost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRPOST() {
        return cmaadrpost;
    }

    /**
     * Sets the value of the cmaadrpost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRPOST(String value) {
        this.cmaadrpost = value;
    }

    /**
     * Gets the value of the cmaadrroad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRROAD() {
        return cmaadrroad;
    }

    /**
     * Sets the value of the cmaadrroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRROAD(String value) {
        this.cmaadrroad = value;
    }

    /**
     * Gets the value of the cmaadrsoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRSOI() {
        return cmaadrsoi;
    }

    /**
     * Sets the value of the cmaadrsoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRSOI(String value) {
        this.cmaadrsoi = value;
    }

    /**
     * Gets the value of the cmaadrtcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRTCODE() {
        return cmaadrtcode;
    }

    /**
     * Sets the value of the cmaadrtcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRTCODE(String value) {
        this.cmaadrtcode = value;
    }

    /**
     * Gets the value of the cmaadrtel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRTEL() {
        return cmaadrtel;
    }

    /**
     * Sets the value of the cmaadrtel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRTEL(String value) {
        this.cmaadrtel = value;
    }

    /**
     * Gets the value of the cmaadrtrok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRTROK() {
        return cmaadrtrok;
    }

    /**
     * Sets the value of the cmaadrtrok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRTROK(String value) {
        this.cmaadrtrok = value;
    }

    /**
     * Gets the value of the cmaadrvillage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMAADRVILLAGE() {
        return cmaadrvillage;
    }

    /**
     * Sets the value of the cmaadrvillage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMAADRVILLAGE(String value) {
        this.cmaadrvillage = value;
    }

    /**
     * Gets the value of the cmmcap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCMMCAP() {
        return cmmcap;
    }

    /**
     * Sets the value of the cmmcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCMMCAP(BigDecimal value) {
        this.cmmcap = value;
    }

    /**
     * Gets the value of the cmmendate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMENDATE() {
        return cmmendate;
    }

    /**
     * Sets the value of the cmmendate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMENDATE(String value) {
        this.cmmendate = value;
    }

    /**
     * Gets the value of the cmmgenid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCMMGENID() {
        return cmmgenid;
    }

    /**
     * Sets the value of the cmmgenid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCMMGENID(Integer value) {
        this.cmmgenid = value;
    }

    /**
     * Gets the value of the cmmmgrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRID() {
        return cmmmgrid;
    }

    /**
     * Sets the value of the cmmmgrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRID(String value) {
        this.cmmmgrid = value;
    }

    /**
     * Gets the value of the cmmmgrfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRFIRSTNAME() {
        return cmmmgrfirstname;
    }

    /**
     * Sets the value of the cmmmgrfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRFIRSTNAME(String value) {
        this.cmmmgrfirstname = value;
    }

    /**
     * Gets the value of the cmmmgrlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRLASTNAME() {
        return cmmmgrlastname;
    }

    /**
     * Sets the value of the cmmmgrlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRLASTNAME(String value) {
        this.cmmmgrlastname = value;
    }

    /**
     * Gets the value of the cmmmgrfirstnameen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRFIRSTNAMEEN() {
        return cmmmgrfirstnameen;
    }

    /**
     * Sets the value of the cmmmgrfirstnameen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRFIRSTNAMEEN(String value) {
        this.cmmmgrfirstnameen = value;
    }

    /**
     * Gets the value of the cmmmgrlastnameen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRLASTNAMEEN() {
        return cmmmgrlastnameen;
    }

    /**
     * Sets the value of the cmmmgrlastnameen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRLASTNAMEEN(String value) {
        this.cmmmgrlastnameen = value;
    }

    /**
     * Gets the value of the cmmmgrtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMMGRTITLE() {
        return cmmmgrtitle;
    }

    /**
     * Sets the value of the cmmmgrtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMMGRTITLE(String value) {
        this.cmmmgrtitle = value;
    }

    /**
     * Gets the value of the cmmnameen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMNAMEEN() {
        return cmmnameen;
    }

    /**
     * Sets the value of the cmmnameen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMNAMEEN(String value) {
        this.cmmnameen = value;
    }

    /**
     * Gets the value of the cmmnameth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMNAMETH() {
        return cmmnameth;
    }

    /**
     * Sets the value of the cmmnameth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMNAMETH(String value) {
        this.cmmnameth = value;
    }

    /**
     * Gets the value of the cmmno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMNO() {
        return cmmno;
    }

    /**
     * Sets the value of the cmmno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMNO(String value) {
        this.cmmno = value;
    }

    /**
     * Gets the value of the cmmownid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNID() {
        return cmmownid;
    }

    /**
     * Sets the value of the cmmownid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNID(String value) {
        this.cmmownid = value;
    }

    /**
     * Gets the value of the cmmownfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNFIRSTNAME() {
        return cmmownfirstname;
    }

    /**
     * Sets the value of the cmmownfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNFIRSTNAME(String value) {
        this.cmmownfirstname = value;
    }

    /**
     * Gets the value of the cmmownlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNLASTNAME() {
        return cmmownlastname;
    }

    /**
     * Sets the value of the cmmownlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNLASTNAME(String value) {
        this.cmmownlastname = value;
    }

    /**
     * Gets the value of the cmmownfirstnameen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNFIRSTNAMEEN() {
        return cmmownfirstnameen;
    }

    /**
     * Sets the value of the cmmownfirstnameen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNFIRSTNAMEEN(String value) {
        this.cmmownfirstnameen = value;
    }

    /**
     * Gets the value of the cmmownlastnameen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNLASTNAMEEN() {
        return cmmownlastnameen;
    }

    /**
     * Sets the value of the cmmownlastnameen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNLASTNAMEEN(String value) {
        this.cmmownlastnameen = value;
    }

    /**
     * Gets the value of the cmmowntaxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNTAXID() {
        return cmmowntaxid;
    }

    /**
     * Sets the value of the cmmowntaxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNTAXID(String value) {
        this.cmmowntaxid = value;
    }

    /**
     * Gets the value of the cmmowntitlenm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNTITLENM() {
        return cmmowntitlenm;
    }

    /**
     * Sets the value of the cmmowntitlenm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNTITLENM(String value) {
        this.cmmowntitlenm = value;
    }

    /**
     * Gets the value of the cmmowntitleen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNTITLEEN() {
        return cmmowntitleen;
    }

    /**
     * Sets the value of the cmmowntitleen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNTITLEEN(String value) {
        this.cmmowntitleen = value;
    }

    /**
     * Gets the value of the cmmowncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMOWNCODE() {
        return cmmowncode;
    }

    /**
     * Sets the value of the cmmowncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMOWNCODE(String value) {
        this.cmmowncode = value;
    }

    /**
     * Gets the value of the cmmreqest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMREQEST() {
        return cmmreqest;
    }

    /**
     * Sets the value of the cmmreqest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMREQEST(String value) {
        this.cmmreqest = value;
    }

    /**
     * Gets the value of the cmmstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMSTAT() {
        return cmmstat;
    }

    /**
     * Sets the value of the cmmstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMSTAT(String value) {
        this.cmmstat = value;
    }

    /**
     * Gets the value of the cmmstdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMSTDATE() {
        return cmmstdate;
    }

    /**
     * Sets the value of the cmmstdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMSTDATE(String value) {
        this.cmmstdate = value;
    }

    /**
     * Gets the value of the cmmwebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMWEBSITE() {
        return cmmwebsite;
    }

    /**
     * Sets the value of the cmmwebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMWEBSITE(String value) {
        this.cmmwebsite = value;
    }

    /**
     * Gets the value of the cmmwebsiteen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMMWEBSITEEN() {
        return cmmwebsiteen;
    }

    /**
     * Sets the value of the cmmwebsiteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMMWEBSITEEN(String value) {
        this.cmmwebsiteen = value;
    }

    /**
     * Gets the value of the cmwwebemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWWEBEMAIL() {
        return cmwwebemail;
    }

    /**
     * Sets the value of the cmwwebemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWWEBEMAIL(String value) {
        this.cmwwebemail = value;
    }

    /**
     * Gets the value of the cmwwebobj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWWEBOBJ() {
        return cmwwebobj;
    }

    /**
     * Sets the value of the cmwwebobj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWWEBOBJ(String value) {
        this.cmwwebobj = value;
    }
    /**
     * Gets the value of the cmwwebobj_code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWWEBOBJ_CODE() {
        return cmwwebobj;
    }

    /**
     * Sets the value of the cmwwebobj_code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWWEBOBJ_CODE(String value) {
        this.cmwwebobj = value;
    }

    /**
     * Gets the value of the cmwbucode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWBUCODE() {
        return cmwbucode;
    }

    /**
     * Sets the value of the cmwbucode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWBUCODE(String value) {
        this.cmwbucode = value;
    }

    /**
     * Gets the value of the cmwbudesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMWBUDESC() {
        return cmwbudesc;
    }

    /**
     * Sets the value of the cmwbudesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMWBUDESC(String value) {
        this.cmwbudesc = value;
    }

    /**
     * Gets the value of the reqchgdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQCHGDESC() {
        return reqchgdesc;
    }

    /**
     * Sets the value of the reqchgdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQCHGDESC(String value) {
        this.reqchgdesc = value;
    }

    /**
     * Gets the value of the reqno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQNO() {
        return reqno;
    }

    /**

     * Sets the value of the reqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQNO(String value) {
        this.reqno = value;
    }

    /**
     * Gets the value of the reqrdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQRDATE() {
        return reqrdate;
    }

    /**
     * Sets the value of the reqrdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQRDATE(String value) {
        this.reqrdate = value;
    }

    /**
     * Gets the value of the reqsdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQSDATE() {
        return reqsdate;
    }

    /**
     * Sets the value of the reqsdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQSDATE(String value) {
        this.reqsdate = value;
    }

    /**
     * Gets the value of the reqtpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQTPCODE() {
        return reqtpcode;
    }

    /**
     * Sets the value of the reqtpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQTPCODE(String value) {
        this.reqtpcode = value;
    }

    /**
     * Gets the value of the reqcmmoffcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQCMMOFFCODE() {
        return reqcmmoffcode;
    }

    /**
     * Sets the value of the reqcmmoffcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQCMMOFFCODE(String value) {
        this.reqcmmoffcode = value;
    }

    /**
     * Gets the value of the webserverrequestdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBSERVERREQUESTDATE() {
        return webserverrequestdate;
    }

    /**
     * Sets the value of the webserverrequestdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBSERVERREQUESTDATE(String value) {
        this.webserverrequestdate = value;
    }

    /**
     * Gets the value of the webserverrequesttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBSERVERREQUESTTIME() {
        return webserverrequesttime;
    }

    /**
     * Sets the value of the webserverrequesttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBSERVERREQUESTTIME(String value) {
        this.webserverrequesttime = value;
    }

    /**
     * Gets the value of the webserverrequestuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEBSERVERREQUESTUSER() {
        return webserverrequestuser;
    }

    /**
     * Sets the value of the webserverrequestuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEBSERVERREQUESTUSER(String value) {
        this.webserverrequestuser = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHDATE() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDATE(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATIONALITY(String value) {
        this.nationality = value;
    }
    
    public String toString()
    {
        PropertyDescriptor[] pd = PropertyUtils.getPropertyDescriptors(this);
        StringBuffer buffer = new StringBuffer();

        if (((List) callStack.get()).contains(this))
        {
            buffer.append("Cyclic Reference!!!");
        }
        else
        {
            ((List) callStack.get()).add(this);

            for (int index = 0; index < pd.length; ++index)
            {
                if ((null != PropertyUtils.getReadMethod(pd[index]))
                        && (pd[index].getPropertyType() != Class.class))
                {
                    if (buffer.length() > 0)
                    {
                        buffer.append(", ");
                    }

                    String prop_name = pd[index].getName();
                    buffer.append(prop_name)
                          .append("=");

                    try
                    {
                        buffer.append(PropertyUtils.getProperty(this, prop_name));
                    }
                    catch (Exception e)
                    {
                        buffer.append(e.getMessage());
                    }
                }
            }

            ((List) callStack.get()).remove(this);
        }

        buffer.insert(0, " { ")
              .insert(0, getClass().getName())
              .append(" }");

        return buffer.toString();
    }

}
