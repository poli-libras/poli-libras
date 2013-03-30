
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handPlane.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="handPlane">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="HORIZONTAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handPlane")
@XmlEnum
public enum HandPlane {

    VERTICAL,
    HORIZONTAL;

    public String value() {
        return name();
    }

    public static HandPlane fromValue(String v) {
        return valueOf(v);
    }

}
