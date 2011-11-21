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
 * <p>Java class for svc_result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="svc_result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}hdr" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}slia"/>
 *           &lt;element ref="{}slirep"/>
 *           &lt;element ref="{}slrep"/>
 *           &lt;element ref="{}slra"/>
 *           &lt;element ref="{}eme_lia"/>
 *           &lt;element ref="{}emerep"/>
 *           &lt;element ref="{}eme_lirep"/>
 *           &lt;element ref="{}tlra"/>
 *           &lt;element ref="{}tlrep"/>
 *           &lt;element ref="{}tlrsa"/>
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
@XmlType(name = "svc_result", propOrder = {
    "hdr",
    "slia",
    "slirep",
    "slrep",
    "slra",
    "emeLia",
    "emerep",
    "emeLirep",
    "tlra",
    "tlrep",
    "tlrsa"
})
public class SvcResult {

    protected Hdr hdr;
    protected Slia slia;
    protected Slirep slirep;
    protected Slrep slrep;
    protected Slra slra;
    @XmlElement(name = "eme_lia")
    protected EmeLia emeLia;
    protected Emerep emerep;
    @XmlElement(name = "eme_lirep")
    protected EmeLirep emeLirep;
    protected Tlra tlra;
    protected Tlrep tlrep;
    protected Tlrsa tlrsa;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String ver;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Hdr }
     *     
     */
    public Hdr getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hdr }
     *     
     */
    public void setHdr(Hdr value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the slia property.
     * 
     * @return
     *     possible object is
     *     {@link Slia }
     *     
     */
    public Slia getSlia() {
        return slia;
    }

    /**
     * Sets the value of the slia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slia }
     *     
     */
    public void setSlia(Slia value) {
        this.slia = value;
    }

    /**
     * Gets the value of the slirep property.
     * 
     * @return
     *     possible object is
     *     {@link Slirep }
     *     
     */
    public Slirep getSlirep() {
        return slirep;
    }

    /**
     * Sets the value of the slirep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slirep }
     *     
     */
    public void setSlirep(Slirep value) {
        this.slirep = value;
    }

    /**
     * Gets the value of the slrep property.
     * 
     * @return
     *     possible object is
     *     {@link Slrep }
     *     
     */
    public Slrep getSlrep() {
        return slrep;
    }

    /**
     * Sets the value of the slrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slrep }
     *     
     */
    public void setSlrep(Slrep value) {
        this.slrep = value;
    }

    /**
     * Gets the value of the slra property.
     * 
     * @return
     *     possible object is
     *     {@link Slra }
     *     
     */
    public Slra getSlra() {
        return slra;
    }

    /**
     * Sets the value of the slra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slra }
     *     
     */
    public void setSlra(Slra value) {
        this.slra = value;
    }

    /**
     * Gets the value of the emeLia property.
     * 
     * @return
     *     possible object is
     *     {@link EmeLia }
     *     
     */
    public EmeLia getEmeLia() {
        return emeLia;
    }

    /**
     * Sets the value of the emeLia property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmeLia }
     *     
     */
    public void setEmeLia(EmeLia value) {
        this.emeLia = value;
    }

    /**
     * Gets the value of the emerep property.
     * 
     * @return
     *     possible object is
     *     {@link Emerep }
     *     
     */
    public Emerep getEmerep() {
        return emerep;
    }

    /**
     * Sets the value of the emerep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Emerep }
     *     
     */
    public void setEmerep(Emerep value) {
        this.emerep = value;
    }

    /**
     * Gets the value of the emeLirep property.
     * 
     * @return
     *     possible object is
     *     {@link EmeLirep }
     *     
     */
    public EmeLirep getEmeLirep() {
        return emeLirep;
    }

    /**
     * Sets the value of the emeLirep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmeLirep }
     *     
     */
    public void setEmeLirep(EmeLirep value) {
        this.emeLirep = value;
    }

    /**
     * Gets the value of the tlra property.
     * 
     * @return
     *     possible object is
     *     {@link Tlra }
     *     
     */
    public Tlra getTlra() {
        return tlra;
    }

    /**
     * Sets the value of the tlra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tlra }
     *     
     */
    public void setTlra(Tlra value) {
        this.tlra = value;
    }

    /**
     * Gets the value of the tlrep property.
     * 
     * @return
     *     possible object is
     *     {@link Tlrep }
     *     
     */
    public Tlrep getTlrep() {
        return tlrep;
    }

    /**
     * Sets the value of the tlrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tlrep }
     *     
     */
    public void setTlrep(Tlrep value) {
        this.tlrep = value;
    }

    /**
     * Gets the value of the tlrsa property.
     * 
     * @return
     *     possible object is
     *     {@link Tlrsa }
     *     
     */
    public Tlrsa getTlrsa() {
        return tlrsa;
    }

    /**
     * Sets the value of the tlrsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tlrsa }
     *     
     */
    public void setTlrsa(Tlrsa value) {
        this.tlrsa = value;
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