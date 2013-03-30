
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handRotation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="handRotation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="RETO"/>
 *     &lt;enumeration value="RASO"/>
 *     &lt;enumeration value="INCLINADO_PARA_DENTRO"/>
 *     &lt;enumeration value="INCLINADO_PARA_FORA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handRotation")
@XmlEnum
public enum HandRotation {

    ZERO,
    RETO,
    RASO,
    INCLINADO_PARA_DENTRO,
    INCLINADO_PARA_FORA;

    public String value() {
        return name();
    }

    public static HandRotation fromValue(String v) {
        return valueOf(v);
    }

}
