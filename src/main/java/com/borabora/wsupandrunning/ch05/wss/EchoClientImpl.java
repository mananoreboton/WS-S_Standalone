package com.borabora.wsupandrunning.ch05.wss;


import com.borabora.wsupandrunning.ch05.wss.client.EchoMethod;
import com.borabora.wsupandrunning.ch05.wss.client.EchoMethodResponse;
import com.borabora.wsupandrunning.ch05.wss.client.EchoServiceImpl;
import com.borabora.wsupandrunning.ch05.wss.client.EchoServiceImplService;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrbueno on 20/04/15.
 */
public class EchoClientImpl {
    public static void main(String[] args) {
        EchoServiceImplService echoServiceImplService = new EchoServiceImplService();
        EchoServiceImpl echoServiceImplPort = echoServiceImplService.getEchoServiceImplPort();
        Binding binding = ((BindingProvider) echoServiceImplPort).getBinding();
        List<Handler> handlerList = new ArrayList<Handler>();
        handlerList.add(new ClientHandler());
        binding.setHandlerChain(handlerList);

        EchoMethod parameters = new EchoMethod();
        parameters.setArg0("holita");

        EchoMethodResponse echoMethodResponse = echoServiceImplPort.echoMethod(parameters);
        System.out.println("echoMethodResponse.getEchoResult() = " + echoMethodResponse.getEchoResult());
    }
}
