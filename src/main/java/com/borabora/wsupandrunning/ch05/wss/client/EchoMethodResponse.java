
package com.borabora.wsupandrunning.ch05.wss.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for echoMethodResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="echoMethodResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="echoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echoMethodResponse", propOrder = {
    "echoResult"
})
public class EchoMethodResponse {

    protected String echoResult;

    /**
     * Gets the value of the echoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoResult() {
        return echoResult;
    }

    /**
     * Sets the value of the echoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoResult(String value) {
        this.echoResult = value;
    }

}
