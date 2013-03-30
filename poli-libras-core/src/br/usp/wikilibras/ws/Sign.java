
package br.usp.wikilibras.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inherences" type="{http://ws.wikilibras.usp.br/}inherence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inserted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="literals" type="{http://ws.wikilibras.usp.br/}literal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbols" type="{http://ws.wikilibras.usp.br/}symbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verbType" type="{http://ws.wikilibras.usp.br/}verbType" minOccurs="0"/>
 *         &lt;element name="words" type="{http://ws.wikilibras.usp.br/}word" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sign", propOrder = {
    "inherences",
    "inserted",
    "literals",
    "name",
    "symbols",
    "verbType",
    "words"
})
public class Sign {

    @XmlElement(nillable = true)
    protected List<Inherence> inherences;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inserted;
    @XmlElement(nillable = true)
    protected List<Literal> literals;
    protected String name;
    @XmlElement(nillable = true)
    protected List<Symbol> symbols;
    protected VerbType verbType;
    @XmlElement(nillable = true)
    protected List<Word> words;

    /**
     * Gets the value of the inherences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inherences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInherences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inherence }
     * 
     * 
     */
    public List<Inherence> getInherences() {
        if (inherences == null) {
            inherences = new ArrayList<Inherence>();
        }
        return this.inherences;
    }

    /**
     * Gets the value of the inserted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInserted() {
        return inserted;
    }

    /**
     * Sets the value of the inserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInserted(XMLGregorianCalendar value) {
        this.inserted = value;
    }

    /**
     * Gets the value of the literals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the literals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiterals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Literal }
     * 
     * 
     */
    public List<Literal> getLiterals() {
        if (literals == null) {
            literals = new ArrayList<Literal>();
        }
        return this.literals;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the symbols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symbol }
     * 
     * 
     */
    public List<Symbol> getSymbols() {
        if (symbols == null) {
            symbols = new ArrayList<Symbol>();
        }
        return this.symbols;
    }

    /**
     * Gets the value of the verbType property.
     * 
     * @return
     *     possible object is
     *     {@link VerbType }
     *     
     */
    public VerbType getVerbType() {
        return verbType;
    }

    /**
     * Sets the value of the verbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerbType }
     *     
     */
    public void setVerbType(VerbType value) {
        this.verbType = value;
    }

    /**
     * Gets the value of the words property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the words property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Word }
     * 
     * 
     */
    public List<Word> getWords() {
        if (words == null) {
            words = new ArrayList<Word>();
        }
        return this.words;
    }

}
