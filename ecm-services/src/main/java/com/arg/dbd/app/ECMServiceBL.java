/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app;

import com.arg.dbd.model.reg.CmMain;
import com.arg.dbd.model.reg.CmObjective;
import com.arg.dbd.model.reg.CmWebsiteDelivery;
import com.arg.dbd.model.reg.CmWebsiteOrder;
import com.arg.dbd.model.reg.CmWebsitePayment;
import com.arg.dbd.model.reg.CmWebsiteRule;
import com.arg.dbd.model.reg.WsRequestAdd;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsRequestDelete;
import com.arg.dbd.model.reg.WsRequestUpdate;
import com.arg.dbd.model.reg.WsResult;
import com.baa.dbd.model.DbdRegDvrReq;
import com.baa.dbd.model.DbdRegObjReq;
import com.baa.dbd.model.DbdRegOrdReq;
import com.baa.dbd.model.DbdRegPayReq;
import com.baa.dbd.model.DbdRegReq;
import com.baa.dbd.model.DbdRegRulReq;
import com.baa.dbd.model.reg.DbdRegisteredEmail;
import com.baa.dbd.model.reg.DbdRegisteredRequest;
import com.bba.hibernate.HibernateUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noom
 */
public class ECMServiceBL {
    private static Log LOG = LogFactory.getLog(ECMServiceBL.class);
    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Long CANCEL_STATUSAPPROVE = 8L;
    private static Long CANCEL_STATUSWEBSERVICE = 3L;
    private static boolean failStatus = Boolean.FALSE;
    private static boolean successStatus = Boolean.TRUE;
    
    public WsResult sendAdd(WsRequestAdd in)
    {       
        LOG.info("ECMServiceBL sendAdd");
        LOG.info("ECMServiceBL CMMGENID = "+in.getCmmain().getCMMGENID());
        String messageCode = "";
        Boolean sucFlag  = successStatus;
        String description = SUCCESS;
        Session session = HibernateUtil.getSessionFactory().openSession();

        
        try
        {
            session.beginTransaction();
            DbdRegReq reg = addMain(in.getCmmain(),"A", session);
            addDeliveries(in.getWebsiteDeliverylist(),in.getCmmain(), session);
            addOrders(in.getWebsiteOrderlist(), in.getCmmain(), session);
            addPayments(in.getWebsitePaymentlist(), in.getCmmain(), session);
            addRules(in.getWebsiteRulelist(),in.getCmmain(), session);            
            addObjs(in.getObjectivelist(),in.getCmmain(), session);            
            AddBL add = new AddBL();
            WsResult result =  add.addRegis(in, reg, session);            
            session.getTransaction().commit();
            LOG.info("Add Done by CMMGENID = "+in.getCmmain().getCMMGENID());
            messageCode = result.getMessageCode();
            description=result.getMessageDescription();
            sucFlag  = result.isSuccessful();
        }
        catch(Exception e)
        {
            LOG.error(e.getMessage(),e);
            LOG.info("Errro by CMMGENID = "+in.getCmmain().getCMMGENID());
            description=FAILED;
            sucFlag  = failStatus;            
            session.getTransaction().rollback();
        }           
        finally
        {
            session.close();
        }
        
        return createResult(messageCode,sucFlag,description);
    }
    
    public WsResult sendUpdate(WsRequestUpdate in)
    {       
        LOG.info("ECMServiceBL sendUpdate");
        LOG.info("ECMServiceBL CMMGENID = "+in.getCmmain().getCMMGENID());
        String messageCode = "";
        Boolean sucFlag  = successStatus;
        String description = SUCCESS;
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        try
        {
            DbdRegReq reg = addMain(in.getCmmain(),"U", session);
            addDeliveries(in.getWebsiteDeliverylist(),in.getCmmain(), session);
            addOrders(in.getWebsiteOrderlist(), in.getCmmain(), session);
            addPayments(in.getWebsitePaymentlist(), in.getCmmain(), session);
            addRules(in.getWebsiteRulelist(),in.getCmmain(), session);
            addObjs(in.getObjectivelist(),in.getCmmain(), session);
            session.getTransaction().commit();
            session.beginTransaction();
            UpdateNewBL update = new UpdateNewBL();
            WsResult result =  update.updateRegis(in, reg, session);
            LOG.info("Update Done by CMMGENID = "+in.getCmmain().getCMMGENID());
            session.getTransaction().commit();
            messageCode = result.getMessageCode();
            description=result.getMessageDescription();
            sucFlag  = result.isSuccessful();
        }
        catch(Exception e)
        {
            LOG.error(e.getMessage(),e);
            LOG.info("Update Error by CMMGENID = "+in.getCmmain().getCMMGENID());
            description=FAILED;
            sucFlag  = failStatus;            
            session.getTransaction().rollback();
        }           
        finally
        {
            session.close();
        }
        
        return createResult(messageCode,sucFlag,description);
    }   
    
    public WsResult sendDelete(WsRequestDelete in)
    {       
        LOG.info("ECMServiceBL sendDelete");
        LOG.info("ECMServiceBL CMMGENID = "+in.getCmmain().getCMMGENID());
        String messageCode = "";
        Boolean sucFlag  = successStatus;
        String description = SUCCESS;
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        try
        {
            addMain(in.getCmmain(), "D", session);            
            session.getTransaction().commit();
            session.beginTransaction();
            LOG.info("Delete Done by CMMGENID = "+in.getCmmain().getCMMGENID());
            session.getTransaction().commit();
            messageCode = "1";
        }
        catch(Exception e)
        {
            LOG.error(e.getMessage(),e);
            LOG.info("Delete Error by CMMGENID = "+in.getCmmain().getCMMGENID());
            description=FAILED;
            sucFlag  = failStatus;           
            session.getTransaction().rollback();
        }           
        finally
        {
            session.close();
        }
        
        return createResult(messageCode,sucFlag,description);
    }   
    
    public WsResult sendCancel(WsRequestCancel in)
    {       
        LOG.info("ECMServiceBL sendCancel");
        LOG.info("ECMServiceBL CMMGENID = "+in.getCmmain().getCMMGENID());
        String messageCode = "";
        Boolean sucFlag  = successStatus;
        String description = SUCCESS;
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        try
        {
            DbdRegReq reg = addMain(in.getCmmain(),"C", session); 
            session.getTransaction().commit();
            session.beginTransaction();
//            CancelBL cancel = new CancelBL();
            CancelNewBL cancel = new CancelNewBL();
            WsResult result = cancel.cancelRegis( in, reg, session);
            LOG.info("Cancel Done by CMMGENID = "+in.getCmmain().getCMMGENID());
            session.getTransaction().commit();
            messageCode = result.getMessageCode();
            description=result.getMessageDescription();
            sucFlag  = result.isSuccessful();
        }
        catch(Exception e)
        {
            LOG.error(e.getMessage(),e);
            LOG.info("Cancel Error by CMMGENID = "+in.getCmmain().getCMMGENID());
            description=FAILED;
            sucFlag  = failStatus;
            session.getTransaction().rollback();
        }           
        finally
        {
            session.close();
        }
        
        return createResult(messageCode,sucFlag,description);
    }   
    
    
            
   
    
    public DbdRegReq addMain(CmMain cmMain, String flag, Session session ) throws UnsupportedEncodingException, IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
//        CmMain cmMain = in.getCmmain();
        
        displayValue(cmMain);
        DbdRegReq req = new DbdRegReq();
        req.setCmmGenId(new Long(cmMain.getCMMGENID().toString()));
        req.setIdentityCard(cmMain.getCMMNO());
        req.setRegReqEst(cmMain.getCMMREQEST());
        req.setReqNo(cmMain.getREQNO());
        req.setReqSDate(cmMain.getREQSDATE());
        req.setDateReg(cmMain.getREQRDATE());
        req.setReqTPCode(cmMain.getREQTPCODE());
        req.setReqCHGDesc(cmMain.getREQCHGDESC());
        req.setRegOfficeId(cmMain.getREQCMMOFFCODE());
        /*req.setReqUserTitle(cmMain.get);*/
        /*req.setReqUserName(cmMain.getCM);*/
        req.setCmmOwnCode(cmMain.getCMMOWNCODE());
        req.setCompanyNameEn(cmMain.getCMMNAMEEN());
        LOG.info("dbd_reg_req.getCompanyNameEn() = "+req.getCompanyNameEn());
        req.setCompanyNameTh(cmMain.getCMMNAMETH());
        req.setDateCommercialStart(cmMain.getCMMSTDATE());
        req.setCmmEnDate(cmMain.getCMMENDATE());
        req.setInvestmentAmt((cmMain.getCMMCAP() != null)?cmMain.getCMMCAP().toString():null);
        req.setCmmStat(cmMain.getCMMSTAT());
        req.setIdentificationNumber(cmMain.getCMMOWNID());
        req.setCmmOwnTaxId(cmMain.getCMMOWNTAXID());
        req.setCmmOwnTitleTh(cmMain.getCMMOWNTITLENM());        
        req.setCmmOwnTitleEn(cmMain.getCMMOWNTITLEEN());
        req.setNameCommerceTh(cmMain.getCMMOWNFIRSTNAME());
        req.setNameCommerceEn(cmMain.getCMMOWNFIRSTNAMEEN());
        req.setCmmMgrId(cmMain.getCMMMGRID());
        req.setCmmMgrTitleTh(cmMain.getCMMMGRTITLE());
        req.setCmmMgrTitleEn(cmMain.getCMMMGRTITLE());
        req.setNameManageTh(cmMain.getCMMMGRFIRSTNAME());
        req.setNameManageEn(cmMain.getCMMMGRFIRSTNAMEEN());
        req.setAddressNoTh(cmMain.getCMAADRHNO());
        req.setAddressNoEn(cmMain.getCMAADRHNO());
        req.setSquadTh(cmMain.getCMAADRMOO());
        req.setSquadEn(cmMain.getCMAADRMOO());
        req.setBuildingTh(cmMain.getCMAADRBLD());        
        req.setBuildingEn(cmMain.getCMAADRBLD());
        req.setFloorTh(cmMain.getCMAADRBLDFL());
        req.setFloorEn(cmMain.getCMAADRBLDFL());
        req.setCmaAdrBldNoTh(cmMain.getCMAADRBLDNO());        
        req.setCmaAdrBldNoEn(cmMain.getCMAADRBLDNO());
        req.setSquad1Th(cmMain.getCMAADRVILLAGE());
        req.setSquad1En(cmMain.getCMAADRVILLAGE());
        req.setCmaAdrTrokTh(cmMain.getCMAADRTROK());
        req.setCmaAdrTrokEn(cmMain.getCMAADRTROK());
        req.setAlleyTh(cmMain.getCMAADRSOI());
        req.setAlleyEn(cmMain.getCMAADRSOI());
        req.setRoadTh(cmMain.getCMAADRROAD());        
        req.setRoadEn(cmMain.getCMAADRROAD());
        req.setCmaAdrtCodeTh(cmMain.getCMAADRTCODE());
        req.setCmaAdrtCodeEn(cmMain.getCMAADRTCODE());
        req.setCmaAdraCodeTh(cmMain.getCMAADRACODE());
        req.setCmaAdraCodeEn(cmMain.getCMAADRACODE());
        req.setCmaAdrjCodeTh(cmMain.getCMAADRJCODE());
        req.setCmaAdrjCodeEn(cmMain.getCMAADRJCODE());
        req.setCmaAdrExtra(cmMain.getCMAADREXTRA());
        req.setCmaAdrCocode(cmMain.getCMAADRCOCODE());
        req.setTextAddressTh(cmMain.getCMAADRDISP());
        req.setTextAddressEn(cmMain.getCMAADRDISPEN());
        req.setPostCodeTh(cmMain.getCMAADRPOST());
        req.setPostCodeEn(cmMain.getCMAADRPOST());
        req.setCmaAdrTel(cmMain.getCMAADRTEL());
        req.setWsFax(cmMain.getCMAADRFAX());
        req.setWsName(cmMain.getCMMWEBSITEEN());
        req.setWsNameOriginal(cmMain.getCMMWEBSITEEN());
        req.setCmmWebsiteTh(cmMain.getCMMWEBSITE());
        req.setCmwBuCode(cmMain.getCMWBUCODE());
        req.setCmwBuDesc(cmMain.getCMWBUDESC());
        req.setCmwWebObj(cmMain.getCMWWEBOBJ());
        req.setCmwWebObjCode(cmMain.getCMWWEBOBJ_CODE());
        req.setCmwWebEmail(cmMain.getCMWWEBEMAIL());
        req.setWebServerReqUser(cmMain.getWEBSERVERREQUESTUSER());
        req.setWebServerReqDate(cmMain.getWEBSERVERREQUESTDATE());
        req.setWebServerReqTime(cmMain.getWEBSERVERREQUESTTIME());
        req.setFlag(flag);
        req.setCreateDate(new Date());
        
        
        session.save(req);
        return req;
    }
    public void addDeliveries(List<CmWebsiteDelivery> cmDvrs, CmMain cmMain, Session session )
    {
//        List<CmWebsiteDelivery> cmDvrs = in.getWebsiteDeliverylist();
        cmDvrs.stream().map((cmDvr) -> {
            DbdRegDvrReq dvrReq = new DbdRegDvrReq();            
            dvrReq.setCmwoDeliCode(cmDvr.getCMWDDELICODE());
            dvrReq.setCmwoDeliDesc(cmDvr.getCMWDDELIDESC());
            dvrReq.setCmmGenId(new BigInteger(cmMain.getCMMGENID().toString()));
            LOG.debug("dvrReq = " + dvrReq);
            return dvrReq;
        }).forEach((dvrReq) -> {
            session.save(dvrReq);
        });
    }
    
    public void addPayments(List<CmWebsitePayment> cmPays, CmMain cmMain, Session session )
    {
//        List<CmWebsitePayment> cmPays = in.getWebsitePaymentlist();
        cmPays.stream().map((cmPay) -> {
            DbdRegPayReq payReq = new DbdRegPayReq();           
            payReq.setCmwoPayCode(cmPay.getCMWPPAYCODE());
            payReq.setCmwoPayDesc(cmPay.getCMWPPAYDESC());
            payReq.setCmmGenId(new BigInteger(cmMain.getCMMGENID().toString()));
            LOG.debug("payReq = " + payReq);
            return payReq;
        }).forEach((payReq) -> {
            session.save(payReq);
        });
    }
    
    public void addRules(List<CmWebsiteRule> cmRules , CmMain cmMain, Session session )
    {
//        List<CmWebsiteRule> cmRules = in.getWebsiteRulelist();
        cmRules.stream().map((cmRule) -> {
            DbdRegRulReq rulReq = new DbdRegRulReq();           
            rulReq.setCmwrRuleCode(cmRule.getCMWRRULECODE());            
            rulReq.setCmmGenId(new BigInteger(cmMain.getCMMGENID().toString()));
            LOG.debug("rulReq = " + rulReq);
            return rulReq;
        }).forEach((payReq) -> {
            session.save(payReq);
        });
    }
    
    public void addOrders(List<CmWebsiteOrder> cmOrds, CmMain cmMain, Session session )
    {
//        List<CmWebsiteOrder> cmOrds = in.getWebsiteOrderlist();
        cmOrds.stream().map((cmOrd) -> {
            DbdRegOrdReq ordReq = new DbdRegOrdReq();           
            ordReq.setCmwoOrdCode(cmOrd.getCMWOORDCODE());
            ordReq.setCmwoOrdDesc(cmOrd.getCMWOORDDESC());
            ordReq.setCmmGenId(new BigInteger(cmMain.getCMMGENID().toString()));
            LOG.debug("ordReq = " + ordReq);
            return ordReq;
        }).forEach((ordReq) -> {
            session.save(ordReq);
        });
    }
    
    public void addObjs(List<CmObjective> cmObjs, CmMain cmMain, Session session )
    {        
        cmObjs.stream().map((cmObj) -> {
            DbdRegObjReq objReq = new DbdRegObjReq();           
            objReq.setCmoiObjCode(cmObj.getCMOIOBJCODE());
            objReq.setCmoiObjDesc(cmObj.getCMOIOBJDESCTH());
            objReq.setCmoiObjSubCode(cmObj.getCMOIOBJSUBCODE());
            objReq.setCmmGenId(new BigInteger(cmMain.getCMMGENID().toString()));
            LOG.debug("objReq = " + objReq);
            return objReq;
        }).forEach((objReq) -> {
            session.save(objReq);
        });
    }
    
    
    
    public WsResult createResult(String messageCode,Boolean sucFlag, String description)
    {
        WsResult result = new WsResult();
        result.setMessageCode(messageCode);
        result.setSuccessful(sucFlag);
        result.setMessageDescription(description);
        return result;
    }
    
    public void displayValue(CmMain cmMain) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        LOG.info(cmMain.toString());
    }
    
    public void displayValue(CmObjective cmMain) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Field [] attributes =  cmMain.getClass().getDeclaredFields();
        LOG.info("------------------------  CmObjective Start  ------------------------ " );
        for (Field field : attributes) {
            // Dynamically read Attribute Name
            LOG.info("  NAME: " + field.getName()+" , VALUE : "+PropertyUtils.getSimpleProperty(cmMain, field.getName()));
           
        }
        LOG.info("------------------------  CmObjective ------------------------ " );
    }
    
    public void displayValue(CmWebsiteDelivery cmMain) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Field [] attributes =  cmMain.getClass().getDeclaredFields();
        LOG.info("------------------------  CmWebsiteDelivery Start  ------------------------ " );
        for (Field field : attributes) {
            // Dynamically read Attribute Name
            LOG.info("  NAME: " + field.getName()+" , VALUE : "+PropertyUtils.getSimpleProperty(cmMain, field.getName()));
           
        }
        LOG.info("------------------------  CmWebsiteDelivery Finish ------------------------ " );
    }
    
    public void displayValue(CmWebsiteOrder cmMain) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Field [] attributes =  cmMain.getClass().getDeclaredFields();
        LOG.info("------------------------  CmWebsiteOrder Start  ------------------------ " );
        for (Field field : attributes) {
            // Dynamically read Attribute Name
            LOG.info("  NAME: " + field.getName()+" , VALUE : "+PropertyUtils.getSimpleProperty(cmMain, field.getName()));
           
        }
        LOG.info("------------------------  CmWebsiteOrder Finish ------------------------ " );
    }
    
    public void displayValue(CmWebsiteRule cmMain) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Field [] attributes =  cmMain.getClass().getDeclaredFields();
        LOG.info("------------------------  CmWebsiteRule Start  ------------------------ " );
        for (Field field : attributes) {
            // Dynamically read Attribute Name
            LOG.info("  NAME: " + field.getName()+" , VALUE : "+PropertyUtils.getSimpleProperty(cmMain, field.getName()));
           
        }
        LOG.info("------------------------  CmWebsiteRule Finish ------------------------ " );
    }
    
}
