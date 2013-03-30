
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="handOrientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="HALF"/>
 *     &lt;enumeration value="BLACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handOrientation")
@XmlEnum
public enum HandOrientation {

    WHITE,
    HALF,
    BLACK;

    public String value() {
        return name();
    }

    public static HandOrientation fromValue(String v) {
        return valueOf(v);
    }

}
