/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app;

import static com.arg.dbd.app.ECMServiceBL.FAILED;
import static com.arg.dbd.app.UpdateNewBL.SUCCESS;
import com.arg.dbd.model.reg.CmMain;
import com.arg.dbd.model.reg.CmWebsiteDelivery;
import com.arg.dbd.model.reg.CmWebsiteOrder;
import com.arg.dbd.model.reg.CmWebsitePayment;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsResult;
import com.baa.dbd.model.DbdRegReq;
import com.baa.dbd.model.reg.DbdDeliveryRegistered;
import com.baa.dbd.model.reg.DbdGroupWebsiteMap;
import com.baa.dbd.model.reg.DbdGroupWebsiteRegistered;
import com.baa.dbd.model.reg.DbdPaymentRegistered;
import com.baa.dbd.model.reg.DbdPurchaseRegistered;
import com.baa.dbd.model.reg.DbdRegisteredEmail;
import com.baa.dbd.model.reg.DbdRegisteredPhone;
import com.baa.dbd.model.reg.DbdRegisteredRequest;
import com.baa.dbd.model.reg.DbdUser;
import com.baa.dbd.model.reg.DbdUserGroup;
import com.baa.dbd.model.reg.RegOffice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noom
 */
public class CancelNewBL {
    private static Log LOG = LogFactory.getLog(CancelNewBL.class);
    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Long CANCEL_STATUSAPPROVE = 8L;
    private static Long CANCEL_STATUSWEBSERVICE =   3L;
    private static boolean failStatus = Boolean.FALSE;
    private static boolean successStatus = Boolean.TRUE;
    
    
    public void cancelOrder(WsResult result,DbdRegisteredRequest newReg,DbdRegisteredRequest oldReg, CmMain cmMain,List<CmWebsiteOrder> objs, Session session)
    {      
        Criteria criteria = session.createCriteria(DbdPurchaseRegistered.class);        	        
        criteria.add(Restrictions.eq("rId", oldReg.getRId()));
	List<DbdPurchaseRegistered> lists =  criteria.list();
        if(lists != null && !lists.isEmpty())
        {
            lists.stream().map((req) -> {     
                session.delete(req);
                return req;
            }).forEach((_item) -> {
                
            });                        
        }  
        int count = 1;
        for(CmWebsiteOrder dvr : objs)
        {
            DbdPurchaseRegistered obj = new DbdPurchaseRegistered();
            obj.setrId(newReg.getRId());    
            obj.setPId(new Integer(dvr.getCMWOORDCODE()));
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setOrdering(count++);
            obj.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                obj.setUserId(newReg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public void cancelPayment(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain,List<CmWebsitePayment> objs, Session session)
    {        
        int count = 1;
        for(CmWebsitePayment dvr : objs)
        {
            DbdPaymentRegistered obj = new DbdPaymentRegistered();
            obj.setrId(newReg.getRId());    
            obj.setPId(new Integer(dvr.getCMWPPAYCODE()));
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setOrdering(count++);
            obj.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                obj.setUserId(newReg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public void cancelDelivery(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain,List<CmWebsiteDelivery> objs, Session session)
    {     
        for(CmWebsiteDelivery dvr : objs)
        {
            DbdDeliveryRegistered obj = new DbdDeliveryRegistered();
            obj.setrId(newReg.getRId());    
            obj.setdId(new Integer(dvr.getCMWDDELICODE()));
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setDeliveryOther("");
            obj.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                obj.setUserId(newReg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public void cancelGroupWebsite(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain, Session session)
    {       
        
        DbdGroupWebsiteRegistered obj = new DbdGroupWebsiteRegistered();
        if(cmMain.getCMWBUCODE() != null)
        {
            obj.setOldID(cmMain.getCMMGENID());
            obj.setOrdering(1);
            obj.setPublished(true);
            obj.setrId(new Long(newReg.getRId()));
            Criteria criteriaMap = session.createCriteria(DbdGroupWebsiteMap.class);
            criteriaMap.add(Restrictions.eq("webId", Long.parseLong(cmMain.getCMWBUCODE())));
            DbdGroupWebsiteMap map = (DbdGroupWebsiteMap)criteriaMap.setMaxResults(1).uniqueResult();
            if(map == null)
            {
                return;
            }
            obj.setwId(new Long(map.getGroupwsId()));   
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setwOther("");
            obj.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                obj.setUserId(newReg.getUserId().intValue());
            }
            session.save(obj);   
        }
    }
    
    public DbdUser cancelUser(WsResult result,DbdRegisteredRequest newReq, DbdRegReq newReg,  CmMain cmMain, Session session)
    {
//        Criteria criteria = session.createCriteria(DbdUser.class);        	        
//        criteria.add(Restrictions.eq("oldId", newReq.getRId()));
//	List<DbdUser> lists =  criteria.list();
//        if(lists != null && !lists.isEmpty())
//        {
//            lists.stream().map((DbdUser req) -> { 
//                Criteria criteriaUser = session.createCriteria(DbdUserGroup.class);        	        
//                criteriaUser.add(Restrictions.eq("userId", req.getId()));
//                List<DbdUserGroup> listUsers =  criteriaUser.list();
//                listUsers.stream().forEach((userGroup) -> {
//                    session.delete(userGroup);
//                    
//                });
//                session.delete(req);
//                session.flush();
//                return req;
//            }).forEach((_item) -> {
//                
//            });                        
//        }   
        DbdUser obj = null;
        if(cmMain.getCMWWEBEMAIL() != null && !cmMain.getCMWWEBEMAIL().trim().isEmpty())
        {
            obj = new DbdUser();
            obj.setOldId(newReq.getOldId());
            obj.setActivation("1");
            obj.setRegisterDate(new Date());
            obj.setSendEmail(1);
            obj.setBlock(0);
            obj.setDate_insert(new Date());
            obj.setEmail(cmMain.getCMWWEBEMAIL());
            obj.setFlag_insert(1);
            obj.setLastvisitDate(new Date());
            obj.setOtep("1");
            obj.setPassword("$2y$10$ze0BcmlL1UzueZTwtf9EG.9MYXbEOSy6jTaX6BrUy3lhkzGhCqPLe");
            obj.setName(newReg.getNameCommerceTh());
            obj.setRequireReset(0);
            obj.setOtpKey("xxx");
            obj.setPassword_decode("xxx");
            obj.setResetCount(0);
            obj.setUsername(cmMain.getCMWWEBEMAIL());
            obj.setRegId(0);        
            obj.setDate_insert(new Date());
            obj.setFlag_insert(1);
            obj.setLastResetTime(new Date());       
            session.save(obj);      

            DbdUserGroup userGroup = new DbdUserGroup();
            userGroup.setUserId(obj.getId());
            userGroup.setGroupId(2L);
            session.save(userGroup);
            session.flush();
        }
        
        return obj;
    }
    
    public DbdRegisteredEmail cancelEmail(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain , Session session)
    {
//        Criteria criteria = session.createCriteria(DbdRegisteredEmail.class);        	        
//        criteria.add(Restrictions.eq("rId", reg.getRId()));
//	List<DbdRegisteredEmail> lists =  criteria.list();
//        if(lists != null && !lists.isEmpty())
//        {
//            lists.stream().map((req) -> {     
//                session.delete(req);
//                return req;
//            }).forEach((_item) -> {
//                
//            });                        
//        }         
        
        DbdRegisteredEmail email = new DbdRegisteredEmail();
        if(cmMain.getCMWWEBEMAIL() != null)
        {            
            email.setrId(newReg.getRId());
            email.setEmail(cmMain.getCMWWEBEMAIL());
            email.setCreateDate(new Date());
            email.setFlagInsert(1);
            email.setOldID(cmMain.getCMMGENID());
            email.setOrdering(1);
            email.setPublished(true);
            email.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                email.setUserId(newReg.getUserId().intValue());
            }
            session.save(email);
        }
        return email;
    }
    
    public void cancelPhone(WsResult result,DbdRegisteredRequest newReg,DbdRegisteredRequest oldReg, CmMain cmMain , Session session)
    {
//        Criteria criteria = session.createCriteria(DbdRegisteredPhone.class);        	        
//        criteria.add(Restrictions.eq("rId", oldReg.getRId()));
//	List<DbdRegisteredPhone> lists =  criteria.list();
//        if(lists != null && !lists.isEmpty())
//        {
//            lists.stream().map((req) -> {     
//                session.delete(req);
//                return req;
//            }).forEach((_item) -> {
//                
//            });                        
//        }       
        
        DbdRegisteredPhone obj = new DbdRegisteredPhone();
        if(cmMain.getCMAADRTEL() != null)
        {
            obj.setrId(newReg.getRId());
            obj.setPhone(cmMain.getCMAADRTEL());        
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);
            obj.setOldID(cmMain.getCMMGENID());
            obj.setOrdering(1);
            obj.setPublished(true);
            obj.setUpdateDate(new Date());
            if(newReg.getUserId() != null)
            {
                obj.setUserId(newReg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public WsResult cancelRegis( WsRequestCancel in ,DbdRegReq reg , Session session)
    {
        WsResult result = new WsResult();
       
        if( reg.getWsName() != null && !reg.getWsName().trim().isEmpty())
        {
            DbdRegisteredRequest req = new DbdRegisteredRequest();
            req.setOldId(reg.getCmmGenId());
            req.setIdentityCard(reg.getIdentityCard());
            req.setRequestNo(reg.getReqNo());
            req.setDateRegister(reg.getDateReg());
            req.setRegisteredOfficeId(strToLong(reg.getRegOfficeId()));
            if(reg.getRegOfficeId() != null)
            { 
                RegOffice regOffice = session.get(RegOffice.class,strToLong(reg.getRegOfficeId()));
                if(regOffice != null)
                {
                    req.setRegisteredOfficeNameEn(regOffice.getDesEn());
                    req.setRegisteredOfficeNameLo(regOffice.getDesLo());
                }
            }            
            req.setComNameTh(reg.getCompanyNameTh());
            req.setComNameEn(reg.getCompanyNameEn());
            LOG.info("dbd_registered_request.getComNameEn() A ="+ req.getComNameEn());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd",new Locale("th","TH"));            
            Date commercialStartDate = null;
            try {
                commercialStartDate = dateFormat.parse(reg.getDateCommercialStart());
                LOG.info("commercialStartDate = "+commercialStartDate);

            } catch (ParseException ex) {
                LOG.error(ex.getMessage(),ex);
                commercialStartDate = null;
            }            
            
            req.setDateCommercialStart(commercialStartDate);
            req.setInvestmentAmount(reg.getInvestmentAmt());
            req.setIdentificationNumber(reg.getIdentificationNumber());
            req.setPrefixCommerceIdEn(strToInteger(reg.getCmmMgrTitleEn()));
            req.setPrefixCommerceIdTh(strToInteger(reg.getCmmMgrTitleTh()));
            req.setPrefixManageIdEn(strToInteger(reg.getCmmMgrTitleEn()));
            req.setPrefixManageIdTh(strToInteger(reg.getCmmMgrTitleTh()));
            req.setNameCommerceEn(reg.getNameCommerceEn());
            req.setNameCommerceTh(reg.getNameCommerceTh());
            req.setNameManageEn(reg.getNameManageEn());
            req.setNameManageTh(reg.getNameManageTh());
            req.setAddressNoEn(reg.getAddressNoEn());
            req.setAddressNoTh(reg.getAddressNoTh());
            req.setSquadEn(reg.getSquadEn());
            req.setSquadTh(reg.getSquadTh());
//            req.setSquad1En(reg.getSquad1En());
//            req.setSquad1Th(reg.getSquad1Th());
            req.setBuildingEn(reg.getBuildingEn());
            req.setBuildingTh(reg.getBuildingTh());
            req.setFloorEn(reg.getFloorEn());
            req.setFloorTh(reg.getFloorTh());
            req.setAlleyEn(reg.getAlleyEn());
            req.setAlleyTh(reg.getAlleyTh());
            req.setRoadEn(reg.getRoadEn());
            req.setRoadTh(reg.getRoadTh());
            req.setSubDistrictCodeEn(reg.getCmaAdrtCodeEn());
            req.setSubDistrictCodeTh(reg.getCmaAdrtCodeTh());
            req.setDistriceCodeEn(reg.getCmaAdraCodeEn());
            req.setDistriceCodeTh(reg.getCmaAdraCodeTh());
            req.setProviceCodeEn(reg.getCmaAdrjCodeEn());
            req.setProviceCodeTh(reg.getCmaAdrjCodeTh());                     
            req.setTextAddressEn(reg.getTextAddressEn());
            req.setTextAddressTh(reg.getTextAddressTh());
            req.setPostCodeEn(strToInteger(reg.getPostCodeEn()));
            req.setPostCodeTh(strToInteger(reg.getPostCodeTh()));
            req.setWsFox(reg.getWsFax());
            req.setWsName(reg.getWsName()!= null?reg.getWsName().toLowerCase():null);
            req.setWsNameOriginal(reg.getWsNameOriginal());                                               
            req.setWsTypeId(strToLong(reg.getCmwWebObjCode()));            
            req.setTypeWebsite(strToLong(reg.getCmwWebObj())); 
            req.setWebReqDate(reg.getWebServerReqDate());
            req.setWebReqTime(reg.getWebServerReqTime());
            req.setWebReqUser(reg.getWebServerReqUser());
            req.setDateInsert(new Date());                    
            if("11".equals(in.getCmmain().getCMMOWNCODE())){
                req.setTypePersonnel(1L);
            }else{
                req.setTypePersonnel(2L);
            }
            req.setStatusVerfied("W");
            req.setWhoFromType((reg.getWebServerReqUser()!= null && reg.getWebServerReqUser().toUpperCase().equals("SYSTEM"))?"อปท":"user");

            req.setWsTypeDomain((reg.getWsName().toLowerCase().contains("facebook")
                    || reg.getWsName().toLowerCase().contains("instagram")
                    || reg.getWsName().toLowerCase().contains("line"))?"2":"1");     
            req.setWhoEditName("System");                        
            req.setStatusApprove(CANCEL_STATUSAPPROVE);
            req.setStatusWebservice(CANCEL_STATUSWEBSERVICE);
            req.setCreateDate(new Date());                                                             
            result.setSuccessful(successStatus);            
            result.setMessageDescription(SUCCESS); 
            result.setMessageCode("1");                                
        }
        else
        {
            result.setSuccessful(failStatus);            
            result.setMessageDescription(SUCCESS); 
            result.setMessageCode("1");            
        }        
        return result;
    }
    
    public Long strToLong(String data)
    {
        Long result = 0L;
        try
        {
            result = new Long(data);
        }
        catch(Exception e)
        {
            result = 0L;
        }
        return result;
    }
    
    public Integer strToInteger(String data)
    {
        Integer result = 0;
        try
        {
            result = new Integer(data);
        }
        catch(Exception e)
        {
            result = null;
        }
        return result;
    }
}
