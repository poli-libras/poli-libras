
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contact">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NENHUM"/>
 *     &lt;enumeration value="CONTATO"/>
 *     &lt;enumeration value="PEGAR"/>
 *     &lt;enumeration value="ENTRE"/>
 *     &lt;enumeration value="BATER"/>
 *     &lt;enumeration value="ESCOVAR"/>
 *     &lt;enumeration value="ESFREGAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contact")
@XmlEnum
public enum Contact {

    NENHUM,
    CONTATO,
    PEGAR,
    ENTRE,
    BATER,
    ESCOVAR,
    ESFREGAR;

    public String value() {
        return name();
    }

    public static Contact fromValue(String v) {
        return valueOf(v);
    }

}
