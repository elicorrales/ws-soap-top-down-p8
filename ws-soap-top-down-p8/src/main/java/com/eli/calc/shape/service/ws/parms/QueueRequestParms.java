
package com.eli.calc.shape.service.ws.parms;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.ShapeName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shapeName" type="{http://model.shape.calc.eli.com/}ShapeName"/&gt;
 *         &lt;element name="calcType" type="{http://model.shape.calc.eli.com/}CalcType"/&gt;
 *         &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shapeName",
    "calcType",
    "dimension"
})
@XmlRootElement(name = "QueueRequestParms")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
public class QueueRequestParms {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    protected ShapeName shapeName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    protected CalcType calcType;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    protected double dimension;

    /**
     * Gets the value of the shapeName property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public ShapeName getShapeName() {
        return shapeName;
    }

    /**
     * Sets the value of the shapeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public void setShapeName(ShapeName value) {
        this.shapeName = value;
    }

    /**
     * Gets the value of the calcType property.
     * 
     * @return
     *     possible object is
     *     {@link CalcType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public CalcType getCalcType() {
        return calcType;
    }

    /**
     * Sets the value of the calcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalcType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public void setCalcType(CalcType value) {
        this.calcType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public double getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-27T11:26:13-04:00", comments = "JAXB RI v2.2.11")
    public void setDimension(double value) {
        this.dimension = value;
    }

}
