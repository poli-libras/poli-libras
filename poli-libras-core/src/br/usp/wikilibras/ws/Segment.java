
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://ws.wikilibras.usp.br/}direction" minOccurs="0"/>
 *         &lt;element name="magnitude" type="{http://ws.wikilibras.usp.br/}magnitude" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segment", propOrder = {
    "direction",
    "magnitude",
    "sequence"
})
public class Segment {

    protected Direction direction;
    protected Magnitude magnitude;
    protected int sequence;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the magnitude property.
     * 
     * @return
     *     possible object is
     *     {@link Magnitude }
     *     
     */
    public Magnitude getMagnitude() {
        return magnitude;
    }

    /**
     * Sets the value of the magnitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Magnitude }
     *     
     */
    public void setMagnitude(Magnitude value) {
        this.magnitude = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

}
