
package com.eli.calc.shape.service.ws.resp;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.domain.CalculationRequest;


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
 *         &lt;element name="pendingRequests" type="{http://domain.shape.calc.eli.com/}CalculationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pendingRequests"
})
@XmlRootElement(name = "PendingRequestsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-28T11:52:03-04:00", comments = "JAXB RI v2.2.11")
public class PendingRequestsResponse
    extends StatusResponse
{

    @XmlElement(nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-28T11:52:03-04:00", comments = "JAXB RI v2.2.11")
    protected List<CalculationRequest> pendingRequests;

    /**
     * Gets the value of the pendingRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationRequest }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-28T11:52:03-04:00", comments = "JAXB RI v2.2.11")
    public List<CalculationRequest> getPendingRequests() {
        if (pendingRequests == null) {
            pendingRequests = new ArrayList<CalculationRequest>();
        }
        return this.pendingRequests;
    }

}
