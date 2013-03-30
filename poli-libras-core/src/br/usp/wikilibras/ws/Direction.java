
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARA_CIMA"/>
 *     &lt;enumeration value="PARA_BAIXO"/>
 *     &lt;enumeration value="DIAGONAL_PARA_CIMA_DIREITA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_BAIXO_DIREITA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_CIMA_ESQUERDA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_BAIXO_ESQUERDA"/>
 *     &lt;enumeration value="PARA_FRENTE"/>
 *     &lt;enumeration value="PARA_TRAS"/>
 *     &lt;enumeration value="DIAGONAL_PARA_FRENTE_DIREITA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_TRAS_DIREITA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_FRENTE_ESQUERDA"/>
 *     &lt;enumeration value="DIAGONAL_PARA_TRAS_ESQUERDA"/>
 *     &lt;enumeration value="PARA_DIREITA"/>
 *     &lt;enumeration value="PARA_ESQUERDA"/>
 *     &lt;enumeration value="PARA_FRENTE_E_PARA_CIMA_NA_DIAGONAL"/>
 *     &lt;enumeration value="PARA_BAIXO_E_PARA_TRAS_NA_DIAGONAL"/>
 *     &lt;enumeration value="PARA_FRENTE_E_PARA_CIMA_DIREITA_NA_DIAGONAL"/>
 *     &lt;enumeration value="PARA_FRENTE_E_PARA_CIMA_ESQUERDA_NA_DIAGONAL"/>
 *     &lt;enumeration value="PARA_BAIXO_E_PARA_TRAS_DIREITA_NA_DIAGONAL"/>
 *     &lt;enumeration value="PARA_BAIXO_E_PARA_TRAS_ESQUERDA_NA_DIAGONAL"/>
 *     &lt;enumeration value="CIRCULAR_HORIZONTAL"/>
 *     &lt;enumeration value="CIRCULAR_VERTICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "direction")
@XmlEnum
public enum Direction {

    PARA_CIMA,
    PARA_BAIXO,
    DIAGONAL_PARA_CIMA_DIREITA,
    DIAGONAL_PARA_BAIXO_DIREITA,
    DIAGONAL_PARA_CIMA_ESQUERDA,
    DIAGONAL_PARA_BAIXO_ESQUERDA,
    PARA_FRENTE,
    PARA_TRAS,
    DIAGONAL_PARA_FRENTE_DIREITA,
    DIAGONAL_PARA_TRAS_DIREITA,
    DIAGONAL_PARA_FRENTE_ESQUERDA,
    DIAGONAL_PARA_TRAS_ESQUERDA,
    PARA_DIREITA,
    PARA_ESQUERDA,
    PARA_FRENTE_E_PARA_CIMA_NA_DIAGONAL,
    PARA_BAIXO_E_PARA_TRAS_NA_DIAGONAL,
    PARA_FRENTE_E_PARA_CIMA_DIREITA_NA_DIAGONAL,
    PARA_FRENTE_E_PARA_CIMA_ESQUERDA_NA_DIAGONAL,
    PARA_BAIXO_E_PARA_TRAS_DIREITA_NA_DIAGONAL,
    PARA_BAIXO_E_PARA_TRAS_ESQUERDA_NA_DIAGONAL,
    CIRCULAR_HORIZONTAL,
    CIRCULAR_VERTICAL;

    public String value() {
        return name();
    }

    public static Direction fromValue(String v) {
        return valueOf(v);
    }

}
