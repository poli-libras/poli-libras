
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forehead.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="forehead">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="TESTA"/>
 *     &lt;enumeration value="FRANZIDA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "forehead")
@XmlEnum
public enum Forehead {

    NADA,
    TESTA,
    FRANZIDA;

    public String value() {
        return name();
    }

    public static Forehead fromValue(String v) {
        return valueOf(v);
    }

}
