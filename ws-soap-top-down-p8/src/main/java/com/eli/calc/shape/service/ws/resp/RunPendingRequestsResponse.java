
package com.eli.calc.shape.service.ws.resp;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://resp.ws.service.shape.calc.eli.com/}StatusResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numRun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numRun"
})
@XmlRootElement(name = "RunPendingRequestsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
public class RunPendingRequestsResponse
    extends StatusResponse
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    protected int numRun;

    /**
     * Gets the value of the numRun property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public int getNumRun() {
        return numRun;
    }

    /**
     * Sets the value of the numRun property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public void setNumRun(int value) {
        this.numRun = value;
    }

}
