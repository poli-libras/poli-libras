
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for teeth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="teeth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="DENTES"/>
 *     &lt;enumeration value="SUPERIORES_TOCANDO_LABIO_INFERIOR"/>
 *     &lt;enumeration value="INFERIORES_TOCANDO_LABIO_SUPERIOR"/>
 *     &lt;enumeration value="SUPERIORES_TOCANDO_LINGUA"/>
 *     &lt;enumeration value="INFERIORES_TOCANDO_LINGUA"/>
 *     &lt;enumeration value="MORDIDA_CENTRO_DO_LABIO"/>
 *     &lt;enumeration value="MORDIDA_LADO_ESQUERDO_DO_LABIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "teeth")
@XmlEnum
public enum Teeth {

    NADA,
    DENTES,
    SUPERIORES_TOCANDO_LABIO_INFERIOR,
    INFERIORES_TOCANDO_LABIO_SUPERIOR,
    SUPERIORES_TOCANDO_LINGUA,
    INFERIORES_TOCANDO_LINGUA,
    MORDIDA_CENTRO_DO_LABIO,
    MORDIDA_LADO_ESQUERDO_DO_LABIO;

    public String value() {
        return name();
    }

    public static Teeth fromValue(String v) {
        return valueOf(v);
    }

}
