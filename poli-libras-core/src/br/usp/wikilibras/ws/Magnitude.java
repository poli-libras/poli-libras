
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for magnitude.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="magnitude">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURTO"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="LONGO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "magnitude")
@XmlEnum
public enum Magnitude {

    CURTO,
    NORMAL,
    LONGO;

    public String value() {
        return name();
    }

    public static Magnitude fromValue(String v) {
        return valueOf(v);
    }

}
