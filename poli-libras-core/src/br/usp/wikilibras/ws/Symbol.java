
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for symbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="symbol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{http://ws.wikilibras.usp.br/}contact" minOccurs="0"/>
 *         &lt;element name="contactQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="face" type="{http://ws.wikilibras.usp.br/}face" minOccurs="0"/>
 *         &lt;element name="handsInUnity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="leftHand" type="{http://ws.wikilibras.usp.br/}hand" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.wikilibras.usp.br/}location" minOccurs="0"/>
 *         &lt;element name="rightHand" type="{http://ws.wikilibras.usp.br/}hand" minOccurs="0"/>
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
@XmlType(name = "symbol", propOrder = {
    "contact",
    "contactQuantity",
    "face",
    "handsInUnity",
    "id",
    "leftHand",
    "location",
    "rightHand",
    "sequence"
})
public class Symbol {

    protected Contact contact;
    protected int contactQuantity;
    protected Face face;
    protected boolean handsInUnity;
    protected Long id;
    protected Hand leftHand;
    protected Location location;
    protected Hand rightHand;
    protected int sequence;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactQuantity property.
     * 
     */
    public int getContactQuantity() {
        return contactQuantity;
    }

    /**
     * Sets the value of the contactQuantity property.
     * 
     */
    public void setContactQuantity(int value) {
        this.contactQuantity = value;
    }

    /**
     * Gets the value of the face property.
     * 
     * @return
     *     possible object is
     *     {@link Face }
     *     
     */
    public Face getFace() {
        return face;
    }

    /**
     * Sets the value of the face property.
     * 
     * @param value
     *     allowed object is
     *     {@link Face }
     *     
     */
    public void setFace(Face value) {
        this.face = value;
    }

    /**
     * Gets the value of the handsInUnity property.
     * 
     */
    public boolean isHandsInUnity() {
        return handsInUnity;
    }

    /**
     * Sets the value of the handsInUnity property.
     * 
     */
    public void setHandsInUnity(boolean value) {
        this.handsInUnity = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the leftHand property.
     * 
     * @return
     *     possible object is
     *     {@link Hand }
     *     
     */
    public Hand getLeftHand() {
        return leftHand;
    }

    /**
     * Sets the value of the leftHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hand }
     *     
     */
    public void setLeftHand(Hand value) {
        this.leftHand = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the rightHand property.
     * 
     * @return
     *     possible object is
     *     {@link Hand }
     *     
     */
    public Hand getRightHand() {
        return rightHand;
    }

    /**
     * Sets the value of the rightHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hand }
     *     
     */
    public void setRightHand(Hand value) {
        this.rightHand = value;
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
