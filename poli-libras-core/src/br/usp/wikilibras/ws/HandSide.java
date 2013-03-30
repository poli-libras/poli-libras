
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handSide.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="handSide">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="LEFT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handSide")
@XmlEnum
public enum HandSide {

    RIGHT,
    LEFT;

    public String value() {
        return name();
    }

    public static HandSide fromValue(String v) {
        return valueOf(v);
    }

}
