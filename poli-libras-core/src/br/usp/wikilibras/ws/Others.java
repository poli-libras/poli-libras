
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for others.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="others">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="QUEIXO"/>
 *     &lt;enumeration value="FACE"/>
 *     &lt;enumeration value="EXPRESSAO_QUESTAO"/>
 *     &lt;enumeration value="ORELHA"/>
 *     &lt;enumeration value="PESCOCO"/>
 *     &lt;enumeration value="ATRAS_DA_CABECA"/>
 *     &lt;enumeration value="EXPRESSAO_RADIANTE"/>
 *     &lt;enumeration value="CABELO"/>
 *     &lt;enumeration value="QUEIXO_PARA_CIMA"/>
 *     &lt;enumeration value="QUEIXO_PARA_FRENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "others")
@XmlEnum
public enum Others {

    NADA,
    QUEIXO,
    FACE,
    EXPRESSAO_QUESTAO,
    ORELHA,
    PESCOCO,
    ATRAS_DA_CABECA,
    EXPRESSAO_RADIANTE,
    CABELO,
    QUEIXO_PARA_CIMA,
    QUEIXO_PARA_FRENTE;

    public String value() {
        return name();
    }

    public static Others fromValue(String v) {
        return valueOf(v);
    }

}
