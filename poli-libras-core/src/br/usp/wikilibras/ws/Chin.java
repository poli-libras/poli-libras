
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="ESTUFADAS"/>
 *     &lt;enumeration value="NAO_ESTUFFADAS"/>
 *     &lt;enumeration value="SUGADAS"/>
 *     &lt;enumeration value="TENSAS"/>
 *     &lt;enumeration value="LINGUA_NA_BOCHECHA_DIREITA"/>
 *     &lt;enumeration value="TODA_FACE_MOVE_PARA_DIREITA"/>
 *     &lt;enumeration value="SOPRANDO_AR"/>
 *     &lt;enumeration value="AR_DENTRO_DA_BOCA"/>
 *     &lt;enumeration value="EXPIRANDO"/>
 *     &lt;enumeration value="INSPIRANDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chin")
@XmlEnum
public enum Chin {

    NADA,
    ESTUFADAS,
    NAO_ESTUFFADAS,
    SUGADAS,
    TENSAS,
    LINGUA_NA_BOCHECHA_DIREITA,
    TODA_FACE_MOVE_PARA_DIREITA,
    SOPRANDO_AR,
    AR_DENTRO_DA_BOCA,
    EXPIRANDO,
    INSPIRANDO;

    public String value() {
        return name();
    }

    public static Chin fromValue(String v) {
        return valueOf(v);
    }

}
