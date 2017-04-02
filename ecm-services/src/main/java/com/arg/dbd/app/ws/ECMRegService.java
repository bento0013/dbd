/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arg.dbd.app.ws;

import com.arg.dbd.model.reg.WsRequestAdd;
import com.arg.dbd.model.reg.WsRequestCancel;
import com.arg.dbd.model.reg.WsRequestDelete;
import com.arg.dbd.model.reg.WsRequestUpdate;
import com.arg.dbd.model.reg.WsResult;
import javax.jws.WebService;

/**
 *
 * @author anurakt
 */

@WebService
public interface ECMRegService 
{
    public WsResult sendAdd(WsRequestAdd in) throws Exception;
    public WsResult sendUpdate(WsRequestUpdate in) throws Exception;
    public WsResult sendCancel(WsRequestCancel in) throws Exception;
    public WsResult sendDelete(WsRequestDelete in) throws Exception;
}