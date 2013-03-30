
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fingersMovement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fingersMovement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NENHUM"/>
 *     &lt;enumeration value="MEDIA_FECHA"/>
 *     &lt;enumeration value="MEDIA_ABRE"/>
 *     &lt;enumeration value="PROXIMAL_FECHA"/>
 *     &lt;enumeration value="PROXIMAL_ABRE"/>
 *     &lt;enumeration value="PROXIMAIS_ABREM_E_FECHAM_JUNTAS"/>
 *     &lt;enumeration value="PROXIMAIS_ABREM_E_FECHAM_ALTERNATIVAMENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fingersMovement")
@XmlEnum
public enum FingersMovement {

    NENHUM,
    MEDIA_FECHA,
    MEDIA_ABRE,
    PROXIMAL_FECHA,
    PROXIMAL_ABRE,
    PROXIMAIS_ABREM_E_FECHAM_JUNTAS,
    PROXIMAIS_ABREM_E_FECHAM_ALTERNATIVAMENTE;

    public String value() {
        return name();
    }

    public static FingersMovement fromValue(String v) {
        return valueOf(v);
    }

}
