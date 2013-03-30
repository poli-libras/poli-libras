
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tongue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tongue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="PARA_CIMA_ABERTA"/>
 *     &lt;enumeration value="VISIVEL_DENTRO_DA_BOCA_PARA_BAIXO"/>
 *     &lt;enumeration value="METADE_PARA_CIMA_COM_BOCA_FECHADA"/>
 *     &lt;enumeration value="VISIVEL_DENTRO_DA_BOCA_PARA_CIMA"/>
 *     &lt;enumeration value="PARA_FORA_NO_CENTRO"/>
 *     &lt;enumeration value="VISIVEL_DENTRO_DA_BOCA_NO_CENTRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tongue")
@XmlEnum
public enum Tongue {

    NADA,
    PARA_CIMA_ABERTA,
    VISIVEL_DENTRO_DA_BOCA_PARA_BAIXO,
    METADE_PARA_CIMA_COM_BOCA_FECHADA,
    VISIVEL_DENTRO_DA_BOCA_PARA_CIMA,
    PARA_FORA_NO_CENTRO,
    VISIVEL_DENTRO_DA_BOCA_NO_CENTRO;

    public String value() {
        return name();
    }

    public static Tongue fromValue(String v) {
        return valueOf(v);
    }

}
