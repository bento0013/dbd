/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baa.dbd.model.reg;

import com.arg.dbd.model.AbstractPojo;
import java.util.Date;
import java.util.Objects;
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
@Table(name = "dbd_registered_request")
public class DbdRegisteredRequest extends AbstractPojo{
    private Integer rId;
    private Long oldId;
    private String identityCard;
    private Long userId;
    private String requestNo;
    private String dateRegister;
    private Long registeredOfficeId;
    private String registeredOfficeNameLo;
    private String registeredOfficeNameEn;
    private String comNameTh;
    private String comNameEn;
    private Date dateCommercialStart;
    private String investmentAmount;
    private String identificationNumber;
    private Integer prefixCommerceIdTh;
    private Integer prefixCommerceIdEn;
    private String nameCommerceTh;
    private String nameCommerceEn;
    private Integer prefixManageIdTh;
    private Integer prefixManageIdEn;
    private String nameManageTh;
    private String nameManageEn;
    private String addressNoTh;
    private String addressNoEn;
    private String squadTh;
    private String buildingTh;
    private String floorTh;
    private String squad1Th;
    private String alleyTh;
    private String roadTh;
    private String squadEn;
    private String buildingEn;
    private String floorEn;
    private String squad1En;
    private String alleyEn;
    private String roadEn;
    private String subDistrictCodeEn;
    private String subDistrictCodeTh;
    private String districeCodeEn;
    private String districeCodeTh;
    private String proviceCodeEn;
    private String proviceCodeTh;
    private String textAddressTh;
    private String textAddressEn;
    private Integer postCodeTh;
    private Integer postCodeEn;
    private String wsFox;
    private String wsName;
    private String wsNameOriginal;
    private Long wsTypeId;
    private Long typeWebsite;
    private String webReqUser;
    private String webReqDate;
    private String webReqTime;
    private Date dateInsert;
    private Long typePersonnel;
    private String statusVerfied;
    private String whoFromType;
    private String wsTypeDomain;
    private String whoEditName;
    private Long statusApprove;
    private Long statusWebservice;
    private Date createDate;
    private Date updateDate;
    private Date dateEdit;
 


    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "R_ID", unique = false ,columnDefinition = "int", nullable = false)
    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }
    
    
    @Column(name = "oldID", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }
        
    @Column(name = "USER_ID", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    @Column(name = "IDENTITY_CARD", nullable = true, length = 50,insertable = true, updatable = true)
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Column(name = "REQUEST_NO", nullable = true, length = 50,insertable = true, updatable = true)
    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
   
    @Column(name = "DATE_REGISTER", nullable = true, length = 30,insertable = true, updatable = true)
    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }
    
    @Column(name = "REGISTERED_OFFICE_ID", unique = false ,columnDefinition = "bigint", nullable = false)
    public Long getRegisteredOfficeId() {
        return registeredOfficeId;
    }

    public void setRegisteredOfficeId(Long registeredOfficeId) {
        this.registeredOfficeId = registeredOfficeId;
    }

    @Column(name = "COMPANY_NAME_TH", nullable = true, length = 100,insertable = true, updatable = true)
    public String getComNameTh() {
        return comNameTh;
    }

    
    public void setComNameTh(String comNameTh) {
        this.comNameTh = comNameTh;
    }

    @Column(name = "COMPANY_NAME_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getComNameEn() {
        return comNameEn;
    }

    public void setComNameEn(String comNameEn) {
        this.comNameEn = comNameEn;
    }

    @Column(name = "DATE_COMMERCIAL_START", nullable = true, length = 30,insertable = true, updatable = true)
    public Date getDateCommercialStart() {
        return dateCommercialStart;
    }

    public void setDateCommercialStart(Date dateCommercialStart) {
        this.dateCommercialStart = dateCommercialStart;
    }

    @Column(name = "INVESTMENT_AMOUNT", nullable = true, length = 20,insertable = true, updatable = true)
    public String getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    @Column(name = "IDENTIFICATION_NUMBER", nullable = true, length = 50,insertable = true, updatable = true)
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Column(name = "P_PREFIX_COMMERCE_ID_TH", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getPrefixCommerceIdTh() {
        return prefixCommerceIdTh;
    }

    public void setPrefixCommerceIdTh(Integer prefixCommerceIdTh) {
        this.prefixCommerceIdTh = prefixCommerceIdTh;
    }

    @Column(name = "P_PREFIX_COMMERCE_ID_EN", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getPrefixCommerceIdEn() {
        return prefixCommerceIdEn;
    }

    public void setPrefixCommerceIdEn(Integer prefixCommerceIdEn) {
        this.prefixCommerceIdEn = prefixCommerceIdEn;
    }

    @Column(name = "NAME_COMMERCE_TH", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameCommerceTh() {
        return nameCommerceTh;
    }

    public void setNameCommerceTh(String nameCommerceTh) {
        this.nameCommerceTh = nameCommerceTh;
    }

    @Column(name = "NAME_COMMERCE_EN", nullable = true, length = 150,insertable = true, updatable = true)
    public String getNameCommerceEn() {
        return nameCommerceEn;
    }

    public void setNameCommerceEn(String nameCommerceEn) {
        this.nameCommerceEn = nameCommerceEn;
    }

    @Column(name = "P_PREFIX_MANAGE_ID_TH", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getPrefixManageIdTh() {
        return prefixManageIdTh;
    }

    public void setPrefixManageIdTh(Integer prefixManageIdTh) {
        this.prefixManageIdTh = prefixManageIdTh;
    }

    @Column(name = "P_PREFIX_MANAGE_ID_EN", unique = false ,columnDefinition = "int", nullable = true)
    
    public Integer getPrefixManageIdEn() {
        return prefixManageIdEn;
    }

    public void setPrefixManageIdEn(Integer prefixManageIdEn) {
        this.prefixManageIdEn = prefixManageIdEn;
    }

    @Column(name = "NAME_MANAGE_TH", nullable = true, length = 100,insertable = true, updatable = true)
    public String getNameManageTh() {
        return nameManageTh;
    }

    public void setNameManageTh(String nameManageTh) {
        this.nameManageTh = nameManageTh;
    }

    @Column(name = "NAME_MANAGE_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getNameManageEn() {
        return nameManageEn;
    }

    public void setNameManageEn(String nameManageEn) {
        this.nameManageEn = nameManageEn;
    }

    @Column(name = "ADDRESS_NO_TH", nullable = true, length = 100,insertable = true, updatable = true)
    public String getAddressNoTh() {
        return addressNoTh;
    }

    public void setAddressNoTh(String addressNoTh) {
        this.addressNoTh = addressNoTh;
    }

    @Column(name = "ADDRESS_NO_EN", nullable = true, length = 100,insertable = true, updatable = true)
    public String getAddressNoEn() {
        return addressNoEn;
    }

    public void setAddressNoEn(String addressNoEn) {
        this.addressNoEn = addressNoEn;
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

//    @Column(name = "SQUAD_TH1", nullable = true, length = 50,insertable = true, updatable = true)
//    public String getSquad1Th() {
//        return squad1Th;
//    }
//
//    public void setSquad1Th(String squad1Th) {
//        this.squad1Th = squad1Th;
//    }

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

//    @Column(name = "SQUAD1_EN", nullable = true, length = 50,insertable = true, updatable = true)
//    public String getSquad1En() {
//        return squad1En;
//    }
//
//    public void setSquad1En(String squad1En) {
//        this.squad1En = squad1En;
//    }

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

    @Column(name = "S_SUBDISTRICT_CODE_EN", nullable = true, length = 4,insertable = true, updatable = true)
    public String getSubDistrictCodeEn() {
        return subDistrictCodeEn;
    }

    public void setSubDistrictCodeEn(String subDistrictCodeEn) {
        this.subDistrictCodeEn = subDistrictCodeEn;
    }
    
    @Column(name = "S_SUBDISTRICT_CODE_TH", nullable = true, length = 4,insertable = true, updatable = true)
    public String getSubDistrictCodeTh() {
        return subDistrictCodeTh;
    }

    public void setSubDistrictCodeTh(String subDistrictCodeTh) {
        this.subDistrictCodeTh = subDistrictCodeTh;
    }

    @Column(name = "D_DISTRICT_CODE_EN", nullable = true, length = 3,insertable = true, updatable = true)
    public String getDistriceCodeEn() {
        return districeCodeEn;
    }

    public void setDistriceCodeEn(String districeCodeEn) {
        this.districeCodeEn = districeCodeEn;
    }
    
    @Column(name = "D_DISTRICT_CODE_TH", nullable = true, length = 3,insertable = true, updatable = true)
    public String getDistriceCodeTh() {
        return districeCodeTh;
    }

    public void setDistriceCodeTh(String districeCodeTh) {
        this.districeCodeTh = districeCodeTh;
    }  
    
    @Column(name = "P_PROVICE_CODE_TH", nullable = true, length = 2,insertable = true, updatable = true)
    public String getProviceCodeTh() {
        return proviceCodeTh;
    }

    public void setProviceCodeTh(String proviceCodeTh) {
        this.proviceCodeTh = proviceCodeTh;
    }

    @Column(name = "P_PROVICE_CODE_EN", nullable = true, length = 2,insertable = true, updatable = true)
    public String getProviceCodeEn() {
        return proviceCodeEn;
    }

    public void setProviceCodeEn(String proviceCodeEn) {
        this.proviceCodeEn = proviceCodeEn;
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

    @Column(name = "POST_CODE_TH", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getPostCodeTh() {
        return postCodeTh;
    }

    public void setPostCodeTh(Integer postCodeTh) {
        this.postCodeTh = postCodeTh;
    }

    @Column(name = "POST_CODE_EN", unique = false ,columnDefinition = "int", nullable = true)
    public Integer getPostCodeEn() {
        return postCodeEn;
    }

    public void setPostCodeEn(Integer postCodeEn) {
        this.postCodeEn = postCodeEn;
    }

    @Column(name = "WS_FAX", nullable = true, length = 100,insertable = true, updatable = true)
    public String getWsFox() {
        return wsFox;
    }

    public void setWsFox(String wsFox) {
        this.wsFox = wsFox;
    }

    @Column(name = "WS_NAME", nullable = true, length = 100,insertable = true, updatable = true)
    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    @Column(name = "WS_NAME_ORIGINAL", nullable = true, length = 100,insertable = true, updatable = true)
    public String getWsNameOriginal() {
        return wsNameOriginal;
    }

    public void setWsNameOriginal(String wsNameOriginal) {
        this.wsNameOriginal = wsNameOriginal;
    }

    @Column(name = "WS_TYPE_ID", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getWsTypeId() {
        return wsTypeId;
    }

    public void setWsTypeId(Long wsTypeId) {
        this.wsTypeId = wsTypeId;
    }

    @Column(name = "TYPE_WEBSITE", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getTypeWebsite() {
        return typeWebsite;
    }

    public void setTypeWebsite(Long typeWebsite) {
        this.typeWebsite = typeWebsite;
    }

    @Column(name = "WEBSERVER_REQUEST_USER", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebReqUser() {
        return webReqUser;
    }

    public void setWebReqUser(String webReqUser) {
        this.webReqUser = webReqUser;
    }

    @Column(name = "WEBSERVER_REQUEST_DATE", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebReqDate() {
        return webReqDate;
    }

    public void setWebReqDate(String webReqDate) {
        this.webReqDate = webReqDate;
    }

    @Column(name = "WEBSERVER_REQUEST_TIME", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWebReqTime() {
        return webReqTime;
    }

    public void setWebReqTime(String webReqTime) {
        this.webReqTime = webReqTime;
    }

    @Column(name = "date_insert", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getDateInsert() {
        return dateInsert;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    @Column(name = "TYPE_PERSONNEL", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getTypePersonnel() {
        return typePersonnel;
    }

    public void setTypePersonnel(Long typePersonnel) {
        this.typePersonnel = typePersonnel;
    }

    @Column(name = "STATUS_VERIFIED", nullable = true, length = 5,insertable = true, updatable = true)
    public String getStatusVerfied() {
        return statusVerfied;
    }

    public void setStatusVerfied(String statusVerfied) {
        this.statusVerfied = statusVerfied;
    }

    @Column(name = "WHO_FROM_TYPE", nullable = true, length = 50,insertable = true, updatable = true)
    public String getWhoFromType() {
        return whoFromType;
    }

    public void setWhoFromType(String whoFromType) {
        this.whoFromType = whoFromType;
    }

    @Column(name = "WS_TYPE_DOMAIN", nullable = true, length = 11,insertable = true, updatable = true)
    public String getWsTypeDomain() {
        return wsTypeDomain;
    }

    public void setWsTypeDomain(String wsTypeDomain) {
        this.wsTypeDomain = wsTypeDomain;
    }

    @Column(name = "STATUSAPPROVE", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getStatusApprove() {
        return statusApprove;
    }

    public void setStatusApprove(Long statusApprove) {
        this.statusApprove = statusApprove;
    }

    @Column(name = "STATUS_WEBSERVICE", unique = false ,columnDefinition = "bigint", nullable = true)
    public Long getStatusWebservice() {
        return statusWebservice;
    }

    public void setStatusWebservice(Long statusWebservice) {
        this.statusWebservice = statusWebservice;
    }

    @Column(name = "WHO_EDIT_NAME", nullable = true, length = 255,insertable = true, updatable = true)
    public String getWhoEditName() {
        return whoEditName;
    }

    public void setWhoEditName(String whoEditName) {
        this.whoEditName = whoEditName;
    }

    @Column(name = "DATECREATE", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Column(name = "DATEEDIT", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    @Column(name = "DATEUPDATE", unique = false ,columnDefinition = "DATETIME", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "REGISTERED_OFFICE_NAME_TH", nullable = true, length = 255,insertable = true, updatable = true)
    public String getRegisteredOfficeNameLo() {
        return registeredOfficeNameLo;
    }

    public void setRegisteredOfficeNameLo(String registeredOfficeNameLo) {
        this.registeredOfficeNameLo = registeredOfficeNameLo;
    }

    @Column(name = "REGISTERED_OFFICE_NAME_EN", nullable = true, length = 255,insertable = true, updatable = true)
    public String getRegisteredOfficeNameEn() {
        return registeredOfficeNameEn;
    }

    public void setRegisteredOfficeNameEn(String registeredOfficeNameEn) {
        this.registeredOfficeNameEn = registeredOfficeNameEn;
    }
    
    
    
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.rId);       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DbdRegisteredRequest other = (DbdRegisteredRequest) obj;        
        if (!Objects.equals(this.rId, other.rId)) {
            return false;
        }        
        return true;
    }
    
    
    
    
    
}
