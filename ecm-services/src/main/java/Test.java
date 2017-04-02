
import com.arg.dbd.app.ECMServiceBL;
import com.arg.dbd.model.reg.CmMain;
import com.arg.dbd.model.reg.CmObjective;
import com.arg.dbd.model.reg.CmWebsiteDelivery;
import com.arg.dbd.model.reg.CmWebsiteOrder;
import com.arg.dbd.model.reg.CmWebsitePayment;
import com.arg.dbd.model.reg.CmWebsiteRule;
import com.arg.dbd.model.reg.WsRequestAdd;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsRequestUpdate;
import com.baa.dbd.model.DbdRegReq;
import com.baa.dbd.model.reg.DbdGroupWebsiteMap;
import com.baa.dbd.model.reg.DbdGroupWebsiteRegistered;
import com.baa.dbd.model.reg.DbdRegisteredRequest;
import com.baa.dbd.model.reg.DbdUser;
import com.bba.hibernate.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noom
 */
public class Test {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try
        {
            tx = session.beginTransaction();
            Criteria criteria = session.createCriteria(DbdRegReq.class);
            criteria.addOrder(Order.asc("id"));
            List<DbdRegReq> lists = criteria.list();
            for (DbdRegReq req :lists)
            {
                String reqNo = req.getWsNameOriginal();
                Criteria criteria1 = session.createCriteria(DbdRegisteredRequest.class);
                criteria1.add(Restrictions.eq("wsNameOriginal", reqNo));
                DbdRegisteredRequest data = (DbdRegisteredRequest)criteria1.setMaxResults(1).uniqueResult();
                if(data != null)
                {
//                    data.setTypePersonnel(req.getCmmOwnCode().equals("11")?1L:2L);
                    System.out.println("Website Original = " + data.getWsNameOriginal());
                    System.out.println("req.getCmwBuCode() = " + req.getCmwBuCode());
                    
                    
                        Criteria criteria3 = session.createCriteria(DbdGroupWebsiteRegistered.class);        	        
                        criteria3.add(Restrictions.eq("rId", data.getRId().longValue()));
                        List<DbdGroupWebsiteRegistered> list1s =  criteria3.list();
                        if(list1s != null && !list1s.isEmpty())
                        {
                            list1s.stream().map((req1) -> {     
                                session.delete(req1);
                                return req1;
                            }).forEach((_item) -> {

                            });                        
                        }        

                        DbdGroupWebsiteRegistered obj = new DbdGroupWebsiteRegistered();
                        if(req.getCmwBuCode() != null)
                        {
                            obj.setOldID(new Integer(req.getCmmGenId().toString()));
                            obj.setOrdering(1);
                            obj.setPublished(true);
                            obj.setrId(new Long(data.getRId()));
                            Criteria criteriaxx = session.createCriteria(DbdGroupWebsiteMap.class);
                            criteriaxx.add(Restrictions.eq("webId", Long.parseLong(req.getCmwBuCode())));
                            DbdGroupWebsiteMap map = (DbdGroupWebsiteMap)criteriaxx.setMaxResults(1).uniqueResult();
                            if(map == null)
                            {
                                return;
                            }
                            System.out.println("map.getGroupwsId() = " + map.getGroupwsId());
                            obj.setwId(new Long(map.getGroupwsId()));   
                            obj.setCreateDate(new Date());
                            obj.setFlagInsert(1);           
                            obj.setwOther("");
                            obj.setUpdateDate(new Date());
                            if(data.getUserId() != null)
                            {
                                obj.setUserId(data.getUserId().intValue());
                            }
                            session.save(obj);   
                        }
                                        
                                                                           
//                    session.save(data);
                    
                }
             
            }
            
            tx.commit();
            
        }catch(Exception e)
        {
            tx.rollback();
            e.printStackTrace();
            
        }
        finally
        {
            session.close();
        }
////        try
////        {
////            DbdUser obj = new DbdUser();                
////            obj.setOldId(1L);
////            obj.setActivation("1");
////            obj.setRegisterDate(new Date());
////            obj.setSendEmail(1);
////            obj.setBlock(0);
////            obj.setDate_insert(new Date());
////            obj.setEmail("bbb@bb.com");
////            obj.setFlag_insert(1);
////            obj.setLastvisitDate(new Date());
////            obj.setOtep("1");
////            obj.setPassword("$2y$10$ze0BcmlL1UzueZTwtf9EG.9MYXbEOSy6jTaX6BrUy3lhkzGhCqPLe");
////            obj.setName("ccc");
////            obj.setRequireReset(0);
////            obj.setOtpKey("xxx");
////            obj.setPassword_decode("xxx");
////            obj.setResetCount(0);
////            obj.setUsername("cccc@ggm.com");
////            obj.setLastResetTime(new Date());
////            obj.setRegId(0);        
////            obj.setDate_insert(new Date());
////            obj.setFlag_insert(1);
////            session.save(obj);
////            session.flush();
////        }catch(Exception e)
////        {          
////            System.out.println("e.getMessage() = " + e.getMessage());
////        }
////        finally
////        {
////            session.close();
////        }
//        ECMServiceBL service = new ECMServiceBL();
//        for(int i = 1;i < 2;i++)
//        {
//            CmMain main = new CmMain();            
//            main.setBIRTHDATE(null);
//            main.setCMAADRACODE("34");
//            main.setCMAADRBLD(null);
//            main.setCMAADRBLDFL(null);
//            main.setCMAADRBLDNO(null);
//            main.setCMAADRDISP(null);
//            main.setCMAADRCOCODE(null);
//            main.setCMAADRDISPEN("Number 53 Soi PATTANAKARN56 SUAN LUANG KHET SUAN LUANG BANGKOK Postal10250");
//            main.setCMAADREXTRA(null);
//            main.setCMAADRFAX(null);
//            main.setCMAADRHID(null);
//            main.setCMAADRHNO("53");
//            main.setCMAADRJCODE("10");
//            main.setCMAADRMOO(null);
//            main.setCMAADRPOST("10250");
//            main.setCMAADRROAD(null);
//            main.setCMAADRSOI("พัฒนาการ 56(เอื้อพัฒนา)");
//            main.setCMAADRTCODE("01");
//            main.setCMAADRTEL("027229880");
//            main.setCMAADRTROK(null);
//            main.setCMAADRVILLAGE(null);
//            main.setCMMCAP(new BigDecimal("2000000"));
//            main.setCMMENDATE(null);
//            main.setCMMGENID(733651);
//            main.setCMMMGRFIRSTNAME("จีราวัจน์ จริยวัฒน์สกุล");
//            main.setCMMMGRFIRSTNAMEEN(null);
//            main.setCMMMGRID("3110300862591");
////            main.setCMMMGRLASTNAME("setCMMMGRLASTNAME ");
////            main.setCMMMGRLASTNAMEEN("setCMMMGRLASTNAMEEN ");
//            main.setCMMMGRTITLE("002");
//            main.setCMMNAMEEN("ASIAGATEWAY TRAVEL CO.,LTD.");
//            main.setCMMNAMETH("บริษัท เอเซียเกทเวย์ ทราเวล จำกัด");
//            main.setCMMNO("0105549144122");
//            main.setCMMOWNCODE("23");
//            main.setCMMOWNFIRSTNAME("เอเซียเกทเวย์ ทราเวล จำกัด");
//            main.setCMMOWNFIRSTNAMEEN("ASIAGATEWAY TRAVEL CO.,LTD.");
//            main.setCMMOWNID("0105549144122");
////            main.setCMMOWNLASTNAME("นามสกุลไทย ");
////            main.setCMMOWNLASTNAMEEN("setCMMOWNLASTNAMEEN ");
//            main.setCMMOWNTAXID(null);
//            main.setCMMOWNTITLEEN(null);
//            main.setCMMOWNTITLENM("บริษัท");
//            main.setCMMREQEST("1003458000275");
//            main.setCMMSTAT("1");
//            main.setCMMSTDATE("25580804");
//            main.setCMMWEBSITE("WWW.LOWCOST-TICKET.COM");
//            main.setCMMWEBSITEEN("WWW.LOWCOST-TICKET.COM");
//            main.setCMWBUCODE(null);
//            main.setCMWBUDESC(null);
//            main.setCMWWEBEMAIL("thanasith@bbb.com");
//            main.setCMWWEBOBJ(null);
//            
//            main.setREQCHGDESC(null);
//            main.setREQCMMOFFCODE("10034");
//            main.setREQNO("1003458000275");
//            main.setREQRDATE("25580804");
//            main.setREQSDATE("25580804");
//            main.setREQTPCODE("4");
//            main.setWEBSERVERREQUESTDATE("20160324");
//            main.setWEBSERVERREQUESTTIME("23:37:3");
//            main.setWEBSERVERREQUESTUSER("SYSTEM");            
//            List<CmObjective> cmObjs = new ArrayList<CmObjective>();
//            List<CmWebsiteDelivery> cmWebDvrs = new ArrayList<CmWebsiteDelivery>();
//            List<CmWebsiteOrder> cmWebOrds = new ArrayList<CmWebsiteOrder>();
//            List<CmWebsitePayment> cmWebPays = new ArrayList<CmWebsitePayment>();
//            List<CmWebsiteRule> cmWebRuls = new ArrayList<CmWebsiteRule>();
//            for(int j =0;j<1;j++)
//            {
//                CmObjective cmObj = new CmObjective();
//                cmObj.setCMOIOBJCODE("07");
//                cmObj.setCMOIOBJDESCTH("setCMOIOBJDESCTH "+String.valueOf(j));
//                cmObj.setCMOIOBJSUBCODE("setCMOIOBJSUBCODE "+String.valueOf(j));
//                cmObj.setCMOORD(j);
//                cmObjs.add(cmObj);
//                CmWebsiteDelivery cmWebDvr = new CmWebsiteDelivery();
//                cmWebDvr.setCMWDDELICODE("01");
//                cmWebDvr.setCMWDDELIDESC("setCMWDDELIDESC "+String.valueOf(j));               
//                cmWebDvrs.add(cmWebDvr);
//                CmWebsiteOrder cmWebOrd = new CmWebsiteOrder();
//                cmWebOrd.setCMWOORDCODE("07");
//                cmWebOrd.setCMWOORDDESC("setCMWOORDDESC "+String.valueOf(j));               
//                cmWebOrds.add(cmWebOrd);
//                CmWebsitePayment cmWebPay = new CmWebsitePayment();
//                cmWebPay.setCMWPPAYCODE("01");
//                cmWebPay.setCMWPPAYDESC("setCMWPPAYDESC "+String.valueOf(j));               
//                cmWebPays.add(cmWebPay);
//                CmWebsiteRule cmWebRul = new CmWebsiteRule();
//                cmWebRul.setCMWRRULECODE("01");            
//                cmWebRuls.add(cmWebRul);
//            }
//            WsRequestUpdate wsAdd = new WsRequestUpdate();
//            wsAdd.setCmmain(main);
//            wsAdd.setObjectivelist(cmObjs);
//            wsAdd.setWebsiteDeliverylist(cmWebDvrs);
//            wsAdd.setWebsiteOrderlist(cmWebOrds);
//            wsAdd.setWebsitePaymentlist(cmWebPays);
//            wsAdd.setWebsiteRulelist(cmWebRuls);
//            service.sendUpdate(wsAdd);
//        }
        
        
    }
}
