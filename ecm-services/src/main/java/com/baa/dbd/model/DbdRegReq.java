/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model;

import com.arg.dbd.model.AbstractPojo;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Noom
 */
@Entity
@Table(name = "dbd_reg_req")
public class DbdRegReq extends AbstractPojo{
    private Long id;
    private Long cmmGenId;
    private String identityCard;
    private String regReqEst;
    private String reqNo;
    private String reqSDate;
    private String dateReg;
    private String reqTPCode;
    private String reqCHGDesc;
    private String regOfficeId;
    private String reqUserTitle;
    private String reqUserName;
    private String cmmOwnCode;
    private String companyNameTh;
    private String companyNameEn;
    private String dateCommercialStart;
    private String cmmEnDate;
    private String investmentAmt;
    private String cmmStat;
    private String identificationNumber;
    private String cmmOwnTaxId;
    private String cmmOwnTitleTh;
    private String cmmOwnTitleEn;
    private String nameCommerceEn;
    private String nameCommerceTh;
    private String cmmMgrId;
    private String cmmMgrTitleTh;
    private String cmmMgrTitleEn;
    private String nameManageTh;
    private String nameManageEn;
    private String addressNoTh;
    private String squadTh;
    private String buildingTh;
    private String floorTh;
    private String cmaAdrBldNoTh;
    private String squad1Th;
    private String cmaAdrTrokTh;
    private String alleyTh;
    private String roadTh;
    private String cmaAdrtCodeTh;
    private String cmaAdraCodeTh;
    private String cmaAdrjCodeTh;
    private String addressNoEn;
    private String squadEn;
    private String buildingEn;
    private String floorEn;
    private String cmaAdrBldNoEn;
    private String squad1En;
    private String cmaAdrTrokEn;
    private String alleyEn;
    private String roadEn;
    private String cmaAdrtCodeEn;
    private String cmaAdraCodeEn;
    private String cmaAdrjCodeEn;
    private String cmaAdrExtra;
    private String cmaAdrCocode;
    private String textAddressTh;
    private String textAddressEn;
    private String postCodeTh;
    private String postCodeEn;
    private String cmaAdrTel;
    private String wsFax;
    private String wsName;
    private String wsNameOriginal;
    private String cmmWebsiteTh;
    private String cmwBuCode;
    private String cmwBuDesc;
    private String cmwWebObj;
    private String cmwWebObjCode;
    private String cmwWebEmail;
    private String webServerReqUser;
    private String webServerReqDate;
    private String webServerReqTime;
    private String flag;
    private Date createDate;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true ,columnDefinition = "bigint", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CMMGENID", nullable = false,columnDefinition = "bigint" ,insertable = true, updatable = true)
    public Long getCmmGenId() {
        return cmmGenId;
    }

    public void setCmmGenId(Long cmmGenId) {
        this.cmmGenId = cmmGenId;
    }

    @Column(name = "IDENTITY_CARD", nullable = true, length = 50,insertable = true, updatable = true)
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    
    @Column(name = "REGISTERED_REQUEST_ESTEBLISHED", nullable = true, length = 50,insertable = true, updatable = true)
    public String getRegReqEst() {
        return regReqEst;
    }

    public void setRegReqEst(String regReqEst) {
        this.regReqEst = regReqEst;
    }

    @Column(name = "REQUEST_NO", nullable = true, length = 50,insertable = true, updatable = true)
    public String getReqNo() {
        return reqNo;
    }

    
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    @Column(name = "REQSDATE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getReqSDate() {
        return reqSDate;
    }

    public void setReqSDate(String reqSDate) {
        this.reqSDate = reqSDate;
    }

    @Column(name = "DATE_REGISTER", nullable = true, length = 30,insertable = true, updatable = true)
    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    @Column(name = "REQTP_CODE", nullable = true, length = 100,insertable = true, updatable = true)
    public String getReqTPCode() {
        return reqTPCode;
    }

    public void setReqTPCode(String reqTPCode) {
        this.reqTPCode = reqTPCode;
    }

    @Column(name = "REQCHG_DESC", nullable = true, length = 100,insertable = true, updatable = true)
    public String getReqCHGDesc() {
        return reqCHGDesc;
    }

    public void setReqCHGDesc(String reqCHGDesc) {
        this.reqCHGDesc = reqCHGDesc;
    }

    @Column(name = "REGISTERED_OFFICE_ID", nullable = true, length = 11,insertable = true, updatable = true)
    public String getRegOfficeId() {
        return regOfficeId;
    }

    public void setRegOfficeId(String regOfficeId) {
        this.regOfficeId = regOfficeId;
    }

    @Column(name = "REQ_REQUSER_TITLE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getReqUserTitle() {
        return reqUserTitle;
    }

    public void setReqUserTitle(String reqUserTitle) {
        this.reqUserTitle = reqUserTitle;
    }

    @Column(name = "REQ_REQUSER_NAME", nullable = true, length = 30,insertable = true, updatable = true)
    public String getReqUserName() {
        return reqUserName;
    }

    public void setReqUserName(String reqUserName) {
        this.reqUserName = reqUserName;
    }

    @Column(name = "CMMOWN_CODE", nullable = true, length = 11,insertable = true, updatable = true)
    public String getCmmOwnCode() {
        return cmmOwnCode;
    }

    public void setCmmOwnCode(String cmmOwnCode) {
        this.cmmOwnCode = cmmOwnCode;
    }

    @Column(name = "COMPANY_NAME_TH", nullable = true, length = 100,insertable = true, updatable = true)
    public String getCompanyNameTh() {
        return companyNameTh;
    }

    public void setCompanyNameTh(String companyNameTh) {
        this.companyNameTh = companyNameTh;
    }

    @Column(name = "COMPANY_NAME_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getCompanyNameEn() {
        return companyNameEn;
    }

    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn;
    }

    @Column(name = "DATE_COMMERCIAL_START", nullable = true, length = 30,insertable = true, updatable = true)
    public String getDateCommercialStart() {
        return dateCommercialStart;
    }

    public void setDateCommercialStart(String dateCommercialStart) {
        this.dateCommercialStart = dateCommercialStart;
    }

    @Column(name = "CMMENDATE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmmEnDate() {
        return cmmEnDate;
    }

    public void setCmmEnDate(String cmmEnDate) {
        this.cmmEnDate = cmmEnDate;
    }

    @Column(name = "INVESTMENT_AMOUNT", nullable = true, length = 20,insertable = true, updatable = true)
    public String getInvestmentAmt() {
        return investmentAmt;
    }

    public void setInvestmentAmt(String investmentAmt) {
        this.investmentAmt = investmentAmt;
    }

    @Column(name = "CMMSTAT", nullable = true, length = 3,insertable = true, updatable = true)
    public String getCmmStat() {
        return cmmStat;
    }

    public void setCmmStat(String cmmStat) {
        this.cmmStat = cmmStat;
    }

    @Column(name = "IDENTIFICATION_NUMBER", nullable = true, length = 50,insertable = true, updatable = true)
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Column(name = "CMMOWNTAXID", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmmOwnTaxId() {
        return cmmOwnTaxId;
    }

    public void setCmmOwnTaxId(String cmmOwnTaxId) {
        this.cmmOwnTaxId = cmmOwnTaxId;
    }

    @Column(name = "CMMOWNTITLE_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmmOwnTitleTh() {
        return cmmOwnTitleTh;
    }

    public void setCmmOwnTitleTh(String cmmOwnTitleTh) {
        this.cmmOwnTitleTh = cmmOwnTitleTh;
    }

    @Column(name = "CMMOWNTITLE_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmmOwnTitleEn() {
        return cmmOwnTitleEn;
    }

    public void setCmmOwnTitleEn(String cmmOwnTitleEn) {
        this.cmmOwnTitleEn = cmmOwnTitleEn;
    }

    @Column(name = "NAME_COMMERCE_EN", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameCommerceEn() {
        return nameCommerceEn;
    }

    public void setNameCommerceEn(String nameCommerceEn) {
        this.nameCommerceEn = nameCommerceEn;
    }

    @Column(name = "NAME_COMMERCE_TH", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameCommerceTh() {
        return nameCommerceTh;
    }

    public void setNameCommerceTh(String nameCommerceTh) {
        this.nameCommerceTh = nameCommerceTh;
    }

    @Column(name = "CMMMGRID", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmmMgrId() {
        return cmmMgrId;
    }

    public void setCmmMgrId(String cmmMgrId) {
        this.cmmMgrId = cmmMgrId;
    }

    @Column(name = "CMMMGRTITLE_TH", nullable = true, length = 11,insertable = true, updatable = true)
    public String getCmmMgrTitleTh() {
        return cmmMgrTitleTh;
    }

    public void setCmmMgrTitleTh(String cmmMgrTitleTh) {
        this.cmmMgrTitleTh = cmmMgrTitleTh;
    }

    @Column(name = "CMMMGRTITLE_EN", nullable = true, length = 11,insertable = true, updatable = true)
    public String getCmmMgrTitleEn() {
        return cmmMgrTitleEn;
    }

    public void setCmmMgrTitleEn(String cmmMgrTitleEn) {
        this.cmmMgrTitleEn = cmmMgrTitleEn;
    }
    
    @Column(name = "NAME_MANAGE_TH", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameManageTh() {
        return nameManageTh;
    }

    public void setNameManageTh(String nameManageTh) {
        this.nameManageTh = nameManageTh;
    }

    @Column(name = "NAME_MANAGE_EN", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameManageEn() {
        return nameManageEn;
    }

    public void setNameManageEn(String nameManageEn) {
        this.nameManageEn = nameManageEn;
    }

    @Column(name = "ADDRESS_NO_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getAddressNoTh() {
        return addressNoTh;
    }

    public void setAddressNoTh(String addressNoTh) {
        this.addressNoTh = addressNoTh;
    }

    @Column(name = "SQUAD_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getSquadTh() {
        return squadTh;
    }

    public void setSquadTh(String squadTh) {
        this.squadTh = squadTh;
    }

    @Column(name = "BUILDING_TH", nullable = true, length = 150,insertable = true, updatable = true)
    public String getBuildingTh() {
        return buildingTh;
    }

    public void setBuildingTh(String buildingTh) {
        this.buildingTh = buildingTh;
    }

    @Column(name = "FLOOR_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getFloorTh() {
        return floorTh;
    }

    public void setFloorTh(String floorTh) {
        this.floorTh = floorTh;
    }

    @Column(name = "CMAADRBLDNO_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmaAdrBldNoTh() {
        return cmaAdrBldNoTh;
    }

    public void setCmaAdrBldNoTh(String cmaAdrBldNoTh) {
        this.cmaAdrBldNoTh = cmaAdrBldNoTh;
    }

    @Column(name = "SQUAD1_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getSquad1Th() {
        return squad1Th;
    }

    public void setSquad1Th(String squad1Th) {
        this.squad1Th = squad1Th;
    }

    @Column(name = "CMAADRTROK_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmaAdrTrokTh() {
        return cmaAdrTrokTh;
    }

    public void setCmaAdrTrokTh(String cmaAdrTrokTh) {
        this.cmaAdrTrokTh = cmaAdrTrokTh;
    }

    @Column(name = "ALLEY_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getAlleyTh() {
        return alleyTh;
    }

    public void setAlleyTh(String alleyTh) {
        this.alleyTh = alleyTh;
    }

    @Column(name = "ROAD_TH", nullable = true, length = 50,insertable = true, updatable = true)
    public String getRoadTh() {
        return roadTh;
    }

    public void setRoadTh(String roadTh) {
        this.roadTh = roadTh;
    }

    @Column(name = "CMAADRTCODE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmaAdrtCodeTh() {
        return cmaAdrtCodeTh;
    }

    public void setCmaAdrtCodeTh(String cmaAdrtCodeTh) {
        this.cmaAdrtCodeTh = cmaAdrtCodeTh;
    }

    @Column(name = "CMAADRACODE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmaAdraCodeTh() {
        return cmaAdraCodeTh;
    }

    public void setCmaAdraCodeTh(String cmaAdraCodeTh) {
        this.cmaAdraCodeTh = cmaAdraCodeTh;
    }

    @Column(name = "CMAADRJCODE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmaAdrjCodeTh() {
        return cmaAdrjCodeTh;
    }

    public void setCmaAdrjCodeTh(String cmaAdrjCodeTh) {
        this.cmaAdrjCodeTh = cmaAdrjCodeTh;
    }

    @Column(name = "ADDRESS_NO_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getAddressNoEn() {
        return addressNoEn;
    }

    public void setAddressNoEn(String addressNoEn) {
        this.addressNoEn = addressNoEn;
    }

    @Column(name = "SQUAD_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getSquadEn() {
        return squadEn;
    }

    public void setSquadEn(String squadEn) {
        this.squadEn = squadEn;
    }

    @Column(name = "BUILDING_EN", nullable = true, length = 150,insertable = true, updatable = true)
    public String getBuildingEn() {
        return buildingEn;
    }

    public void setBuildingEn(String buildingEn) {
        this.buildingEn = buildingEn;
    }

    @Column(name = "FLOOR_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getFloorEn() {
        return floorEn;
    }

    public void setFloorEn(String floorEn) {
        this.floorEn = floorEn;
    }

    @Column(name = "CMAADRBLDNO_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getCmaAdrBldNoEn() {
        return cmaAdrBldNoEn;
    }

    public void setCmaAdrBldNoEn(String cmaAdrBldNoEn) {
        this.cmaAdrBldNoEn = cmaAdrBldNoEn;
    }

    @Column(name = "SQUAD1_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getSquad1En() {
        return squad1En;
    }

    public void setSquad1En(String squad1En) {
        this.squad1En = squad1En;
    }

    @Column(name = "CMAADRTROK_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmaAdrTrokEn() {
        return cmaAdrTrokEn;
    }

    public void setCmaAdrTrokEn(String cmaAdrTrokEn) {
        this.cmaAdrTrokEn = cmaAdrTrokEn;
    }

    @Column(name = "ALLEY_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getAlleyEn() {
        return alleyEn;
    }

    public void setAlleyEn(String alleyEn) {
        this.alleyEn = alleyEn;
    }

    @Column(name = "ROAD_EN", nullable = true, length = 50,insertable = true, updatable = true)
    public String getRoadEn() {
        return roadEn;
    }

    public void setRoadEn(String roadEn) {
        this.roadEn = roadEn;
    }

    @Column(name = "CMAADRTCODE_EN", nullable = true, length = 2,insertable = true, updatable = true)
    public String getCmaAdrtCodeEn() {
        return cmaAdrtCodeEn;
    }

    public void setCmaAdrtCodeEn(String cmaAdrtCodeEn) {
        this.cmaAdrtCodeEn = cmaAdrtCodeEn;
    }

    @Column(name = "CMAADRACODE_EN", nullable = true, length = 2,insertable = true, updatable = true)
    public String getCmaAdraCodeEn() {
        return cmaAdraCodeEn;
    }

    public void setCmaAdraCodeEn(String cmaAdraCodeEn) {
        this.cmaAdraCodeEn = cmaAdraCodeEn;
    }

    @Column(name = "CMAADRJCODE_EN", nullable = true, length = 3,insertable = true, updatable = true)
    public String getCmaAdrjCodeEn() {
        return cmaAdrjCodeEn;
    }

    public void setCmaAdrjCodeEn(String cmaAdrjCodeEn) {
        this.cmaAdrjCodeEn = cmaAdrjCodeEn;
    }

    @Column(name = "CMAADREXTRA", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmaAdrExtra() {
        return cmaAdrExtra;
    }

    public void setCmaAdrExtra(String cmaAdrExtra) {
        this.cmaAdrExtra = cmaAdrExtra;
    }

    @Column(name = "CMAADRCOCODE", nullable = true, length = 50,insertable = true, updatable = true)
    public String getCmaAdrCocode() {
        return cmaAdrCocode;
    }

    public void setCmaAdrCocode(String cmaAdrCocode) {
        this.cmaAdrCocode = cmaAdrCocode;
    }

    @Column(name = "TEXTAREA_ADDRESS_TH", nullable = true, length = 2000,insertable = true, updatable = true)
    public String getTextAddressTh() {
        return textAddressTh;
    }

    public void setTextAddressTh(String textAddressTh) {
        this.textAddressTh = textAddressTh;
    }

    @Column(name = "TEXTAREA_ADDRESS_EN", nullable = true, length = 2000,insertable = true, updatable = true)
    public String getTextAddressEn() {
        return textAddressEn;
    }

    public void setTextAddressEn(String textAddressEn) {
        this.textAddressEn = textAddressEn;
    }

    @Column(name = "POST_CODE_TH", nullable = true, length = 6,insertable = true, updatable = true)
    public String getPostCodeTh() {
        return postCodeTh;
    }

    public void setPostCodeTh(String postCodeTh) {
        this.postCodeTh = postCodeTh;
    }

    @Column(name = "POST_CODE_EN", nullable = true, length = 6,insertable = true, updatable = true)
    public String getPostCodeEn() {
        return postCodeEn;
    }

    public void setPostCodeEn(String postCodeEn) {
        this.postCodeEn = postCodeEn;
    }

    @Column(name = "CMAADRTEL", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmaAdrTel() {
        return cmaAdrTel;
    }

    public void setCmaAdrTel(String cmaAdrTel) {
        this.cmaAdrTel = cmaAdrTel;
    }

    @Column(name = "WS_FAX", nullable = true, length = 100,insertable = true, updatable = true)
    public String getWsFax() {
        return wsFax;
    }

    public void setWsFax(String wsFax) {
        this.wsFax = wsFax;
    }

    @Column(name = "WS_NAME", nullable = true, length = 200,insertable = true, updatable = true)
    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    @Column(name = "WS_NAME_ORIGINAL", nullable = true, length = 200,insertable = true, updatable = true)
    public String getWsNameOriginal() {
        return wsNameOriginal;
    }

    public void setWsNameOriginal(String wsNameOriginal) {
        this.wsNameOriginal = wsNameOriginal;
    }

    @Column(name = "CMMWEBSITETH", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmmWebsiteTh() {
        return cmmWebsiteTh;
    }

    public void setCmmWebsiteTh(String cmmWebsiteTh) {
        this.cmmWebsiteTh = cmmWebsiteTh;
    }

    @Column(name = "CMW_BU_CODE", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmwBuCode() {
        return cmwBuCode;
    }

    public void setCmwBuCode(String cmwBuCode) {
        this.cmwBuCode = cmwBuCode;
    }

    @Column(name = "CMW_BU_DESC", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmwBuDesc() {
        return cmwBuDesc;
    }

    public void setCmwBuDesc(String cmwBuDesc) {
        this.cmwBuDesc = cmwBuDesc;
    }

    @Column(name = "CMWWEBOBJ", nullable = true, length = 30,insertable = true, updatable = true)
    public String getCmwWebObj() {
        return cmwWebObj;
    }

    public void setCmwWebObj(String cmwWebObj) {
        this.cmwWebObj = cmwWebObj;
    }
    
    @Column(name = "CMWWEBOBJ_CODE", nullable = true, length = 100,insertable = true, updatable = true)
    public String getCmwWebObjCode() {
        return cmwWebObjCode;
    }

    public void setCmwWebObjCode(String cmwWebObjCode) {
        this.cmwWebObjCode = cmwWebObjCode;
    }

    @Column(name = "CMWWEBEMAIL", nullable = true, length = 200,insertable = true, updatable = true)
    public String getCmwWebEmail() {
        return cmwWebEmail;
    }

    public void setCmwWebEmail(String cmwWebEmail) {
        this.cmwWebEmail = cmwWebEmail;
    }

    @Column(name = "WEBSERVER_REQUEST_USER", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebServerReqUser() {
        return webServerReqUser;
    }

    public void setWebServerReqUser(String webServerReqUser) {
        this.webServerReqUser = webServerReqUser;
    }

    @Column(name = "WEBSERVER_REQUEST_DATE", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebServerReqDate() {
        return webServerReqDate;
    }

    public void setWebServerReqDate(String webServerReqDate) {
        this.webServerReqDate = webServerReqDate;
    }

    @Column(name = "WEBSERVER_REQUEST_TIME", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebServerReqTime() {
        return webServerReqTime;
    }

    public void setWebServerReqTime(String webServerReqTime) {
        this.webServerReqTime = webServerReqTime;
    }
    
    @Column(name = "FLAG", nullable = false, length = 1,insertable = true, updatable = true)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    @Column(name = "create_date", unique = false ,columnDefinition = "DATETIME", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    
    
    
    
    
    
    

}
