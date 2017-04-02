/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app;

import com.arg.dbd.model.reg.CmMain;
import com.arg.dbd.model.reg.CmWebsiteDelivery;
import com.arg.dbd.model.reg.CmWebsiteOrder;
import com.arg.dbd.model.reg.CmWebsitePayment;
import com.arg.dbd.model.reg.WsRequestAdd;
import com.arg.dbd.model.reg.WsRequestUpdate;
import com.arg.dbd.model.reg.WsResult;
import com.baa.dbd.model.DbdRegReq;
import com.baa.dbd.model.reg.DbdDeliveryMap;
import com.baa.dbd.model.reg.DbdDeliveryRegistered;
import com.baa.dbd.model.reg.DbdGroupWebsiteMap;
import com.baa.dbd.model.reg.DbdGroupWebsiteRegistered;
import com.baa.dbd.model.reg.DbdPaymentMap;
import com.baa.dbd.model.reg.DbdPaymentRegistered;
import com.baa.dbd.model.reg.DbdPurchaseMap;
import com.baa.dbd.model.reg.DbdPurchaseRegistered;
import com.baa.dbd.model.reg.DbdRegisteredEmail;
import com.baa.dbd.model.reg.DbdRegisteredPhone;
import com.baa.dbd.model.reg.DbdRegisteredRequest;
import com.baa.dbd.model.reg.DbdUser;
import com.baa.dbd.model.reg.DbdUserGroup;
import com.baa.dbd.model.reg.DbdWebsiteMap;
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
 * 
 */
public class AddBL {
    private static Log LOG = LogFactory.getLog(AddBL.class);

    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Long STATUSAPPROVE = 8L;
    private static Long STATUSWEBSERVICE = 1L;
    private static boolean failStatus = Boolean.FALSE;
    private static boolean successStatus = Boolean.TRUE;
    
    
    
    public void addOrder(WsResult result,DbdRegisteredRequest reg, CmMain cmMain,List<CmWebsiteOrder> objs, Session session)
    {        
        int count = 1;
        for(CmWebsiteOrder dvr : objs)
        {
            Criteria criteria = session.createCriteria(DbdPurchaseMap.class);
            LOG.info("getCMWOORDCODE = "+dvr.getCMWOORDCODE());
            criteria.add(Restrictions.eq("purchaseId", new Long(dvr.getCMWOORDCODE()) ));
            List<DbdPaymentMap> lists = criteria.list();
            LOG.info("DbdPurchaseMap lists size = "+lists.size());
            DbdPurchaseRegistered obj = new DbdPurchaseRegistered();
            obj.setrId(reg.getRId());    
            obj.setPId((lists.size() > 0 ? new Integer(dvr.getCMWOORDCODE()):0));
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setOrdering(count++);
            obj.setUpdateDate(new Date());
            if(reg.getUserId() != null)
            {
                obj.setUserId(reg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public void addPayment(WsResult result,DbdRegisteredRequest reg, CmMain cmMain,List<CmWebsitePayment> objs, Session session)
    {        
        int count = 1;
        for(CmWebsitePayment dvr : objs)
        {
            if(dvr.getCMWPPAYCODE() != null)
            {
                Criteria criteria = session.createCriteria(DbdPaymentMap.class);
                LOG.info("getCMWPPAYCODE = "+dvr.getCMWPPAYCODE());
                criteria.add(Restrictions.eq("paymentId", new Long(dvr.getCMWPPAYCODE()) ));
                List<DbdPaymentMap> lists = criteria.list();
                LOG.info(" DbdPaymentMap lists size = "+lists.size());
                DbdPaymentRegistered obj = new DbdPaymentRegistered();
                obj.setrId(reg.getRId());    
                obj.setPId((lists.size() > 0 ? new Integer(dvr.getCMWPPAYCODE()):0));
                obj.setCreateDate(new Date());
                obj.setFlagInsert(1);           
                obj.setOrdering(count++);
                obj.setUpdateDate(new Date());
                if(reg.getUserId() != null)
                {
                    obj.setUserId(reg.getUserId().intValue());
                }
                session.save(obj);
            }
        }
    }
    
    public void addDelivery(WsResult result,DbdRegisteredRequest reg, CmMain cmMain,List<CmWebsiteDelivery> objs, Session session)
    {        
        for(CmWebsiteDelivery dvr : objs)
        {
            Criteria criteria = session.createCriteria(DbdDeliveryMap.class);
            LOG.info("getCMWDDELICODE = "+dvr.getCMWDDELICODE());
            criteria.add(Restrictions.eq("deliveryId", new Long(dvr.getCMWDDELICODE()) ));
            List<DbdPaymentMap> lists = criteria.list();
            LOG.info("DbdDeliveryMap lists size = "+lists.size());
            DbdDeliveryRegistered obj = new DbdDeliveryRegistered();
            obj.setrId(reg.getRId());    
            obj.setdId((lists.size() > 0 ? new Integer(dvr.getCMWDDELICODE()):0));
            obj.setCreateDate(new Date());
            obj.setFlagInsert(1);           
            obj.setDeliveryOther("");
            obj.setUpdateDate(new Date());
            if(reg.getUserId() != null)
            {
                obj.setUserId(reg.getUserId().intValue());
            }
            session.save(obj);
        }
    }
    
    public void addGroupWebsite(WsResult result,DbdRegisteredRequest reg, CmMain cmMain, Session session)
    {                
        DbdGroupWebsiteRegistered obj = new DbdGroupWebsiteRegistered();
        
        if(cmMain.getCMWBUCODE() != null)
        {
            obj.setOldID(cmMain.getCMMGENID());
            obj.setOrdering(1);
            obj.setPublished(true);
            obj.setrId(new Long(reg.getRId()));
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
            if(reg.getUserId() != null)
            {
                obj.setUserId(reg.getUserId().intValue());
            }
            session.save(obj);        
        }
    }
    
    public DbdUser addUser(WsResult result,DbdRegisteredRequest reg, DbdRegReq newReg, CmMain cmMain, Session session)
    {
        
        DbdUser obj = new DbdUser();                
        obj.setOldId(reg.getOldId());
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
        session.flush();
        LOG.info("user Obj ID = "+obj.getId());
        
        DbdUserGroup userGroup = new DbdUserGroup();
        userGroup.setUserId(obj.getId());
        userGroup.setGroupId(2L);
        session.save(userGroup);
        session.flush();
        return obj;
    }
    
    public DbdRegisteredEmail addEmail(WsResult result,DbdRegisteredRequest reg, CmMain cmMain , Session session)
    {        
        DbdRegisteredEmail email = new DbdRegisteredEmail();
        email.setrId(reg.getRId());
        email.setEmail(cmMain.getCMWWEBEMAIL());
        email.setCreateDate(new Date());
        email.setFlagInsert(1);
        email.setOldID(cmMain.getCMMGENID());
        email.setOrdering(1);
        email.setPublished(true);
        email.setUpdateDate(new Date());
        if(reg.getUserId() != null)
        {
            email.setUserId(reg.getUserId().intValue());
        }
        session.save(email);
        return email;
    }
    
    public void addPhone(WsResult result,DbdRegisteredRequest reg, CmMain cmMain , Session session)
    {             
        DbdRegisteredPhone obj = new DbdRegisteredPhone();
        obj.setrId(reg.getRId());
        obj.setPhone(cmMain.getCMAADRTEL());        
        obj.setCreateDate(new Date());
        obj.setFlagInsert(1);
        obj.setOldID(cmMain.getCMMGENID());
        obj.setOrdering(1);
        obj.setPublished(true);
        obj.setUpdateDate(new Date());
        if(reg.getUserId() != null)
        {
            obj.setUserId(reg.getUserId().intValue());
        }
        session.save(obj);
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
    
    public WsResult addRegis( WsRequestAdd in,DbdRegReq reg , Session session) throws ParseException
    {
        WsResult result = new WsResult();
        Criteria criteria = session.createCriteria(DbdRegisteredRequest.class);        	        
        criteria.add(Restrictions.eq("identificationNumber", reg.getIdentificationNumber()));
        criteria.add(Restrictions.eq("wsName", (reg.getWsName() != null?reg.getWsName().toLowerCase().trim():"")));
        criteria.add(Restrictions.ne("statusWebservice", 3L));
	List<DbdRegisteredRequest> lists =  criteria.list();
        LOG.info("---------------->addRegis check lists.isEmpty() "+lists.size());
        if(lists.isEmpty() && reg.getWsName() != null && !reg.getWsName().trim().isEmpty())
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
            req.setStatusApprove(STATUSAPPROVE);
            req.setStatusWebservice(STATUSWEBSERVICE);
            req.setCreateDate(new Date());
            if(in.getCmmain().getCMWWEBEMAIL() != null && !in.getCmmain().getCMWWEBEMAIL().trim().isEmpty())
            {            
                DbdUser user = addUser(result, req, reg, in.getCmmain(), session);
                req.setUserId(user.getId());
            }
            session.save(req);
            session.flush();
            LOG.info(req);
            
            if(in.getCmmain().getCMWWEBEMAIL() != null && !in.getCmmain().getCMWWEBEMAIL().trim().isEmpty())
            {
                addEmail(result, req, in.getCmmain(), session);
            }
            addPhone(result, req, in.getCmmain(), session);
            addPayment(result, req, in.getCmmain(), in.getWebsitePaymentlist(),session);
            addOrder(result, req, in.getCmmain(), in.getWebsiteOrderlist(), session);
            addDelivery(result, req, in.getCmmain(), in.getWebsiteDeliverylist(), session);
            addGroupWebsite(result, req, in.getCmmain(), session);                                                   
            result.setSuccessful(successStatus);            
            result.setMessageDescription(SUCCESS); 
            result.setMessageCode("1");                                
        }
        else
        {
            result.setSuccessful(successStatus);            
            result.setMessageDescription(SUCCESS); 
            result.setMessageCode("1");            
        }
        return result;
    }
}
