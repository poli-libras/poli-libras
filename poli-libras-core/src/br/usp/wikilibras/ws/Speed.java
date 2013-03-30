
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="speed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LENTO"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="RAPIDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "speed")
@XmlEnum
public enum Speed {

    LENTO,
    NORMAL,
    RAPIDO;

    public String value() {
        return name();
    }

    public static Speed fromValue(String v) {
        return valueOf(v);
    }

}
