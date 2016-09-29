
package com.eli.calc.shape.service.ws.resp;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.domain.CalculationResult;


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
 *         &lt;element name="calculatedResults" type="{http://domain.shape.calc.eli.com/}CalculationResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "calculatedResults"
})
@XmlRootElement(name = "CalculatedResultsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-29T01:21:04-04:00", comments = "JAXB RI v2.2.11")
public class CalculatedResultsResponse
    extends StatusResponse
{

    @XmlElement(nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-29T01:21:04-04:00", comments = "JAXB RI v2.2.11")
    protected List<CalculationResult> calculatedResults;

    /**
     * Gets the value of the calculatedResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationResult }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-29T01:21:04-04:00", comments = "JAXB RI v2.2.11")
    public List<CalculationResult> getCalculatedResults() {
        if (calculatedResults == null) {
            calculatedResults = new ArrayList<CalculationResult>();
        }
        return this.calculatedResults;
    }

}
