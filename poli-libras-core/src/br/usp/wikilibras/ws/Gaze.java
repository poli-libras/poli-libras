
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gaze.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gaze">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="PARA_CIMA"/>
 *     &lt;enumeration value="PARA_CIMA_PARA_UM_LADO"/>
 *     &lt;enumeration value="PARA_OS_LADOS"/>
 *     &lt;enumeration value="PARA_BAIXO_PARA_UM_LADO"/>
 *     &lt;enumeration value="PARA_BAIXO"/>
 *     &lt;enumeration value="PARA_FRENTE"/>
 *     &lt;enumeration value="PARA_FRENTE_PARA_UM_LADO"/>
 *     &lt;enumeration value="PARA_OS_LADOS_2"/>
 *     &lt;enumeration value="PARA_TRAS_PARA_UM_LADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gaze")
@XmlEnum
public enum Gaze {

    NADA,
    PARA_CIMA,
    PARA_CIMA_PARA_UM_LADO,
    PARA_OS_LADOS,
    PARA_BAIXO_PARA_UM_LADO,
    PARA_BAIXO,
    PARA_FRENTE,
    PARA_FRENTE_PARA_UM_LADO,
    PARA_OS_LADOS_2,
    PARA_TRAS_PARA_UM_LADO;

    public String value() {
        return name();
    }

    public static Gaze fromValue(String v) {
        return valueOf(v);
    }

}
