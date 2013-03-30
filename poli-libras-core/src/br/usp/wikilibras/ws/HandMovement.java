
package br.usp.wikilibras.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handMovement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="handMovement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://ws.wikilibras.usp.br/}frequency" minOccurs="0"/>
 *         &lt;element name="segments" type="{http://ws.wikilibras.usp.br/}segment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://ws.wikilibras.usp.br/}speed" minOccurs="0"/>
 *         &lt;element name="startsInLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{http://ws.wikilibras.usp.br/}movementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handMovement", propOrder = {
    "frequency",
    "segments",
    "speed",
    "startsInLocation",
    "type"
})
public class HandMovement {

    protected Frequency frequency;
    @XmlElement(nillable = true)
    protected List<Segment> segments;
    protected Speed speed;
    protected boolean startsInLocation;
    protected MovementType type;

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     * 
     * 
     */
    public List<Segment> getSegments() {
        if (segments == null) {
            segments = new ArrayList<Segment>();
        }
        return this.segments;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Speed }
     *     
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speed }
     *     
     */
    public void setSpeed(Speed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the startsInLocation property.
     * 
     */
    public boolean isStartsInLocation() {
        return startsInLocation;
    }

    /**
     * Sets the value of the startsInLocation property.
     * 
     */
    public void setStartsInLocation(boolean value) {
        this.startsInLocation = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MovementType }
     *     
     */
    public MovementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementType }
     *     
     */
    public void setType(MovementType value) {
        this.type = value;
    }

}
