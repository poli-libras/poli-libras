
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="frequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIMPLES"/>
 *     &lt;enumeration value="REPETIDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "frequency")
@XmlEnum
public enum Frequency {

    SIMPLES,
    REPETIDO;

    public String value() {
        return name();
    }

    public static Frequency fromValue(String v) {
        return valueOf(v);
    }

}
