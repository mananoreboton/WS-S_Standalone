package com.borabora.wsupandrunning.ch05.wss;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;import java.lang.String;

/**
 * Created by mrbueno on 19/04/15.
 */
@WebService
public class EchoServiceImpl {
    @Resource
    WebServiceContext ws_ctx;


    @WebMethod
    @WebResult(name = "echoResult")
    public String echoMethod(String msg) {
        return "Echoing: " + msg;
    }
}