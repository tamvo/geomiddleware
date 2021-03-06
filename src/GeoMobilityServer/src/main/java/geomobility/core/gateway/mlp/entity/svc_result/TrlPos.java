//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.28 at 09:45:38 AM ICT 
//


package geomobility.core.gateway.mlp.entity.svc_result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for trl_pos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trl_pos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}msid"/>
 *         &lt;choice>
 *           &lt;element ref="{}pd"/>
 *           &lt;element ref="{}poserr"/>
 *           &lt;element ref="{}time"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="trl_trigger" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="MS_AVAIL"/>
 *             &lt;enumeration value="CHANGE_AREA"/>
 *             &lt;enumeration value="PERIODIC"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pos_method">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="AFLT"/>
 *             &lt;enumeration value="OTDOA"/>
 *             &lt;enumeration value="EFLT"/>
 *             &lt;enumeration value="E-OTD"/>
 *             &lt;enumeration value="UNKNOWN"/>
 *             &lt;enumeration value="U-TDOA"/>
 *             &lt;enumeration value="CELL"/>
 *             &lt;enumeration value="OTHER"/>
 *             &lt;enumeration value="GPS"/>
 *             &lt;enumeration value="A-GPS"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trl_pos", propOrder = {
    "msid",
    "pd",
    "poserr",
    "time"
})
public class TrlPos {

    @XmlElement(required = true)
    protected Msid msid;
    protected Pd pd;
    protected Poserr poserr;
    protected Time time;
    @XmlAttribute(name = "trl_trigger", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trlTrigger;
    @XmlAttribute(name = "pos_method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String posMethod;

    /**
     * Gets the value of the msid property.
     * 
     * @return
     *     possible object is
     *     {@link Msid }
     *     
     */
    public Msid getMsid() {
        return msid;
    }

    /**
     * Sets the value of the msid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Msid }
     *     
     */
    public void setMsid(Msid value) {
        this.msid = value;
    }

    /**
     * Gets the value of the pd property.
     * 
     * @return
     *     possible object is
     *     {@link Pd }
     *     
     */
    public Pd getPd() {
        return pd;
    }

    /**
     * Sets the value of the pd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pd }
     *     
     */
    public void setPd(Pd value) {
        this.pd = value;
    }

    /**
     * Gets the value of the poserr property.
     * 
     * @return
     *     possible object is
     *     {@link Poserr }
     *     
     */
    public Poserr getPoserr() {
        return poserr;
    }

    /**
     * Sets the value of the poserr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poserr }
     *     
     */
    public void setPoserr(Poserr value) {
        this.poserr = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the trlTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlTrigger() {
        return trlTrigger;
    }

    /**
     * Sets the value of the trlTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrlTrigger(String value) {
        this.trlTrigger = value;
    }

    /**
     * Gets the value of the posMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosMethod() {
        return posMethod;
    }

    /**
     * Sets the value of the posMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosMethod(String value) {
        this.posMethod = value;
    }

}
