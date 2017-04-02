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
import java.util.function.Function;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noom
 * 
 */
public class UpdateNewBL {
    private static Log LOG = LogFactory.getLog(UpdateNewBL.class);
    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Long STATUSAPPROVE = 8L;
    private static Long STATUSWEBSERVICE = 2L;
    private static boolean failStatus = Boolean.FALSE;
    private static boolean successStatus = Boolean.TRUE;
    
    
    
    public void updateOrder(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain,List<CmWebsiteOrder> objs, Session session)
    {      
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
    
    public void updatePayment(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain,List<CmWebsitePayment> objs, Session session)
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
    
    public void updateDelivery(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain,List<CmWebsiteDelivery> objs, Session session)
    {     
        for(CmWebsiteDelivery dvr : objs)
        {
            Criteria criteria = session.createCriteria(DbdDeliveryMap.class);
            LOG.info("getCMWDDELICODE = "+dvr.getCMWDDELICODE());
            criteria.add(Restrictions.eq("deliveryId", new Long(dvr.getCMWDDELICODE()) ));
            List<DbdPaymentMap> lists = criteria.list();
            LOG.info("DbdDeliveryMap lists size = "+lists.size());
            DbdDeliveryRegistered obj = new DbdDeliveryRegistered();
            obj.setrId(newReg.getRId());    
            obj.setdId((lists.size() > 0 ? new Integer(dvr.getCMWDDELICODE()):0));
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
    
    public void updateGroupWebsite(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain, Session session)
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
    
    public DbdUser updateUser(WsResult result,DbdRegisteredRequest newReq, DbdRegReq newReg,  CmMain cmMain, Session session)
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
    
    public DbdRegisteredEmail updateEmail(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain , Session session)
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
    
    public void updatePhone(WsResult result,DbdRegisteredRequest newReg, CmMain cmMain , Session session)
    {
//        Criteria criteria = session.createCriteria(DbdRegisteredPhone.class);        	        
//        criteria.add(Restrictions.eq("rId", reg.getRId()));
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
    
    public WsResult updateRegis(WsRequestUpdate in, DbdRegReq reg , Session session) 
    {
        WsResult result = new WsResult();
        Criteria criteria = session.createCriteria(DbdRegisteredRequest.class);        	        
        criteria.add(Restrictions.eq("identificationNumber", reg.getIdentificationNumber()));
        criteria.add(Restrictions.eq("wsName", (reg.getWsName() != null?reg.getWsName().toLowerCase().trim():"")));
        criteria.add(Restrictions.ne("statusWebservice", 3L));
        criteria.setMaxResults(1);
        criteria.addOrder(Order.desc("oldId"));
    	List<DbdRegisteredRequest> lists =  criteria.list();
        LOG.info("size = "+lists.size());
        if(lists != null && !lists.isEmpty() && reg.getWsName() != null && !reg.getWsName().trim().isEmpty())
        {
            LOG.info("-----------------------> found record");
            lists.stream().map(new Function<DbdRegisteredRequest, DbdRegisteredRequest>() {
                @Override
                public DbdRegisteredRequest apply(DbdRegisteredRequest req) {
                    if(req.getWsName().equals(reg.getWsName()))
                    {
                        DbdRegisteredRequest newReq = (DbdRegisteredRequest)req.clone();
                        newReq.setRId(null);
                        newReq.setOldId(reg.getCmmGenId());
                        newReq.setIdentityCard(reg.getIdentityCard());
                        newReq.setRequestNo(reg.getReqNo());
                        newReq.setDateRegister(reg.getDateReg());
                        newReq.setRegisteredOfficeId(strToLong(reg.getRegOfficeId()));
                        if(reg.getRegOfficeId() != null)
                        {
                            RegOffice regOffice = session.get(RegOffice.class,strToLong(reg.getRegOfficeId()));
                            if(regOffice != null)
                            {
                                newReq.setRegisteredOfficeNameEn(regOffice.getDesEn());
                                newReq.setRegisteredOfficeNameLo(regOffice.getDesLo());
                            }
                        }
                        newReq.setComNameTh(reg.getCompanyNameTh());
                        newReq.setComNameEn(reg.getCompanyNameEn());
                        LOG.info("dbd_registered_request.getComNameEn() U ="+ newReq.getComNameEn());
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd",new Locale("th","TH"));
                        
                        Date commercialStartDate = null;
                        try {
                            commercialStartDate = dateFormat.parse(reg.getDateCommercialStart());
                            LOG.info("commercialStartDate = "+commercialStartDate);

                        } catch (ParseException ex) {
                            LOG.error(ex.getMessage(),ex);
                            commercialStartDate = null;
                        }
                        
                        newReq.setDateCommercialStart(commercialStartDate);
                        //req.setDateCommercialStart(reg.getDateCommercialStart());
                        newReq.setInvestmentAmount(reg.getInvestmentAmt());
                        newReq.setIdentificationNumber(reg.getIdentificationNumber());
                        newReq.setPrefixCommerceIdEn(strToInteger(reg.getCmmMgrTitleEn()));
                        newReq.setPrefixCommerceIdTh(strToInteger(reg.getCmmMgrTitleTh()));
                        newReq.setPrefixManageIdEn(strToInteger(reg.getCmmMgrTitleEn()));
                        newReq.setPrefixManageIdTh(strToInteger(reg.getCmmMgrTitleTh()));
                        newReq.setNameCommerceEn(reg.getNameCommerceEn());
                        newReq.setNameCommerceTh(reg.getNameCommerceTh());
                        newReq.setNameManageEn(reg.getNameManageEn());
                        newReq.setNameManageTh(reg.getNameManageTh());
                        newReq.setAddressNoEn(reg.getAddressNoEn());
                        newReq.setAddressNoTh(reg.getAddressNoTh());
                        newReq.setSquadEn(reg.getSquadEn());
                        newReq.setSquadTh(reg.getSquadTh());
                        //            req.setSquad1En(reg.getSquad1En());
                        //            req.setSquad1Th(reg.getSquad1Th());
                        newReq.setBuildingEn(reg.getBuildingEn());
                        newReq.setBuildingTh(reg.getBuildingTh());
                        newReq.setFloorEn(reg.getFloorEn());
                        newReq.setFloorTh(reg.getFloorTh());
                        newReq.setAlleyEn(reg.getAlleyEn());
                        newReq.setAlleyTh(reg.getAlleyTh());
                        newReq.setRoadEn(reg.getRoadEn());
                        newReq.setRoadTh(reg.getRoadTh());
                        newReq.setSubDistrictCodeEn(reg.getCmaAdrtCodeEn());
                        newReq.setSubDistrictCodeTh(reg.getCmaAdrtCodeTh());
                        newReq.setDistriceCodeEn(reg.getCmaAdraCodeEn());
                        newReq.setDistriceCodeTh(reg.getCmaAdraCodeTh());
                        newReq.setProviceCodeEn(reg.getCmaAdrjCodeEn());
                        newReq.setProviceCodeTh(reg.getCmaAdrjCodeTh());
                        newReq.setTextAddressEn(reg.getTextAddressEn());
                        newReq.setTextAddressTh(reg.getTextAddressTh());
                        newReq.setPostCodeEn(strToInteger(reg.getPostCodeEn()));
                        newReq.setPostCodeTh(strToInteger(reg.getPostCodeTh()));
                        newReq.setWsFox(reg.getWsFax());
                        
                        newReq.setWsName(reg.getWsName()!= null?reg.getWsName().toLowerCase():null);
                        newReq.setWsNameOriginal(reg.getWsNameOriginal());
                        newReq.setWsTypeId(strToLong(reg.getCmwWebObjCode()));
                        newReq.setTypeWebsite(strToLong(reg.getCmwWebObj()));
                        newReq.setWebReqDate(reg.getWebServerReqDate());
                        newReq.setWebReqTime(reg.getWebServerReqTime());
                        newReq.setWebReqUser(reg.getWebServerReqUser());
                        newReq.setDateInsert(new Date());
                        if("11".equals(in.getCmmain().getCMMOWNCODE())){
                            newReq.setTypePersonnel(1L);
                        }else{
                            newReq.setTypePersonnel(2L);
                        }
                        //                    req.setStatusVerfied("W"); ไม่แก้ไขข้อมูล เมื่อ update  ตาม comment 05/05/2016
                        newReq.setWhoFromType((reg.getWebServerReqUser()!= null && reg.getWebServerReqUser().toUpperCase().equals("SYSTEM"))?"อปท":"user");

                        newReq.setWsTypeDomain((reg.getWsName().toLowerCase().contains("facebook")
                                || reg.getWsName().toLowerCase().contains("instagram")
                                || reg.getWsName().toLowerCase().contains("line"))?"2":"1");

                        newReq.setWhoEditName("System");

                        newReq.setStatusApprove(STATUSAPPROVE);
                        newReq.setStatusWebservice(STATUSWEBSERVICE);

                        //                    req.setUpdateDate(new Date());

                        //                    DbdUser user = updateUser(result, req, reg, in.getCmmain(), session);
                        //                    if(user != null)
                        //                    {
                        //                        req.setUserId(user.getId());
                        //                    }ไม่แก้ไขข้อมูล เมื่อ update  ตาม comment 05/05/2016
                        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
                        try {
                            newReq.setDateEdit(format.parse(reg.getWebServerReqDate()+" "+newReq.getWebReqTime()));
                        } catch (ParseException ex) {
                            LOG.error(ex.getMessage()
                                    , ex);
                        }
                        if(in.getCmmain().getCMWWEBEMAIL() != null && !in.getCmmain().getCMWWEBEMAIL().trim().isEmpty())
                        {
                            DbdUser user = addUser(result, req, reg, in.getCmmain(), session);
                            newReq.setUserId(user.getId());
                        }
                        session.save(newReq);
                        session.flush();
                        updateEmail(result, newReq, in.getCmmain(), session);
                        updatePhone(result, newReq, in.getCmmain(), session);
                        updatePayment(result, newReq, in.getCmmain(), in.getWebsitePaymentlist(),session);
                        updateOrder(result, newReq, in.getCmmain(), in.getWebsiteOrderlist(), session);
                        updateDelivery(result, newReq, in.getCmmain(), in.getWebsiteDeliverylist(), session);
                        updateGroupWebsite(result, newReq, in.getCmmain(), session);
                    }
                    return req;
                }
            }).forEach((_item) -> {
                result.setSuccessful(successStatus);            
                result.setMessageDescription(SUCCESS); 
                result.setMessageCode("1");
            });                        
        }
        else
        {
            if(reg.getWsName() != null && !reg.getWsName().trim().isEmpty())
            {
                result.setSuccessful(successStatus);            
                result.setMessageDescription(SUCCESS); 
                result.setMessageCode("1");
            }
            else
            {
                result.setSuccessful(Boolean.FALSE);
                result.setMessageCode(null);
                result.setMessageDescription(FAILED);            
            }
            
        }
        return result;
    }

    public DbdUser addUser(WsResult result,DbdRegisteredRequest reg, DbdRegReq newReg, CmMain cmMain, Session session)
    {

        DbdUser obj = new DbdUser();
        obj.setOldId(newReg.getCmmGenId());
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
}
