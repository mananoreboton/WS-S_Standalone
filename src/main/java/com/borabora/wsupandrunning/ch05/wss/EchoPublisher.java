package com.borabora.wsupandrunning.ch05.wss;

import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;
import java.lang.String;import java.lang.System;import java.util.LinkedList;
import java.util.List;

/**
 * Created by mrbueno on 19/04/15.
 */
public class EchoPublisher {
    public static void main(String[ ] args) {
        Endpoint endpoint = Endpoint.create(new EchoServiceImpl());
        Binding binding = endpoint.getBinding();
        List<Handler> hchain = new LinkedList<Handler>();
        hchain.add(new EchoSecurityHandler());
        binding.setHandlerChain(hchain);
        endpoint.publish("http://localhost:7777/echo");
        System.out.println("http://localhost:7777/echo");
    }
}
