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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CircularArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CircularArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}coord"/>
 *         &lt;element ref="{}radius"/>
 *         &lt;element ref="{}distanceUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="gid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="srsName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircularArea", propOrder = {
    "coord",
    "radius",
    "distanceUnit"
})
public class CircularArea {

    @XmlElement(required = true)
    protected Coord coord;
    @XmlElement(required = true)
    protected Radius radius;
    protected DistanceUnit distanceUnit;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String gid;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String srsName;

    /**
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link Coord }
     *     
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coord }
     *     
     */
    public void setCoord(Coord value) {
        this.coord = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Radius }
     *     
     */
    public Radius getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radius }
     *     
     */
    public void setRadius(Radius value) {
        this.radius = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnit }
     *     
     */
    public DistanceUnit getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnit }
     *     
     */
    public void setDistanceUnit(DistanceUnit value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGid(String value) {
        this.gid = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

}