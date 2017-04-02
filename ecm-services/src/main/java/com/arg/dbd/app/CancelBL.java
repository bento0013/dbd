/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app;

import static com.arg.dbd.app.ECMServiceBL.FAILED;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsResult;
import com.baa.dbd.model.DbdRegReq;
import com.baa.dbd.model.reg.DbdRegisteredRequest;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noom
 */
public class CancelBL {
    private static Log LOG = LogFactory.getLog(CancelBL.class);
    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Long CANCEL_STATUSAPPROVE =13L;
    private static Long CANCEL_STATUSWEBSERVICE =   3L;
    private static boolean failStatus = Boolean.FALSE;
    private static boolean successStatus = Boolean.TRUE;
    
    public WsResult cancelRegis( WsRequestCancel in ,DbdRegReq reg , Session session)
    {
        WsResult result = new WsResult();
        Criteria criteria = session.createCriteria(DbdRegisteredRequest.class);        	        
        criteria.add(Restrictions.eq("identificationNumber", in.getCmmain().getCMMOWNID()));
        criteria.add(Restrictions.eq("wsName", (reg.getWsName() != null?reg.getWsName().toLowerCase().trim():"")));
        criteria.add(Restrictions.ne("statusWebservice", 3L));
	    List<DbdRegisteredRequest> lists =  criteria.list();
        LOG.info("sizes = "+lists.size());
        if(lists != null && !lists.isEmpty())
        {
            
            lists.stream().map((req) -> {
                LOG.info("ws Name = "+req.getWsName());
                LOG.info("Website = "+in.getCmmain().getCMMWEBSITE());
                if(req.getWsName().equals(reg.getWsName()))
                {
                    req.setStatusApprove(CANCEL_STATUSAPPROVE);
                    req.setStatusWebservice(CANCEL_STATUSWEBSERVICE);
//                    req.setUpdateDate(new Date());
                    session.update(req);
                }
                return req;
            }).forEach((_item) -> {
                result.setSuccessful(successStatus);            
                result.setMessageDescription(SUCCESS); 
                result.setMessageCode("1");
            });
        }
        else
        {
            result.setSuccessful(failStatus);
            result.setMessageCode(null);
            result.setMessageDescription(FAILED);            
        }
        return result;
    }
}
