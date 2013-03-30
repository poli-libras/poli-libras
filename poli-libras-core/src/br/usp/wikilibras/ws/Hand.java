
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fingers" type="{http://ws.wikilibras.usp.br/}fingersMovement" minOccurs="0"/>
 *         &lt;element name="movement" type="{http://ws.wikilibras.usp.br/}handMovement" minOccurs="0"/>
 *         &lt;element name="orientation" type="{http://ws.wikilibras.usp.br/}handOrientation" minOccurs="0"/>
 *         &lt;element name="plane" type="{http://ws.wikilibras.usp.br/}handPlane" minOccurs="0"/>
 *         &lt;element name="rotation" type="{http://ws.wikilibras.usp.br/}handRotation" minOccurs="0"/>
 *         &lt;element name="shape" type="{http://ws.wikilibras.usp.br/}handShape" minOccurs="0"/>
 *         &lt;element name="side" type="{http://ws.wikilibras.usp.br/}handSide" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hand", propOrder = {
    "fingers",
    "movement",
    "orientation",
    "plane",
    "rotation",
    "shape",
    "side"
})
public class Hand {

    protected FingersMovement fingers;
    protected HandMovement movement;
    protected HandOrientation orientation;
    protected HandPlane plane;
    protected HandRotation rotation;
    protected String shape;
    protected HandSide side;

    /**
     * Gets the value of the fingers property.
     * 
     * @return
     *     possible object is
     *     {@link FingersMovement }
     *     
     */
    public FingersMovement getFingers() {
        return fingers;
    }

    /**
     * Sets the value of the fingers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FingersMovement }
     *     
     */
    public void setFingers(FingersMovement value) {
        this.fingers = value;
    }

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link HandMovement }
     *     
     */
    public HandMovement getMovement() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandMovement }
     *     
     */
    public void setMovement(HandMovement value) {
        this.movement = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link HandOrientation }
     *     
     */
    public HandOrientation getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandOrientation }
     *     
     */
    public void setOrientation(HandOrientation value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the plane property.
     * 
     * @return
     *     possible object is
     *     {@link HandPlane }
     *     
     */
    public HandPlane getPlane() {
        return plane;
    }

    /**
     * Sets the value of the plane property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandPlane }
     *     
     */
    public void setPlane(HandPlane value) {
        this.plane = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link HandRotation }
     *     
     */
    public HandRotation getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandRotation }
     *     
     */
    public void setRotation(HandRotation value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link HandSide }
     *     
     */
    public HandSide getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandSide }
     *     
     */
    public void setSide(HandSide value) {
        this.side = value;
    }

}
