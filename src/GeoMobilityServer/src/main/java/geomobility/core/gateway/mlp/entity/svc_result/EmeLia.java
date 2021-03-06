//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.28 at 09:45:38 AM ICT 
//


package geomobility.core.gateway.mlp.entity.svc_result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eme_lia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eme_lia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{}eme_pos" maxOccurs="unbounded"/>
 *           &lt;element ref="{}req_id"/>
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
@XmlType(name = "eme_lia", propOrder = {
    "emePos",
    "reqId",
    "result",
    "addInfo"
})
public class EmeLia {

    @XmlElement(name = "eme_pos")
    protected List<EmePos> emePos;
    @XmlElement(name = "req_id")
    protected ReqId reqId;
    protected Result result;
    @XmlElement(name = "add_info")
    protected AddInfo addInfo;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ver;

    /**
     * Gets the value of the emePos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emePos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmePos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmePos }
     * 
     * 
     */
    public List<EmePos> getEmePos() {
        if (emePos == null) {
            emePos = new ArrayList<EmePos>();
        }
        return this.emePos;
    }

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
