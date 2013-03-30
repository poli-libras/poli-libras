
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for face complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="face">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chin" type="{http://ws.wikilibras.usp.br/}chin" minOccurs="0"/>
 *         &lt;element name="eyebrow" type="{http://ws.wikilibras.usp.br/}eyebrow" minOccurs="0"/>
 *         &lt;element name="eyes" type="{http://ws.wikilibras.usp.br/}eyes" minOccurs="0"/>
 *         &lt;element name="forehead" type="{http://ws.wikilibras.usp.br/}forehead" minOccurs="0"/>
 *         &lt;element name="gaze" type="{http://ws.wikilibras.usp.br/}gaze" minOccurs="0"/>
 *         &lt;element name="mounth" type="{http://ws.wikilibras.usp.br/}mounth" minOccurs="0"/>
 *         &lt;element name="nose" type="{http://ws.wikilibras.usp.br/}nose" minOccurs="0"/>
 *         &lt;element name="others" type="{http://ws.wikilibras.usp.br/}others" minOccurs="0"/>
 *         &lt;element name="teeth" type="{http://ws.wikilibras.usp.br/}teeth" minOccurs="0"/>
 *         &lt;element name="tongue" type="{http://ws.wikilibras.usp.br/}tongue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "face", propOrder = {
    "chin",
    "eyebrow",
    "eyes",
    "forehead",
    "gaze",
    "mounth",
    "nose",
    "others",
    "teeth",
    "tongue"
})
public class Face {

    protected Chin chin;
    protected Eyebrow eyebrow;
    protected Eyes eyes;
    protected Forehead forehead;
    protected Gaze gaze;
    protected Mounth mounth;
    protected Nose nose;
    protected Others others;
    protected Teeth teeth;
    protected Tongue tongue;

    /**
     * Gets the value of the chin property.
     * 
     * @return
     *     possible object is
     *     {@link Chin }
     *     
     */
    public Chin getChin() {
        return chin;
    }

    /**
     * Sets the value of the chin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chin }
     *     
     */
    public void setChin(Chin value) {
        this.chin = value;
    }

    /**
     * Gets the value of the eyebrow property.
     * 
     * @return
     *     possible object is
     *     {@link Eyebrow }
     *     
     */
    public Eyebrow getEyebrow() {
        return eyebrow;
    }

    /**
     * Sets the value of the eyebrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eyebrow }
     *     
     */
    public void setEyebrow(Eyebrow value) {
        this.eyebrow = value;
    }

    /**
     * Gets the value of the eyes property.
     * 
     * @return
     *     possible object is
     *     {@link Eyes }
     *     
     */
    public Eyes getEyes() {
        return eyes;
    }

    /**
     * Sets the value of the eyes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eyes }
     *     
     */
    public void setEyes(Eyes value) {
        this.eyes = value;
    }

    /**
     * Gets the value of the forehead property.
     * 
     * @return
     *     possible object is
     *     {@link Forehead }
     *     
     */
    public Forehead getForehead() {
        return forehead;
    }

    /**
     * Sets the value of the forehead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forehead }
     *     
     */
    public void setForehead(Forehead value) {
        this.forehead = value;
    }

    /**
     * Gets the value of the gaze property.
     * 
     * @return
     *     possible object is
     *     {@link Gaze }
     *     
     */
    public Gaze getGaze() {
        return gaze;
    }

    /**
     * Sets the value of the gaze property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gaze }
     *     
     */
    public void setGaze(Gaze value) {
        this.gaze = value;
    }

    /**
     * Gets the value of the mounth property.
     * 
     * @return
     *     possible object is
     *     {@link Mounth }
     *     
     */
    public Mounth getMounth() {
        return mounth;
    }

    /**
     * Sets the value of the mounth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mounth }
     *     
     */
    public void setMounth(Mounth value) {
        this.mounth = value;
    }

    /**
     * Gets the value of the nose property.
     * 
     * @return
     *     possible object is
     *     {@link Nose }
     *     
     */
    public Nose getNose() {
        return nose;
    }

    /**
     * Sets the value of the nose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nose }
     *     
     */
    public void setNose(Nose value) {
        this.nose = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link Others }
     *     
     */
    public Others getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link Others }
     *     
     */
    public void setOthers(Others value) {
        this.others = value;
    }

    /**
     * Gets the value of the teeth property.
     * 
     * @return
     *     possible object is
     *     {@link Teeth }
     *     
     */
    public Teeth getTeeth() {
        return teeth;
    }

    /**
     * Sets the value of the teeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Teeth }
     *     
     */
    public void setTeeth(Teeth value) {
        this.teeth = value;
    }

    /**
     * Gets the value of the tongue property.
     * 
     * @return
     *     possible object is
     *     {@link Tongue }
     *     
     */
    public Tongue getTongue() {
        return tongue;
    }

    /**
     * Sets the value of the tongue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tongue }
     *     
     */
    public void setTongue(Tongue value) {
        this.tongue = value;
    }

}
