
package com.borabora.wsupandrunning.ch05.wss.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.borabora.wsupandrunning.ch05.wss.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EchoMethod_QNAME = new QName("http://wss.ch05.wsupandrunning.borabora.com/", "echoMethod");
    private final static QName _EchoMethodResponse_QNAME = new QName("http://wss.ch05.wsupandrunning.borabora.com/", "echoMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.borabora.wsupandrunning.ch05.wss.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoMethod }
     * 
     */
    public EchoMethod createEchoMethod() {
        return new EchoMethod();
    }

    /**
     * Create an instance of {@link EchoMethodResponse }
     * 
     */
    public EchoMethodResponse createEchoMethodResponse() {
        return new EchoMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wss.ch05.wsupandrunning.borabora.com/", name = "echoMethod")
    public JAXBElement<EchoMethod> createEchoMethod(EchoMethod value) {
        return new JAXBElement<EchoMethod>(_EchoMethod_QNAME, EchoMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wss.ch05.wsupandrunning.borabora.com/", name = "echoMethodResponse")
    public JAXBElement<EchoMethodResponse> createEchoMethodResponse(EchoMethodResponse value) {
        return new JAXBElement<EchoMethodResponse>(_EchoMethodResponse_QNAME, EchoMethodResponse.class, null, value);
    }

}
