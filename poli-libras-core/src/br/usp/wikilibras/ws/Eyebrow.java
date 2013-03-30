
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eyebrow.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eyebrow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="PARA_CIMA"/>
 *     &lt;enumeration value="RETAS"/>
 *     &lt;enumeration value="PARA_BAIXO"/>
 *     &lt;enumeration value="PARA_CIMA_LADO_DE_DENTRO"/>
 *     &lt;enumeration value="PARA_BAIXO_LADO_DE_DENTRO"/>
 *     &lt;enumeration value="PARA_CIMA_LADO_DE_FORA"/>
 *     &lt;enumeration value="PARA_BAIXO_LADO_DE_FORA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eyebrow")
@XmlEnum
public enum Eyebrow {

    NADA,
    PARA_CIMA,
    RETAS,
    PARA_BAIXO,
    PARA_CIMA_LADO_DE_DENTRO,
    PARA_BAIXO_LADO_DE_DENTRO,
    PARA_CIMA_LADO_DE_FORA,
    PARA_BAIXO_LADO_DE_FORA;

    public String value() {
        return name();
    }

    public static Eyebrow fromValue(String v) {
        return valueOf(v);
    }

}
