
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verbType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="verbType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAO_VERBO"/>
 *     &lt;enumeration value="NAO_FLEXIONA"/>
 *     &lt;enumeration value="CONCORDA_COM_SUJEITO_E_OBJETO"/>
 *     &lt;enumeration value="FLEXIONA_COM_LOCALIZACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "verbType")
@XmlEnum
public enum VerbType {

    NAO_VERBO,
    NAO_FLEXIONA,
    CONCORDA_COM_SUJEITO_E_OBJETO,
    FLEXIONA_COM_LOCALIZACAO;

    public String value() {
        return name();
    }

    public static VerbType fromValue(String v) {
        return valueOf(v);
    }

}
