
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="movementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETILINIO"/>
 *     &lt;enumeration value="CURVO"/>
 *     &lt;enumeration value="HELICOIDAL"/>
 *     &lt;enumeration value="SINUOSO"/>
 *     &lt;enumeration value="CIRCULAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "movementType")
@XmlEnum
public enum MovementType {

    RETILINIO,
    CURVO,
    HELICOIDAL,
    SINUOSO,
    CIRCULAR;

    public String value() {
        return name();
    }

    public static MovementType fromValue(String v) {
        return valueOf(v);
    }

}
