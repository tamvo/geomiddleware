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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tlra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tlra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}req_id"/>
 *             &lt;element ref="{}lcs_ref" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{}result"/>
 *             &lt;element ref="{}add_info" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ver" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="3.2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tlra", propOrder = {
    "reqId",
    "lcsRef",
    "result",
    "addInfo"
})
public class Tlra {

    @XmlElement(name = "req_id")
    protected ReqId reqId;
    @XmlElement(name = "lcs_ref")
    protected LcsRef lcsRef;
    protected Result result;
    @XmlElement(name = "add_info")
    protected AddInfo addInfo;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ver;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link ReqId }
     *     
     */
    public ReqId getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqId }
     *     
     */
    public void setReqId(ReqId value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the lcsRef property.
     * 
     * @return
     *     possible object is
     *     {@link LcsRef }
     *     
     */
    public LcsRef getLcsRef() {
        return lcsRef;
    }

    /**
     * Sets the value of the lcsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LcsRef }
     *     
     */
    public void setLcsRef(LcsRef value) {
        this.lcsRef = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddInfo }
     *     
     */
    public AddInfo getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddInfo }
     *     
     */
    public void setAddInfo(AddInfo value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        if (ver == null) {
            return "3.2.0";
        } else {
            return ver;
        }
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

}