
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eyes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eyes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="ABERTOS"/>
 *     &lt;enumeration value="ESPRIMIDOS"/>
 *     &lt;enumeration value="FECHADOS"/>
 *     &lt;enumeration value="MEIO_ABERTOS"/>
 *     &lt;enumeration value="MEIO_FECHADOS"/>
 *     &lt;enumeration value="BEM_ABERTOS"/>
 *     &lt;enumeration value="CICLHOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eyes")
@XmlEnum
public enum Eyes {

    NADA,
    ABERTOS,
    ESPRIMIDOS,
    FECHADOS,
    MEIO_ABERTOS,
    MEIO_FECHADOS,
    BEM_ABERTOS,
    CICLHOS;

    public String value() {
        return name();
    }

    public static Eyes fromValue(String v) {
        return valueOf(v);
    }

}
