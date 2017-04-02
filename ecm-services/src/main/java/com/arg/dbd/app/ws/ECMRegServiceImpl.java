/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app.ws;


import com.arg.dbd.app.ECMServiceBL;
import javax.jws.WebService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.arg.dbd.model.reg.WsRequestAdd;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsRequestDelete;
import com.arg.dbd.model.reg.WsRequestUpdate;
import com.arg.dbd.model.reg.WsResult;

/**
 *
 * @author anurakt
 */
@WebService(endpointInterface = "com.arg.dbd.app.ws.ECMRegService", serviceName = "ECMRegService")
public class ECMRegServiceImpl implements ECMRegService {

    protected static Log LOG = LogFactory.getLog(ECMRegServiceImpl.class);
    protected static String SUCCESS = "Success";
    protected static String FAILED = "Failed";
    private static Integer failStatus = 0;
    private static Integer successStatus = 1;
    protected static String CMMNO_IS_REQUIRED = "Column CMMNO or other(s) column are required field is null";
    protected static String CMMNO_IS_REQUIRED2 = "Column in CMMNO  are required field is null";
    //private Boolean sendMail = Boolean.parseBoolean(Configuration.getString("dbd.ws.sendmail.flag")) ;

    @Override
    public WsResult sendAdd(WsRequestAdd in) throws Exception {
        LOG.info("in getCMMNO -----------> " + in.getCmmain().getCMMNO());
        LOG.info("------------> sendAdd");
        ECMServiceBL serviceBL = new ECMServiceBL();
        WsResult result = serviceBL.sendAdd(in);
        LOG.info("send Add WsResult messagecode = "+result.getMessageCode());
        LOG.info("         WsResult messagedescription = "+result.getMessageDescription());
        LOG.info("         WsResult successful = "+result.isSuccessful());
        
        return result;
    }
    

    
    
    
    @Override
    public WsResult sendUpdate(WsRequestUpdate in) throws Exception {
        LOG.info("in getCMMNO -----------> " + in.getCmmain().getCMMNO());
        LOG.info("------------> sendUpdate");
        ECMServiceBL serviceBL = new ECMServiceBL();
        WsResult result = serviceBL.sendUpdate(in);
        LOG.info("send Update WsResult messagecode = "+result.getMessageCode());
        LOG.info("         WsResult messagedescription = "+result.getMessageDescription());
        LOG.info("         WsResult successful = "+result.isSuccessful());
        return result;
    }

    @Override
    public WsResult sendCancel(WsRequestCancel in) throws Exception {
        LOG.info("in getCMMNO -----------> " + in.getCmmain().getCMMNO());
        LOG.info("------------> sendCancel");
        ECMServiceBL serviceBL = new ECMServiceBL();
        WsResult result = serviceBL.sendCancel(in);
        LOG.info("send Cancel WsResult messagecode = "+result.getMessageCode());
        LOG.info("         WsResult messagedescription = "+result.getMessageDescription());
        LOG.info("         WsResult successful = "+result.isSuccessful());
        return result;
    }

    @Override
    public WsResult sendDelete(WsRequestDelete in) throws Exception {
        LOG.info("in getCMMNO -----------> " + in.getCmmain().getCMMNO());
        LOG.info("------------> sendDelete");
        ECMServiceBL serviceBL = new ECMServiceBL();
        WsResult result = serviceBL.sendDelete(in);
        return result;
    }

    


   
}
